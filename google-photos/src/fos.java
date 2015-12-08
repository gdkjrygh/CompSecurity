// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;

final class fos extends fte
    implements nug
{

    private final mwx a;
    private final fpf b;
    private final Runnable c = new fot(this);
    private mwz d;
    private final Rect e = new Rect();
    private final int f[] = new int[2];
    private boolean g;
    private boolean h;
    private fok i;

    public fos(fok fok1, mwx mwx1, fpf fpf1)
    {
        i = fok1;
        super();
        a = mwx1;
        b = fpf1;
    }

    static void a(fos fos1)
    {
        fos1.b();
    }

    private void b()
    {
        if (h || g || !fok.i(i).e())
        {
            b.c();
            return;
        } else
        {
            b.d();
            return;
        }
    }

    private boolean e(fsv fsv1)
    {
        Rect rect = e;
        fsv1.i.getLocationInWindow(fsv1.b);
        rect.set(fsv1.b[0] + (int)fsv1.c(), fsv1.b[1] + fsv1.d(), fsv1.b[0] + (int)fsv1.b(), fsv1.b[1] + fsv1.d() + fsv1.c);
        if (!b.b())
        {
            b.a().getLocationInWindow(f);
        }
        return e.bottom >= f[1];
    }

    public final void ap_()
    {
        h = false;
        if (b.b())
        {
            d = a.a(c, 70L);
        }
    }

    public final void b_(Object obj)
    {
        g = ((hyy)obj).b();
        b();
    }

    public final void c(fsv fsv1)
    {
        h = e(fsv1);
        if (fsv1.f == ftk.d)
        {
            return;
        } else
        {
            b();
            return;
        }
    }

    public final void d(fsv fsv1)
    {
        h = e(fsv1);
        a.a(d);
        b();
    }
}
