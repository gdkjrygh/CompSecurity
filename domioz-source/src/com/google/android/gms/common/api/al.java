// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.zzut;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            aa

final class al extends ln
{

    private WeakReference a;

    al(aa aa1)
    {
        a = new WeakReference(aa1);
    }

    public final void a(ConnectionResult connectionresult, zzut zzut)
    {
        zzut = (aa)a.get();
        if (zzut != null)
        {
            aa.c(zzut, connectionresult);
        }
    }
}
