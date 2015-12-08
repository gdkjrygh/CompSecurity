// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Video, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeWeakRef, 
//            a

public class VideoImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Video
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyVideo(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public VideoImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public VideoImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createVideo());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public void addListener(Video.VideoIListener videoilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(videoilistener);
        }
        return;
        videoilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw videoilistener;
    }

    public native void createBinding(int i, int j);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.VIDEO_CONVO_ID);
    }

    public native Video.GetCurrentVideoDevice_Result getCurrentVideoDevice();

    public String getDebuginfoProp()
    {
        return getStrProperty(PROPKEY.VIDEO_DEBUGINFO);
    }

    public String getDeviceNameProp()
    {
        return getStrProperty(PROPKEY.VIDEO_DEVICE_NAME);
    }

    public String getDevicePathProp()
    {
        return getStrProperty(PROPKEY.VIDEO_DEVICE_PATH);
    }

    public String getDimensionsProp()
    {
        return getStrProperty(PROPKEY.VIDEO_DIMENSIONS);
    }

    public int getDuration1080Prop()
    {
        return getIntProperty(PROPKEY.VIDEO_DURATION_1080);
    }

    public int getDuration720Prop()
    {
        return getIntProperty(PROPKEY.VIDEO_DURATION_720);
    }

    public int getDurationHqvProp()
    {
        return getIntProperty(PROPKEY.VIDEO_DURATION_HQV);
    }

    public int getDurationLtvgad2Prop()
    {
        return getIntProperty(PROPKEY.VIDEO_DURATION_LTVGAD2);
    }

    public int getDurationSsProp()
    {
        return getIntProperty(PROPKEY.VIDEO_DURATION_SS);
    }

    public int getDurationVgad2Prop()
    {
        return getIntProperty(PROPKEY.VIDEO_DURATION_VGAD2);
    }

    public String getErrorProp()
    {
        return getStrProperty(PROPKEY.VIDEO_ERROR);
    }

    public int getHqPresentProp()
    {
        return getIntProperty(PROPKEY.VIDEO_HQ_PRESENT);
    }

    public Video.MEDIATYPE getMediaTypeProp()
    {
        return Video.MEDIATYPE.fromInt(getIntProperty(PROPKEY.VIDEO_MEDIA_TYPE));
    }

    public int getSsTimestampProp()
    {
        return getIntProperty(PROPKEY.VIDEO_SS_TIMESTAMP);
    }

    public Video.STATUS getStatusProp()
    {
        return Video.STATUS.fromInt(getIntProperty(PROPKEY.VIDEO_STATUS));
    }

    public int getTimestampProp()
    {
        return getIntProperty(PROPKEY.VIDEO_TIMESTAMP);
    }

    public native void initializeListener();

    public native void releaseBinding(int i);

    public void removeListener(Video.VideoIListener videoilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(videoilistener);
        }
        return;
        videoilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw videoilistener;
    }

    public native void setIncomingTransmissionsDesired(boolean flag);

    public native void setRemoteRendererId(int i);

    public void setScreenCaptureRectangle(int i, int j, int k, int l)
    {
        setScreenCaptureRectangle(i, j, k, l, 0, 0);
    }

    public void setScreenCaptureRectangle(int i, int j, int k, int l, int i1)
    {
        setScreenCaptureRectangle(i, j, k, l, i1, 0);
    }

    public native void setScreenCaptureRectangle(int i, int j, int k, int l, int i1, int j1);

    public native void setVideoConsumptionProperties(int i, int j);

    public native void start();

    public native void stop();
}
