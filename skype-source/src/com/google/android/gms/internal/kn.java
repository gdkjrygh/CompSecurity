// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.tagmanager.ak;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kl, kh, km, kc, 
//            kk, iq

public final class kn
    implements Runnable
{

    private final Context a;
    private final km b;
    private final kl c;
    private final kc d;
    private final kh e;

    public kn(Context context, kc kc1, km km1)
    {
        this(context, kc1, km1, new kl(), new kh());
    }

    private kn(Context context, kc kc1, km km1, kl kl1, kh kh1)
    {
        y.a(context);
        y.a(km1);
        a = context;
        d = kc1;
        b = km1;
        c = kl1;
        e = kh1;
    }

    public kn(Context context, kc kc1, km km1, String s)
    {
        this(context, kc1, km1, new kl(), new kh());
        e.a(s);
    }

    private boolean a(String s)
    {
        return a.getPackageManager().checkPermission(s, a.getPackageName()) == 0;
    }

    public final void run()
    {
        kk kk1;
        boolean flag;
        if (!a("android.permission.INTERNET"))
        {
            ak.a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        } else
        if (!a("android.permission.ACCESS_NETWORK_STATE"))
        {
            ak.a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            flag = false;
        } else
        {
            NetworkInfo networkinfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkinfo == null || !networkinfo.isConnected())
            {
                ak.b("NetworkLoader: No network connectivity - Offline");
                flag = false;
            } else
            {
                flag = true;
            }
        }
        if (!flag)
        {
            b.a(km.a.a);
            return;
        }
        ak.b();
        kk1 = kl.a();
        String s = e.a(d.a());
        java.io.InputStream inputstream = kk1.a(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        iq.a(inputstream, bytearrayoutputstream, false);
        b.a(bytearrayoutputstream.toByteArray());
        kk1.a();
        ak.b();
        return;
        Object obj;
        obj;
        ak.a((new StringBuilder("NetworkLoader: No data is retrieved from the given url: ")).append(s).toString());
        b.a(km.a.c);
        kk1.a();
        return;
        obj;
        ak.a((new StringBuilder("NetworkLoader: Error when loading resource from url: ")).append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        b.a(km.a.b);
        kk1.a();
        return;
        obj;
        ak.a((new StringBuilder("NetworkLoader: Error when parsing downloaded resources from url: ")).append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        b.a(km.a.c);
        kk1.a();
        return;
        Exception exception;
        exception;
        kk1.a();
        throw exception;
    }
}
