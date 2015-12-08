// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import BT;
import Gt;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.snapchat.android.ui.lenses:
//            LensesView

final class a
    implements android.widget.nItemSelectedListener
{

    final b a;
    final LensesView b;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((Gt)b.getAdapter()).a(i);
        LensesView.a(b, adapterview);
        b.postDelayed(new Runnable(adapterview, i) {

            private BT a;
            private int b;
            private LensesView._cls2 c;

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
                c = LensesView._cls2.this;
                a = bt;
                b = i;
                super();
            }
        }, 200L);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    _cls1.b(LensesView lensesview, _cls1.b b1)
    {
        b = lensesview;
        a = b1;
        super();
    }
}
