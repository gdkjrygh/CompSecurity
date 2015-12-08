// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, Alert, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeWeakRef, 
//            a

public class AlertImpl extends ObjectInterfaceImpl
    implements Alert, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyAlert(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public AlertImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public AlertImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createAlert());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public void addListener(Alert.AlertIListener alertilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(alertilistener);
        }
        return;
        alertilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw alertilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean delete();

    public byte[] getChatmsgGuidProp()
    {
        return getBinProperty(PROPKEY.ALERT_CHATMSG_GUID);
    }

    public boolean getIsUnseenProp()
    {
        return getIntProperty(PROPKEY.ALERT_IS_UNSEEN) != 0;
    }

    public String getMessageButtonCaptionProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_BUTTON_CAPTION);
    }

    public String getMessageButtonUriProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_BUTTON_URI);
    }

    public String getMessageContentProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_CONTENT);
    }

    public String getMessageFooterProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_FOOTER);
    }

    public String getMessageHeaderCancelProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_HEADER_CANCEL);
    }

    public String getMessageHeaderCaptionProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_HEADER_CAPTION);
    }

    public String getMessageHeaderLaterProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_HEADER_LATER);
    }

    public String getMessageHeaderSubjectProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_HEADER_SUBJECT);
    }

    public String getMessageHeaderTitleProp()
    {
        return getStrProperty(PROPKEY.ALERT_MESSAGE_HEADER_TITLE);
    }

    public Alert.TYPE getMessageTypeProp()
    {
        return Alert.TYPE.fromInt(getIntProperty(PROPKEY.ALERT_MESSAGE_TYPE));
    }

    public int getMetaExpiryProp()
    {
        return getIntProperty(PROPKEY.ALERT_META_EXPIRY);
    }

    public String getPartnerEventProp()
    {
        return getStrProperty(PROPKEY.ALERT_PARTNER_EVENT);
    }

    public String getPartnerHeaderProp()
    {
        return getStrProperty(PROPKEY.ALERT_PARTNER_HEADER);
    }

    public String getPartnerHistoryProp()
    {
        return getStrProperty(PROPKEY.ALERT_PARTNER_HISTORY);
    }

    public int getPartnerIdProp()
    {
        return getIntProperty(PROPKEY.ALERT_PARTNER_ID);
    }

    public String getPartnerLogoProp()
    {
        return getStrProperty(PROPKEY.ALERT_PARTNER_LOGO);
    }

    public String getPartnerNameProp()
    {
        return getStrProperty(PROPKEY.ALERT_PARTNER_NAME);
    }

    public int getTimestampProp()
    {
        return getIntProperty(PROPKEY.ALERT_TIMESTAMP);
    }

    public Alert.WINDOW_SIZE getWindowSizeProp()
    {
        return Alert.WINDOW_SIZE.fromInt(getIntProperty(PROPKEY.ALERT_WINDOW_SIZE));
    }

    public native void initializeListener();

    public native void markSeen();

    public void removeListener(Alert.AlertIListener alertilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(alertilistener);
        }
        return;
        alertilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw alertilistener;
    }
}
