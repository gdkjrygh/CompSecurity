// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import android.os.Bundle;
import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.b.b;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.f;

public abstract class g
    implements Runnable
{

    private final f a;
    private final Bundle b;

    public g(f f1, Bundle bundle)
    {
        a = f1;
        b = bundle;
    }

    public abstract void a()
        throws a;

    public void run()
    {
        b b1;
        try
        {
            a();
            return;
        }
        catch (a a1)
        {
            d.c(a1.toString());
            a.onFailure(a1, b);
            return;
        }
        catch (Exception exception)
        {
            b1 = new b(exception);
        }
        d.c(b1.toString());
        a.onFailure(b1, b);
    }
}
