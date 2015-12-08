// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.o;

// Referenced classes of package com.google.android.gms.common.internal:
//            ab, aa

public final class aj extends ab
{

    final aa e;

    public aj(aa aa1, int i, Bundle bundle)
    {
        e = aa1;
        super(aa1, i, bundle);
    }

    protected final void a(ConnectionResult connectionresult)
    {
        aa.a(e).b(connectionresult);
        aa.g_();
    }

    protected final boolean a()
    {
        aa.a(e).b(ConnectionResult.a);
        return true;
    }
}
