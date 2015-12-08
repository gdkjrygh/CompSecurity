// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;
import android.util.Pair;
import com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.util.Assertion;

public final class dqc extends LruCache
{

    private final com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize a;
    private PorcelainDefaultImageDelegate b;

    public dqc(PorcelainDefaultImageDelegate porcelaindefaultimagedelegate, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize)
    {
        b = porcelaindefaultimagedelegate;
        super(10);
        a = imagesize;
    }

    protected final Object create(Object obj)
    {
        float f;
        PorcelainDefaultImageDelegate porcelaindefaultimagedelegate;
        PorcelainIcon porcelainicon;
        com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize iconsize;
        boolean flag;
        obj = (Pair)obj;
        porcelaindefaultimagedelegate = b;
        com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize = a;
        porcelainicon = (PorcelainIcon)((Pair) (obj)).first;
        iconsize = (com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize)((Pair)((Pair) (obj)).second).first;
        if (((Pair)((Pair) (obj)).second).second == com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate._cls1.c[porcelainicon.ordinal()];
        JVM INSTR tableswitch 1 6: default 108
    //                   1 141
    //                   2 141
    //                   3 141
    //                   4 141
    //                   5 141
    //                   6 141;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        f = (0.0F / 0.0F);
_L4:
        if (imagesize == com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.a)
        {
            return dff.a(porcelaindefaultimagedelegate.a, porcelainicon.mIcon, f, flag);
        } else
        {
            return dff.b(porcelaindefaultimagedelegate.a, porcelainicon.mIcon, f, flag);
        }
_L2:
        switch (com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate._cls1.d[iconsize.ordinal()])
        {
        default:
            Assertion.b((new StringBuilder("Unmapped size : ")).append(iconsize).toString());
            f = 1.0F;
            break;

        case 1: // '\001'
            f = 0.33F;
            break;

        case 2: // '\002'
            f = 0.66F;
            break;

        case 3: // '\003'
            f = 0.5F;
            break;

        case 4: // '\004'
            f = 0.75F;
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
