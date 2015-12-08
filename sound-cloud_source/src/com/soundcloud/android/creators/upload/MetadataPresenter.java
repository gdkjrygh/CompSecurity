// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import a.a;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.crop.Crop;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.image.PlaceholderGenerator;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.ViewHelper;
import com.soundcloud.android.utils.images.ImageUtils;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            RecordingMetaDataLayout, MetadataFragment

public class MetadataPresenter extends SupportFragmentLightCycleDispatcher
{

    public static final String RECORDING_KEY = "recording";
    ImageButton actionButton;
    private MetadataFragment metadataFragment;
    private PlaceholderGenerator placeholderGenerator;
    RadioGroup rdoPrivacy;
    RadioButton rdoPrivate;
    RadioButton rdoPublic;
    private SoundRecorder recorder;
    private Recording recording;
    RecordingMetaDataLayout recordingMetadata;
    TextView txtRecordOptions;
    private final ViewHelper viewHelper;

    public MetadataPresenter(SoundRecorder soundrecorder, PlaceholderGenerator placeholdergenerator, ViewHelper viewhelper)
    {
        recorder = soundrecorder;
        placeholderGenerator = placeholdergenerator;
        viewHelper = viewhelper;
    }

    private void mapToRecording(Recording recording1)
    {
        recordingMetadata.mapToRecording(recording1);
        boolean flag;
        if (rdoPrivacy.getCheckedRadioButtonId() == 0x7f0f0189)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        recording1.is_private = flag;
    }

    private void restoreRecording()
    {
        recording = recorder.getRecording();
        if (recording != null)
        {
            if (!recordingMetadata.hasPlaceholder())
            {
                recordingMetadata.setPlaceholder(placeholderGenerator.generateDrawable(String.valueOf(recording.hashCode())));
            }
            recordingMetadata.setRecording(recording, true);
            return;
        } else
        {
            ((RecordActivity)metadataFragment.getActivity()).displayRecord();
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   6709: 71
    //                   9000: 60
    //                   9001: 60;
           goto _L1 _L2 _L3 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown requestCode: ")).append(i).toString());
_L3:
        if (j == -1)
        {
            onArtworkSelected(intent);
        }
_L5:
        return;
_L2:
        if (j == -1)
        {
            onSuccessfulCrop();
            return;
        }
        if (j == 404)
        {
            ErrorUtils.handleSilentException("error cropping image", Crop.getError(intent));
            Toast.makeText(metadataFragment.getActivity(), 0x7f0700fc, 0).show();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onArtworkSelected(Intent intent)
    {
        Uri uri = Uri.fromFile(recording.getImageFile());
        if (intent != null)
        {
            ImageUtils.sendCropIntent(metadataFragment.getActivity(), intent.getData(), uri);
            return;
        } else
        {
            ImageUtils.sendCropIntent(metadataFragment.getActivity(), uri);
            return;
        }
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        metadataFragment = (MetadataFragment)fragment;
        metadataFragment.getActivity().setTitle(0x7f0700ae);
    }

    public void onDestroyView(Fragment fragment)
    {
        super.onDestroyView(fragment);
        if (recordingMetadata != null)
        {
            recordingMetadata.onDestroy();
        }
    }

    public void onPause(Fragment fragment)
    {
        recordingMetadata.mapToRecording(recording);
        super.onPause(fragment);
    }

    void onPost()
    {
        if (recording != null)
        {
            RecordActivity recordactivity = (RecordActivity)metadataFragment.getActivity();
            mapToRecording(recording);
            recordactivity.startUpload(recording);
            recordactivity.onMonitorToUpload(recording);
        }
    }

    public void onResume(Fragment fragment)
    {
        super.onResume(fragment);
        restoreRecording();
        ((RecordActivity)metadataFragment.getActivity()).trackScreen(ScreenEvent.create(Screen.RECORD_UPLOAD));
    }

    public void onSaveInstanceState(Fragment fragment, Bundle bundle)
    {
        bundle.putInt("createPrivacyValue", rdoPrivacy.getCheckedRadioButtonId());
        recordingMetadata.onSaveInstanceState(bundle);
        super.onSaveInstanceState(fragment, bundle);
    }

    public void onStart(Fragment fragment)
    {
        super.onStart(fragment);
        metadataFragment = (MetadataFragment)fragment;
    }

    public void onStop(Fragment fragment)
    {
        super.onStop(fragment);
        if (recording != null && !recording.external_upload)
        {
            mapToRecording(recording);
        }
    }

    public void onSuccessfulCrop()
    {
        recording.artwork_path = recording.getImageFile();
        recordingMetadata.setImage(recording.artwork_path);
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        a.a(this, view);
        int i = view.getResources().getDimensionPixelSize(0x7f0b001a);
        viewHelper.setCircularButtonOutline(actionButton, i);
        actionButton.setImageResource(0x7f020196);
        if (bundle != null)
        {
            if (bundle.getInt("createPrivacyValue") == 0x7f0f0189)
            {
                rdoPrivate.setChecked(true);
            } else
            {
                rdoPublic.setChecked(true);
            }
            recordingMetadata.onRestoreInstanceState(bundle);
        }
        recordingMetadata.setActivity(metadataFragment.getActivity());
    }
}
