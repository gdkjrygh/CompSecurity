// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            c

public abstract class b
{

    protected final c a;
    private final Context b;
    private boolean c;

    public b(Context context, c c1)
    {
        b = context;
        a = c1;
    }

    public final void a()
    {
        if (!c)
        {
            if (a != null)
            {
                a.d();
            }
            b();
            c = true;
            g.a(b, "Impression logged");
            if (a != null)
            {
                a.e();
                return;
            }
        }
    }

    protected abstract void b();
}
