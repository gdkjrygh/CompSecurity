// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class dct
{

    public static dcr a(Context context, Toolbar toolbar)
    {
        dcs dcs1 = new dcs(LayoutInflater.from(context).inflate(0x7f0300be, toolbar, false));
        dcq.a(dcs1);
        toolbar.addView(dcs1.a);
        if (!gmu.a && dgn.a(context))
        {
            dcs1.a.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener(dcs1, toolbar) {

                private dcs a;
                private Toolbar b;

                public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                        int k1, int l1)
                {
                    view = (TextView)a.a.findViewById(0x7f1103e8);
                    j = b.getRight();
                    android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
                    marginlayoutparams.rightMargin = (i - (j - k)) / 2;
                    view.setLayoutParams(marginlayoutparams);
                }

            
            {
                a = dcs1;
                b = toolbar;
                super();
            }
            });
        }
        return dcs1;
    }
}
