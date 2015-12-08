// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import java.util.concurrent.TimeUnit;

abstract class mht
    implements jyq, jys, mhe
{

    public final jyn a;
    private mhf b;

    public mht(Context context, String s, mhf mhf1)
    {
        b = mhf1;
        mhf1 = (new jyo(context)).a(lnq.b);
        if (s == null)
        {
            context = null;
        } else
        {
            context = new Account(s, "com.google");
        }
        mhf1.a = context;
        a = mhf1.a();
    }

    private void e()
    {
        if (!a.b(this))
        {
            a.a(this);
        }
        if (!a.b(this))
        {
            a.a(this);
        }
    }

    public lzv a(mhj mhj1)
    {
        mhj1 = new AutoBackupSettings(1, mhj1.a, mhj1.b, mhj1.c, mhj1.d, mhj1.e, mhj1.f, mhj1.g, mhj1.h, false, null);
        return new lzv(lnq.c.a(a, mhj1), new mhw(this));
    }

    public void a()
    {
        e();
        a.b();
    }

    public void a(int i)
    {
    }

    public void a(long l, TimeUnit timeunit)
    {
        e();
        a.a(l, timeunit);
    }

    public void a(Bundle bundle)
    {
        if (b != null)
        {
            b.a();
        }
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    public void a(mhg mhg)
    {
        lnq.c.a(a).a(new mhu(this, mhg));
    }

    public void b()
    {
        a.d();
        if (a.b(this))
        {
            a.c(this);
        }
        if (a.b(this))
        {
            a.c(this);
        }
    }

    public lzv c(String s)
    {
        return new lzv(lnq.c.c(a, s), new mhx(this));
    }

    public boolean c()
    {
        return a.e();
    }

    public lzv d()
    {
        return new lzv(lnq.c.b(a), new mhv(this));
    }
}
