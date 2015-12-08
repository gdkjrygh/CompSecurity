// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

final class npn
    implements npk
{

    private final npr a;
    private final ConnectivityManager b;

    public npn(Context context)
    {
        a = (npr)olm.a(context, npr);
        b = (ConnectivityManager)context.getSystemService("connectivity");
        new npq(this);
    }

    private static boolean a(NetworkInfo networkinfo)
    {
        if (Log.isLoggable("NetworkCapability", 3))
        {
            String s = String.valueOf(networkinfo);
            (new StringBuilder(String.valueOf(s).length() + 16)).append("Active network: ").append(s);
        }
        boolean flag;
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return flag && networkinfo.getDetailedState() != android.net.NetworkInfo.DetailedState.BLOCKED;
        } else
        {
            return flag;
        }
    }

    public final boolean a()
    {
        return a(b.getActiveNetworkInfo());
    }

    public final boolean b()
    {
        return a(b.getNetworkInfo(1));
    }

    public final boolean c()
    {
        return ig.a(b);
    }

    public final boolean d()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isRoaming();
    }

    public final boolean e()
    {
        if (b())
        {
            boolean flag;
            if (!ig.a(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final int f()
    {
        return a.a();
    }

    public final int g()
    {
        return (int)a.a;
    }

    public final int h()
    {
        return a.b();
    }
}
