// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.photogrid.release:
//            cg, ih, PhotoGridActivity, ng

final class cj
    implements android.view.View.OnClickListener
{

    final cg a;

    cj(cg cg1)
    {
        a = cg1;
        super();
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        if (cg.a(a) == null)
        {
            if (ih.C().be())
            {
                cg.d(a).a(ih.C().bd(), false);
                cg.c(a).setImageResource(0x7f020364);
                return;
            } else
            {
                ih.C().g(false);
                cg.d(a).a(ih.C().bd(), true);
                cg.c(a).setImageResource(0x7f020365);
                return;
            }
        }
        if (cg.e(a))
        {
            cg.a(a).c(cg.b(a) / 5 + 5, false);
            cg.c(a).setImageResource(0x7f020364);
        } else
        {
            cg.a(a).c(cg.b(a) / 5 + 5, true);
            cg.c(a).setImageResource(0x7f020365);
        }
        view = a;
        if (cg.e(a))
        {
            flag = false;
        }
        cg.a(view, flag);
    }
}
