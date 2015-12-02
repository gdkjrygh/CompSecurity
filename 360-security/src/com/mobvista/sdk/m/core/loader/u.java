// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import com.mobvista.sdk.m.a.a.d.a;
import com.mobvista.sdk.m.a.a.d.b;
import com.mobvista.sdk.m.a.e.c;
import com.mobvista.sdk.m.a.e.d;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            v

public final class u extends a
    implements d
{

    private b a;
    private JumpLoader.JumpLoaderResult b;
    private boolean c;

    public u()
    {
        c = true;
    }

    static JumpLoader.JumpLoaderResult a(u u1)
    {
        return u1.b;
    }

    static JumpLoader.JumpLoaderResult a(u u1, JumpLoader.JumpLoaderResult jumploaderresult)
    {
        u1.b = jumploaderresult;
        return jumploaderresult;
    }

    static boolean b(u u1)
    {
        return u1.c;
    }

    public final void a(Context context, String s, b b1, boolean flag)
    {
        a = b1;
        if (flag)
        {
            com.mobvista.sdk.m.a.e.a.a().b(new v(this, context, s), this);
            return;
        } else
        {
            com.mobvista.sdk.m.a.e.a.a().a(new v(this, context, s), this);
            return;
        }
    }

    public final void a(c c1)
    {
    }

    public final void b()
    {
        c = false;
    }

    public final void b(c c1)
    {
        while (!c || a == null) 
        {
            return;
        }
        if (b.isSuccess())
        {
            a.a(b);
            return;
        } else
        {
            a.a(b.getMsg());
            return;
        }
    }
}
