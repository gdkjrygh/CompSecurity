// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.o;

// Referenced classes of package com.google.android.gms.common.internal:
//            ab, aa

public final class ai extends ab
{

    final aa e;

    public ai(aa aa1)
    {
        e = aa1;
        super(aa1, 0, null);
    }

    protected final void a(ConnectionResult connectionresult)
    {
        aa.a(e).a(connectionresult);
        aa.g_();
    }

    protected final boolean a()
    {
        aa.a(e).a(ConnectionResult.a);
        return true;
    }
}
