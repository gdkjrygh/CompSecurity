// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.widget.TextView;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bn, ImageColorView, bk, ai, 
//            ag, af, ah

final class ae
    implements bn
{

    final ImageColorView a;

    ae(ImageColorView imagecolorview)
    {
        a = imagecolorview;
        super();
    }

    public final void a()
    {
        ImageColorView.b(a).setVisibility(0);
    }

    public final void a(bk bk1, int i)
    {
        bk1 = (ai)bk1.getTag();
        if (ImageColorView.a(a).c())
        {
            return;
        }
        af.a[bk1.ordinal()];
        JVM INSTR tableswitch 1 4: default 64
    //                   1 79
    //                   2 112
    //                   3 143
    //                   4 174;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        ImageColorView.b(a).setText(String.valueOf(i));
        return;
_L2:
        ImageColorView.a(a, i + 150);
        ImageColorView.a(a).b(i + 150);
        continue; /* Loop/switch isn't completed */
_L3:
        ImageColorView.b(a, i + 100);
        ImageColorView.a(a).c(i + 100);
        continue; /* Loop/switch isn't completed */
_L4:
        ImageColorView.c(a, i + 100);
        ImageColorView.a(a).d(i + 100);
        continue; /* Loop/switch isn't completed */
_L5:
        ImageColorView.d(a, i + 180);
        ImageColorView.a(a).e(i + 180);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void b()
    {
        ImageColorView.b(a).setVisibility(8);
        if (ImageColorView.c(a) == null)
        {
            return;
        } else
        {
            ImageColorView.c(a).a();
            return;
        }
    }
}
