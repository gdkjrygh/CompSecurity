// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.view.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.artist.view.GalleryViewPager;
import com.spotify.mobile.android.spotlets.artist.view.PageIndicator;

public class HeaderViewGallery extends FrameLayout
{

    public GalleryViewPager a;
    public PageIndicator b;

    public HeaderViewGallery(Context context)
    {
        super(context);
        a();
    }

    public HeaderViewGallery(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    private void a()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0300db, this);
        a = (GalleryViewPager)findViewById(0x7f110423);
        b = (PageIndicator)findViewById(0x7f110424);
    }
}
