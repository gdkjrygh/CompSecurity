// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, VideoMessage, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeStringConvert, 
//            NativeWeakRef, a

public class VideoMessageImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, VideoMessage
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyVideoMessage(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public VideoMessageImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public VideoMessageImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createVideoMessage());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public void addListener(VideoMessage.VideoMessageIListener videomessageilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(videomessageilistener);
        }
        return;
        videomessageilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw videomessageilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public String getAuthorProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_AUTHOR);
    }

    public int getCreationTimestampProp()
    {
        return getIntProperty(PROPKEY.VIDEOMESSAGE_CREATION_TIMESTAMP);
    }

    public String getDescriptionProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_DESCRIPTION);
    }

    public String getLocalPathProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_LOCAL_PATH);
    }

    public int getProgressProp()
    {
        return getIntProperty(PROPKEY.VIDEOMESSAGE_PROGRESS);
    }

    public String getPublicLinkProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_PUBLIC_LINK);
    }

    public VideoMessage.STATUS getStatusProp()
    {
        return VideoMessage.STATUS.fromInt(getIntProperty(PROPKEY.VIDEOMESSAGE_STATUS));
    }

    public native void getThumbnail();

    public String getTitleProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_TITLE);
    }

    public String getTypeProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_TYPE);
    }

    public String getVodPathProp()
    {
        return getStrProperty(PROPKEY.VIDEOMESSAGE_VOD_PATH);
    }

    public VideoMessage.VOD_STATUS getVodStatusProp()
    {
        return VideoMessage.VOD_STATUS.fromInt(getIntProperty(PROPKEY.VIDEOMESSAGE_VOD_STATUS));
    }

    public native void initializeListener();

    public void onThumbnailPath(byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((VideoMessage.VideoMessageIListener)iterator.next()).onThumbnailPath(this, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_51;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void prepareForPlay()
    {
        prepareForPlay(false);
    }

    public native void prepareForPlay(boolean flag);

    public void removeListener(VideoMessage.VideoMessageIListener videomessageilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(videomessageilistener);
        }
        return;
        videomessageilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw videomessageilistener;
    }
}
