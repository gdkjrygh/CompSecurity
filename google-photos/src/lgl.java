// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public final class lgl
    implements Runnable
{

    private final Context a;
    private final lgj b;
    private final lgi c;
    private final lfp d;
    private final lge e;

    public lgl(Context context, lfp lfp1, lgj lgj1)
    {
        this(context, lfp1, lgj1, new lgi(), new lge());
    }

    public lgl(Context context, lfp lfp1, lgj lgj1, String s)
    {
        this(context, lfp1, lgj1, new lgi(), new lge());
        e.a = s;
        lqh.c((new StringBuilder("The Ctfe server endpoint was changed to: ")).append(s).toString());
    }

    private lgl(Context context, lfp lfp1, lgj lgj1, lgi lgi1, lge lge1)
    {
        b.d(context);
        b.d(lgj1);
        a = context;
        d = lfp1;
        b = lgj1;
        c = lgi1;
        e = lge1;
    }

    private boolean a(String s)
    {
        return a.getPackageManager().checkPermission(s, a.getPackageName()) == 0;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        boolean flag1;
        boolean flag;
        if (!a("android.permission.INTERNET"))
        {
            lqh.a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        } else
        if (!a("android.permission.ACCESS_NETWORK_STATE"))
        {
            lqh.a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            flag = false;
        } else
        {
            NetworkInfo networkinfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkinfo == null || !networkinfo.isConnected())
            {
                lqh.b("NetworkLoader: No network connectivity - Offline");
                flag = false;
            } else
            {
                flag = true;
            }
        }
        if (!flag)
        {
            b.a(lgk.a);
            return;
        }
        lqh.d("NetworkLoader: Starting to load resource from Network.");
        obj = c;
        Object obj2;
        ByteArrayOutputStream bytearrayoutputstream;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            obj = new lgf();
        } else
        {
            obj = new lgg();
        }
        obj2 = e;
        obj1 = d.a;
        obj2 = (new StringBuilder()).append(((lge) (obj2)).a).append("/gtm/android?");
        if (((List) (obj1)).size() <= 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.b(flag1);
        if (!((List) (obj1)).isEmpty()) goto _L2; else goto _L1
_L1:
        obj1 = "";
_L5:
        obj1 = ((StringBuilder) (obj2)).append(((String) (obj1))).toString();
        obj2 = ((lgh) (obj)).a(((String) (obj1)));
        bytearrayoutputstream = new ByteArrayOutputStream();
        c.a(((java.io.InputStream) (obj2)), bytearrayoutputstream);
        b.a(bytearrayoutputstream.toByteArray());
        ((lgh) (obj)).a();
        lqh.d("NetworkLoader: Resource loaded.");
        return;
_L2:
        lfh lfh1;
        lfh1 = (lfh)((List) (obj1)).get(0);
        if (lfh1.e.trim().equals(""))
        {
            break MISSING_BLOCK_LABEL_543;
        }
        obj1 = lfh1.e.trim();
_L7:
        StringBuilder stringbuilder = new StringBuilder();
        if (lfh1.c == null) goto _L4; else goto _L3
_L3:
        stringbuilder.append(lfh1.c);
_L6:
        stringbuilder.append("=").append(lge.a(lfh1.a)).append("&pv").append("=").append(lge.a(((String) (obj1))));
        if (lfh1.d)
        {
            stringbuilder.append("&gtm_debug=x");
        }
        obj1 = stringbuilder.toString();
          goto _L5
_L4:
        stringbuilder.append("id");
          goto _L6
        obj1;
        ((lgh) (obj)).a();
        throw obj1;
        Object obj3;
        obj3;
        lqh.a((new StringBuilder("NetworkLoader: No data is retrieved from the given url: ")).append(((String) (obj1))).toString());
        b.a(lgk.c);
        ((lgh) (obj)).a();
        return;
        obj3;
        lqh.a((new StringBuilder("NetworkLoader: Error when loading resource from url: ")).append(((String) (obj1))).append(" ").append(((IOException) (obj3)).getMessage()).toString(), ((Throwable) (obj3)));
        b.a(lgk.b);
        ((lgh) (obj)).a();
        return;
        obj3;
        lqh.a((new StringBuilder("NetworkLoader: Error when parsing downloaded resources from url: ")).append(((String) (obj1))).append(" ").append(((IOException) (obj3)).getMessage()).toString(), ((Throwable) (obj3)));
        b.a(lgk.c);
        ((lgh) (obj)).a();
        return;
        obj1 = "-1";
          goto _L7
    }
}
