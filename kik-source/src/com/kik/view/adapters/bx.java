// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.widget.Toast;

// Referenced classes of package com.kik.view.adapters:
//            bw, bf

final class bx
    implements Runnable
{

    final int a;
    final bw b;

    bx(bw bw1, int i)
    {
        b = bw1;
        a = i;
        super();
    }

    public final void run()
    {
        if (b.a.z) goto _L2; else goto _L1
_L1:
        if (a != 400) goto _L4; else goto _L3
_L3:
        Toast.makeText(b.d.l, b.d.l.getString(0x7f0900e3), 0).show();
_L2:
        if (b.a == b.d.a)
        {
            b.d.a(b.a, b.b, b.c);
        }
        b.d.a(b.a, b.b, false);
        return;
_L4:
        if (a == 401)
        {
            Toast.makeText(b.d.l, 0x7f09014d, 0).show();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
