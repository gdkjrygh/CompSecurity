// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.roidapp.photogrid.release.ImageEditor;

// Referenced classes of package com.roidapp.photogrid.common:
//            az, bf, bg, bh, 
//            bi, bj

public final class be
{

    private ViewGroup a;
    private TextView b;
    private AlphaAnimation c;
    private String d;
    private boolean e;
    private long f;
    private long g;

    public be(Activity activity, ViewGroup viewgroup, String s, int i, boolean flag, boolean flag1, long l)
    {
        e = false;
        g = l;
        az.q;
        JVM INSTR tableswitch 0 8: default 68
    //                   0 119
    //                   1 146
    //                   2 155
    //                   3 164
    //                   4 173
    //                   5 128
    //                   6 182
    //                   7 68
    //                   8 137;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L1 _L9
_L1:
        if (activity instanceof ImageEditor)
        {
            e = true;
            d = "ImageEditor";
        }
        a = viewgroup;
        a.removeAllViews();
        c = new AlphaAnimation(1.0F, 0.0F);
        if (a == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        d = "GridActivity";
        continue; /* Loop/switch isn't completed */
_L7:
        d = "GridActivity/Single";
        continue; /* Loop/switch isn't completed */
_L9:
        d = "GridActivity/Movie";
        continue; /* Loop/switch isn't completed */
_L3:
        d = "FreeActivity";
        continue; /* Loop/switch isn't completed */
_L4:
        d = "WideHighActivity/Wide";
        continue; /* Loop/switch isn't completed */
_L5:
        d = "WideHighActivity/High";
        continue; /* Loop/switch isn't completed */
_L6:
        d = "Template";
        continue; /* Loop/switch isn't completed */
_L8:
        d = "Video";
        if (true) goto _L1; else goto _L10
_L10:
        ImageView imageview;
        if (flag)
        {
            viewgroup = LayoutInflater.from(activity).inflate(0x7f03012e, viewgroup, false);
        } else
        {
            viewgroup = LayoutInflater.from(activity).inflate(0x7f03012d, viewgroup, false);
        }
        a.getAnimation();
        a.addView(viewgroup);
        b = (TextView)viewgroup.findViewById(0x7f0d01b7);
        imageview = (ImageView)viewgroup.findViewById(0x7f0d04cb);
        if (flag)
        {
            s = (ImageView)viewgroup.findViewById(0x7f0d04d0);
            if (flag1)
            {
                s.setOnClickListener(new bf(this, activity));
            } else
            {
                s.setVisibility(8);
                viewgroup = (LinearLayout)viewgroup.findViewById(0x7f0d04cf);
                s = (android.widget.RelativeLayout.LayoutParams)viewgroup.getLayoutParams();
                s.addRule(0, 0x7f0d04d1);
                viewgroup.setLayoutParams(s);
            }
            imageview.setOnClickListener(new bg(this, activity));
            return;
        } else
        {
            viewgroup.findViewById(0x7f0d04ca).setOnClickListener(new bh(this, s, activity));
            imageview.setOnClickListener(new bi(this, activity, s, i));
            return;
        }
    }

    static long a(be be1, long l)
    {
        be1.f = l;
        return l;
    }

    static void a(be be1)
    {
        be1.a(true);
    }

    private void a(boolean flag)
    {
        if (a == null)
        {
            return;
        }
        if (flag)
        {
            if (a.getAnimation() != null)
            {
                a.getAnimation().cancel();
            }
            a.removeAllViews();
            a.setVisibility(8);
            return;
        } else
        {
            c.setDuration(300L);
            c.setStartOffset(g);
            c.setAnimationListener(new bj(this));
            a.startAnimation(c);
            return;
        }
    }

    static long b(be be1)
    {
        return be1.f;
    }

    static String c(be be1)
    {
        return be1.d;
    }

    static boolean d(be be1)
    {
        return be1.e;
    }

    static ViewGroup e(be be1)
    {
        return be1.a;
    }

    public final void a(CharSequence charsequence)
    {
        if (a == null)
        {
            return;
        } else
        {
            b.setText(charsequence);
            a.setVisibility(0);
            a(false);
            return;
        }
    }
}
