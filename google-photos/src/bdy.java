// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bdy
    implements android.view.View.OnLayoutChangeListener
{

    private bdw a;

    bdy(bdx bdx, bdw bdw1)
    {
        a = bdw1;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        bdw bdw1 = a;
        i = view.getWidth();
        j = view.getHeight();
        bdw1.a = i;
        bdw1.b = j;
    }
}
