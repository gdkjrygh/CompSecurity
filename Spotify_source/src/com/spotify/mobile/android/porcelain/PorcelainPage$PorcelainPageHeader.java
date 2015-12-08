// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain;

import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import drv;

public interface Style
{

    public abstract String getBackground();

    public abstract drv getButton();

    public abstract PorcelainImage getImage();

    public abstract Style getStyle();

    public abstract CharSequence getSubtitle();

    public abstract CharSequence getTitle();
}
