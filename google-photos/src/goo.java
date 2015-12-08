// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

final class goo
    implements gnu, gyw, ixf, nug, omb, ooi, opp, opr, opv
{

    private static final long b;
    gnk a;
    private final int c;
    private final am d;
    private jhj e;
    private nwm f;
    private mwx g;
    private ixe h;
    private gmu i;
    private noz j;
    private long k;
    private mwz l;
    private final Runnable m = new gop(this);

    public goo(am am1, opd opd1, int i1)
    {
        d = am1;
        c = i1;
        opd1.a(this);
    }

    static noz a(goo goo1)
    {
        return goo1.j;
    }

    private void a(ekp ekp1)
    {
        if (a != null)
        {
            if (ekp1 == null)
            {
                e();
                return;
            }
            if (j.a())
            {
                noy.a("media", Long.valueOf(ekp1.b()));
                noy.a("enter", Long.valueOf(a.c.b()));
                noy.a("exit", Long.valueOf(a.d.b()));
                noy.a("isAnimating", Boolean.valueOf(a.e));
            }
            if (ekp1.equals(h()) && !a.e && b(ekp1))
            {
                e();
                return;
            }
        }
    }

    private void a(gnk gnk1)
    {
        bb bb = d.B;
        bb.a().a(c, gnk1, "com.google.android.apps.photos.pager.PhotoPagerMutationManager.photo_transition").b();
        bb.b();
        a = gnk1;
        k = noy.a();
        f.c();
    }

    static void b(goo goo1)
    {
        goo1.e();
    }

    private boolean b(ekp ekp1)
    {
        Object obj = e.b;
        if (!(obj instanceof gwu))
        {
            return false;
        }
        obj = (gwu)obj;
        grn grn1 = ((gwu) (obj)).b;
        if (j.a())
        {
            noy.a("media", Long.valueOf(grn1.b.b()));
            noy.a("isLoaded", Boolean.valueOf(((gwu) (obj)).b.c));
        }
        return grn1.b.equals(ekp1) && grn1.c;
    }

    private void e()
    {
        g.a(l);
        if (a == null)
        {
            return;
        }
        bb bb = d.B;
        bb.a().a(a).c();
        bb.b();
        a.a = null;
        a = null;
        if (j.a())
        {
            noy.a("duration", k);
        }
        f.c();
    }

    private ekp h()
    {
        if (a.b == gnt.b)
        {
            return a.c;
        } else
        {
            return a.d;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        h = (ixe)olm1.a(ixe);
        f = (nwm)olm1.a(nwm);
        e = (jhj)olm1.a(jhj);
        i = (gmu)olm1.a(gmu);
        g = (mwx)olm1.a(mwx);
        j = noz.a(context, 3, "PagerMutationManager", new String[0]);
    }

    public final void a(PhotoView photoview, ekp ekp1)
    {
        if (j.a() && a != null)
        {
            noy.a("media", Long.valueOf(ekp1.b()));
        }
        a(ekp1);
    }

    public final void a(Collection collection)
    {
        ekp ekp1;
        boolean flag;
        if (collection.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Don't allow bulk trash for pager.");
        ekp1 = i.b();
        collection = (ekp)collection.iterator().next();
        if (a != null)
        {
            e();
        }
        if (collection == null || ekp1 == null)
        {
            return;
        }
        if (j.a())
        {
            noy.a("currentMedia", Long.valueOf(collection.b()));
            noy.a("nextMedia", Long.valueOf(ekp1.b()));
        }
        collection = gnk.r().a(ekp1).b(collection).a(gnt.b);
        collection.a = this;
        a(collection.a());
    }

    public final void a(Collection collection, boolean flag)
    {
        boolean flag1 = true;
        if (collection.size() != 1)
        {
            flag1 = false;
        }
        p.a(flag1, "Don't allow bulk trash for pager.");
        if (!flag)
        {
            e();
        }
    }

    public final void al_()
    {
        h.a(this);
        e.a.a(this, false);
    }

    public final void am_()
    {
        h.b(this);
        e.a.a(this);
    }

    public final void b(Collection collection)
    {
        ekp ekp1;
        boolean flag;
        if (collection.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Don't allow bulk trash for pager.");
        collection = (ekp)collection.iterator().next();
        ekp1 = i.a();
        if (a != null)
        {
            e();
        }
        if (ekp1 == null || collection == null)
        {
            return;
        }
        if (j.a())
        {
            noy.a("currentMedia", Long.valueOf(ekp1.b()));
            noy.a("previousMedia", Long.valueOf(collection.b()));
        }
        collection = gnk.r().a(ekp1).b(collection).a(gnt.a);
        collection.a = this;
        a(collection.a());
    }

    public final void b_(Bundle bundle)
    {
        if (bundle != null)
        {
            a = (gnk)d.B.a("com.google.android.apps.photos.pager.PhotoPagerMutationManager.photo_transition");
            e();
        }
    }

    public final void b_(Object obj)
    {
        obj = ((jhj)obj).b;
        if (obj instanceof gwu)
        {
            obj = (gwu)obj;
            if (j.a())
            {
                noy.a("media", Long.valueOf(((gwu) (obj)).b.b.b()));
                noy.a("isLoaded", Boolean.valueOf(((gwu) (obj)).b.c));
            }
            if (((gwu) (obj)).b.c)
            {
                a(((gwu) (obj)).b.b);
            }
        }
    }

    public final void c()
    {
        if (j.a())
        {
            noy.a("enter", Long.valueOf(a.c.b()));
            noy.a("exit", Long.valueOf(a.d.b()));
        }
        g.a(l);
        l = g.a(m, b);
    }

    public final void c(Collection collection)
    {
    }

    public final void d()
    {
        if (j.a())
        {
            noy.a("enter", Long.valueOf(a.c.b()));
            noy.a("exit", Long.valueOf(a.d.b()));
        }
        if (!b(h()))
        {
            return;
        } else
        {
            e();
            return;
        }
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(5L);
    }
}
