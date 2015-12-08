// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import com.skype.Voicemail;
import com.skype.VoicemailImpl;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.audio.AudioRoute;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.widget.SymbolView;
import com.skype.pcmhost.PcmHost;

public class PlayVoicemailDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnDismissListener, android.os.Handler.Callback, android.view.View.OnClickListener
{

    private static final int WHAT_REFRESH = 1;
    private final com.skype.android.widget.SymbolElement.SymbolCode AUDIO_ROUTE_EARPIECE_ICON;
    private final com.skype.android.widget.SymbolElement.SymbolCode AUDIO_ROUTE_SPEAKER_ICON;
    AudioManager audioManager;
    private com.skype.android.widget.SymbolElement.SymbolCode currentAudioRouteIcon;
    private Handler handler;
    private boolean isPlaying;
    private com.skype.Message message;
    PcmHost pcmHost;
    private SymbolView playButton;
    private ProgressBar progressBar;
    private SymbolView routingButton;
    private UpdateScheduler updateScheduler;
    private Voicemail voicemail;

    public PlayVoicemailDialog()
    {
        AUDIO_ROUTE_SPEAKER_ICON = com.skype.android.widget.SymbolElement.SymbolCode.bH;
        AUDIO_ROUTE_EARPIECE_ICON = com.skype.android.widget.SymbolElement.SymbolCode.bO;
        currentAudioRouteIcon = AUDIO_ROUTE_EARPIECE_ICON;
    }

    private void announceRoutingButton()
    {
        routingButton.sendAccessibilityEvent(32768);
    }

    private void updatePlayButton()
    {
        if (isPlaying)
        {
            playButton.setContentDescription(getString(0x7f0800ab));
            playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bX);
            return;
        } else
        {
            playButton.setContentDescription(getString(0x7f0800af));
            playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bV);
            progressBar.setProgress(0);
            return;
        }
    }

    private void updateRoutingButtonDescription()
    {
        SymbolView symbolview = routingButton;
        String s1 = getString(0x7f080100);
        String s;
        if (currentAudioRouteIcon == AUDIO_ROUTE_SPEAKER_ICON)
        {
            s = getString(0x7f080195);
        } else
        {
            s = getString(0x7f080138);
        }
        symbolview.setContentDescription(String.format(s1, new Object[] {
            s
        }));
    }

    public boolean handleMessage(Message message1)
    {
        message1.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        updatePlayButton();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        com.skype.Voicemail.STATUS status = voicemail.getStatusProp();
        if (view != playButton) goto _L2; else goto _L1
_L1:
        if (status != com.skype.Voicemail.STATUS.PLAYING && status != com.skype.Voicemail.STATUS.BUFFERING) goto _L4; else goto _L3
_L3:
        voicemail.stopPlayback();
        isPlaying = false;
        getActivity().setVolumeControlStream(2);
        updatePlayButton();
_L6:
        return;
_L4:
        if (status == com.skype.Voicemail.STATUS.UNPLAYED || status == com.skype.Voicemail.STATUS.PLAYED || status == com.skype.Voicemail.STATUS.NOTDOWNLOADED)
        {
            voicemail.startPlayback();
            isPlaying = true;
            getActivity().setVolumeControlStream(0);
            updatePlayButton();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view == routingButton)
        {
            if (currentAudioRouteIcon == AUDIO_ROUTE_SPEAKER_ICON)
            {
                view = AUDIO_ROUTE_EARPIECE_ICON;
            } else
            {
                view = AUDIO_ROUTE_SPEAKER_ICON;
            }
            currentAudioRouteIcon = view;
            routingButton.setSymbolCode(currentAudioRouteIcon);
            if (currentAudioRouteIcon == AUDIO_ROUTE_SPEAKER_ICON)
            {
                AudioRoute.c.a(audioManager, pcmHost);
            } else
            {
                AudioRoute.a.a(audioManager, pcmHost);
            }
            updateRoutingButtonDescription();
            announceRoutingButton();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        message = (com.skype.Message)getObjectInterface(com/skype/Message);
        voicemail = new VoicemailImpl();
        message.getVoiceMessage(voicemail);
        handler = new Handler(this);
        updateScheduler = new UpdateScheduler(handler);
        bundle = getMaterialDialogBuilder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f030051, null);
        playButton = (SymbolView)view.findViewById(0x7f1002dd);
        playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bV);
        playButton.setOnClickListener(this);
        progressBar = (ProgressBar)view.findViewById(0x7f1002de);
        progressBar.setMax(voicemail.getDurationProp() - 1);
        progressBar.setProgress(0);
        routingButton = (SymbolView)view.findViewById(0x7f1002df);
        routingButton.setOnClickListener(this);
        routingButton.setSymbolCode(currentAudioRouteIcon);
        updateRoutingButtonDescription();
        bundle.b(view);
        bundle.a(getString(0x7f0800ff));
        bundle.b(0x7f080120, null);
        return bundle.c();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        voicemail.stopPlayback();
    }

    public void onEvent(com.skype.android.gen.VoicemailListener.OnPropertyChange onpropertychange)
    {
        int i;
        int j;
        onpropertychange = (Voicemail)onpropertychange.getSender();
        i = onpropertychange.getPlaybackProgressProp();
        onpropertychange = onpropertychange.getStatusProp();
        j = progressBar.getMax();
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (onpropertychange != com.skype.Voicemail.STATUS.PLAYED) goto _L2; else goto _L1
_L1:
        isPlaying = false;
        updateScheduler.a(1);
_L4:
        return;
_L2:
        if (onpropertychange != com.skype.Voicemail.STATUS.PLAYING || progressBar.getProgress() == 0) goto _L4; else goto _L3
_L3:
        progressBar.setProgress(j);
        return;
        progressBar.setProgress(i);
        return;
    }
}
