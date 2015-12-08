// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import com.kik.g.r;
import com.kik.m.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kik.a.d.a.a;
import kik.android.util.bx;
import kik.android.util.ct;

// Referenced classes of package kik.android.net.a:
//            c, e

final class d extends r
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void a()
    {
        kik.android.net.a.c.a(a);
    }

    public final void a(Object obj)
    {
        obj = (File)obj;
        kik.android.net.a.c.a(a, c.a.c);
        kik.android.net.a.c.a(a, ((File) (obj)));
        kik.android.net.a.c.a(a, c.b(a).getName());
        c.c(a).a(c.b(a));
        for (obj = c.d(a).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a(c.b(a))) { }
        obj = ct.b(c.b(a).getPath());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = kik.android.util.r.c(((android.graphics.Bitmap) (obj)));
        if (obj != null)
        {
            try
            {
                obj = k.b(((android.graphics.Bitmap) (obj)), android.graphics.Bitmap.CompressFormat.JPEG, 80);
                c.c(a).a("preview", new kik.a.d.d(((byte []) (obj))));
                for (Iterator iterator = c.d(a).iterator(); iterator.hasNext(); ((a)iterator.next()).a("preview", new kik.a.d.d(((byte []) (obj))))) { }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                bx.a(new Exception("Thumbnail regeneration failed after transcoding"));
            }
        }
        c.c(a).a(false);
        for (obj = c.d(a).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a(false)) { }
        if (c.e(a) == 2)
        {
            kik.android.net.a.e.a().a(a);
        } else
        {
            if (c.e(a) == 1)
            {
                a.i();
                return;
            }
            if (c.e(a) == -1)
            {
                a.j();
                return;
            }
        }
        return;
    }

    public final void a(Throwable throwable)
    {
        kik.android.net.a.c.a(a, kik.android.net.a.c.a.a);
    }
}
