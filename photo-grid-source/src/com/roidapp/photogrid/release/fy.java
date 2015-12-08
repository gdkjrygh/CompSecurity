// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            fr, PhotoGridActivity

final class fy
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final View b;
    final int c;
    final int d;
    final fr e;

    fy(fr fr1, ViewGroup viewgroup, View view, int i, int j)
    {
        e = fr1;
        a = viewgroup;
        b = view;
        c = i;
        d = j;
        super();
    }

    public final void onClick(View view)
    {
        if (fr.f(e).i)
        {
            return;
        }
        if (fr.g(e) != null)
        {
            int i = fr.h(e) - fr.g(e).getLeft() - (view.getRight() - fr.g(e).getScrollX());
            if (i < fr.i(e) >> 1)
            {
                fr.g(e).smoothScrollBy((fr.i(e) >> 1) - i, 0);
            } else
            {
                int j = view.getLeft() - fr.g(e).getScrollX();
                if (j < fr.i(e) >> 1)
                {
                    fr.g(e).smoothScrollBy(j - (fr.i(e) >> 1), 0);
                }
            }
        }
        if (fr.a(e) != null)
        {
            a.findViewById(fr.a(e).intValue()).findViewById(0x7f0d0493).setVisibility(8);
        }
        b.findViewById(0x7f0d0493).setVisibility(0);
        fr.a(e, Integer.valueOf(c));
        fr.j(e);
        JVM INSTR tableswitch 1 2: default 188
    //                   1 261
    //                   2 288;
           goto _L1 _L2 _L3
_L1:
        e.a(d, fr.j(e));
        return;
_L2:
        if (e.a() == 0.0F)
        {
            fr.b(e).setProgress(10);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!e.b())
        {
            fr.e(e).setProgress(20);
            fr.d(e).setProgress(100);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
