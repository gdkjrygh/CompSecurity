// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import android.hardware.Camera;
import org.c.b;

// Referenced classes of package kik.android.scan:
//            m, k

final class n
    implements Runnable
{

    final byte a[];
    final Camera b;
    final m c;

    n(m m1, byte abyte0[], Camera camera)
    {
        c = m1;
        a = abyte0;
        b = camera;
        super();
    }

    public final void run()
    {
        try
        {
            k.a(c.a, a, b);
        }
        catch (Throwable throwable)
        {
            k.f().b("Unexpected error in decode thread", throwable);
        }
        if (!kik.android.scan.k.b(c.a))
        {
            b.addCallbackBuffer(a);
        }
    }
}
