// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class iie
    implements android.view.View.OnLayoutChangeListener
{

    private iib a;

    iie(iib iib1)
    {
        a = iib1;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        for (i = k - i; i == k1 - i1 || i <= 0 || !(view instanceof TextView);)
        {
            return;
        }

        Object obj = view.getContext();
        mmr mmr1 = (mmr)olm.a(((android.content.Context) (obj)), mmr);
        obj = (iif)olm.a(((android.content.Context) (obj)), iif);
        view = (TextView)view;
        view.setText(((iif) (obj)).a(mmr1.g(), a.a, view));
    }
}
