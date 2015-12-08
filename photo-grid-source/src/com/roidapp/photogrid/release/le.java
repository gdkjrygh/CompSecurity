// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            ld, PhotoGridActivity, ih, lj

final class le
    implements android.widget.AdapterView.OnItemClickListener
{

    final ld a;

    le(ld ld1)
    {
        a = ld1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        byte byte0;
        for (byte0 = 3; ld.a(a).i || i == 0 || ld.a() == 0;)
        {
            return;
        }

        b.a((new StringBuilder("From:")).append(az.q).toString());
        az.q;
        JVM INSTR tableswitch 0 5: default 88
    //                   0 88
    //                   1 88
    //                   2 88
    //                   3 88
    //                   4 88
    //                   5 247;
           goto _L1 _L1 _L1 _L1 _L1 _L1 _L2
_L1:
        if (!com.roidapp.photogrid.release.ld.b(a)) goto _L4; else goto _L3
_L3:
        b.a((new StringBuilder("Single:")).append(ih.C().W()).toString());
        if (!ld.c(a)) goto _L6; else goto _L5
_L5:
        i;
        JVM INSTR tableswitch 1 5: default 168
    //                   1 257
    //                   2 263
    //                   3 269
    //                   4 276
    //                   5 171;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        byte0 = 0;
_L12:
        b.a((new StringBuilder("To:")).append(byte0).toString());
        ld.d(a).a(byte0);
        if (com.roidapp.photogrid.release.ld.b(a))
        {
            b.a((new StringBuilder("Single:")).append(ih.C().W()).toString());
        }
        a.b();
        return;
_L2:
        ih.C().W();
          goto _L1
_L8:
        byte0 = 5;
          goto _L12
_L9:
        byte0 = 1;
          goto _L12
_L10:
        byte0 = 6;
          goto _L12
_L11:
        byte0 = 4;
          goto _L12
_L6:
        i;
        JVM INSTR tableswitch 1 4: default 312
    //                   1 315
    //                   2 328
    //                   3 334
    //                   4 171;
           goto _L7 _L13 _L14 _L15 _L12
_L13:
        ih.C().k(1);
        byte0 = 5;
          goto _L12
_L14:
        byte0 = 1;
          goto _L12
_L15:
        byte0 = 4;
          goto _L12
_L4:
        if (!ld.c(a)) goto _L17; else goto _L16
_L16:
        i;
        JVM INSTR tableswitch 1 5: default 384
    //                   1 387
    //                   2 393
    //                   3 399
    //                   4 406
    //                   5 171;
           goto _L7 _L18 _L19 _L20 _L21 _L12
_L18:
        byte0 = 0;
          goto _L12
_L19:
        byte0 = 1;
          goto _L12
_L20:
        byte0 = 6;
          goto _L12
_L21:
        byte0 = 4;
          goto _L12
_L17:
        i;
        JVM INSTR tableswitch 1 4: default 444
    //                   1 447
    //                   2 453
    //                   3 459
    //                   4 171;
           goto _L7 _L22 _L23 _L24 _L12
_L22:
        byte0 = 0;
          goto _L12
_L23:
        byte0 = 1;
          goto _L12
_L24:
        byte0 = 4;
          goto _L12
    }
}
