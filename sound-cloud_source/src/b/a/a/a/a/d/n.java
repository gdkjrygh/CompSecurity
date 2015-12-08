// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.j;

// Referenced classes of package b.a.a.a.a.d:
//            j

public final class n
    implements Runnable
{

    private final Context a;
    private final b.a.a.a.a.d.j b;

    public n(Context context, b.a.a.a.a.d.j j1)
    {
        a = context;
        b = j1;
    }

    public final void run()
    {
        try
        {
            j.e(a);
            if (!b.e())
            {
                b.d();
            }
            return;
        }
        catch (Exception exception)
        {
            j.f(a);
        }
    }
}
