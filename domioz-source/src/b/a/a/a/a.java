// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.app.Application;
import android.content.Context;

// Referenced classes of package b.a.a.a:
//            b, d

public final class a
{

    private final Application a;
    private b b;

    public a(Context context)
    {
        a = (Application)context.getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new b(a);
        }
    }

    public final boolean a(d d)
    {
        return b != null && b.a.a.a.b.a(b, d);
    }
}
