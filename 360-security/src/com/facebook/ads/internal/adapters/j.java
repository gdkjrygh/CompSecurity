// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.util.h;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            k

public abstract class j
{

    protected final k a;
    private final Context b;
    private boolean c;

    public j(Context context, k k1)
    {
        b = context;
        a = k1;
    }

    public final void a()
    {
        if (!c)
        {
            if (a != null)
            {
                a.b();
            }
            b();
            c = true;
            h.a(b, "Impression logged");
            if (a != null)
            {
                a.c();
                return;
            }
        }
    }

    protected abstract void b();
}
