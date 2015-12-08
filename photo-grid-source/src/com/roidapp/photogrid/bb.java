// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.roidapp.photogrid:
//            ba, bh

final class bb
    implements android.widget.AdapterView.OnItemClickListener
{

    final ba a;

    bb(ba ba1)
    {
        a = ba1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!ba.a(a)) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 9: default 64
    //                   0 65
    //                   1 78
    //                   2 91
    //                   3 104
    //                   4 117
    //                   5 130
    //                   6 151
    //                   7 164
    //                   8 278
    //                   9 335;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L3:
        return;
_L4:
        ba.b(a).a();
        return;
_L5:
        ba.b(a).b();
        return;
_L6:
        ba.b(a).c();
        return;
_L7:
        ba.b(a).d();
        return;
_L8:
        ba.b(a).e();
        return;
_L9:
        ba.c(a);
        ba.b(a).i();
        return;
_L10:
        ba.b(a).f();
        return;
_L11:
        if (ba.d(a) != 1 && ba.e(a) != 1)
        {
            ba.c(a);
            ba.b(a).a(ba.f(a));
            return;
        }
        if (ba.d(a) != 1 && ba.e(a) == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ba.d(a) == 1 && ba.e(a) != 1)
        {
            ba.b(a).a(ba.f(a));
            return;
        }
        if (true) goto _L3; else goto _L14
_L14:
        break; /* Loop/switch isn't completed */
_L12:
        if (ba.d(a) != 1 && ba.e(a) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ba.d(a) == 1 && ba.e(a) != 1)
        {
            ba.b(a).h();
            return;
        }
        if (true) goto _L3; else goto _L15
_L13:
        ba.b(a).g();
        return;
_L2:
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            ba.b(a).a();
            return;

        case 1: // '\001'
            ba.b(a).b();
            return;

        case 2: // '\002'
            ba.b(a).c();
            return;

        case 3: // '\003'
            ba.b(a).d();
            return;

        case 4: // '\004'
            ba.b(a).e();
            return;

        case 5: // '\005'
            ba.b(a).i();
            return;

        case 6: // '\006'
            ba.b(a).f();
            return;

        case 7: // '\007'
            break;
        }
_L15:
        ba.b(a).g();
        return;
    }
}
