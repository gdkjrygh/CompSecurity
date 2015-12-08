// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            j

protected final class <init> extends <init>
{

    final j e;

    protected final void a(ConnectionResult connectionresult)
    {
        j.a(e).b(connectionresult);
        j.g_();
    }

    protected final boolean a()
    {
        j.a(e).b(ConnectionResult.a);
        return true;
    }

    public ult(j j1, int k, Bundle bundle)
    {
        e = j1;
        super(j1, k, bundle);
    }
}
