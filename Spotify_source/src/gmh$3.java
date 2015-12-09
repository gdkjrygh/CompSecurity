// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.Map;

final class ang.Object
    implements Runnable
{

    private String a;
    private gmh b;

    public final void run()
    {
        if (b.a.containsKey(a))
        {
            String s = a;
            gmh.a(b, a);
            return;
        } else
        {
            Object obj = a;
            obj = a;
            obj = new gmj(a, b.c, b.f);
            ehe ehe1 = new ehe(new ehk(new ehv(b.e), ((egv) (obj))), b.b, new Handler(Looper.getMainLooper()), false);
            obj = new gmi(a, ehe1, ((gmj) (obj)), (byte)0);
            b.a.put(a, obj);
            gmh.a(b, ((gmi) (obj)).a);
            return;
        }
    }

    (gmh gmh1, String s)
    {
        b = gmh1;
        a = s;
        super();
    }
}
