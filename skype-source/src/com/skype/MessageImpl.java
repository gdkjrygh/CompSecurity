// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, Message, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, MediaDocument, Sms, VideoMessage, 
//            Voicemail, a

public class MessageImpl extends ObjectInterfaceImpl
    implements Message, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyMessage(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public MessageImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public MessageImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createMessage());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native int addAnnotation(MessageAnnotation.TYPE type, byte abyte0[], byte abyte1[]);

    private native boolean edit(byte abyte0[], boolean flag, boolean flag1, byte abyte1[]);

    public int addAnnotation(MessageAnnotation.TYPE type, String s, String s1)
    {
        return addAnnotation(type, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public void addListener(Message.MessageIListener messageilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(messageilistener);
        }
        return;
        messageilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw messageilistener;
    }

    public native boolean canAnnotate();

    public native boolean canEdit();

    public native Message.CountAnnotations_Result countAnnotations(MessageAnnotation.TYPE type);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean deleteLocally();

    public boolean edit(String s)
    {
        return edit(s, false, false, "");
    }

    public boolean edit(String s, boolean flag)
    {
        return edit(s, flag, false, "");
    }

    public boolean edit(String s, boolean flag, boolean flag1)
    {
        return edit(s, flag, flag1, "");
    }

    public boolean edit(String s, boolean flag, boolean flag1, String s1)
    {
        return edit(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1, NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public int getAnnotationVersionProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_ANNOTATION_VERSION);
    }

    public native Message.GetAnnotations_Result getAnnotations(MessageAnnotation.TYPE type);

    public String getAuthorDisplaynameProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_AUTHOR_DISPLAYNAME);
    }

    public String getAuthorProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_AUTHOR);
    }

    public boolean getAuthorWasLiveProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_AUTHOR_WAS_LIVE) != 0;
    }

    public String getBodyXmlProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_BODY_XML);
    }

    public String getCallGuidProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_CALL_GUID);
    }

    public Message.CONSUMPTION_STATUS getConsumptionStatusProp()
    {
        return Message.CONSUMPTION_STATUS.fromInt(getIntProperty(PROPKEY.MESSAGE_CONSUMPTION_STATUS));
    }

    public native Message.GetContacts_Result getContacts();

    public String getConvoGuidProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_CONVO_GUID);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_CONVO_ID);
    }

    public int getEditTimestampProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_EDIT_TIMESTAMP);
    }

    public String getEditedByProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_EDITED_BY);
    }

    public byte[] getGuidProp()
    {
        return getBinProperty(PROPKEY.MESSAGE_GUID);
    }

    public String getIdentitiesProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_IDENTITIES);
    }

    public SkyLib.LEAVE_REASON getLeaveReasonProp()
    {
        return SkyLib.LEAVE_REASON.fromInt(getIntProperty(PROPKEY.MESSAGE_LEAVEREASON));
    }

    public native Message.GetLocation_Result getLocation();

    public native boolean getMediaDocument(MediaDocument mediadocument);

    public int getOptionBitsProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_OPTION_BITS);
    }

    public String getOriginallyMeantForProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_ORIGINALLY_MEANT_FOR);
    }

    public native int getOtherLiveMessage();

    public native Message.GetOwnAnnotations_Result getOwnAnnotations(MessageAnnotation.TYPE type);

    public int getParamKeyProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_PARAM_KEY);
    }

    public int getParamValueProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_PARAM_VALUE);
    }

    public int getParticipantCountProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_PARTICIPANT_COUNT);
    }

    public native Message.PERMISSIONS getPermissions();

    public String getReasonProp()
    {
        return getStrProperty(PROPKEY.MESSAGE_REASON);
    }

    public native boolean getSMS(Sms sms);

    public Message.SENDING_STATUS getSendingStatusProp()
    {
        return Message.SENDING_STATUS.fromInt(getIntProperty(PROPKEY.MESSAGE_SENDING_STATUS));
    }

    public int getTimestampProp()
    {
        return getIntProperty(PROPKEY.MESSAGE_TIMESTAMP);
    }

    public native Message.GetTransfers_Result getTransfers();

    public Message.TYPE getTypeProp()
    {
        return Message.TYPE.fromInt(getIntProperty(PROPKEY.MESSAGE_TYPE));
    }

    public native boolean getVideoMessage(VideoMessage videomessage);

    public native boolean getVoiceMessage(Voicemail voicemail);

    public native void initializeListener();

    public native void removeAnnotation(int i);

    public void removeListener(Message.MessageIListener messageilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(messageilistener);
        }
        return;
        messageilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw messageilistener;
    }
}
