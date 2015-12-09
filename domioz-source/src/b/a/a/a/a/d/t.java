// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.l;

// Referenced classes of package b.a.a.a.a.d:
//            p

public final class t
    implements Runnable
{

    private final Context a;
    private final p b;

    public t(Context context, p p1)
    {
        a = context;
        b = p1;
    }

    public final void run()
    {
        try
        {
            l.a(a, "Performing time based file roll over.");
            if (!b.e())
            {
                b.d();
            }
            return;
        }
        catch (Exception exception)
        {
            l.b(a, "Failed to roll over file");
        }
    }
}
