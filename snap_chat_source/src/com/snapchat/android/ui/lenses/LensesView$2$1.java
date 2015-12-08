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

final class b
    implements Runnable
{

    private BT a;
    private int b;
    private c c;

    public final void run()
    {
label0:
        {
            if (LensesView.a(c.c) == a)
            {
                LensesView.a(c.c, null);
                if (LensesView.b(c.c))
                {
                    break label0;
                }
                c.c.c(a, b);
            }
            return;
        }
        LensesView.a(c.c, false);
    }

    ner(ner ner, BT bt, int i)
    {
        c = ner;
        a = bt;
        b = i;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/lenses/LensesView$2

/* anonymous class */
    final class LensesView._cls2
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final LensesView.a a;
        final LensesView b;

        public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = ((Gt)b.getAdapter()).a(i);
            LensesView.a(b, adapterview);
            b.postDelayed(new LensesView._cls2._cls1(this, adapterview, i), 200L);
        }

        public final void onNothingSelected(AdapterView adapterview)
        {
        }

            
            {
                b = lensesview;
                a = a1;
                super();
            }
    }

}
