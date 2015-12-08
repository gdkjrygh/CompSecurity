// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class gj
{

    public final go a;
    private final hq b;

    public gj()
    {
    }

    public gj(Context context, gz gz1)
    {
        if (gz1 == null)
        {
            throw new IllegalArgumentException("session must not be null");
        }
        b = gz1.a();
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            a = new gq(context, gz1);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new gp(context, gz1);
            return;
        } else
        {
            a = new gr(b);
            return;
        }
    }

    public gj(Context context, hq hq)
    {
        if (hq == null)
        {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        b = hq;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new gp(context, hq);
            return;
        } else
        {
            a = new gr(b);
            return;
        }
    }

    public final gt a()
    {
        return a.a();
    }

    public final void a(gk gk)
    {
        if (gk == null)
        {
            throw new IllegalArgumentException("callback cannot be null");
        } else
        {
            a.a(gk);
            return;
        }
    }
}
