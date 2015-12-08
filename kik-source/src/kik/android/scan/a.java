// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import android.hardware.Camera;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.scan:
//            b

public final class a
    implements android.hardware.Camera.AutoFocusCallback
{

    private static ScheduledExecutorService d = Executors.newScheduledThreadPool(1);
    private final Camera a;
    private final int b = 1000;
    private boolean c;
    private final b e = org.c.c.a("ScanFocus");

    public a(Camera camera)
    {
        c = false;
        a = camera;
    }

    static b a(a a1)
    {
        return a1.e;
    }

    static boolean b(a a1)
    {
        return a1.c;
    }

    static Camera c(a a1)
    {
        return a1.a;
    }

    public final void a()
    {
        d.schedule(new kik.android.scan.b(this), b, TimeUnit.MILLISECONDS);
    }

    public final void b()
    {
        c = true;
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        a();
    }

}
