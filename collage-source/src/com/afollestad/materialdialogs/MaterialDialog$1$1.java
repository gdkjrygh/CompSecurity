// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.view.ViewTreeObserver;
import android.widget.ListView;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.afollestad.materialdialogs:
//            f

class a
    implements Runnable
{

    final int a;
    final a b;

    public void run()
    {
        b.b.c.requestFocus();
        b.b.c.setSelection(a);
    }

    er(er er, int i)
    {
        b = er;
        a = i;
        super();
    }

    // Unreferenced inner class com/afollestad/materialdialogs/f$1

/* anonymous class */
    class f._cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final f a;

        public void onGlobalLayout()
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                a.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else
            {
                a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (a.q != f.h.b && a.q != f.h.c) goto _L2; else goto _L1
_L1:
            if (a.q != f.h.b) goto _L4; else goto _L3
_L3:
            if (a.b.I >= 0) goto _L5; else goto _L2
_L2:
            return;
_L5:
            int i = a.b.I;
_L8:
            if (a.c.getLastVisiblePosition() >= i) goto _L2; else goto _L6
_L6:
            int j = i - (a.c.getLastVisiblePosition() - a.c.getFirstVisiblePosition()) / 2;
            i = j;
            if (j < 0)
            {
                i = 0;
            }
            a.c.post(new MaterialDialog._cls1._cls1(this, i));
            return;
_L4:
            if (a.r == null || a.r.size() == 0) goto _L2; else goto _L7
_L7:
            Collections.sort(a.r);
            i = ((Integer)a.r.get(0)).intValue();
              goto _L8
        }

            
            {
                a = f1;
                super();
            }
    }

}
