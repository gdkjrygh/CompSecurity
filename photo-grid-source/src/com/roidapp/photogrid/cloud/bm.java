// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.release.ih;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bm
    implements android.view.View.OnClickListener
{

    final SelectorBaseActivity a;

    bm(SelectorBaseActivity selectorbaseactivity)
    {
        a = selectorbaseactivity;
        super();
    }

    public final void onClick(View view)
    {
        if (a.l.size() == 0 || !SelectorBaseActivity.c(a))
        {
            if (a.l.size() != 0)
            {
                an.a(new WeakReference(a), String.format(a.getString(0x7f0701ea), new Object[] {
                    Integer.valueOf(a.o - a.l.size())
                }));
                return;
            }
            if (ih.C().P())
            {
                an.a(new WeakReference(a), a.getString(0x7f0701e9));
                return;
            }
            if (a.o == 1)
            {
                an.a(new WeakReference(a), a.getString(0x7f0701eb));
                return;
            } else
            {
                an.a(new WeakReference(a), String.format(a.getString(0x7f0701ea), new Object[] {
                    Integer.valueOf(a.o)
                }));
                return;
            }
        } else
        {
            a.i();
            return;
        }
    }
}
