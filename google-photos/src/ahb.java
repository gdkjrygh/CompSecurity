// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;
import java.util.concurrent.locks.ReentrantLock;

public final class ahb
    implements akb
{

    static ReentrantLock a = new ReentrantLock();
    public ahj b;

    ahb(ajr ajr)
    {
        b = null;
        b = new ahj(this, ajr);
    }

    public static int b()
    {
        return Camera.getNumberOfCameras();
    }

    static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT < 15;
    }

    public final void a()
    {
    }

    public final void a(aka aka)
    {
        b.a.a(aka);
    }

    public final boolean a(ahv ahv, aig aig1, int i)
    {
        boolean flag = false;
        if (b.a(ahv, i))
        {
            if (aig1 != null)
            {
                aig1.a(new akm(false));
            }
            flag = true;
        }
        return flag;
    }

    public final void b(aka aka)
    {
        b.a.b(aka);
    }

}
