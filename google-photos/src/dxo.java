// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class dxo
{

    final lzq a;
    final mdy b;
    private final Context c;
    private final noz d;
    private final noz e;
    private CountDownLatch f;

    public dxo(Context context)
    {
        f = new CountDownLatch(0);
        c = context;
        d = noz.a(context, "LocationApiHelper", new String[0]);
        e = noz.a(context, 3, "LocationApiHelper", new String[0]);
        b = (mdy)olm.a(context, mdy);
        a = ((lzs)olm.a(context, lzs)).a(context).a((lzp)olm.a(context, mdz)).a(new dxq(this)).a(new dxp(this)).a();
    }

    static CountDownLatch a(dxo dxo1)
    {
        return dxo1.f;
    }

    static void a(dxo dxo1, int i)
    {
        dxo1.a(i);
    }

    static noz b(dxo dxo1)
    {
        return dxo1.e;
    }

    static void c(dxo dxo1)
    {
        dxo1.a();
    }

    static noz d(dxo dxo1)
    {
        return dxo1.d;
    }

    void a()
    {
        a.b();
    }

    void a(int i)
    {
        Toast.makeText(c, c.getString(i), 1).show();
    }

    public final boolean a(Account account)
    {
        if (account != null)
        {
            f = new CountDownLatch(1);
            if (!a.c())
            {
                a.a();
                try
                {
                    f.await(2L, TimeUnit.SECONDS);
                }
                catch (InterruptedException interruptedexception)
                {
                    a.b();
                }
            }
            if (a.c())
            {
                account = (mea)b.a(a, account).a();
                if (e.a())
                {
                    noy.a("isSuccess", Boolean.valueOf(account.r().a()));
                    noy.a("isOptedIn", Boolean.valueOf(account.d()));
                    noy.a("shouldOptInLenient", Boolean.valueOf(account.f()));
                    noy.a("deferringToMaps", Boolean.valueOf(false));
                    if (!account.f())
                    {
                        noy.a("isHistoryEnabled", Boolean.valueOf(account.c()));
                        noy.a("isReportingEnabled", Boolean.valueOf(account.b()));
                        noy.a("expectedOptInStatusCode", Integer.valueOf(account.e()));
                    }
                }
                boolean flag;
                if (account.r().a() && !account.d() && account.f())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (e.a())
                {
                    noy.a("showOptInt", Boolean.valueOf(flag));
                }
                return flag;
            }
        }
        return false;
    }
}
