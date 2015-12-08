// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v4.view.d;
import android.support.v7.media.f;
import android.support.v7.media.g;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//            r, MediaRouteButton

public class m extends d
{
    private static final class a extends android.support.v7.media.g.a
    {

        private final WeakReference a;

        private void a(g g1)
        {
            m m1 = (m)a.get();
            if (m1 != null)
            {
                m.a(m1);
                return;
            } else
            {
                g1.a(this);
                return;
            }
        }

        public void a(g g1, android.support.v7.media.g.e e1)
        {
            a(g1);
        }

        public void a(g g1, android.support.v7.media.g.f f1)
        {
            a(g1);
        }

        public void b(g g1, android.support.v7.media.g.e e1)
        {
            a(g1);
        }

        public void b(g g1, android.support.v7.media.g.f f1)
        {
            a(g1);
        }

        public void c(g g1, android.support.v7.media.g.e e1)
        {
            a(g1);
        }

        public void c(g g1, android.support.v7.media.g.f f1)
        {
            a(g1);
        }

        public a(m m1)
        {
            a = new WeakReference(m1);
        }
    }


    private final g a;
    private final a b = new a(this);
    private f c;
    private r d;
    private MediaRouteButton e;

    public m(Context context)
    {
        super(context);
        c = f.a;
        d = r.a();
        a = g.a(context);
    }

    static void a(m m1)
    {
        m1.i();
    }

    private void i()
    {
        e();
    }

    public View b()
    {
        if (e != null)
        {
            Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        e = h();
        e.setCheatSheetEnabled(true);
        e.setRouteSelector(c);
        e.setDialogFactory(d);
        e.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
        return e;
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        return a.a(c, 1);
    }

    public boolean f()
    {
        if (e != null)
        {
            return e.a();
        } else
        {
            return false;
        }
    }

    public MediaRouteButton h()
    {
        return new MediaRouteButton(a());
    }
}
