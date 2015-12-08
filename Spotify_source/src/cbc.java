// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

public final class cbc
{

    boolean a;
    String b;
    Map c;
    Context d;
    String e;

    public cbc(Context context, String s)
    {
        d = null;
        e = null;
        d = context;
        e = s;
        s = cbb.u;
        a = ((Boolean)bkv.n().a(s)).booleanValue();
        s = cbb.v;
        b = (String)bkv.n().a(s);
        c = new LinkedHashMap();
        c.put("s", "gmob_sdk");
        c.put("v", "3");
        c.put("os", android.os.Build.VERSION.RELEASE);
        c.put("sdk", android.os.Build.VERSION.SDK);
        s = c;
        bkv.e();
        s.put("device", cjj.b());
        s = c;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext().getPackageName();
        } else
        {
            context = context.getPackageName();
        }
        s.put("app", context);
        context = bkv.k().a(d);
        c.put("network_coarse", Integer.toString(((cik) (context)).m));
        c.put("network_fine", Integer.toString(((cik) (context)).n));
    }
}
