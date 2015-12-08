// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.squareup.picasso.Picasso;

public final class fbr
    implements android.view.View.OnClickListener, fbo
{

    ViewGroup a;
    Uri b;
    android.view.ViewTreeObserver.OnGlobalLayoutListener c;
    private final fbp d;
    private fbs e;
    private ImageView f;

    public fbr(fbp fbp1)
    {
        e = new fbs(this);
        d = fbp1;
    }

    static int a(View view)
    {
        int i = view.getWidth();
        int j = view.getHeight();
        if (i > j)
        {
            return j;
        } else
        {
            return i;
        }
    }

    static ViewGroup a(fbr fbr1)
    {
        return fbr1.a;
    }

    static int b(View view)
    {
        return a(view);
    }

    static void b(fbr fbr1)
    {
        fbr1.d();
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return e;
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        d.a(e);
        a = viewgroup;
        f = (ImageView)layoutinflater.inflate(0x7f03010d, viewgroup, false);
        f.setOnClickListener(this);
        if (b == null)
        {
            f.setImageResource(0x7f02006b);
        }
        a.addView(f);
    }

    public final void a(ViewGroup viewgroup)
    {
        d.b(e);
        c();
        viewgroup.removeView(f);
    }

    public final void a(Flags flags)
    {
    }

    public final eda b()
    {
        return e;
    }

    public final void c()
    {
        if (c == null)
        {
            return;
        } else
        {
            gcg.a(a.getViewTreeObserver(), c);
            c = null;
            return;
        }
    }

    final void d()
    {
        int i = a(a);
        ((gft)dmz.a(gft)).a().a(b).a(0x7f02006b).b(i, i).a(f, null);
    }

    public final void f(boolean flag)
    {
    }

    public final void g()
    {
    }

    public final void onClick(View view)
    {
        fbs fbs1 = e;
        view = view.getContext();
        if (fbs1.b.f())
        {
            fbs1.b.l();
            return;
        } else
        {
            dmz.a(edp);
            edp.b(view, fbs1.a.b);
            return;
        }
    }

    // Unreferenced inner class fbr$1

/* anonymous class */
    final class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private fbr a;

        public final void onGlobalLayout()
        {
            if (fbr.b(fbr.a(a)) > 0)
            {
                a.c();
                fbr.b(a);
            }
        }

            
            {
                a = fbr.this;
                super();
            }
    }

}
