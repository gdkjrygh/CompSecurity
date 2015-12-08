// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.Pair;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.ViewHelper;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import rx.Y;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, ChronometerView, CreateWaveDisplay, RecordFragment, 
//            RecordActivity, RecordingOperations

public class RecordPresenter extends SupportFragmentLightCycleDispatcher
    implements CreateWaveDisplay.Listener
{

    public static final String RECORD_STATE_KEY = "createCurrentCreateState";
    ImageButton actionButton;
    TextView actionText;
    View apply;
    ChronometerView chrono;
    private Y cleanupRecordingsSubscription;
    private Y cleanupStaleUploadsSubscription;
    private RecordFragment.CreateState currentState;
    View delete;
    ImageButton editButton;
    ViewGroup editControls;
    ViewGroup gaugeHolder;
    View next;
    ImageButton playButton;
    ImageButton playEditButton;
    private RecordFragment recordFragment;
    private final SoundRecorder recorder;
    private final RecordingOperations recordingOperations;
    View revert;
    private final BroadcastReceiver statusListener = new _cls5();
    SwitchCompat toggleFade;
    private final ViewHelper viewHelper;
    private Map visibilities;
    private CreateWaveDisplay waveDisplay;

    public RecordPresenter(RecordingOperations recordingoperations, ViewHelper viewhelper, SoundRecorder soundrecorder)
    {
        cleanupRecordingsSubscription = RxUtils.invalidSubscription();
        cleanupStaleUploadsSubscription = RxUtils.invalidSubscription();
        recordingOperations = recordingoperations;
        viewHelper = viewhelper;
        recorder = soundrecorder;
    }

    private void configurePlaybackInfo()
    {
        long l = recorder.getCurrentPlaybackPosition();
        long l1 = recorder.getPlaybackDuration();
        if ((l > 0L || recorder.isPlaying()) && l < l1)
        {
            chrono.setPlaybackProgress(l, l1);
            waveDisplay.setProgress((float)l / (float)l1);
            return;
        } else
        {
            chrono.setDurationOnly(l1);
            waveDisplay.setProgress(-1F);
            return;
        }
    }

    private void configureRecordButton(boolean flag)
    {
        if (flag)
        {
            actionButton.setBackgroundResource(0x7f020230);
            actionButton.setImageResource(0x7f020193);
            actionText.setText(recordFragment.getString(0x7f0701c0));
        } else
        {
            actionButton.setBackgroundResource(0x7f02022f);
            actionButton.setImageResource(0x7f020194);
            if (currentState == RecordFragment.CreateState.IDLE_PLAYBACK || currentState == RecordFragment.CreateState.PLAYBACK)
            {
                actionText.setText(recordFragment.getString(0x7f0701c3));
            } else
            {
                actionText.setText(recordFragment.getString(0x7f0701c2));
            }
        }
        actionButton.setEnabled(IOUtils.isSDCardAvailable());
    }

    private void configureTitle()
    {
        recordFragment.getActivity().setTitle(currentState.getTitleId());
    }

    private void configureViewVisibilities()
    {
        for (Iterator iterator = visibilities.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((BitSet)((Pair)entry.getValue()).first).get(currentState.ordinal()))
            {
                viewHelper.showView((View)entry.getKey(), true);
            } else
            {
                viewHelper.hideView((View)entry.getKey(), ((Integer)((Pair)entry.getValue()).second).intValue(), false);
            }
        }

    }

    private transient BitSet createVisibilitySet(RecordFragment.CreateState acreatestate[])
    {
        BitSet bitset = new BitSet(RecordFragment.CreateState.values().length);
        int j = acreatestate.length;
        for (int i = 0; i < j; i++)
        {
            bitset.set(acreatestate[i].ordinal());
        }

        return bitset;
    }

    private DefaultSubscriber getCleanupRecordingsSubscriber()
    {
        return new _cls2();
    }

    private void handleIntent(Intent intent)
    {
        if ("com.soundcloud.android.action.RECORD_START".equals(intent.getAction()))
        {
            if (!recorder.isRecording())
            {
                reset();
                startRecording();
            }
            intent.setAction("com.soundcloud.android.action.RECORD");
        } else
        {
            if ("com.soundcloud.android.action.RECORD_STOP".equals(intent.getAction()))
            {
                if (recorder.isRecording())
                {
                    recorder.stopRecording();
                }
                intent.setAction("com.soundcloud.android.action.RECORD");
                return;
            }
            if (intent.getBooleanExtra("reset", false) && !recorder.isActive())
            {
                intent.removeExtra("reset");
                reset();
                return;
            }
        }
    }

    private boolean hasRecording()
    {
        Recording recording = recorder.getRecording();
        return recording != null && !recording.isUploadRecording();
    }

    private transient void initializeAndHideView(View view, int i, RecordFragment.CreateState acreatestate[])
    {
        initializeView(view, i, acreatestate);
        viewHelper.hideView(view, i, false);
    }

    private transient void initializeView(View view, int i, RecordFragment.CreateState acreatestate[])
    {
        visibilities.put(view, new Pair(createVisibilitySet(acreatestate), Integer.valueOf(i)));
    }

    private void setPlayButtonDrawable(boolean flag)
    {
        if (flag)
        {
            playButton.setImageResource(0x7f020191);
            playEditButton.setImageResource(0x7f020191);
            return;
        } else
        {
            playButton.setImageResource(0x7f020192);
            playEditButton.setImageResource(0x7f020192);
            return;
        }
    }

    private void showRemoveRecordingDialog(int i)
    {
        (new android.support.v7.app.AlertDialog.Builder(recordFragment.getActivity())).setMessage(i).setNegativeButton(0x7f0700ad, null).setPositiveButton(0x7f0700b6, new _cls3()).show();
    }

    private void showRevertRecordingDialog()
    {
        (new android.support.v7.app.AlertDialog.Builder(recordFragment.getActivity())).setMessage(0x7f070118).setNegativeButton(0x7f0700ad, null).setPositiveButton(0x7f0700b6, new _cls4()).show();
    }

    private void trackScreen(ScreenEvent screenevent)
    {
        ((RecordActivity)recordFragment.getActivity()).trackScreen(screenevent);
    }

    private void updateUi(RecordFragment.CreateState createstate)
    {
        currentState = createstate;
        _cls6..SwitchMap.com.soundcloud.android.creators.record.RecordFragment.CreateState[currentState.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 100
    //                   2 151
    //                   3 173
    //                   4 193
    //                   5 186;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        toggleFade.setChecked(recorder.isFading());
        configureTitle();
        configureViewVisibilities();
        waveDisplay.setIsEditing(currentState.isEdit());
        setPlayButtonDrawable(currentState.isPlayState());
        return;
_L2:
        configureRecordButton(false);
        if (recordFragment.isResumed() && !hasRecording())
        {
            recorder.reset(true);
            recorder.startReading();
        }
        chrono.setText(0x7f0701bd);
        continue; /* Loop/switch isn't completed */
_L3:
        configureRecordButton(true);
        chrono.setDurationOnly(recorder.getRecordingElapsedTime());
        continue; /* Loop/switch isn't completed */
_L4:
        configureRecordButton(false);
        waveDisplay.gotoPlaybackMode(true);
_L6:
        configurePlaybackInfo();
        continue; /* Loop/switch isn't completed */
_L5:
        actionButton.setImageResource(0x7f020194);
        if (true) goto _L1; else goto _L7
_L7:
    }

    void checkForUnsavedRecordings()
    {
        cleanupRecordingsSubscription = recordingOperations.cleanupRecordings(SoundRecorder.RECORD_DIR).observeOn(a.a()).subscribe(getCleanupRecordingsSubscriber());
        cleanupStaleUploadsSubscription = recordingOperations.deleteStaleUploads(SoundRecorder.UPLOAD_DIR).subscribe(new _cls1());
    }

    void configureStateBasedOnRecorder()
    {
        RecordFragment.CreateState createstate = currentState;
        if (recorder.isRecording())
        {
            createstate = RecordFragment.CreateState.RECORD;
        } else
        if (recorder.isPlaying())
        {
            if (currentState != RecordFragment.CreateState.EDIT_PLAYBACK)
            {
                createstate = RecordFragment.CreateState.PLAYBACK;
            }
            configurePlaybackInfo();
            waveDisplay.gotoPlaybackMode(false);
        } else
        if (hasRecording())
        {
            if (currentState != RecordFragment.CreateState.EDIT)
            {
                createstate = RecordFragment.CreateState.IDLE_PLAYBACK;
            }
            configurePlaybackInfo();
            waveDisplay.gotoPlaybackMode(false);
        } else
        {
            createstate = RecordFragment.CreateState.IDLE_RECORD;
        }
        updateUi(createstate);
    }

    void next()
    {
        ((RecordActivity)recordFragment.getActivity()).onRecordToMetadata(true);
    }

    void onActionButton()
    {
        if (currentState == RecordFragment.CreateState.RECORD)
        {
            recorder.stopRecording();
            return;
        } else
        {
            startRecording();
            return;
        }
    }

    public void onAdjustTrimLeft(float f, long l)
    {
        recorder.onNewStartPosition(f, l);
        configurePlaybackInfo();
    }

    public void onAdjustTrimRight(float f, long l)
    {
        recorder.onNewEndPosition(f, l);
        configurePlaybackInfo();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        recordFragment = (RecordFragment)fragment;
        if (bundle == null)
        {
            currentState = RecordFragment.CreateState.IDLE_RECORD;
        }
    }

    public void onDestroyView(Fragment fragment)
    {
        waveDisplay.onDestroy();
        super.onDestroyView(fragment);
    }

    void onEdit()
    {
        RecordFragment.CreateState createstate;
        if (currentState.isPlayState())
        {
            createstate = RecordFragment.CreateState.EDIT_PLAYBACK;
        } else
        {
            createstate = RecordFragment.CreateState.EDIT;
        }
        updateUi(createstate);
        ((RecordActivity)recordFragment.getActivity()).trackScreen(ScreenEvent.create(Screen.RECORD_EDIT));
    }

    public void onPause(Fragment fragment)
    {
        cleanupRecordingsSubscription.unsubscribe();
        cleanupStaleUploadsSubscription.unsubscribe();
        recorder.stopReading();
        if (recordFragment.getActivity().isFinishing() || !recordFragment.getActivity().isChangingConfigurations())
        {
            recorder.shouldUseNotifications(true);
        }
        super.onPause(fragment);
    }

    public void onRestoreInstanceState(Fragment fragment, Bundle bundle)
    {
        super.onRestoreInstanceState(fragment, bundle);
        if (bundle != null && !bundle.containsKey("createCurrentCreateState"))
        {
            currentState = RecordFragment.CreateState.valueOf(bundle.getString("createCurrentCreateState"));
            return;
        } else
        {
            currentState = RecordFragment.CreateState.IDLE_RECORD;
            return;
        }
    }

    public void onResume(Fragment fragment)
    {
        super.onResume(fragment);
        if (currentState == null)
        {
            currentState = RecordFragment.CreateState.IDLE_RECORD;
        }
        recorder.shouldUseNotifications(false);
        if (hasRecording())
        {
            configureStateBasedOnRecorder();
        } else
        {
            checkForUnsavedRecordings();
        }
        if (currentState.isEdit())
        {
            fragment = ScreenEvent.create(Screen.RECORD_EDIT);
        } else
        {
            fragment = ScreenEvent.create(Screen.RECORD_MAIN);
        }
        trackScreen(fragment);
    }

    public void onSaveInstanceState(Fragment fragment, Bundle bundle)
    {
        super.onSaveInstanceState(fragment, bundle);
        bundle.putString("createCurrentCreateState", currentState.name());
        if (waveDisplay != null)
        {
            waveDisplay.onSaveInstanceState(bundle);
        }
    }

    public void onSeek(float f)
    {
        recorder.seekTo(f);
    }

    public void onStart(Fragment fragment)
    {
        super.onStart(fragment);
        recordFragment = (RecordFragment)fragment;
        fragment = SoundRecorder.getIntentFilter();
        fragment.addAction("android.intent.action.MEDIA_MOUNTED");
        fragment.addAction("android.intent.action.MEDIA_REMOVED");
        LocalBroadcastManager.getInstance(recordFragment.getActivity()).registerReceiver(statusListener, fragment);
    }

    public void onStop(Fragment fragment)
    {
        super.onStop(fragment);
        LocalBroadcastManager.getInstance(recordFragment.getActivity()).unregisterReceiver(statusListener);
        recordFragment = null;
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        a.a.a(this, view);
        visibilities = new HashMap();
        initializeView(actionButton, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.IDLE_RECORD, RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.RECORD, RecordFragment.CreateState.PLAYBACK
        });
        actionButton.setEnabled(false);
        initializeAndHideView(chrono, 4, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.IDLE_RECORD, RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.RECORD, RecordFragment.CreateState.PLAYBACK, RecordFragment.CreateState.EDIT, RecordFragment.CreateState.EDIT_PLAYBACK
        });
        initializeAndHideView(next, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.PLAYBACK, RecordFragment.CreateState.IDLE_PLAYBACK
        });
        initializeAndHideView(delete, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.PLAYBACK, RecordFragment.CreateState.IDLE_PLAYBACK
        });
        initializeAndHideView(revert, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.EDIT, RecordFragment.CreateState.EDIT_PLAYBACK
        });
        initializeAndHideView(apply, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.EDIT, RecordFragment.CreateState.EDIT_PLAYBACK
        });
        initializeAndHideView(toggleFade, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.EDIT, RecordFragment.CreateState.EDIT_PLAYBACK
        });
        initializeAndHideView(playEditButton, 8, new RecordFragment.CreateState[] {
            RecordFragment.CreateState.EDIT, RecordFragment.CreateState.EDIT_PLAYBACK
        });
        int i;
        if (editControls != null)
        {
            initializeAndHideView(editControls, 8, new RecordFragment.CreateState[] {
                RecordFragment.CreateState.EDIT, RecordFragment.CreateState.EDIT_PLAYBACK
            });
            initializeAndHideView(playButton, 8, new RecordFragment.CreateState[] {
                RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.PLAYBACK
            });
            initializeAndHideView(editButton, 8, new RecordFragment.CreateState[] {
                RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.PLAYBACK
            });
            initializeView(actionText, 8, new RecordFragment.CreateState[] {
                RecordFragment.CreateState.IDLE_RECORD, RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.RECORD, RecordFragment.CreateState.PLAYBACK
            });
        } else
        {
            initializeAndHideView(playButton, 8, new RecordFragment.CreateState[] {
                RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.PLAYBACK
            });
            initializeAndHideView(editButton, 8, new RecordFragment.CreateState[] {
                RecordFragment.CreateState.IDLE_PLAYBACK, RecordFragment.CreateState.PLAYBACK
            });
            initializeAndHideView(actionText, 8, new RecordFragment.CreateState[0]);
        }
        i = view.getResources().getDimensionPixelSize(0x7f0b0019);
        viewHelper.setCircularButtonOutline(actionButton, i);
        waveDisplay = new CreateWaveDisplay(view.getContext());
        waveDisplay.setTrimListener(this);
        if (bundle != null)
        {
            waveDisplay.onRestoreInstanceState(bundle);
        }
        gaugeHolder.addView(waveDisplay);
        handleIntent(fragment.getActivity().getIntent());
    }

    void playEditButton()
    {
        recorder.togglePlayback();
    }

    public void reset()
    {
        recorder.reset(false);
        waveDisplay.reset();
        updateUi(RecordFragment.CreateState.IDLE_RECORD);
    }

    void revert()
    {
        showRevertRecordingDialog();
    }

    void save()
    {
        RecordFragment.CreateState createstate;
        if (currentState.isPlayState())
        {
            createstate = RecordFragment.CreateState.PLAYBACK;
        } else
        {
            createstate = RecordFragment.CreateState.IDLE_PLAYBACK;
        }
        updateUi(createstate);
    }

    public void setProgress(float f)
    {
        waveDisplay.setProgress(f);
    }

    public void setProgress(long l, long l1)
    {
        if (l1 != 0L)
        {
            chrono.setPlaybackProgress(l, l1);
            waveDisplay.setProgress((float)Math.max(0L, Math.min(l, l1)) / (float)l1);
        }
    }

    void showDeleteRecordingDialog()
    {
        showRemoveRecordingDialog(0x7f070117);
    }

    protected void startRecording()
    {
        try
        {
            recorder.startRecording();
            waveDisplay.gotoRecordMode();
            return;
        }
        catch (IOException ioexception)
        {
            updateUi(RecordFragment.CreateState.IDLE_RECORD);
        }
    }

    void toggleFade()
    {
        toggleFade.setChecked(recorder.toggleFade());
    }

    public void updateAmplitude(float f, boolean flag)
    {
        waveDisplay.updateAmplitude(f, flag);
    }

    public void updateRecordProgress(long l)
    {
        chrono.setDurationOnly(l);
    }






    private class _cls5 extends BroadcastReceiver
    {

        final RecordPresenter this$0;

        public void onReceive(Context context, Intent intent)
        {
            boolean flag;
            flag = false;
            context = intent.getAction();
            if (!"com.soundcloud.android.recordstarted".equals(context)) goto _L2; else goto _L1
_L1:
            updateUi(RecordFragment.CreateState.RECORD);
_L4:
            return;
_L2:
            if (!"com.soundcloud.android.recordsample".equals(context))
            {
                break; /* Loop/switch isn't completed */
            }
            if (currentState == RecordFragment.CreateState.IDLE_RECORD || currentState == RecordFragment.CreateState.RECORD)
            {
                context = RecordPresenter.this;
                float f = intent.getFloatExtra("amplitude", -1F);
                if (currentState == RecordFragment.CreateState.RECORD)
                {
                    flag = true;
                }
                context.updateAmplitude(f, flag);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if ("com.soundcloud.android.recordprogress".equals(context))
            {
                updateRecordProgress(intent.getLongExtra("elapsedTime", -1L));
                return;
            }
            if ("com.soundcloud.android.recorderror".equals(context))
            {
                updateUi(RecordFragment.CreateState.IDLE_RECORD);
                return;
            }
            if ("com.soundcloud.android.recordfinished".equals(context))
            {
                if (intent.getLongExtra("time_remaining", -1L) == 0L)
                {
                    AndroidUtils.showToast(recordFragment.getActivity(), 0x7f0701bf, new Object[0]);
                }
                updateUi(RecordFragment.CreateState.IDLE_PLAYBACK);
                return;
            }
            if ("com.soundcloud.android.playbackstarted".equals(context))
            {
                intent = RecordPresenter.this;
                if (currentState == RecordFragment.CreateState.EDIT || currentState == RecordFragment.CreateState.EDIT_PLAYBACK)
                {
                    context = RecordFragment.CreateState.EDIT_PLAYBACK;
                } else
                {
                    context = RecordFragment.CreateState.PLAYBACK;
                }
                intent.updateUi(context);
                return;
            }
            if ("com.soundcloud.android.playbackprogress".equals(context))
            {
                setProgress(intent.getLongExtra("position", 0L), intent.getLongExtra("duration", 0L));
                return;
            }
            if (!"com.soundcloud.android.playbackcomplete".equals(context) && !"com.soundcloud.android.playbackstopped".equals(context) && !"com.soundcloud.android.playbackerror".equals(context))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (currentState != RecordFragment.CreateState.PLAYBACK && currentState != RecordFragment.CreateState.EDIT_PLAYBACK) goto _L4; else goto _L5
_L5:
            intent = RecordPresenter.this;
            if (currentState == RecordFragment.CreateState.EDIT_PLAYBACK)
            {
                context = RecordFragment.CreateState.EDIT;
            } else
            {
                context = RecordFragment.CreateState.IDLE_PLAYBACK;
            }
            intent.updateUi(context);
            return;
            if (!"android.intent.action.MEDIA_MOUNTED".equals(context) && !"android.intent.action.MEDIA_REMOVED".equals(context) || currentState != RecordFragment.CreateState.IDLE_RECORD) goto _L4; else goto _L6
_L6:
            updateUi(RecordFragment.CreateState.IDLE_RECORD);
            return;
        }

        _cls5()
        {
            this$0 = RecordPresenter.this;
            super();
        }
    }


    private class _cls2 extends DefaultSubscriber
    {

        final RecordPresenter this$0;

        public volatile void onNext(Object obj)
        {
            onNext((List)obj);
        }

        public void onNext(List list)
        {
            if (!list.isEmpty())
            {
                list = (Recording)list.get(0);
                recorder.setRecording(list);
            }
            configureStateBasedOnRecorder();
        }

        _cls2()
        {
            this$0 = RecordPresenter.this;
            super();
        }
    }


    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final RecordPresenter this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            recorder.reset(true);
            waveDisplay.reset();
            checkForUnsavedRecordings();
        }

        _cls3()
        {
            this$0 = RecordPresenter.this;
            super();
        }
    }


    private class _cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final RecordPresenter this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            recorder.revertFile();
            RecordPresenter recordpresenter = RecordPresenter.this;
            if (currentState.isPlayState())
            {
                dialoginterface = RecordFragment.CreateState.PLAYBACK;
            } else
            {
                dialoginterface = RecordFragment.CreateState.IDLE_PLAYBACK;
            }
            recordpresenter.updateUi(dialoginterface);
        }

        _cls4()
        {
            this$0 = RecordPresenter.this;
            super();
        }
    }


    private class _cls6
    {

        static final int $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState = new int[RecordFragment.CreateState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[RecordFragment.CreateState.IDLE_RECORD.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[RecordFragment.CreateState.RECORD.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[RecordFragment.CreateState.IDLE_PLAYBACK.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[RecordFragment.CreateState.PLAYBACK.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$creators$record$RecordFragment$CreateState[RecordFragment.CreateState.EDIT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends DefaultSubscriber
    {

        final RecordPresenter this$0;

        _cls1()
        {
            this$0 = RecordPresenter.this;
            super();
        }
    }

}
