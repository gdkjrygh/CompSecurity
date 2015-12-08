// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast.internal:
//            j, p, r

public abstract class d
{

    protected final p f;
    public final String g;
    public r h;

    protected d(String s, String s1)
    {
        Object obj = null;
        super();
        j.a(s);
        g = s;
        f = new p(s1);
        if (!TextUtils.isEmpty(null))
        {
            s1 = f;
            if (TextUtils.isEmpty(null))
            {
                s = obj;
            } else
            {
                s = String.format("[%s] ", new Object[] {
                    null
                });
            }
            s1.c = s;
        }
    }

    public void a(String s)
    {
    }

    protected final void a(String s, long l)
        throws IOException
    {
        p p1 = f;
        if (p1.b)
        {
            p1.c("Sending text message: %s to: %s", new Object[] {
                s, null
            });
        }
        h.a(g, s, l);
    }

    public void e()
    {
    }

    protected final long f()
    {
        return h.a();
    }
}
