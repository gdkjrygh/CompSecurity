// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Voicemail, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeWeakRef, 
//            a

public class VoicemailImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Voicemail
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyVoicemail(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public VoicemailImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public VoicemailImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createVoicemail());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public void addListener(Voicemail.VoicemailIListener voicemaililistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(voicemaililistener);
        }
        return;
        voicemaililistener;
        hashset;
        JVM INSTR monitorexit ;
        throw voicemaililistener;
    }

    public native boolean cancel();

    public native boolean checkPermission();

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean delete();

    public native boolean forwardToContacts(int ai[]);

    public native boolean forwardToGroups(int ai[]);

    public int getAllowedDurationProp()
    {
        return getIntProperty(PROPKEY.VM_ALLOWED_DURATION);
    }

    public byte[] getChatmsgGuidProp()
    {
        return getBinProperty(PROPKEY.VM_CHATMSG_GUID);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.VM_CONVO_ID);
    }

    public int getDurationProp()
    {
        return getIntProperty(PROPKEY.VM_DURATION);
    }

    public native int getEventId();

    public Voicemail.FAILUREREASON getFailureReasonProp()
    {
        return Voicemail.FAILUREREASON.fromInt(getIntProperty(PROPKEY.VM_FAILUREREASON));
    }

    public String getPartnerDispnameProp()
    {
        return getStrProperty(PROPKEY.VM_PARTNER_DISPNAME);
    }

    public String getPartnerHandleProp()
    {
        return getStrProperty(PROPKEY.VM_PARTNER_HANDLE);
    }

    public int getPlaybackProgressProp()
    {
        return getIntProperty(PROPKEY.VM_PLAYBACK_PROGRESS);
    }

    public Voicemail.STATUS getStatusProp()
    {
        return Voicemail.STATUS.fromInt(getIntProperty(PROPKEY.VM_STATUS));
    }

    public String getSubjectProp()
    {
        return getStrProperty(PROPKEY.VM_SUBJECT);
    }

    public int getTimestampProp()
    {
        return getIntProperty(PROPKEY.VM_TIMESTAMP);
    }

    public Voicemail.TYPE getTypeProp()
    {
        return Voicemail.TYPE.fromInt(getIntProperty(PROPKEY.VM_TYPE));
    }

    public native void initializeListener();

    public void removeListener(Voicemail.VoicemailIListener voicemaililistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(voicemaililistener);
        }
        return;
        voicemaililistener;
        hashset;
        JVM INSTR monitorexit ;
        throw voicemaililistener;
    }

    public native boolean startPlayback();

    public native boolean startRecording();

    public native boolean stopPlayback();

    public native boolean stopRecording();
}
