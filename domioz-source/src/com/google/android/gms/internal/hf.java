// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.l;

// Referenced classes of package com.google.android.gms.internal:
//            hh, hi, gv, zzjb, 
//            he

final class hf extends hh
{

    final String b;
    final zzjb c[];
    final he d;

    hf(he he, l l, String s, zzjb azzjb[])
    {
        d = he;
        b = s;
        c = azzjb;
        super(l);
    }

    protected final void a(gv gv1)
    {
        gv1.a(new hi(this), b, c);
    }
}
