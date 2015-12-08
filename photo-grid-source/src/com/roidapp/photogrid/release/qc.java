// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;
import com.roidapp.photogrid.common.al;

// Referenced classes of package com.roidapp.photogrid.release:
//            Preference, qh

final class qc
    implements android.widget.AdapterView.OnItemClickListener
{

    final qh a;
    final Preference b;

    qc(Preference preference, qh qh1)
    {
        b = preference;
        a = qh1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i;
        JVM INSTR tableswitch 1 20: default 96
    //                   1 97
    //                   2 105
    //                   3 113
    //                   4 121
    //                   5 96
    //                   6 129
    //                   7 137
    //                   8 96
    //                   9 145
    //                   10 96
    //                   11 153
    //                   12 96
    //                   13 161
    //                   14 169
    //                   15 177
    //                   16 185
    //                   17 193
    //                   18 201
    //                   19 209
    //                   20 217;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L1 _L8 _L1 _L9 _L1 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        return;
_L2:
        Preference.d(b);
        return;
_L3:
        Preference.e(b);
        return;
_L4:
        Preference.f(b);
        return;
_L5:
        Preference.g(b);
        return;
_L6:
        Preference.h(b);
        return;
_L7:
        Preference.i(b);
        return;
_L8:
        Preference.j(b);
        return;
_L9:
        Preference.k(b);
        return;
_L10:
        Preference.l(b);
        return;
_L11:
        Preference.m(b);
        return;
_L12:
        Preference.n(b);
        return;
_L13:
        Preference.o(b);
        return;
_L14:
        Preference.p(b);
        return;
_L15:
        Preference.q(b);
        return;
_L16:
        Preference.r(b);
        return;
_L17:
        Preference.s(b);
        if (Preference.t(b) == 10)
        {
            al.a = true;
            b.a(true);
            a.notifyDataSetChanged();
            return;
        }
        if (Preference.t(b) == 15)
        {
            al.a = false;
            b.a(false);
            a.notifyDataSetChanged();
            Preference.u(b);
            return;
        }
        if (true) goto _L1; else goto _L18
_L18:
    }
}
