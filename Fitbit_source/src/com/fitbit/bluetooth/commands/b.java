// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            j

public class b extends j
{

    private static final String n = "ClearSecretCommand";

    public b(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
    }

    public volatile void a()
    {
        super.a();
    }

    public volatile void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f1)
    {
        super.a(f1);
    }

    public volatile void a(com.fitbit.galileo.ota.GalileoOtaMessages.i l)
    {
        super.a(l);
    }

    public volatile void a(com.fitbit.galileo.ota.GalileoOtaMessages.l l)
    {
        super.a(l);
    }

    public volatile void a(com.fitbit.galileo.ota.GalileoOtaMessages.n n1)
    {
        super.a(n1);
    }

    public volatile void a(com.fitbit.galileo.ota.GalileoOtaMessages.u u)
    {
        super.a(u);
    }

    public volatile void a(com.fitbit.galileo.ota.GalileoOtaMessages.v v)
    {
        super.a(v);
    }

    public volatile void a(byte abyte0[])
    {
        super.a(abyte0);
    }

    public volatile void a(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
        super.a(abyte0, status);
    }

    public void b()
    {
        r();
        m.a(true, null);
    }

    public volatile void b(byte abyte0[])
    {
        super.b(abyte0);
    }

    public volatile void b(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
        super.b(abyte0, status);
    }

    public volatile void c()
    {
        super.c();
    }

    public volatile void c(byte abyte0[])
    {
        super.c(abyte0);
    }

    public volatile void d()
    {
        super.d();
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile void f()
    {
        super.f();
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        galileoprofile.setListener(this);
        if (galileoprofile.writeValue(k.l(), com.fitbit.galileo.ota.b.j()))
        {
            s();
            return;
        } else
        {
            r();
            m.a(false, null);
            return;
        }
    }

    protected void h()
    {
        k.a().setListener(null);
        t();
    }

    protected void i()
    {
        r();
        m.a(false, null);
    }

    protected String k()
    {
        return "ClearSecretCommand";
    }
}
