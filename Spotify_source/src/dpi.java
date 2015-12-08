// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;

public final class dpi
{

    public String a;
    public com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape b;
    private final PorcelainIcon c;
    private com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge d;

    public dpi(PorcelainIcon porcelainicon)
    {
        b = com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.a;
        d = com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge.a;
        c = (PorcelainIcon)ctz.a(porcelainicon);
    }

    public final PorcelainJsonImage a()
    {
        return new PorcelainJsonImage(a, b, d, c);
    }
}
