// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            v, r, a, PhotoGridActivity, 
//            x, y, b

final class w
    implements android.view.View.OnClickListener
{

    final b a;
    final v b;

    w(v v1, b b1)
    {
        b = v1;
        a = b1;
        super();
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        int i = 0;
        if (b.b != null && b.b.size() != 0)
        {
            if (!r.d(b.c))
            {
                if (r.g(b.c).d(a))
                {
                    if (r.a(b.c) != null && !r.a(b.c).isFinishing() && !r.h(b.c))
                    {
                        view = new android.app.AlertDialog.Builder(r.a(b.c));
                        view.setMessage(String.format(b.c.getResources().getString(0x7f0702f3), new Object[] {
                            Integer.valueOf(15)
                        }));
                        view.setPositiveButton(0x1040013, new x(this));
                        view.setOnCancelListener(new y(this));
                        view.create().show();
                        r.a(b.c, true);
                        return;
                    }
                } else
                {
                    b b1 = a;
                    if (a.b)
                    {
                        flag = false;
                    }
                    b1.b = flag;
                    view = view.findViewById(0x7f0d021b);
                    if (!a.b)
                    {
                        i = 4;
                    }
                    view.setVisibility(i);
                    if (!a.b)
                    {
                        r.g(b.c).b(a);
                        return;
                    } else
                    {
                        r.g(b.c).a(a);
                        return;
                    }
                }
            } else
            {
                r.g(b.c).c(a);
                return;
            }
        }
    }
}
