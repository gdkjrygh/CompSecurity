// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import com.facebook.ads.NativeAd;
import java.io.Serializable;

public class AdvData
    implements Serializable
{

    public String adid;
    public String btnDesc;
    public String btnName;
    public String c1;
    public String c2;
    public String c3;
    public String creatives;
    public String des;
    public String dev;
    public String icon;
    public String impr;
    public String installs;
    public int mid;
    public NativeAd nativeAd;
    public int openType;
    public String openUrl;
    public String p1;
    public String p2;
    public int pid;
    public String pkg;
    public String size;
    public float starLevel;
    public String title;
    public int tp;
    public int type;

    public AdvData()
    {
        type = 0;
        nativeAd = null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdvData [pid=").append(pid).append(", type=").append(type).append(", title=").append(title).append(", des=").append(des).append(", starLevel=").append(starLevel).append(", icon=").append(icon).append(", creatives=").append(creatives).append(", openUrl=").append(openUrl).append(", openType=").append(openType).append(", tp=").append(tp).append(", btnName=").append(btnName).append(", btnDesc=").append(btnDesc).append("]").toString();
    }
}
