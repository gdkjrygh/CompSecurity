// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

protected final class <init> extends <init>
{

    final m e;

    protected void a(ConnectionResult connectionresult)
    {
        m.zza(e).b(connectionresult);
        e.onConnectionFailed(connectionresult);
    }

    protected boolean a()
    {
        m.zza(e).b(ConnectionResult.a);
        return true;
    }

    public ult(m m1, int j, Bundle bundle)
    {
        e = m1;
        super(m1, j, bundle);
    }
}
