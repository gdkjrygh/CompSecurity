// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.y.j;
import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            by, aa, ac, p, 
//            bp, cb

public final class q extends com.google.android.m4b.maps.df.aa.a
    implements android.view.View.OnClickListener
{

    private static final int f;
    private static final int g;
    final LinearLayout a;
    boolean b;
    boolean c;
    final boolean d;
    aa e;
    private final Resources h;
    private final ImageView i;
    private final ImageView j;
    private final ImageView k;
    private final LinkedList l = new LinkedList();
    private boolean m;
    private final by n;
    private boolean o;
    private CameraPosition p;
    private final int q;
    private final int r;
    private final int s;

    private q(LinearLayout linearlayout, ImageView imageview, ImageView imageview1, ImageView imageview2, Resources resources, by by1, boolean flag)
    {
        m = false;
        h = (Resources)com.google.android.m4b.maps.y.j.a(resources, "libraryResources");
        a = (LinearLayout)com.google.android.m4b.maps.y.j.a(linearlayout, "toolbarView");
        i = (ImageView)com.google.android.m4b.maps.y.j.a(imageview, "openGmmButton");
        j = (ImageView)com.google.android.m4b.maps.y.j.a(imageview1, "directionsButton");
        k = (ImageView)com.google.android.m4b.maps.y.j.a(imageview2, "starButton");
        n = (by)com.google.android.m4b.maps.y.j.a(by1, "gmmLauncher");
        d = flag;
        q = resources.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_map_toolbar_margin);
        r = resources.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_map_toolbar_divider);
        s = resources.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_map_toolbar_bottom_shadow);
        a.setOrientation(0);
        a.setTag("GoogleMapToolbar");
        a.setVisibility(8);
        i.setImageDrawable(h.getDrawable(com.google.android.m4b.maps.h.e.maps_icon_gmm));
        i.setContentDescription(h.getString(com.google.android.m4b.maps.h.h.maps_OPEN_GMM_ALT_TEXT));
        i.setTag("GoogleMapOpenGmmButton");
        j.setImageDrawable(h.getDrawable(com.google.android.m4b.maps.h.e.maps_icon_direction));
        j.setContentDescription(h.getString(com.google.android.m4b.maps.h.h.maps_DIRECTIONS_ALT_TEXT));
        j.setTag("GoogleMapDirectionsButton");
        linearlayout = h;
        j.setColorFilter(linearlayout.getColor(f));
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        a.addView(k);
        a.addView(j);
        a.addView(i);
    }

    public static q a(Context context, Resources resources, by by1, boolean flag)
    {
        return new q(new LinearLayout(context), new ImageView(context), new ImageView(context), new ImageView(context), resources, by1, flag);
    }

    private void a(View view, boolean flag)
    {
        boolean flag1;
        if (view.getVisibility() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            return;
        }
        TranslateAnimation translateanimation;
        if (view == a)
        {
            if (flag)
            {
                translateanimation = new TranslateAnimation(2, 1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
                translateanimation.setInterpolator(new DecelerateInterpolator());
                translateanimation.setDuration(300L);
            } else
            {
                translateanimation = new TranslateAnimation(1, 0.0F, 2, 1.0F, 1, 0.0F, 1, 0.0F);
                translateanimation.setInterpolator(new AccelerateInterpolator());
                translateanimation.setDuration(300L);
            }
        } else
        if (view == k)
        {
            com.google.android.m4b.maps.y.j.a(flag, "Slide out not implemented for the star.");
            translateanimation = new TranslateAnimation(1, 1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
            translateanimation.setInterpolator(new DecelerateInterpolator());
            translateanimation.setDuration(100L);
        } else
        {
            throw new IllegalArgumentException("No animation set for this view.");
        }
        view.startAnimation(translateanimation);
    }

    private void a(ImageView imageview, int i1)
    {
        Drawable drawable;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            imageview.setBackground(h.getDrawable(i1));
        } else
        {
            imageview.setBackgroundDrawable(h.getDrawable(i1));
        }
        drawable = imageview.getBackground();
        imageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        if (i1 == com.google.android.m4b.maps.h.e.maps_btn_right)
        {
            imageview.setPadding(r, 0, q, s);
        } else
        if (i1 == com.google.android.m4b.maps.h.e.maps_btn_left)
        {
            imageview.setPadding(q, 0, r, s);
        } else
        {
            imageview.setPadding(0, 0, 0, s);
        }
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
    }

    public final void a()
    {
        e = null;
        if (!d)
        {
            a(((View) (a)), false);
        }
        m = false;
        a.setVisibility(8);
    }

    public final void a(CameraPosition cameraposition)
    {
        p = cameraposition;
        if (!d && e != null)
        {
            cameraposition = e.a;
            Object obj = e;
            obj = ((ac) (cameraposition)).m.e().e().a(((aa) (obj)).d());
            cameraposition = ((ac) (cameraposition)).m.d();
            boolean flag;
            if (((Point) (obj)).x >= 0 && ((Point) (obj)).x < cameraposition.getWidth() && ((Point) (obj)).y >= 0 && ((Point) (obj)).y < cameraposition.getHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                a();
            }
        }
    }

    public final void a(boolean flag, aa aa1, boolean flag1)
    {
        boolean flag2 = false;
        m = true;
        if (!b)
        {
            return;
        }
        ImageView imageview = j;
        int i1;
        int j1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        i.setVisibility(0);
        k.setVisibility(8);
        e = aa1;
        o = flag1;
        l.clear();
        if (flag)
        {
            l.add(j);
        }
        l.add(i);
        j1 = l.size();
        i1 = ((flag2) ? 1 : 0);
        if (j1 == 1)
        {
            a((ImageView)l.get(0), com.google.android.m4b.maps.h.e.maps_btn_standalone);
        } else
        {
            while (i1 < j1) 
            {
                aa1 = (ImageView)l.get(i1);
                if (i1 == 0)
                {
                    a(((ImageView) (aa1)), com.google.android.m4b.maps.h.e.maps_btn_left);
                } else
                if (i1 == j1 - 1)
                {
                    a(((ImageView) (aa1)), com.google.android.m4b.maps.h.e.maps_btn_right);
                } else
                {
                    a(((ImageView) (aa1)), com.google.android.m4b.maps.h.e.maps_btn_middle);
                }
                i1++;
            }
        }
        b();
    }

    final void b()
    {
        if (!m || !c || !b)
        {
            return;
        }
        if (!d)
        {
            a(a, true);
        }
        a.setVisibility(0);
    }

    public final void onClick(View view)
    {
        if (view == i)
        {
            n.a(p, e, o);
        } else
        if (view == j)
        {
            view = n;
            Object obj = e;
            if (!com.google.android.m4b.maps.g.g.e(((by) (view)).a))
            {
                ((by) (view)).b.b(cb.a.cg);
                obj = ((aa) (obj)).d();
                double d1 = ((LatLng) (obj)).b;
                double d2 = ((LatLng) (obj)).c;
                view.a((new StringBuilder(90)).append("http://maps.google.com/maps?saddr=&daddr=").append(d1).append(",").append(d2).toString());
                return;
            }
        }
    }

    static 
    {
        f = com.google.android.m4b.maps.h.c.maps_qu_google_blue_500;
        g = com.google.android.m4b.maps.h.c.maps_qu_google_yellow_500;
    }
}
