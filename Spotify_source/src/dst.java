// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;

public class dst
    implements com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader
{

    private final com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader a;

    public dst(com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader porcelainpageheader)
    {
        a = (com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader)ctz.a(porcelainpageheader);
    }

    public String getBackground()
    {
        return a.getBackground();
    }

    public drv getButton()
    {
        return a.getButton();
    }

    public PorcelainImage getImage()
    {
        return a.getImage();
    }

    public com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style getStyle()
    {
        return a.getStyle();
    }

    public CharSequence getSubtitle()
    {
        return a.getSubtitle();
    }

    public CharSequence getTitle()
    {
        return a.getTitle();
    }
}
