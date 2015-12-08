// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.Voicemail;
import com.skype.VoicemailImpl;
import com.skype.android.SkypeActivity;
import com.skype.android.app.LayoutExperience;
import com.skype.android.audio.AudioRoute;
import com.skype.android.audio.BluetoothReceiver;
import com.skype.android.audio.WiredHeadsetReceiver;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.pcmhost.PcmHost;

// Referenced classes of package com.skype.android.app.chat:
//            e, MessageViewAdapterComponent, MessageHolder, j, 
//            f, PlayVoicemailDialog

final class m extends e
{
    private final class a
    {

        TextView duration;
        TextView headerText;
        BubbleRelativeLayout infoLayout;
        SymbolView playButton;
        CircularProgressBar progress;
        SymbolView sourceButton;
        final m this$0;

        public a(View view)
        {
            this$0 = m.this;
            super();
            infoLayout = (BubbleRelativeLayout)view;
            headerText = (TextView)view.findViewById(0x7f1002e0);
            sourceButton = (SymbolView)view.findViewById(0x7f1002df);
            playButton = (SymbolView)view.findViewById(0x7f1002dd);
            progress = (CircularProgressBar)view.findViewById(0x7f1002de);
            duration = (TextView)view.findViewById(0x7f1002e1);
            m1 = getContext();
            progress.setProgressBackgroundColor(getResources().getColor(0x7f0f013c));
            progress.setProgressColor(getResources().getColor(0x7f0f0135));
            progress.setProgressWidth(6F);
        }
    }

    private static final class b
    {

        TextView duration;
        TextView headerText;
        View infoLayout;
        SymbolView voicemailSymbol;
        BubbleRelativeLayout voicemailSymbolLayout;

