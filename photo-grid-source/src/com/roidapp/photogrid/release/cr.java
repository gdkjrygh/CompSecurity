// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.release:
//            ck, PhotoGridActivity, mm

final class cr
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final View b;
    final int c;
    final ck d;

    cr(ck ck1, ViewGroup viewgroup, View view, int i)
    {
        d = ck1;
        a = viewgroup;
        b = view;
        c = i;
        super();
    }

    public final void onClick(View view)
    {
        if (ck.b(d).i)
        {
            return;
        }
        if (ck.m(d) != null)
        {
            a.findViewById(ck.m(d).intValue()).findViewById(0x7f0d0493).setVisibility(8);
        }
        b.findViewById(0x7f0d0493).setVisibility(0);
        ck.a(d, Integer.valueOf(c));
        ck.b(d).b.b(((Integer)view.getTag()).intValue());
    }
}
