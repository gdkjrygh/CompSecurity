// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public class lgx extends kbo
{

    public final lhq a = new lgy(this);
    private final String b;

    public lgx(Context context, Looper looper, jyq jyq, jys jys, String s, kax kax)
    {
        super(context, looper, 23, kax, jyq, jys);
        b = s;
    }

    static void a(lgx lgx1)
    {
        lgx1.n();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lhe.a(ibinder);
    }

    protected final String c()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final Bundle e()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", b);
        return bundle;
    }
}
