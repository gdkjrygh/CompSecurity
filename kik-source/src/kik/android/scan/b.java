// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import android.hardware.Camera;

// Referenced classes of package kik.android.scan:
//            a

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        kik.android.scan.a.a(a);
        if (!kik.android.scan.a.b(a))
        {
            kik.android.scan.a.c(a).autoFocus(a);
        }
    }
}
