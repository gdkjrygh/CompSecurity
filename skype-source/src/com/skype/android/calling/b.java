// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.Video;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.calling:
//            VideoCall

final class b
    implements com.skype.Conversation.ConversationIListener, com.skype.ObjectInterface.ObjectInterfaceIListener, com.skype.Participant.ParticipantIListener, com.skype.Video.VideoIListener
{

    private VideoCall a;

    b(VideoCall videocall)
    {
        a = videocall;
    }

    public final void onCallQualityFeedbackRequested(Conversation conversation, String s, String s1, String s2)
    {
    }

    public final void onCapabilitiesChanged(Conversation conversation, boolean aflag[])
    {
    }

    public final void onEventMessage(Conversation conversation, com.skype.Conversation.EVENT_MESSAGE_TYPE event_message_type, String s)
    {
    }

    public final void onIncomingDTMF(Participant participant, com.skype.Participant.DTMF dtmf)
    {
    }

    public final void onLiveSessionEvent(Conversation conversation, com.skype.Conversation.LIVE_SESSION_EVENT live_session_event)
    {
        static final class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.skype.Conversation.LIVE_SESSION_EVENT.values().length];
                try
                {
                    b[com.skype.Conversation.LIVE_SESSION_EVENT.DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.skype.Conversation.LIVE_SESSION_EVENT.USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[PROPKEY.values().length];
                try
                {
                    a[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[PROPKEY.PARTICIPANT_SOUND_LEVEL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[PROPKEY.PARTICIPANT_VOICE_STATUS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[PROPKEY.VIDEO_STATUS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PROPKEY.VIDEO_ERROR.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        conversation = _cls1.b;
        live_session_event.ordinal();
    }

    public final void onLiveSessionMoved(Conversation conversation, int i)
    {
    }

    public final void onLiveSessionVideosChanged(Participant participant)
    {
        a.c(participant);
    }

    public final void onMessage(Conversation conversation, int i)
    {
    }

    public final void onParticipantListChange(Conversation conversation)
    {
        a.i();
    }

    public final void onPendingMediaDocumentsListChanged(Conversation conversation)
    {
    }

    public final void onPremiumVideoSubscriptionCheckResult(Conversation conversation, int i, com.skype.Conversation.PREMIUM_VIDEO_STATUS premium_video_status)
    {
    }

    public final void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        switch (_cls1.a[propkey.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.k();
            return;

        case 2: // '\002'
            objectinterface = (Participant)objectinterface;
            a.a(objectinterface);
            return;

        case 3: // '\003'
            objectinterface = (Participant)objectinterface;
            a.b(objectinterface);
            return;

        case 4: // '\004'
            a.a((Video)objectinterface);
            return;

        case 5: // '\005'
            objectinterface = (Video)objectinterface;
            break;
        }
        VideoCall.a.severe(objectinterface.getErrorProp());
    }

    public final void onSpawnConference(Conversation conversation, int i)
    {
    }
}
