// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.ke;
import com.google.android.gms.internal.kk;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.lb;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ak, de, bg, aj

final class bq
    implements Runnable
{

    private final Context a;
    private final kl b;
    private final String c;
    private final String d;
    private aj e;
    private volatile de f;
    private volatile String g;
    private volatile String h;

    private bq(Context context, String s, kl kl1, de de1)
    {
        a = context;
        b = kl1;
        c = s;
        f = de1;
        d = (new StringBuilder("/r?id=")).append(s).toString();
        g = d;
        h = null;
    }

    public bq(Context context, String s, de de1)
    {
        this(context, s, new kl(), de1);
    }

    final void a(aj aj)
    {
        e = aj;
    }

    final void a(String s)
    {
        if (s == null)
        {
            g = d;
            return;
        } else
        {
            ak.a();
            g = s;
            return;
        }
    }

    final void b(String s)
    {
        ak.a();
        h = s;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        if (e == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        }
        obj = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean flag;
        if (obj == null || !((NetworkInfo) (obj)).isConnected())
        {
            ak.b();
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            obj = aj.a.a;
            return;
        }
        ak.b();
        obj1 = (new StringBuilder()).append(f.a()).append(g).append("&v=a65833898").toString();
        obj = obj1;
        if (h != null)
        {
            obj = obj1;
            if (!h.trim().equals(""))
            {
                obj = (new StringBuilder()).append(((String) (obj1))).append("&pv=").append(h).toString();
            }
        }
        if (bg.a().b().equals(bg.a.c))
        {
            obj = (new StringBuilder()).append(((String) (obj))).append("&gtm_debug=x").toString();
        }
        obj1 = kl.a();
        Object obj2 = ((kk) (obj1)).a(((String) (obj)));
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ke.a(((java.io.InputStream) (obj2)), bytearrayoutputstream);
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        abyte0 = (com.google.android.gms.internal.g.i)lb.a(new com.google.android.gms.internal.g.i(), abyte0);
        (new StringBuilder("Successfully loaded supplemented resource: ")).append(abyte0);
        ak.b();
        if (((com.google.android.gms.internal.g.i) (abyte0)).b == null && ((com.google.android.gms.internal.g.i) (abyte0)).a.length == 0)
        {
            (new StringBuilder("No change for container: ")).append(c);
            ak.b();
        }
        ((kk) (obj1)).a();
        ak.b();
        return;
        Object obj3;
        obj3;
        ak.b((new StringBuilder("No data is retrieved from the given url: ")).append(((String) (obj))).append(". Make sure container_id: ").append(c).append(" is correct.").toString());
        obj = aj.a.c;
        ((kk) (obj1)).a();
        return;
        obj3;
        ak.b((new StringBuilder("Error when loading resources from url: ")).append(((String) (obj))).append(" ").append(((IOException) (obj3)).getMessage()).toString(), ((Throwable) (obj3)));
        obj = aj.a.b;
        ((kk) (obj1)).a();
        return;
        obj3;
        ak.b((new StringBuilder("Error when parsing downloaded resources from url: ")).append(((String) (obj))).append(" ").append(((IOException) (obj3)).getMessage()).toString(), ((Throwable) (obj3)));
        obj = aj.a.c;
        ((kk) (obj1)).a();
        return;
        Exception exception;
        exception;
        ((kk) (obj1)).a();
        throw exception;
    }
}
