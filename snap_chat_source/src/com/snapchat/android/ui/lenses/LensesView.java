// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import BT;
import Gt;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;

public class LensesView extends Gallery
{
    public static interface a
    {

        public abstract void a(BT bt, int i);
    }


    private BT a;
    private boolean b;

    public LensesView(Context context)
    {
        super(context);
        a = null;
        b = false;
    }

    public LensesView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = false;
    }

    public LensesView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        b = false;
    }

    static BT a(LensesView lensesview)
    {
        return lensesview.a;
    }

    static BT a(LensesView lensesview, BT bt)
    {
        lensesview.a = bt;
        return bt;
    }

    static boolean a(LensesView lensesview, boolean flag)
    {
        lensesview.b = flag;
        return flag;
    }

    static boolean b(LensesView lensesview)
    {
        return lensesview.b;
    }

    public void setOnLensSelectedListener(a a1)
    {
        setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(a1) {

            private a a;
            private LensesView b;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((Gt)b.getAdapter()).a(i);
                LensesView.a(b, null);
                LensesView.a(b, true);
                a.a(adapterview, i);
            }

            
            {
                b = LensesView.this;
                a = a1;
                super();
            }
        });
        setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener(a1) {

            final a a;
            final LensesView b;

            public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((Gt)b.getAdapter()).a(i);
                LensesView.a(b, adapterview);
                b.postDelayed(new Runnable(this, adapterview, i) {

                    private BT a;
                    private int b;
                    private _cls2 c;

                    public final void run()
                    {
label0:
                        {
                            if (LensesView.a(c.b) == a)
                            {
                                LensesView.a(c.b, null);
                                if (LensesView.b(c.b))
                                {
                                    break label0;
                                }
                                c.a.a(a, b);
                            }
                            return;
                        }
                        LensesView.a(c.b, false);
                    }

            
            {
                c = _pcls2;
                a = bt;
                b = i;
                super();
            }
                }, 200L);
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                b = LensesView.this;
                a = a1;
                super();
            }
        });
    }
}
