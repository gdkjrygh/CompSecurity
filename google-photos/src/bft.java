// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bft
    implements android.view.View.OnLayoutChangeListener
{

    private bdv a;

    bft(bfo bfo, bdv bdv1)
    {
        a = bdv1;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        bdv bdv1 = a;
        i = view.getWidth();
        j = view.getHeight();
        bdv1.a = i;
        bdv1.b = j;
    }
}
