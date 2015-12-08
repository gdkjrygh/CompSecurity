// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.view.ViewTreeObserver;
import android.widget.ImageView;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            CoverImageActivity

final class d
    implements android.view.eDrawListener
{

    private int a;
    private int b;
    private int c;
    private int d;
    private CoverImageActivity e;

    public final boolean onPreDraw()
    {
        CoverImageActivity.a(e).getViewTreeObserver().removeOnPreDrawListener(this);
        int ai[] = new int[2];
        CoverImageActivity.a(e).getLocationOnScreen(ai);
        CoverImageActivity.a(e, a - ai[0]);
        CoverImageActivity.b(e, b - ai[1]);
        CoverImageActivity.a(e, (float)c / (float)CoverImageActivity.a(e).getWidth());
        CoverImageActivity.b(e, (float)d / (float)CoverImageActivity.a(e).getHeight());
        CoverImageActivity.b(e);
        return true;
    }

    A(CoverImageActivity coverimageactivity, int i, int j, int k, int l)
    {
        e = coverimageactivity;
        a = i;
        b = j;
        c = k;
        d = l;
        super();
    }
}
