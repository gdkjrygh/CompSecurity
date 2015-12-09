// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.content.Context;
import b.a.a.a.a.a.b;
import b.a.a.a.a.a.d;
import b.a.a.a.f;
import b.a.a.a.q;

// Referenced classes of package b.a.a.a.a.b:
//            aa

public final class z
{

    private final d a = new aa(this);
    private final b b = new b();

    public z()
    {
    }

    public final String a(Context context)
    {
        boolean flag;
        try
        {
            context = (String)b.a(context, a);
            flag = "".equals(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            f.c().c("Fabric", "Failed to determine installer package name", context);
            return null;
        }
        if (flag)
        {
            context = null;
        }
        return context;
    }
}
