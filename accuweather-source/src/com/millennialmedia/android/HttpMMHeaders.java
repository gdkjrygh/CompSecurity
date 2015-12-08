// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Map;
import org.apache.http.Header;

// Referenced classes of package com.millennialmedia.android:
//            MMLog

class HttpMMHeaders
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public HttpMMHeaders createFromParcel(Parcel parcel)
        {
            return new HttpMMHeaders(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public HttpMMHeaders[] newArray(int i)
        {
            return new HttpMMHeaders[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String HEADER_MM_ACID = "X-MM-ACID";
    private static final String HEADER_MM_CUSTOM_CLOSE = "X-MM-USE-CUSTOM-CLOSE";
    private static final String HEADER_MM_ENABLE_HARDWARE_ACCEL = "X-MM-ENABLE-HARDWARE-ACCELERATION";
    private static final String HEADER_MM_TRANSITION = "X-MM-TRANSITION";
    private static final String HEADER_MM_TRANSITION_DURATION = "X-MM-TRANSITION-DURATION";
    private static final String HEADER_MM_TRANSPARENT = "X-MM-TRANSPARENT";
    private static final String TAG = com/millennialmedia/android/HttpMMHeaders.getName();
    static final long serialVersionUID = 0xb41d817d0ea16L;
    String acid;
    boolean enableHardwareAccel;
    boolean isTransparent;
    String transition;
    long transitionTimeInMillis;
    boolean useCustomClose;

    public HttpMMHeaders(Parcel parcel)
    {
        try
        {
            boolean aflag[] = new boolean[3];
            parcel.readBooleanArray(aflag);
            isTransparent = aflag[0];
            useCustomClose = aflag[1];
            enableHardwareAccel = aflag[2];
            transition = parcel.readString();
            acid = parcel.readString();
            transitionTimeInMillis = parcel.readLong();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            MMLog.e(TAG, "Header serializing failed", parcel);
        }
    }

    public HttpMMHeaders(Header aheader[])
    {
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            checkTransparent(header);
            checkTransition(header);
            checkTransitionDuration(header);
            checkUseCustomClose(header);
            checkEnableHardwareAccel(header);
            checkAcid(header);
        }

    }

    private void checkAcid(Header header)
    {
        if ("X-MM-ACID".equalsIgnoreCase(header.getName()))
        {
            acid = header.getValue();
        }
    }

    private void checkEnableHardwareAccel(Header header)
    {
        if ("X-MM-ENABLE-HARDWARE-ACCELERATION".equalsIgnoreCase(header.getName()))
        {
            enableHardwareAccel = Boolean.parseBoolean(header.getValue());
        }
    }

    private void checkTransition(Header header)
    {
        if ("X-MM-TRANSITION".equalsIgnoreCase(header.getName()))
        {
            transition = header.getValue();
        }
    }

    private void checkTransitionDuration(Header header)
    {
        if ("X-MM-TRANSITION-DURATION".equalsIgnoreCase(header.getName()))
        {
            header = header.getValue();
            if (header != null)
            {
                transitionTimeInMillis = (long)(Float.parseFloat(header) * 1000F);
            }
        }
    }

    private void checkTransparent(Header header)
    {
        if ("X-MM-TRANSPARENT".equalsIgnoreCase(header.getName()))
        {
            header = header.getValue();
            if (header != null)
            {
                isTransparent = Boolean.parseBoolean(header);
            }
        }
    }

    private void checkUseCustomClose(Header header)
    {
        if ("X-MM-USE-CUSTOM-CLOSE".equalsIgnoreCase(header.getName()))
        {
            useCustomClose = Boolean.parseBoolean(header.getValue());
        }
    }

    public int describeContents()
    {
        return 0;
    }

    void updateArgumentsWithSettings(Map map)
    {
        map.put("transparent", String.valueOf(isTransparent));
        map.put("transition", String.valueOf(transition));
        map.put("acid", String.valueOf(acid));
        map.put("transitionDuration", String.valueOf(transitionTimeInMillis));
        map.put("useCustomClose", String.valueOf(useCustomClose));
        map.put("enableHardwareAccel", String.valueOf(enableHardwareAccel));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBooleanArray(new boolean[] {
            isTransparent, useCustomClose, enableHardwareAccel
        });
        parcel.writeString(transition);
        parcel.writeString(acid);
        parcel.writeLong(transitionTimeInMillis);
    }

}
