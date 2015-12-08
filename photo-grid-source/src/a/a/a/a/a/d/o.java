// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.d;

import a.a.a.a.a.b.l;
import android.content.Context;

// Referenced classes of package a.a.a.a.a.d:
//            k

public final class o
    implements Runnable
{

    private final Context a;
    private final k b;

    public o(Context context, k k1)
    {
        a = context;
        b = k1;
    }

    public final void run()
    {
        try
        {
            l.e(a);
            if (!b.e())
            {
                b.d();
            }
            return;
        }
        catch (Exception exception)
        {
            l.a(a, "Failed to roll over file");
        }
    }
}
