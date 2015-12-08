// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a.a.b.x;
import a.a.a.a.a.c.w;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package a.a.a.a:
//            e, l, f, p, 
//            s

public final class i
{

    private final Context a;
    private p b[];
    private w c;
    private Handler d;
    private s e;
    private boolean f;
    private String g;
    private String h;
    private l i;

    public i(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null.");
        } else
        {
            a = context.getApplicationContext();
            return;
        }
    }

    public final f a()
    {
        if (c == null)
        {
            c = w.a();
        }
        if (d == null)
        {
            d = new Handler(Looper.getMainLooper());
        }
        Object obj;
        x x1;
        if (e == null)
        {
            if (f)
            {
                e = new e();
            } else
            {
                e = new e((byte)0);
            }
        }
        if (h == null)
        {
            h = a.getPackageName();
        }
        if (i == null)
        {
            i = l.d;
        }
        if (b == null)
        {
            obj = new HashMap();
        } else
        {
            obj = a.a.a.a.f.a(Arrays.asList(b));
        }
        x1 = new x(a, h, g, ((Map) (obj)).values());
        return new f(a, ((Map) (obj)), c, d, e, f, i, x1);
    }

    public final transient i a(p ap[])
    {
        if (b != null)
        {
            throw new IllegalStateException("Kits already set.");
        } else
        {
            b = ap;
            return this;
        }
    }
}
