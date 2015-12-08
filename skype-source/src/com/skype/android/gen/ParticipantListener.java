// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ParticipantListener
    implements com.skype.ObjectInterface.ObjectInterfaceIListener, com.skype.Participant.ParticipantIListener
{
    public static class OnIncomingDTMF
    {

        private com.skype.Participant.DTMF _dtmf;
        private Participant _sender;

        public com.skype.Participant.DTMF getDtmf()
        {
            return _dtmf;
        }

        public Participant getSender()
        {
            return _sender;
        }

        public OnIncomingDTMF(Participant participant, com.skype.Participant.DTMF dtmf)
        {
            _sender = participant;
            _dtmf = dtmf;
        }
    }

    public static class OnLiveSessionVideosChanged
    {

        private Participant _sender;

        public Participant getSender()
        {
            return _sender;
        }

        public OnLiveSessionVideosChanged(Participant participant)
        {
            _sender = participant;
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


    EventBus eventBus;

    public ParticipantListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onIncomingDTMF(Participant participant, com.skype.Participant.DTMF dtmf)
    {
        participant = new OnIncomingDTMF(participant, dtmf);
        eventBus.a(participant);
    }

    public void onLiveSessionVideosChanged(Participant participant)
    {
        participant = new OnLiveSessionVideosChanged(participant);
        eventBus.a(participant);
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }
}
