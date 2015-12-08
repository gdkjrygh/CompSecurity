// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.google.android.apps.photos.photosphere.PhotosphereViewerActivity;

public class gzf extends omp
    implements android.view.View.OnClickListener, gzk
{

    private static final ekk a = (new ekm()).b(elt).b(hdv).a();
    private grn b;
    private grk c;
    private ImageButton d;
    private boolean e;
    private boolean f;
    private Animation g;
    private Animation h;

    public gzf()
    {
        new ghb(af, new gzg(this), (short)0);
        new ghb(af, new gzh(this), (byte)0);
    }

    static void a(gzf gzf1)
    {
        if (gzf1.d == null || gzf1.c.c)
        {
            return;
        }
        if (!gzf1.b.c)
        {
            gzf1.d.setVisibility(8);
            gzf1.e = false;
            return;
        }
        hdv hdv1 = (hdv)gzf1.b.b.b(hdv);
        if (hdv1 != null && hdv1.m())
        {
            gzf1.d.setBackgroundResource(b.uZ);
            gzf1.d.setContentDescription(gzf1.a(b.vb));
            gzf1.d.setVisibility(0);
            gzf1.e = true;
            return;
        } else
        {
            gzf1.e = false;
            gzf1.d.setVisibility(8);
            return;
        }
    }

    static boolean a(gzf gzf1, boolean flag)
    {
        gzf1.f = flag;
        return flag;
    }

    static grk b(gzf gzf1)
    {
        return gzf1.c;
    }

    static boolean c(gzf gzf1)
    {
        return gzf1.f;
    }

    static boolean d(gzf gzf1)
    {
        return gzf1.e;
    }

    static Animation e(gzf gzf1)
    {
        return gzf1.h;
    }

    static ImageButton f(gzf gzf1)
    {
        return gzf1.d;
    }

    static Animation g(gzf gzf1)
    {
        return gzf1.g;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = (ImageButton)layoutinflater.inflate(b.va, null);
        d.setOnClickListener(this);
        return d;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b = (grn)ae.a(grn);
        c = (grk)ae.a(grk);
        f = c.c;
        g = AnimationUtils.loadAnimation(O_(), c.dK);
        h = AnimationUtils.loadAnimation(O_(), c.dL);
        g.setAnimationListener(new gzi(this));
        h.setAnimationListener(new gzj(this));
    }

    public void onClick(View view)
    {
        view = b.b;
        hdv hdv1 = (hdv)b.b.b(hdv);
        if (hdv1 != null && hdv1.m())
        {
            Intent intent = new Intent(O_(), com/google/android/apps/photos/photosphere/PhotosphereViewerActivity);
            intent.putExtra("com.google.android.apps.photos.core.media", view);
            a(intent);
        }
    }

    public final ekk t()
    {
        return a;
    }

}
