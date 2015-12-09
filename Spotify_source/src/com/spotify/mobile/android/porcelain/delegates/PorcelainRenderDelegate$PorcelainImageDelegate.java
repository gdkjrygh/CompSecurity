// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.delegates;

import android.widget.ImageView;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import dqh;

public interface IconSize
{

    public abstract void a(ImageView imageview);

    public abstract void a(ImageView imageview, PorcelainIcon porcelainicon);

    public abstract void a(ImageView imageview, PorcelainImage porcelainimage, ImageSize imagesize, IconSize iconsize);

    public abstract void a(ImageView imageview, PorcelainImage porcelainimage, dqh dqh, ImageSize imagesize, IconSize iconsize);
}
