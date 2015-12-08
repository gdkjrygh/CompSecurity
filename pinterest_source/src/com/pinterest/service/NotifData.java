// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.os.Bundle;
import android.text.TextUtils;
import com.pinterest.network.json.PinterestJsonObject;

public class NotifData
{

    public String imageUrl;
    public boolean isLargeText;
    public boolean isPull;
    public String largeImageUrl;
    public String link;
    public String msg;
    public String version;

    public NotifData(Bundle bundle)
    {
        version = "1.0";
        isLargeText = false;
        isPull = false;
        version = bundle.getString("version");
        msg = bundle.getString("payload");
        link = bundle.getString("link");
        imageUrl = bundle.getString("image");
        largeImageUrl = bundle.getString("image_large");
    }

    public NotifData(PinterestJsonObject pinterestjsonobject)
    {
        version = "1.0";
        isLargeText = false;
        isPull = false;
        isPull = true;
        msg = pinterestjsonobject.a("message", "");
        link = pinterestjsonobject.a("link", "");
        imageUrl = pinterestjsonobject.a("thumbnail_image", "");
        largeImageUrl = pinterestjsonobject.a("detail_image", "");
        isLargeText = TextUtils.isEmpty(largeImageUrl);
    }
}
