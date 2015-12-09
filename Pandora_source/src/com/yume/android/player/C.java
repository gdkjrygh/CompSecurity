// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.widget.ImageView;
import com.yume.android.sdk.YuMeImageInfo;
import com.yume.android.sdk.YuMeImageRegion;
import com.yume.android.sdk.YuMeTimerInfo;

// Referenced classes of package com.yume.android.player:
//            E, F, D

final class C
{

    public byte a[];
    public boolean b;
    public boolean c;
    public boolean d;
    private ImageView e;
    private ImageView f;
    private boolean g;
    private boolean h;
    private D i;
    private int j;
    private int k;

    C()
    {
        e = null;
        f = null;
        g = false;
        h = false;
        j = 0;
        k = 0;
        a = null;
        b = false;
        c = false;
        d = false;
    }

    private static E a(YuMeImageRegion yumeimageregion)
    {
        if (yumeimageregion == YuMeImageRegion.TOP_LEFT)
        {
            return E.b;
        }
        if (yumeimageregion == YuMeImageRegion.TOP_RIGHT)
        {
            return E.c;
        }
        if (yumeimageregion == YuMeImageRegion.BOTTOM_LEFT)
        {
            return E.d;
        }
        if (yumeimageregion == YuMeImageRegion.BOTTOM_RIGHT)
        {
            return E.e;
        } else
        {
            return E.a;
        }
    }

    private static F b(YuMeImageRegion yumeimageregion)
    {
        if (yumeimageregion == YuMeImageRegion.TOP_LEFT || yumeimageregion == YuMeImageRegion.TOP_RIGHT || yumeimageregion == YuMeImageRegion.BOTTOM_LEFT || yumeimageregion == YuMeImageRegion.BOTTOM_RIGHT)
        {
            return F.c;
        } else
        {
            return F.b;
        }
    }

    public final ImageView a()
    {
        return e;
    }

    public final void a(int l)
    {
        j = l;
    }

    public final void a(ImageView imageview)
    {
        e = imageview;
    }

    public final void a(YuMeImageInfo yumeimageinfo)
    {
        if (yumeimageinfo != null)
        {
            i = null;
            i = new D();
            i.a = yumeimageinfo.imageID;
            i.b = yumeimageinfo.imageURL;
            i.c = yumeimageinfo.mimeType;
            i.d = yumeimageinfo.bIsVisibleAtStart;
            i.l = yumeimageinfo.bDisplayTwice;
            i.i = yumeimageinfo.bIsClickable;
            i.e = yumeimageinfo.widthPercent;
            i.f = yumeimageinfo.heightPercent;
            i.g = yumeimageinfo.yPercent;
            i.h = yumeimageinfo.xPercent;
            i.j = a(yumeimageinfo.eRegion);
            i.k = yumeimageinfo.positionInRegion;
            i.m = yumeimageinfo.width;
            i.n = yumeimageinfo.height;
            i.o = b(yumeimageinfo.eRegion);
            i.p = false;
        }
    }

    public final void a(YuMeTimerInfo yumetimerinfo)
    {
        if (yumetimerinfo != null)
        {
            i = null;
            i = new D();
            i.a = yumetimerinfo.timerID;
            i.b = yumetimerinfo.backgroundImgURL;
            i.c = yumetimerinfo.mimeType;
            i.d = yumetimerinfo.bIsVisibleAtStart;
            i.l = Boolean.valueOf(false);
            i.i = Boolean.valueOf(false);
            i.e = yumetimerinfo.widthPercent;
            i.f = yumetimerinfo.heightPercent;
            i.g = yumetimerinfo.yPercent;
            i.h = yumetimerinfo.xPercent;
            i.j = a(yumetimerinfo.eRegion);
            i.k = yumetimerinfo.positionInRegion;
            i.m = yumetimerinfo.width;
            i.n = yumetimerinfo.height;
            i.o = b(yumetimerinfo.eRegion);
            i.p = true;
        }
    }

    public final void a(boolean flag)
    {
        g = flag;
    }

    public final void b(int l)
    {
        k = l;
    }

    public final void b(ImageView imageview)
    {
        f = imageview;
    }

    public final void b(boolean flag)
    {
        h = flag;
    }

    public final boolean b()
    {
        return g;
    }

    public final boolean c()
    {
        return h;
    }

    public final D d()
    {
        return i;
    }

    public final int e()
    {
        return j;
    }

    public final int f()
    {
        return k;
    }

    public final ImageView g()
    {
        return f;
    }
}
