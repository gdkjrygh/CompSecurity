// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import kik.a.e.s;
import kik.android.widget.ProgressWheel;

// Referenced classes of package com.kik.view.adapters:
//            bf

final class bh
    implements s
{

    final bf.b a;
    final bf b;

    bh(bf bf, bf.b b1)
    {
        b = bf;
        a = b1;
        super();
    }

    public final void a(int i)
    {
        ProgressWheel progresswheel = ((bf.b)a).w;
        if (progresswheel != null && (float)i / 100F > 0.1F)
        {
            progresswheel.a((float)i / 100F);
        }
    }
}
