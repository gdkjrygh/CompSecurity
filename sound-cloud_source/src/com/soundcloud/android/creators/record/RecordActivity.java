// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.upload.MetadataFragment;
import com.soundcloud.android.creators.upload.UploadMonitorFragment;
import com.soundcloud.android.creators.upload.UploadService;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.b;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, RecordFragment

public class RecordActivity extends ScActivity
{

    private static final String METADATA_FRAGMENT_TAG = "metadata_fragment";
    private static final String RECORD_FRAGMENT_TAG = "recording_fragment";
    private static final String UPLOAD_PROGRESS_FRAGMENT_TAG = "upload_progress_fragment";
    ActionBarHelper actionBarHelper;
    BaseLayoutHelper baseLayoutHelper;
    EventBus eventBus;
    private Y initialStateSubscription;
    Navigator navigator;
    SoundRecorder recorder;

    public RecordActivity()
    {
        initialStateSubscription = RxUtils.invalidSubscription();
    }

    private MetadataFragment getMetadataFragment()
    {
        return (MetadataFragment)getSupportFragmentManager().findFragmentByTag("metadata_fragment");
    }

    private Fragment getRecordFragment()
    {
        return getSupportFragmentManager().findFragmentByTag("recording_fragment");
    }

    private UploadMonitorFragment getUploadMonitorFragment()
    {
        return (UploadMonitorFragment)getSupportFragmentManager().findFragmentByTag("upload_progress_fragment");
    }

    private void restoreCurrentFragment()
    {
        if (getSupportFragmentManager().findFragmentById(0x7f0f00b5) == null)
        {
            initialStateSubscription = eventBus.queue(EventQueue.UPLOAD).first().subscribe(new _cls1());
        }
    }

    private boolean setRecordingFromIntent(Intent intent)
    {
        Recording recording = Recording.fromIntent(intent);
        if (recording != null)
        {
            recorder.reset();
            recorder.setRecording(recording);
            intent.removeExtra("recording");
            return true;
        } else
        {
            return false;
        }
    }

    private void transition(Fragment fragment, String s, boolean flag)
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.setCustomAnimations(0x7f040010, 0x7f040012, 0x7f040010, 0x7f040012);
        fragmenttransaction.replace(0x7f0f00b5, fragment, s);
        if (flag)
        {
            fragmenttransaction.addToBackStack(null);
        }
        fragmenttransaction.commit();
    }

    public void displayMonitor(Recording recording)
    {
        UploadMonitorFragment uploadmonitorfragment = getUploadMonitorFragment();
        Object obj = uploadmonitorfragment;
        if (uploadmonitorfragment == null)
        {
            obj = UploadMonitorFragment.create(recording);
        }
        getSupportFragmentManager().beginTransaction().setCustomAnimations(0x7f040010, 0x7f040012).replace(0x7f0f00b5, ((Fragment) (obj)), "upload_progress_fragment").commit();
    }

    public void displayRecord()
    {
        Fragment fragment1 = getRecordFragment();
        Fragment fragment = fragment1;
        if (fragment1 == null)
        {
            fragment = RecordFragment.create();
        }
        getSupportFragmentManager().popBackStack(null, 1);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(0x7f040010, 0x7f040012).replace(0x7f0f00b5, fragment, "recording_fragment").commit();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        MetadataFragment metadatafragment;
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown requestCode: ")).append(i).toString());

        case 6709: 
        case 9000: 
        case 9001: 
            metadatafragment = getMetadataFragment();
            break;
        }
        if (metadatafragment != null)
        {
            metadatafragment.onActivityResult(i, j, intent);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        getWindow().requestFeature(12);
        super.onCreate(bundle);
        restoreCurrentFragment();
    }

    protected void onDestroy()
    {
        initialStateSubscription.unsubscribe();
        super.onDestroy();
    }

    public void onMonitorToUpload(Recording recording)
    {
        UploadMonitorFragment uploadmonitorfragment = getUploadMonitorFragment();
        Object obj = uploadmonitorfragment;
        if (uploadmonitorfragment == null)
        {
            obj = UploadMonitorFragment.create(recording);
        }
        getSupportFragmentManager().popBackStack(null, 1);
        transition(((Fragment) (obj)), "upload_progress_fragment", false);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (setRecordingFromIntent(intent))
        {
            onRecordToMetadata(false);
        }
    }

    public void onRecordToMetadata(boolean flag)
    {
        MetadataFragment metadatafragment = getMetadataFragment();
        Object obj = metadatafragment;
        if (metadatafragment == null)
        {
            obj = MetadataFragment.create();
        }
        transition(((Fragment) (obj)), "metadata_fragment", flag);
    }

    public boolean onSupportNavigateUp()
    {
        navigator.openHome(this);
        finish();
        return true;
    }

    public void onUploadToRecord()
    {
        Fragment fragment1 = getRecordFragment();
        Fragment fragment = fragment1;
        if (fragment1 == null)
        {
            fragment = RecordFragment.create();
        }
        transition(fragment, "recording_fragment", false);
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setContainerLayout(this);
    }

    public void startUpload(Recording recording)
    {
        startService(new Intent(this, com/soundcloud/android/creators/upload/UploadService));
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.start(recording));
    }

    public void trackScreen(ScreenEvent screenevent)
    {
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, screenevent);
        }
    }


    private class _cls1 extends DefaultSubscriber
    {

        final RecordActivity this$0;

        public void onNext(UploadEvent uploadevent)
        {
            if (uploadevent.isUploading())
            {
                displayMonitor(uploadevent.getRecording());
                return;
            }
            if (!setRecordingFromIntent(getIntent()))
            {
                displayRecord();
                return;
            } else
            {
                onRecordToMetadata(false);
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((UploadEvent)obj);
        }

        _cls1()
        {
            this$0 = RecordActivity.this;
            super();
        }
    }

}
