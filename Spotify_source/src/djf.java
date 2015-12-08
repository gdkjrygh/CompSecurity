// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

final class djf extends dja
{

    private final dja a;

    djf(djj djj1, Context context, Fragment fragment)
    {
        dgm dgm = djj1.i;
        int j = djj1.b;
        if (dgm != null)
        {
            a = new djk(djj1, context, fragment, dgm);
            return;
        }
        if (j == 1)
        {
            a = new djm(djj1, context, fragment);
            return;
        }
        if (j == 2)
        {
            throw new UnsupportedOperationException("Not implemented");
        } else
        {
            a = new djo(djj1, context, fragment);
            return;
        }
    }

    public final djt a()
    {
        return a.a();
    }

    public final void a(int j)
    {
        a.a(j);
    }

    public final void a(Menu menu, Activity activity)
    {
    }

    public final void a(View view)
    {
        a.a(view);
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final View b()
    {
        return a.b();
    }

    public final void b(int j)
    {
    }

    public final void b(View view)
    {
        a.b(view);
    }

    public final void b(boolean flag)
    {
        a.b(flag);
    }

    public final ImageView c()
    {
        return a.c();
    }

    public final void c(View view)
    {
        a.c(view);
    }

    public final ImageView d()
    {
        return a.d();
    }

    public final StickyListView e()
    {
        return a.e();
    }

    public final ListView f()
    {
        return a.f();
    }

    public final void h()
    {
        a.h();
    }

    public final void i()
    {
        a.i();
    }
}
