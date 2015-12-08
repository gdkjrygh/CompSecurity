// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.mf;
import com.google.android.gms.internal.mr;
import com.google.android.gms.internal.mz;
import com.google.android.gms.internal.na;
import com.google.android.gms.wallet.wobs.k;

// Referenced classes of package com.google.android.gms.wallet:
//            g, e

public final class f
{

    public static final c a;
    public static final e b = new mr();
    public static final k c = new na();
    public static final mf d = new mz();
    private static final j e;
    private static final i f;

    static j a()
    {
        return e;
    }

    static 
    {
        e = new j();
        f = new g();
        a = new c(f, e, new Scope[0]);
    }
}
