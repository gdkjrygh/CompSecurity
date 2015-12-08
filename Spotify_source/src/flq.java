// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.video.VideoSurfacePriority;
import com.spotify.mobile.android.video.VideoSurfaceView;

public final class flq
{

    public eqh a;
    public Activity b;
    TextView c;
    public CancellableSeekBar d;
    public TextView e;
    public ImageButton f;
    public VideoSurfaceView g;
    public final TextView h = (TextView)a(0x7f11026e);
    public final ImageButton i = (ImageButton)a(0x7f1103d0);
    public final ImageButton j = (ImageButton)a(0x7f1103d5);
    public final ImageButton k = (ImageButton)a(0x7f1103d6);
    public final ImageButton l = (ImageButton)a(0x7f1103d8);
    public final ImageButton m = (ImageButton)a(0x7f1103d9);
    public final ImageButton n = (ImageButton)a(0x7f1103cf);
    public View o;
    public View p;
    public View q;
    public gbe r;
    float s;
    private final Property t = new Property(java/lang/Integer, "track_position") {

        private flq a;

        public final Object get(Object obj)
        {
            return Integer.valueOf(((CancellableSeekBar)obj).getProgress());
        }

        public final void set(Object obj, Object obj1)
        {
            obj = (CancellableSeekBar)obj;
            obj1 = (Integer)obj1;
            ((CancellableSeekBar) (obj)).setProgress(((Integer) (obj1)).intValue());
            a.c.setText(flt.a(((Integer) (obj1)).intValue() / 1000));
        }

            
            {
                a = flq.this;
                super(class1, s1);
            }
    };

    public flq(Activity activity)
    {
        b = activity;
        o = a(0x7f1103cd);
        p = a(0x7f1103ce);
        q = a(0x7f1103d1);
        g = (VideoSurfaceView)a(0x7f1102e6);
        c = (TextView)a(0x7f1103d2);
        d = (CancellableSeekBar)a(0x7f1103d3);
        e = (TextView)a(0x7f1103d4);
        f = (ImageButton)a(0x7f1103d7);
        g.a(VideoSurfacePriority.c);
        n.setImageDrawable(a(SpotifyIcon.bi, 24));
        i.setImageDrawable(fye.a(b, 0x7f0f015d));
        j.setImageDrawable(a(SpotifyIcon.bn, 16));
        k.setImageDrawable(a(SpotifyIcon.R, 20));
        a(true);
        l.setImageDrawable(a(SpotifyIcon.T, 20));
        m.setImageDrawable(a(SpotifyIcon.bo, 16));
        c();
        int ai[];
        GradientDrawable gradientdrawable;
        if (p.getVisibility() == 0)
        {
            fls.a(b);
        } else
        {
            fls.b(b);
        }
        ai = new int[2];
        int[] _tmp = ai;
        ai[0] = 0xcc000000;
        ai[1] = 0;
        activity = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, ai);
        gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, ai);
        dgo.a(p, activity);
        dgo.a(q, gradientdrawable);
        a = new eqh(d, t);
        r = new gbe(a) {

            private flq b;

            protected final void a(int i1)
            {
                b.c.setText(flt.a(i1));
            }

            protected final void a(long l1, long l2)
            {
                b.a(l1, l2, b.s);
            }

            
            {
                b = flq.this;
                super(eqh1);
            }
        };
        d.a(r);
    }

    private Drawable a(SpotifyIcon spotifyicon, int i1)
    {
        android.content.res.ColorStateList colorstatelist = gcg.c(b, 0x7f0f015d);
        spotifyicon = new dfz(b, spotifyicon);
        spotifyicon.a(colorstatelist);
        spotifyicon.a(dft.b(i1, b.getResources()));
        return spotifyicon;
    }

    private View a(int i1)
    {
        return b.findViewById(i1);
    }

    private void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i1)
    {
        boolean flag3 = true;
        boolean flag2 = false;
        Resources resources = b.getResources();
        Point point;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        if ((i1 & 1) != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if ((i1 & 2) != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if ((i1 & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (k1 != 0)
        {
            cvp.a(resources);
            k1 = resources.getIdentifier("status_bar_height", "dimen", "android");
            Activity activity;
            if (k1 > 0)
            {
                k1 = resources.getDimensionPixelSize(k1);
            } else
            {
                k1 = 0;
            }
            k1 += 0;
        } else
        {
            k1 = 0;
        }
        if (!fls.a(b))
        {
            break MISSING_BLOCK_LABEL_289;
        }
        activity = b;
        cvp.a(activity);
        if (!fls.a(activity)) goto _L2; else goto _L1
_L1:
        point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag3;
        if (point.x == point.y) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        flag1 = flag3;
_L4:
        if (flag1)
        {
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_289;
            }
            j1 = fls.a(resources);
            i1 = 0;
            j1 += 0;
        } else
        {
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_289;
            }
            i1 = fls.a(resources) + 0;
            j1 = ((flag2) ? 1 : 0);
        }
_L7:
        marginlayoutparams.setMargins(marginlayoutparams.leftMargin, k1, i1, j1);
        return;
_L6:
        flag1 = flag3;
        if (point.x < point.y) goto _L4; else goto _L2
_L2:
        flag1 = false;
          goto _L4
        i1 = 0;
        j1 = ((flag2) ? 1 : 0);
          goto _L7
    }

    public final void a()
    {
        fls.a(b);
        p.setVisibility(0);
        q.setVisibility(0);
    }

    public final void a(long l1, long l2, float f1)
    {
        s = f1;
        a.a(l1, l2, f1);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            f.setImageDrawable(fyd.a(b, 28, 1));
            f.setContentDescription(b.getString(0x7f0805ea));
            return;
        } else
        {
            f.setImageDrawable(fyd.b(b, 28, 1));
            f.setContentDescription(b.getString(0x7f0805e9));
            return;
        }
    }

    public final void b()
    {
        fls.b(b);
        p.setVisibility(8);
        q.setVisibility(8);
    }

    public final void c()
    {
        a((android.widget.FrameLayout.LayoutParams)q.getLayoutParams(), 6);
        a((android.widget.FrameLayout.LayoutParams)p.getLayoutParams(), 2);
        o.requestLayout();
    }
}
