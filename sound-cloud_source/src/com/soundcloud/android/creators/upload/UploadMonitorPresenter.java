// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import a.a;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.image.PlaceholderGenerator;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ViewHelper;
import com.soundcloud.android.utils.images.ImageUtils;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadMonitorFragment, CircularProgressBar

public class UploadMonitorPresenter extends SupportFragmentLightCycleDispatcher
{
    private final class EventSubscriber extends DefaultSubscriber
    {

        final UploadMonitorPresenter this$0;

        public final void onNext(UploadEvent uploadevent)
        {
            if (!isCancelling)
            {
                int i = uploadevent.getProgress();
                isUploading = uploadevent.isUploading();
                updateRecording(uploadevent.getRecording());
                if (uploadevent.isStarted())
                {
                    setIndeterminateState();
                    return;
                }
                if (uploadevent.isProcessing())
                {
                    setIndeterminateState();
                    return;
                }
                if (uploadevent.isTransfer())
                {
                    setTransferState(i);
                    return;
                }
                if (uploadevent.isFinished())
                {
                    onUploadFinished(uploadevent.isUploadSuccess());
                    return;
                }
                if (uploadevent.isCancelled())
                {
                    isCancelling = true;
                    displayRecordScreenWithDelay();
                    return;
                }
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((UploadEvent)obj);
        }

        private EventSubscriber()
        {
            this$0 = UploadMonitorPresenter.this;
            super();
        }

        EventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    public static final String RECORDING_KEY = "recording";
    private final AccountOperations accountOperations;
    ImageButton actionButton;
    Button cancelButton;
    private final EventBus eventBus;
    private final Handler handler = new Handler();
    ImageView icon;
    private boolean isCancelling;
    private boolean isUploading;
    private final PlaceholderGenerator placeholderGenerator;
    private Recording recording;
    private Y subscription;
    TextView trackDuration;
    TextView trackTitle;
    TextView trackUsername;
    private UploadMonitorFragment uploadMonitorFragment;
    CircularProgressBar uploadProgress;
    TextView uploadStatusText;
    private final ViewHelper viewHelper;

    public UploadMonitorPresenter(EventBus eventbus, PlaceholderGenerator placeholdergenerator, AccountOperations accountoperations, ViewHelper viewhelper)
    {
        isUploading = false;
        isCancelling = false;
        eventBus = eventbus;
        placeholderGenerator = placeholdergenerator;
        accountOperations = accountoperations;
        viewHelper = viewhelper;
    }

    private void displayRecordScreen()
    {
        RecordActivity recordactivity = (RecordActivity)uploadMonitorFragment.getActivity();
        if (recordactivity != null)
        {
            recordactivity.onUploadToRecord();
        }
    }

    private void displayRecordScreenWithDelay()
    {
        handler.postDelayed(new _cls1(), 2000L);
    }

    private int getDimension(int i)
    {
        return uploadMonitorFragment.getResources().getDimensionPixelSize(i);
    }

    private void onUploadFinished(boolean flag)
    {
        uploadProgress.setVisibility(4);
        if (flag)
        {
            cancelButton.setVisibility(8);
            actionButton.setBackgroundResource(0x7f02022f);
            actionButton.setImageResource(0x7f02018d);
            actionButton.setEnabled(false);
            uploadStatusText.setText(0x7f0701cb);
            displayRecordScreenWithDelay();
            return;
        } else
        {
            cancelButton.setVisibility(0);
            actionButton.setBackgroundResource(0x7f02022f);
            actionButton.setImageResource(0x7f020195);
            actionButton.setEnabled(true);
            uploadStatusText.setText(0x7f0701ca);
            return;
        }
    }

    private void setCancellingState()
    {
        cancelButton.setVisibility(8);
        actionButton.setEnabled(false);
        uploadProgress.setVisibility(0);
        uploadProgress.setIndeterminate(true);
        uploadStatusText.setText(0x7f07021a);
    }

    private void setCircularShape(View view, int i)
    {
        viewHelper.setCircularButtonOutline(view, getDimension(i));
    }

    private void setIndeterminateState()
    {
        setUploadingState();
        uploadProgress.setIndeterminate(true);
        uploadStatusText.setText(0x7f07021c);
    }

    private void setRecording(Recording recording1)
    {
        if (recording1.equals(recording))
        {
            return;
        }
        recording = recording1;
        trackTitle.setText(recording1.sharingNote(uploadMonitorFragment.getResources()));
        trackUsername.setText(accountOperations.getLoggedInUser().getDisplayName());
        trackDuration.setText(recording1.formattedDuration());
        if (recording1.hasArtwork())
        {
            ImageUtils.setImage(recording1.getArtwork(), icon, getDimension(0x7f0b0009), getDimension(0x7f0b000a));
            return;
        } else
        {
            icon.setImageDrawable(placeholderGenerator.generateDrawable(String.valueOf(recording1.hashCode())));
            return;
        }
    }

    private void setTransferState(int i)
    {
        if (i < 0)
        {
            setIndeterminateState();
            return;
        } else
        {
            i = Math.max(0, Math.min(100, i));
            setUploadingState();
            uploadProgress.setIndeterminate(false);
            uploadProgress.setProgress(i);
            uploadStatusText.setText(uploadMonitorFragment.getString(0x7f07021d, new Object[] {
                Integer.valueOf(i)
            }));
            return;
        }
    }

    private void setUploadingState()
    {
        cancelButton.setVisibility(0);
        actionButton.setBackgroundResource(0x7f020230);
        actionButton.setImageResource(0x7f020197);
        actionButton.setEnabled(false);
        uploadProgress.setVisibility(0);
    }

    private void showCancelDialog()
    {
        (new android.support.v7.app.AlertDialog.Builder(uploadMonitorFragment.getActivity())).setTitle(null).setMessage(0x7f070116).setPositiveButton(0x7f0700b6, new _cls2()).setNegativeButton(0x7f0700ad, null).create().show();
    }

    private void updateRecording(Recording recording1)
    {
        if (recording1 != null)
        {
            setRecording(recording1);
        }
    }

    public void onCancel()
    {
        if (isUploading)
        {
            showCancelDialog();
            return;
        } else
        {
            displayRecordScreen();
            return;
        }
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        uploadMonitorFragment = (UploadMonitorFragment)fragment;
        uploadMonitorFragment.getActivity().setTitle(0x7f0700b4);
    }

    public void onPause(Fragment fragment)
    {
        subscription.unsubscribe();
        super.onPause(fragment);
    }

    public void onResume(Fragment fragment)
    {
        super.onResume(fragment);
        ((RecordActivity)uploadMonitorFragment.getActivity()).trackScreen(ScreenEvent.create(Screen.RECORD_PROGRESS));
        isCancelling = false;
        subscription = eventBus.subscribe(EventQueue.UPLOAD, new EventSubscriber(null));
    }

    public void onRetry()
    {
        if (!isUploading)
        {
            RecordActivity recordactivity = (RecordActivity)uploadMonitorFragment.getActivity();
            recordactivity.startUpload(recording);
            recordactivity.onMonitorToUpload(recording);
        }
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        a.a(this, view);
        setCircularShape(actionButton, 0x7f0b001a);
        setCircularShape(uploadProgress, 0x7f0b00e5);
        updateRecording((Recording)uploadMonitorFragment.getArguments().getParcelable("recording"));
    }




/*
    static boolean access$102(UploadMonitorPresenter uploadmonitorpresenter, boolean flag)
    {
        uploadmonitorpresenter.isCancelling = flag;
        return flag;
    }

*/




/*
    static boolean access$202(UploadMonitorPresenter uploadmonitorpresenter, boolean flag)
    {
        uploadmonitorpresenter.isUploading = flag;
        return flag;
    }

*/








    private class _cls1
        implements Runnable
    {

        final UploadMonitorPresenter this$0;

        public void run()
        {
            displayRecordScreen();
        }

        _cls1()
        {
            this$0 = UploadMonitorPresenter.this;
            super();
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final UploadMonitorPresenter this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (isUploading)
            {
                isUploading = false;
                setCancellingState();
                eventBus.publish(EventQueue.UPLOAD, UploadEvent.cancelled(recording));
            }
        }

        _cls2()
        {
            this$0 = UploadMonitorPresenter.this;
            super();
        }
    }

}
