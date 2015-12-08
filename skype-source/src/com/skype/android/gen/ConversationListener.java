// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ConversationListener
    implements com.skype.Conversation.ConversationIListener, com.skype.ObjectInterface.ObjectInterfaceIListener
{
    public static class OnCallQualityFeedbackRequested
    {

        private String _questionnaireId;
        private String _reason;
        private String _requestBody;
        private Conversation _sender;

        public String getQuestionnaireId()
        {
            return _questionnaireId;
        }

        public String getReason()
        {
            return _reason;
        }

        public String getRequestBody()
        {
            return _requestBody;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public OnCallQualityFeedbackRequested(Conversation conversation, String s, String s1, String s2)
        {
            _sender = conversation;
            _reason = s;
            _questionnaireId = s1;
            _requestBody = s2;
        }
    }

    public static class OnCapabilitiesChanged
    {

        private boolean _capabilities[];
        private Conversation _sender;

        public boolean[] getCapabilities()
        {
            return _capabilities;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public OnCapabilitiesChanged(Conversation conversation, boolean aflag[])
        {
            _sender = conversation;
            _capabilities = aflag;
        }
    }

    public static class OnEventMessage
    {

        private String _body;
        private Conversation _sender;
        private com.skype.Conversation.EVENT_MESSAGE_TYPE _type;

        public String getBody()
        {
            return _body;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public com.skype.Conversation.EVENT_MESSAGE_TYPE getType()
        {
            return _type;
        }

        public OnEventMessage(Conversation conversation, com.skype.Conversation.EVENT_MESSAGE_TYPE event_message_type, String s)
        {
            _sender = conversation;
            _type = event_message_type;
            _body = s;
        }
    }

    public static class OnLiveSessionEvent
    {

        private com.skype.Conversation.LIVE_SESSION_EVENT _callEventId;
        private Conversation _sender;

        public com.skype.Conversation.LIVE_SESSION_EVENT getCallEventId()
        {
            return _callEventId;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public OnLiveSessionEvent(Conversation conversation, com.skype.Conversation.LIVE_SESSION_EVENT live_session_event)
        {
            _sender = conversation;
            _callEventId = live_session_event;
        }
    }

    public static class OnLiveSessionMoved
    {

        private int _receiverObjectID;
        private Conversation _sender;

        public int getReceiverObjectID()
        {
            return _receiverObjectID;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public OnLiveSessionMoved(Conversation conversation, int i)
        {
            _sender = conversation;
            _receiverObjectID = i;
        }
    }

    public static class OnMessage
    {

        private int _messageObjectID;
        private Conversation _sender;

        public int getMessageObjectID()
        {
            return _messageObjectID;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public OnMessage(Conversation conversation, int i)
        {
            _sender = conversation;
            _messageObjectID = i;
        }
    }

    public static class OnParticipantListChange
    {

        private Conversation _sender;

        public Conversation getSender()
        {
            return _sender;
        }

        public OnParticipantListChange(Conversation conversation)
        {
            _sender = conversation;
        }
    }

    public static class OnPendingMediaDocumentsListChanged
    {

        private Conversation _sender;

        public Conversation getSender()
        {
            return _sender;
        }

        public OnPendingMediaDocumentsListChanged(Conversation conversation)
        {
            _sender = conversation;
        }
    }

    public static class OnPremiumVideoSubscriptionCheckResult
    {

        private int _requestId;
        private com.skype.Conversation.PREMIUM_VIDEO_STATUS _resultCode;
        private Conversation _sender;

        public int getRequestId()
        {
            return _requestId;
        }

        public com.skype.Conversation.PREMIUM_VIDEO_STATUS getResultCode()
        {
            return _resultCode;
        }

        public Conversation getSender()
        {
            return _sender;
        }

        public OnPremiumVideoSubscriptionCheckResult(Conversation conversation, int i, com.skype.Conversation.PREMIUM_VIDEO_STATUS premium_video_status)
        {
            _sender = conversation;
            _requestId = i;
            _resultCode = premium_video_status;
        }
    }

    public static class OnPropertyChange
    {

        private PROPKEY _propKey;
        private ObjectInterface _sender;

        public PROPKEY getPropKey()
        {
            return _propKey;
        }

        public ObjectInterface getSender()
        {
            return _sender;
        }

        public OnPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
        {
            _sender = objectinterface;
            _propKey = propkey;
        }
    }

    public static class OnSpawnConference
    {

        private Conversation _sender;
        private int _spawnedObjectID;

        public Conversation getSender()
        {
            return _sender;
        }

        public int getSpawnedObjectID()
        {
            return _spawnedObjectID;
        }

        public OnSpawnConference(Conversation conversation, int i)
        {
            _sender = conversation;
            _spawnedObjectID = i;
        }
    }


    EventBus eventBus;

    public ConversationListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onCallQualityFeedbackRequested(Conversation conversation, String s, String s1, String s2)
    {
        conversation = new OnCallQualityFeedbackRequested(conversation, s, s1, s2);
        eventBus.a(conversation);
    }

    public void onCapabilitiesChanged(Conversation conversation, boolean aflag[])
    {
        conversation = new OnCapabilitiesChanged(conversation, aflag);
        eventBus.a(conversation);
    }

    public void onEventMessage(Conversation conversation, com.skype.Conversation.EVENT_MESSAGE_TYPE event_message_type, String s)
    {
        conversation = new OnEventMessage(conversation, event_message_type, s);
        eventBus.a(conversation);
    }

    public void onLiveSessionEvent(Conversation conversation, com.skype.Conversation.LIVE_SESSION_EVENT live_session_event)
    {
        conversation = new OnLiveSessionEvent(conversation, live_session_event);
        eventBus.a(conversation);
    }

    public void onLiveSessionMoved(Conversation conversation, int i)
    {
        conversation = new OnLiveSessionMoved(conversation, i);
        eventBus.a(conversation);
    }

    public void onMessage(Conversation conversation, int i)
    {
        conversation = new OnMessage(conversation, i);
        eventBus.a(conversation);
    }

    public void onParticipantListChange(Conversation conversation)
    {
        conversation = new OnParticipantListChange(conversation);
        eventBus.a(conversation);
    }

    public void onPendingMediaDocumentsListChanged(Conversation conversation)
    {
        conversation = new OnPendingMediaDocumentsListChanged(conversation);
        eventBus.a(conversation);
    }

    public void onPremiumVideoSubscriptionCheckResult(Conversation conversation, int i, com.skype.Conversation.PREMIUM_VIDEO_STATUS premium_video_status)
    {
        conversation = new OnPremiumVideoSubscriptionCheckResult(conversation, i, premium_video_status);
        eventBus.a(conversation);
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }

    public void onSpawnConference(Conversation conversation, int i)
    {
        conversation = new OnSpawnConference(conversation, i);
        eventBus.a(conversation);
    }
}
