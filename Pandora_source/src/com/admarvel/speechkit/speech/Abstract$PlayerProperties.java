// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.os.Parcel;

// Referenced classes of package com.admarvel.speechkit.speech:
//            Abstract

public static class le extends le
{

    public static final android.os.t.PlayerProperties.showControl CREATOR = new android.os.Parcelable.Creator() {

        public Abstract.PlayerProperties createFromParcel(Parcel parcel)
        {
            return new Abstract.PlayerProperties(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Abstract.PlayerProperties[] newArray(int i)
        {
            return new Abstract.PlayerProperties[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public boolean audioMuted;
    public boolean autoPlay;
    public boolean doLoop;
    public boolean inline;
    public int positionUpdatePeriodMs;
    public boolean showControl;
    public String startStyle;
    public String stopStyle;

    public boolean doLoop()
    {
        return doLoop;
    }

    public boolean doMute()
    {
        return audioMuted;
    }

    public boolean exitOnComplete()
    {
        return stopStyle.equalsIgnoreCase("exit");
    }

    public boolean isAutoPlay()
    {
        return autoPlay;
    }

    public boolean isFullScreen()
    {
        return startStyle.equalsIgnoreCase("fullscreen");
    }

    public void muteAudio()
    {
        audioMuted = true;
    }

    public void setProperties(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, String s, String s1, 
            int i)
    {
        autoPlay = flag1;
        showControl = flag2;
        doLoop = flag4;
        audioMuted = flag;
        startStyle = s;
        stopStyle = s1;
        inline = flag3;
        positionUpdatePeriodMs = i;
    }

    public void setStopStyle(String s)
    {
        stopStyle = s;
    }

    public boolean showControl()
    {
        return showControl;
    }


    public _cls1()
    {
        showControl = true;
        autoPlay = true;
        audioMuted = false;
        doLoop = false;
        stopStyle = "normal";
        startStyle = "normal";
        inline = false;
        positionUpdatePeriodMs = -1;
    }

    public positionUpdatePeriodMs(Parcel parcel)
    {
        super(parcel);
    }
}
