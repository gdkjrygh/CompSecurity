// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b.a.a.a.a.b.x;
import b.a.a.a.a.c.w;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package b.a.a.a:
//            e, k, f, o, 
//            q

public final class i
{

    private final Context a;
    private o b[];
    private w c;
    private Handler d;
    private q e;
    private boolean f;
    private String g;
    private String h;
    private k i;

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
        if (b == null)
        {
            throw new IllegalStateException("Kits must not be null.");
        }
        if (c == null)
        {
            c = w.a();
        }
        if (d == null)
        {
            d = new Handler(Looper.getMainLooper());
        }
        Map map;
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
            i = k.d;
        }
        map = b.a.a.a.f.a(Arrays.asList(b));
        x1 = new x(a, h, g, map.values());
        return new f(a, map, c, d, e, f, i, x1);
    }

    public final transient i a(o ao[])
    {
        if (ao == null)
        {
            throw new IllegalArgumentException("Kits must not be null.");
        }
        if (ao.length == 0)
        {
            throw new IllegalArgumentException("Kits must not be empty.");
        }
        if (b != null)
        {
            throw new IllegalStateException("Kits already set.");
        } else
        {
            b = ao;
            return this;
        }
    }
}
