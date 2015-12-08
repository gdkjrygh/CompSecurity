// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class gqf
    implements android.view.View.OnClickListener, omb, opp, opr, opv
{

    private final am a;
    private grg b;
    private gpp c;
    private TextView d;
    private nug e;

    public gqf(am am1, opd opd1)
    {
        e = new gqg(this);
        a = am1;
        opd1.a(this);
    }

    static void a(gqf gqf1)
    {
        boolean flag;
        if (gqf1.b.h == null || gqf1.c() == null)
        {
            return;
        }
        Object obj = (eev)gqf1.b.h.b(eev);
        int i;
        int j;
        boolean flag1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = ((eev) (obj)).b();
        }
        j = b.n(i);
        if (8 != i) goto _L2; else goto _L1
_L1:
        obj = (gfn)gqf1.b.h.b(gfn);
        if (obj == null) goto _L2; else goto _L3
_L3:
        flag1 = ((gfn) (obj)).g();
        flag = flag1;
        if (!flag1)
        {
            j = 0;
            flag = flag1;
        }
_L5:
        gqf1.d = gqf1.c();
        if (j != 0)
        {
            gqf1.d.setOnClickListener(gqf1);
            gqf1.d.setVisibility(0);
            gqf1.d.setText(j);
            if (i == 8 && flag)
            {
                gqf1.d.setCompoundDrawablesWithIntrinsicBounds(b.sY, 0, 0, 0);
                return;
            } else
            {
                gqf1.d.setCompoundDrawablesWithIntrinsicBounds(b.sX, 0, 0, 0);
                return;
            }
        } else
        {
            gqf1.d.setVisibility(8);
            return;
        }
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private TextView c()
    {
        return (TextView)c.a(b.sZ);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (grg)olm1.a(grg);
        c = (gpp)olm1.a(gpp);
    }

    public final void al_()
    {
        b.a.a(e, true);
    }

    public final void am_()
    {
        b.a.a(e);
        if (d != null)
        {
            d.setOnClickListener(null);
        }
    }

    public final void onClick(View view)
    {
        int i;
        int j;
        i = ((eev)b.h.b(eev)).b();
        j = b.n(i);
        i;
        JVM INSTR tableswitch 1 18: default 116
    //                   1 143
    //                   2 136
    //                   3 157
    //                   4 150
    //                   5 164
    //                   6 171
    //                   7 178
    //                   8 241
    //                   9 185
    //                   10 192
    //                   11 116
    //                   12 199
    //                   13 206
    //                   14 116
    //                   15 213
    //                   16 220
    //                   17 227
    //                   18 234;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L1 _L12 _L13 _L1 _L14 _L15 _L16 _L17
_L1:
        i = 0;
_L19:
        gqh.b(j, i).a(a.B, "com.google.android.apps.photos.pager.autoawesome.message_dialog");
        return;
_L3:
        i = b.te;
        continue; /* Loop/switch isn't completed */
_L2:
        i = b.tc;
        continue; /* Loop/switch isn't completed */
_L5:
        i = b.tj;
        continue; /* Loop/switch isn't completed */
_L4:
        i = b.tl;
        continue; /* Loop/switch isn't completed */
_L6:
        i = b.tg;
        continue; /* Loop/switch isn't completed */
_L7:
        i = b.tb;
        continue; /* Loop/switch isn't completed */
_L8:
        i = b.ta;
        continue; /* Loop/switch isn't completed */
_L10:
        i = b.tk;
        continue; /* Loop/switch isn't completed */
_L11:
        i = b.tn;
        continue; /* Loop/switch isn't completed */
_L12:
        i = b.tf;
        continue; /* Loop/switch isn't completed */
_L13:
        i = b.th;
        continue; /* Loop/switch isn't completed */
_L14:
        i = b.tm;
        continue; /* Loop/switch isn't completed */
_L15:
        i = b.td;
        continue; /* Loop/switch isn't completed */
_L16:
        i = b.to;
        continue; /* Loop/switch isn't completed */
_L17:
        i = b.ti;
        continue; /* Loop/switch isn't completed */
_L9:
        i = b.tE;
        if (true) goto _L19; else goto _L18
_L18:
    }
}
