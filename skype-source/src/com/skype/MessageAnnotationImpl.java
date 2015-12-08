// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, MessageAnnotation, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeWeakRef, 
//            a

public class MessageAnnotationImpl extends ObjectInterfaceImpl
    implements MessageAnnotation, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyMessageAnnotation(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public MessageAnnotationImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public MessageAnnotationImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createMessageAnnotation());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public void addListener(MessageAnnotation.MessageAnnotationIListener messageannotationilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(messageannotationilistener);
        }
        return;
        messageannotationilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw messageannotationilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public String getAuthorProp()
    {
        return getStrProperty(PROPKEY.MESSAGEANNOTATION_AUTHOR);
    }

    public String getKeyProp()
    {
        return getStrProperty(PROPKEY.MESSAGEANNOTATION_KEY);
    }

    public int getMessageIdProp()
    {
        return getIntProperty(PROPKEY.MESSAGEANNOTATION_MESSAGE_ID);
    }

    public MessageAnnotation.STATUS getStatusProp()
    {
        return MessageAnnotation.STATUS.fromInt(getIntProperty(PROPKEY.MESSAGEANNOTATION_STATUS));
    }

    public int getTimestampProp()
    {
        return getIntProperty(PROPKEY.MESSAGEANNOTATION_TIMESTAMP);
    }

    public MessageAnnotation.TYPE getTypeProp()
    {
        return MessageAnnotation.TYPE.fromInt(getIntProperty(PROPKEY.MESSAGEANNOTATION_TYPE));
    }

    public String getValueProp()
    {
        return getStrProperty(PROPKEY.MESSAGEANNOTATION_VALUE);
    }

    public native void initializeListener();

    public void removeListener(MessageAnnotation.MessageAnnotationIListener messageannotationilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(messageannotationilistener);
        }
        return;
        messageannotationilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw messageannotationilistener;
    }
}
