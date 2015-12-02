// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.entity;

import android.text.TextUtils;
import com.mobvista.sdk.m.core.util.NoProGuard;
import java.io.Serializable;

public class Campaign
    implements NoProGuard, Serializable
{

    public static final int TYPE_FB = 1;
    public static final int TYPE_MV = 2;
    private static final long serialVersionUID = 1L;
    public String adCall;
    private String appDesc;
    private String appName;
    private String bgImage;
    private String iconUrl;
    private String id;
    private String imageUrl;
    private String packageName;
    private String size;
    private long timestamp;
    private int type;

    public Campaign()
    {
        id = "";
        packageName = "";
        appName = "";
        appDesc = "";
        size = "";
        iconUrl = "";
        imageUrl = "";
        timestamp = 0L;
        bgImage = "";
        adCall = "INSTALL";
        type = 2;
    }

    public String getAdCall()
    {
        return adCall;
    }

    public String getAppDesc()
    {
        return appDesc;
    }

    public String getAppName()
    {
        return appName;
    }

    public String getBgImage()
    {
        return bgImage;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public String getId()
    {
        return id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getPackageName()
    {
        return packageName;
    }

    public String getSize()
    {
        return size;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public int getType()
    {
        return type;
    }

    public void setAdCall(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            adCall = s;
            return;
        }
    }

    public void setAppDesc(String s)
    {
        appDesc = s;
    }

    public void setAppName(String s)
    {
        appName = s;
    }

    public void setBgImage(String s)
    {
        bgImage = s;
    }

    public void setIconUrl(String s)
    {
        iconUrl = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImageUrl(String s)
    {
        imageUrl = s;
    }

    public void setPackageName(String s)
    {
        packageName = s;
    }

    public void setSize(String s)
    {
        size = s;
    }

    public void setTimestamp(long l)
    {
        timestamp = l;
    }

    public void setType(int i)
    {
        type = i;
    }
}
