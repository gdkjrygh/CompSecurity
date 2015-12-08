// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class kbx extends kbp
{

    private kbo a;

    public kbx(kbo kbo1, int i, Bundle bundle)
    {
        a = kbo1;
        super(kbo1, i, bundle);
    }

    protected final void a(ConnectionResult connectionresult)
    {
        kbo.a(a).b(connectionresult);
        a.a(connectionresult);
    }

    protected final boolean a()
    {
        kbo.a(a).b(ConnectionResult.a);
        return true;
    }
}
