// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.c;

import android.hardware.Camera;
import android.view.SurfaceView;
import com.a.a.a;
import java.io.IOException;
import kik.android.util.bx;

// Referenced classes of package kik.android.c:
//            c

final class d
    implements Runnable
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void run()
    {
        android.view.SurfaceHolder surfaceholder;
        if (kik.android.c.c.a(a) != null && a.e)
        {
            if ((surfaceholder = c.b(a).getHolder()) != null)
            {
                try
                {
                    kik.android.c.c.a(a).setPreviewDisplay(surfaceholder);
                    kik.android.c.c.a(a).startPreview();
                    c.b(a).requestLayout();
                    return;
                }
                catch (IOException ioexception)
                {
                    com.a.a.a.a(ioexception);
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    bx.a(runtimeexception);
                }
                if (a.c != null)
                {
                    a.c.a();
                    return;
                }
            }
        }
    }
}
