// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.h;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.slyce.f.c;
import com.android.slyce.j.n;
import com.android.slyce.j.p;
import com.android.slyce.k.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.h:
//            b, c

public class a
    implements n, p
{

    private static String f = com/android/slyce/h/a.getSimpleName();
    protected com.android.slyce.j.a a;
    protected String b;
    protected int c;
    protected com.android.slyce.a d;
    protected boolean e;
    private AtomicBoolean g;
    private b h;
    private com.android.slyce.h.c i;
    private String j;
    private Bitmap k;

    public a(Context context, com.android.slyce.a a1, c c1, JSONObject jsonobject)
    {
        g = new AtomicBoolean(false);
        e = false;
        d = a1;
        a = new com.android.slyce.j.a(context, a1.c(), a1.a(), a1.b(), c1, jsonobject);
        a.a(this);
        a.a(this);
    }

    public void a(int l)
    {
        c = l;
    }

    protected void a(b b1)
    {
        h = b1;
    }

    protected void a(com.android.slyce.h.c c1)
    {
        i = c1;
    }

    protected void b()
    {
        if (!g.compareAndSet(false, true))
        {
            com.android.slyce.k.h.b(f, "execute can be called only once, please create another instance of SlyceRequest");
            return;
        }
        if (!d.e())
        {
            com.android.slyce.k.h.b(f, "Slyce SDK is not initialized");
            return;
        } else
        {
            a.a(this);
            return;
        }
    }

    protected void b(Bitmap bitmap)
    {
        k = bitmap;
    }

    public void b(String s)
    {
        b = s;
    }

    public b c()
    {
        return h;
    }

    public void c(String s)
    {
        j = s;
    }

    public com.android.slyce.h.c d()
    {
        return i;
    }

    public boolean e()
    {
        return e;
    }

    public String f()
    {
        return j;
    }

    public Bitmap g()
    {
        return k;
    }

}
