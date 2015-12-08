// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class bsl extends bsd
{

    private bsc a;

    public bsl(bsc bsc1, int i, Bundle bundle)
    {
        a = bsc1;
        super(bsc1, i, bundle);
    }

    protected final void a(ConnectionResult connectionresult)
    {
        bsc.a(a).b(connectionresult);
        a.a(connectionresult);
    }

    protected final boolean a()
    {
        bsc.a(a).b(ConnectionResult.a);
        return true;
    }
}
