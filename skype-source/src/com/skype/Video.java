// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, NativeStringConvert

public interface Video
    extends ObjectInterface
{
    public static class GetCurrentVideoDevice_Result
    {

        public String m_deviceName;
        public String m_devicePath;
        public MEDIATYPE m_return;

        public void init(byte abyte0[], byte abyte1[], MEDIATYPE mediatype)
        {
            m_deviceName = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_devicePath = NativeStringConvert.ConvertFromNativeBytes(abyte1);
            m_return = mediatype;
        }

        public GetCurrentVideoDevice_Result()
        {
        }
    }

    public static final class MEDIATYPE extends Enum
    {

        private static final MEDIATYPE $VALUES[];
        public static final MEDIATYPE MEDIA_SCREENSHARING;
        public static final MEDIATYPE MEDIA_SR_AUGMENTED;
        public static final MEDIATYPE MEDIA_VIDEO;
        public static final MEDIATYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static MEDIATYPE fromInt(int i)
        {
            MEDIATYPE mediatype = (MEDIATYPE)intToTypeMap.a(i);
            if (mediatype != null)
            {
                return mediatype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static MEDIATYPE valueOf(String s)
        {
            return (MEDIATYPE)Enum.valueOf(com/skype/Video$MEDIATYPE, s);
        }

        public static MEDIATYPE[] values()
        {
            return (MEDIATYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MEDIA_SCREENSHARING = new MEDIATYPE("MEDIA_SCREENSHARING", 0, 1);
            MEDIA_VIDEO = new MEDIATYPE("MEDIA_VIDEO", 1, 0);
            MEDIA_SR_AUGMENTED = new MEDIATYPE("MEDIA_SR_AUGMENTED", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new MEDIATYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new MEDIATYPE[] {
                MEDIA_SCREENSHARING, MEDIA_VIDEO, MEDIA_SR_AUGMENTED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            MEDIATYPE amediatype[] = values();
            int k = amediatype.length;
            for (int i = 0; i < k; i++)
            {
                MEDIATYPE mediatype = amediatype[i];
                intToTypeMap.a(mediatype.value, mediatype);
            }

        }

        private MEDIATYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS AVAILABLE;
        public static final STATUS CHECKING_SUBSCRIPTION;
        public static final STATUS HINT_IS_VIDEOCALL_RECEIVED;
        public static final STATUS NOT_AVAILABLE;
        public static final STATUS NOT_STARTED;
        public static final STATUS PAUSED;
        public static final STATUS REJECTED;
        public static final STATUS RUNNING;
        public static final STATUS STARTING;
        public static final STATUS STOPPING;
        public static final STATUS SWITCHING_DEVICE;
        public static final STATUS UNATTACHED;
        public static final STATUS UNKNOWN;
        public static final STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static STATUS fromInt(int i)
        {
            STATUS status = (STATUS)intToTypeMap.a(i);
            if (status != null)
            {
                return status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static STATUS valueOf(String s)
        {
            return (STATUS)Enum.valueOf(com/skype/Video$STATUS, s);
        }

        public static STATUS[] values()
        {
            return (STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOT_AVAILABLE = new STATUS("NOT_AVAILABLE", 0, 0);
            AVAILABLE = new STATUS("AVAILABLE", 1, 1);
            STARTING = new STATUS("STARTING", 2, 2);
            REJECTED = new STATUS("REJECTED", 3, 3);
            RUNNING = new STATUS("RUNNING", 4, 4);
            STOPPING = new STATUS("STOPPING", 5, 5);
            PAUSED = new STATUS("PAUSED", 6, 6);
            NOT_STARTED = new STATUS("NOT_STARTED", 7, 7);
            HINT_IS_VIDEOCALL_RECEIVED = new STATUS("HINT_IS_VIDEOCALL_RECEIVED", 8, 8);
            UNKNOWN = new STATUS("UNKNOWN", 9, 9);
            CHECKING_SUBSCRIPTION = new STATUS("CHECKING_SUBSCRIPTION", 10, 11);
            SWITCHING_DEVICE = new STATUS("SWITCHING_DEVICE", 11, 12);
            UNATTACHED = new STATUS("UNATTACHED", 12, 13);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 13, 0x7fffffff);
            $VALUES = (new STATUS[] {
                NOT_AVAILABLE, AVAILABLE, STARTING, REJECTED, RUNNING, STOPPING, PAUSED, NOT_STARTED, HINT_IS_VIDEOCALL_RECEIVED, UNKNOWN, 
                CHECKING_SUBSCRIPTION, SWITCHING_DEVICE, UNATTACHED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            STATUS astatus[] = values();
            int k = astatus.length;
            for (int i = 0; i < k; i++)
            {
                STATUS status = astatus[i];
                intToTypeMap.a(status.value, status);
            }

        }

        private STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class VIDEO_DEVICE_CAPABILITY extends Enum
    {

        private static final VIDEO_DEVICE_CAPABILITY $VALUES[];
        public static final VIDEO_DEVICE_CAPABILITY VIDEOCAP_HQ_CAPABLE;
        public static final VIDEO_DEVICE_CAPABILITY VIDEOCAP_HQ_CERTIFIED;
        public static final VIDEO_DEVICE_CAPABILITY VIDEOCAP_REQ_DRIVERUPDATE;
        public static final VIDEO_DEVICE_CAPABILITY VIDEOCAP_USB_HIGHSPEED;
        public static final VIDEO_DEVICE_CAPABILITY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static VIDEO_DEVICE_CAPABILITY fromInt(int i)
        {
            VIDEO_DEVICE_CAPABILITY video_device_capability = (VIDEO_DEVICE_CAPABILITY)intToTypeMap.a(i);
            if (video_device_capability != null)
            {
                return video_device_capability;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static VIDEO_DEVICE_CAPABILITY valueOf(String s)
        {
            return (VIDEO_DEVICE_CAPABILITY)Enum.valueOf(com/skype/Video$VIDEO_DEVICE_CAPABILITY, s);
        }

        public static VIDEO_DEVICE_CAPABILITY[] values()
        {
            return (VIDEO_DEVICE_CAPABILITY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            VIDEOCAP_HQ_CAPABLE = new VIDEO_DEVICE_CAPABILITY("VIDEOCAP_HQ_CAPABLE", 0, 0);
            VIDEOCAP_HQ_CERTIFIED = new VIDEO_DEVICE_CAPABILITY("VIDEOCAP_HQ_CERTIFIED", 1, 1);
            VIDEOCAP_REQ_DRIVERUPDATE = new VIDEO_DEVICE_CAPABILITY("VIDEOCAP_REQ_DRIVERUPDATE", 2, 2);
            VIDEOCAP_USB_HIGHSPEED = new VIDEO_DEVICE_CAPABILITY("VIDEOCAP_USB_HIGHSPEED", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new VIDEO_DEVICE_CAPABILITY("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new VIDEO_DEVICE_CAPABILITY[] {
                VIDEOCAP_HQ_CAPABLE, VIDEOCAP_HQ_CERTIFIED, VIDEOCAP_REQ_DRIVERUPDATE, VIDEOCAP_USB_HIGHSPEED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            VIDEO_DEVICE_CAPABILITY avideo_device_capability[] = values();
            int k = avideo_device_capability.length;
            for (int i = 0; i < k; i++)
            {
                VIDEO_DEVICE_CAPABILITY video_device_capability = avideo_device_capability[i];
                intToTypeMap.a(video_device_capability.value, video_device_capability);
            }

        }

        private VIDEO_DEVICE_CAPABILITY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface VideoIListener
    {
    }


    public abstract void addListener(VideoIListener videoilistener);

    public abstract int getConvoIdProp();

    public abstract GetCurrentVideoDevice_Result getCurrentVideoDevice();

    public abstract String getDebuginfoProp();

    public abstract String getDeviceNameProp();

    public abstract String getDevicePathProp();

    public abstract String getDimensionsProp();

    public abstract int getDuration1080Prop();

    public abstract int getDuration720Prop();

    public abstract int getDurationHqvProp();

    public abstract int getDurationLtvgad2Prop();

    public abstract int getDurationSsProp();

    public abstract int getDurationVgad2Prop();

    public abstract String getErrorProp();

    public abstract int getHqPresentProp();

    public abstract MEDIATYPE getMediaTypeProp();

    public abstract int getSsTimestampProp();

    public abstract STATUS getStatusProp();

    public abstract int getTimestampProp();

    public abstract void removeListener(VideoIListener videoilistener);

    public abstract void setIncomingTransmissionsDesired(boolean flag);

    public abstract void setRemoteRendererId(int i);

    public abstract void setScreenCaptureRectangle(int i, int j, int k, int l);

    public abstract void setScreenCaptureRectangle(int i, int j, int k, int l, int i1);

    public abstract void setScreenCaptureRectangle(int i, int j, int k, int l, int i1, int j1);

    public abstract void setVideoConsumptionProperties(int i, int j);

    public abstract void start();

    public abstract void stop();
}