        public b(View view)
        {
            infoLayout = view;
            voicemailSymbolLayout = (BubbleRelativeLayout)view.findViewById(0x7f1002e6);
            voicemailSymbol = (SymbolView)view.findViewById(0x7f1002e7);
            headerText = (TextView)view.findViewById(0x7f1002e0);
            duration = (TextView)view.findViewById(0x7f1002e1);
            voicemailSymbol.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.aO);
        }
    }

    private final class c extends f
    {

        private a inboundHolder;
        private View inboundView;
        private ViewStub inboundViewStub;
        private b outboundHolder;
        private View outboundView;
        private ViewStub outboundViewStub;
        final m this$0;

        public final void inflateInboundStub()
        {
            inboundView = inboundViewStub.inflate();
            inboundHolder = new a(inboundView);
        }

        public final void inflateOutboundStub()
        {
            outboundView = outboundViewStub.inflate();
            outboundHolder = new b(outboundView);
        }





        public c(View view)
        {
            this$0 = m.this;
            super(view);
            m1 = getInlineContent();
            inboundViewStub = (ViewStub)findViewById(0x7f1002e2);
            outboundViewStub = (ViewStub)findViewById(0x7f1002e4);
        }
    }

    private final class d
        implements android.view.View.OnClickListener
    {

        final m this$0;
        Voicemail vm;

        public final void onClick(View view)
        {
            if (vm.getStatusProp() != com.skype.Voicemail.STATUS.PLAYING && vm.getStatusProp() != com.skype.Voicemail.STATUS.BUFFERING) goto _L2; else goto _L1
_L1:
            parentHandler.sendEmptyMessage(3);
            vm.stopPlayback();
_L4:
            refreshContent();
            return;
_L2:
            if (vm.getStatusProp() == com.skype.Voicemail.STATUS.UNPLAYED || vm.getStatusProp() == com.skype.Voicemail.STATUS.PLAYED || vm.getStatusProp() == com.skype.Voicemail.STATUS.NOTDOWNLOADED)
            {
                parentHandler.sendEmptyMessage(2);
                vm.startPlayback();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public d(Voicemail voicemail)
        {
            this$0 = m.this;
            super();
            vm = voicemail;
        }
    }


    private static final int supportedMessageTypes[];
    AccessibilityUtil accessibility;
    Account account;
    AudioManager audioManager;
    ConversationUtil conversationUtil;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    private Handler parentHandler;
    PcmHost pcmHost;
    TimeAnomalyTelemetry timeAnomalyTelemetry;
    TimeUtil timeUtil;
    private int voicemailMaxWidth;
    private SparseArray voicemails;

    public m(Activity activity, Handler handler)
    {
        super(activity);
        getComponent().inject(this);
        parentHandler = handler;
        voicemails = new SparseArray();
        voicemailMaxWidth = activity.getResources().getDimensionPixelSize(0x7f0c0185);
    }

    private void bindInboundVoicemailView(a a1, ViewGroup viewgroup, Message message, boolean flag)
    {
        updateInboundVoicemailViewForAccessibility(a1, viewgroup, message);
        viewgroup = getContext();
        message = voicemailForMessage(message);
        Object obj = timeUtil.a(message.getDurationProp());
        if (shouldTurnSpeakerPhoneOff())
        {
            setSpeakerphoneOn(false);
            refreshContent();
        }
        if (!isAnyVoicemailPlaying())
        {
            parentHandler.sendEmptyMessage(3);
        }
        a1.progress.setProgress(0);
        a1.progress.setMax(10);
        a1.playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bV);
        a1.duration.setText(((CharSequence) (obj)));
        a1.headerText.setText(viewgroup.getString(0x7f080457));
        a1.infoLayout.setDirectionState(com.skype.android.widget.bubbles.Bubblable.Direction.a, flag);
        updateSourceButtonPresentationWithAudioState(a1.sourceButton);
        obj = message.getStatusProp();
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$Voicemail$STATUS[];

            static 
            {
                $SwitchMap$com$skype$Voicemail$STATUS = new int[com.skype.Voicemail.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Voicemail$STATUS[com.skype.Voicemail.STATUS.BUFFERING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Voicemail$STATUS[com.skype.Voicemail.STATUS.PLAYING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Voicemail$STATUS[com.skype.Voicemail.STATUS.FAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.Voicemail.STATUS[((com.skype.Voicemail.STATUS) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            a1.playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bX);
            a1.progress.setMax(message.getDurationProp());
            a1.progress.setProgress(message.getPlaybackProgressProp());
            a1.duration.setText(timeUtil.a(message.getPlaybackProgressProp()));
            return;

        case 3: // '\003'
            a1.headerText.setText(viewgroup.getString(0x7f080455));
            break;
        }
    }

    private void bindOutboundVoicemailView(b b1, ViewGroup viewgroup, Message message, boolean flag)
    {
        message = voicemailForMessage(message);
        b1.duration.setText(timeUtil.a(message.getDurationProp()));
        b1.voicemailSymbolLayout.setDirectionState(com.skype.android.widget.bubbles.Bubblable.Direction.b, flag);
        if (message.getStatusProp() == com.skype.Voicemail.STATUS.UPLOADING)
        {
            b1.duration.setText(getContext().getString(0x7f0803db));
        }
        updateOutboundVoicemailViewForAccessibility(b1, viewgroup, message);
    }

    private boolean isAnyVoicemailPlaying()
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < voicemails.size())
                {
                    com.skype.Voicemail.STATUS status = ((Voicemail)voicemails.valueAt(i)).getStatusProp();
                    if (status != com.skype.Voicemail.STATUS.BUFFERING && status != com.skype.Voicemail.STATUS.PLAYING)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private void setAccessibilityVoicemailPlaybackOnClickListener(View view, final Message message)
    {
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final m this$0;
            final Message val$message;

            public final void onClick(View view1)
            {
                view1 = new PlayVoicemailDialog();
                Bundle bundle = new Bundle();
                bundle.putInt("com.skype.objId", message.getObjectID());
                view1.setArguments(bundle);
                view1.show(((SkypeActivity)getContext()).getSupportFragmentManager());
            }

            
            {
                this$0 = m.this;
                message = message1;
                super();
            }
        });
    }

    private void setSpeakerphoneOn(boolean flag)
    {
        if (flag)
        {
            AudioRoute.c.a(audioManager, pcmHost);
            return;
        } else
        {
            AudioRoute.a.a(audioManager, pcmHost);
            return;
        }
    }

    private boolean shouldTurnSpeakerPhoneOff()
    {
label0:
        {
            boolean flag = false;
            if (audioManager.isSpeakerphoneOn())
            {
                if (isAnyVoicemailPlaying())
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    private void updateInboundVoicemailViewForAccessibility(a a1, ViewGroup viewgroup, Message message)
    {
        Voicemail voicemail = voicemailForMessage(message);
        final Object vmStatus = voicemail.getStatusProp();
        if (accessibility.a())
        {
            AccessibilityUtil.a(new View[] {
                a1.playButton, a1.progress, a1.sourceButton, a1.headerText, a1.duration, a1.infoLayout
            });
            ViewUtil.a(new View[] {
                a1.playButton, a1.progress, a1.sourceButton, a1.headerText, a1.duration, a1.infoLayout
            });
            ViewUtil.a(null, new View[] {
                a1.playButton, a1.sourceButton, a1.infoLayout
            });
            viewgroup.setOnLongClickListener(null);
            viewgroup.setClickable(true);
            a1.infoLayout.setOnLongClickListener(null);
            setAccessibilityVoicemailPlaybackOnClickListener(a1.infoLayout, message);
            a1.progress.setEnabled(false);
            a1.playButton.setEnabled(false);
            a1.sourceButton.setEnabled(false);
            message = ViewUtil.b(a1.headerText);
            a1 = getContext();
            if (vmStatus != com.skype.Voicemail.STATUS.PLAYED && vmStatus != com.skype.Voicemail.STATUS.PLAYING)
            {
                a1 = a1.getString(0x7f080071);
            } else
            {
                a1 = a1.getString(0x7f080070);
            }
            try
            {
                vmStatus = timeUtil.a(voicemail.getDurationProp(), false).toString();
                viewgroup.setContentDescription((new StringBuilder()).append(message).append(", ").append(((String) (vmStatus))).append(", ").append(a1).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (final Object vmStatus)
            {
                timeAnomalyTelemetry.a(((TimeAnomalyException) (vmStatus)), voicemail.getTypeProp(), "Voicemail#inbound");
            }
            viewgroup.setContentDescription((new StringBuilder()).append(message).append(", ").append(a1).toString());
            return;
        } else
        {
            viewgroup = new d(voicemail);
            a1.infoLayout.setOnClickListener(viewgroup);
            a1.playButton.setOnClickListener(viewgroup);
            a1.sourceButton.setOnClickListener(new android.view.View.OnClickListener() {

                final m this$0;
                final com.skype.Voicemail.STATUS val$vmStatus;

                public final void onClick(View view)
                {
                    if (vmStatus == com.skype.Voicemail.STATUS.PLAYING || vmStatus == com.skype.Voicemail.STATUS.BUFFERING)
                    {
                        view = m.this;
                        boolean flag;
                        if (!audioManager.isSpeakerphoneOn())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        view.setSpeakerphoneOn(flag);
                    }
                    refreshContent();
                }

            
            {
                this$0 = m.this;
                vmStatus = status;
                super();
            }
            });
            return;
        }
    }

    private void updateOutboundVoicemailViewForAccessibility(b b1, ViewGroup viewgroup, Voicemail voicemail)
    {
        if (!accessibility.a())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        AccessibilityUtil.a(new View[] {
            b1.voicemailSymbolLayout, b1.voicemailSymbol, b1.headerText, b1.duration, b1.infoLayout
        });
        ViewUtil.a(new View[] {
            b1.voicemailSymbolLayout, b1.voicemailSymbol, b1.headerText, b1.duration, b1.infoLayout
        });
        b1.infoLayout.setOnClickListener(null);
        viewgroup.setOnLongClickListener(null);
        viewgroup.setOnClickListener(null);
        viewgroup.setClickable(false);
        viewgroup.setLongClickable(false);
        b1.voicemailSymbolLayout.setOnClickListener(null);
        b1 = ViewUtil.b(b1.headerText);
        String s = timeUtil.a(voicemail.getDurationProp(), false).toString();
        viewgroup.setContentDescription((new StringBuilder()).append(b1).append(", ").append(s).toString());
        return;
        TimeAnomalyException timeanomalyexception;
        timeanomalyexception;
        timeAnomalyTelemetry.a(timeanomalyexception, voicemail.getTypeProp(), "Voicemail#outbound");
        viewgroup.setContentDescription(b1);
        return;
    }

    private void updateSourceButtonPresentationWithAudioState(SymbolView symbolview)
    {
        Activity activity;
        if (WiredHeadsetReceiver.a())
        {
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bO);
        } else
        if (BluetoothReceiver.a().booleanValue())
        {
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bQ);
        } else
        if (layoutExperience.isMultipane())
        {
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.a);
        } else
        {
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bH);
        }
        activity = getContext();
        if (audioManager.isSpeakerphoneOn())
        {
            symbolview.setSymbolRoundBackgroundColor(activity.getResources().getColor(0x7f0f0135));
            symbolview.setTextColor(activity.getResources().getColor(0x7f0f00d3));
            return;
        } else
        {
            symbolview.setSymbolRoundBackgroundColor(activity.getResources().getColor(0x7f0f00d3));
            symbolview.setTextColor(activity.getResources().getColor(0x7f0f0135));
            return;
        }
    }

    private Voicemail voicemailForMessage(Message message)
    {
        Voicemail voicemail = (Voicemail)voicemails.get(message.getObjectID());
        Object obj = voicemail;
        if (voicemail == null)
        {
            VoicemailImpl voicemailimpl = new VoicemailImpl();
            obj = voicemailimpl;
            if (message.getVoiceMessage(voicemailimpl))
            {
                voicemails.put(message.getObjectID(), voicemailimpl);
                map.b(voicemailimpl);
                map.a(voicemailimpl);
                obj = voicemailimpl;
            }
        }
        return ((Voicemail) (obj));
    }

    protected final void bindContentView(j j, MessageHolder messageholder)
    {
        j = (c)j;
        messageholder = (Message)messageholder.getMessageObject();
        boolean flag;
        if (messageholder.getAuthorProp().equals(account.getSkypenameProp()) || messageholder.getAuthorProp().equals(account.getLiveidMembernameProp()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (((c) (j)).outboundHolder == null)
            {
                j.inflateOutboundStub();
            }
            if (((c) (j)).inboundView != null)
            {
                ((c) (j)).inboundView.setVisibility(8);
            }
            ((c) (j)).outboundView.setVisibility(0);
            bindOutboundVoicemailView(((c) (j)).outboundHolder, j.getInlineContent(), messageholder, j.isChained());
            return;
        }
        if (((c) (j)).inboundHolder == null)
        {
            j.inflateInboundStub();
        }
        if (((c) (j)).outboundView != null)
        {
            ((c) (j)).outboundView.setVisibility(8);
        }
        ((c) (j)).inboundView.setVisibility(0);
        setOnItemLongClickListener(messageholder, ((c) (j)).inboundHolder.infoLayout, j.getLayoutPosition());
        bindInboundVoicemailView(((c) (j)).inboundHolder, j.getInlineContent(), messageholder, j.isChained());
    }

    protected final j createMessageViewHolder(View view)
    {
        return new c(view);
    }

    protected final int getLayoutId(int i)
    {
        return 0x7f030053;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected final void refreshContent()
    {
        parentHandler.sendEmptyMessage(1);
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.toInt()
        });
    }


}
