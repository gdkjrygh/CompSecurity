// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, by, PhotoView, ra, 
//            ao, az, ge, fr, 
//            bt, fo, hc, cs, 
//            fa

public final class ez extends Fragment
    implements android.view.View.OnClickListener
{

    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private PhotoGridActivity i;
    private boolean j;
    private PhotoView k;
    private LinearLayout l;

    public ez()
    {
    }

    static LinearLayout a(ez ez1)
    {
        return ez1.l;
    }

    private void a(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
    {
        if (i != null && !i.isFinishing())
        {
            if (flag)
            {
                i.a("FragmentTextColor");
                d.setBackgroundResource(0x7f0200c2);
            }
            if (flag1)
            {
                i.a("FragmentBgList");
                i.a("FragmentBgListSub");
                i.a("FragmentBgColor");
                e.setBackgroundResource(0x7f0200c2);
            }
            if (flag2)
            {
                i.a("FragmentTextOrder");
                i.a("FragmentAlignList");
                f.setBackgroundResource(0x7f0200c2);
            }
            if (flag3)
            {
                i.a("TextFontFragment");
                c.setBackgroundResource(0x7f0200c2);
            }
            if (flag4)
            {
                i.a("FragmentTextAlpha");
                g.setBackgroundResource(0x7f0200c2);
            }
            if (flag5)
            {
                i.a("FragmentTextOrder");
                h.setBackgroundResource(0x7f0200c2);
                return;
            }
        }
    }

    public final void a()
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, -0.4F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        translateanimation.setDuration(400L);
        l.setAnimation(translateanimation);
    }

    public final boolean b()
    {
        if (i.getSupportFragmentManager().findFragmentByTag("TextFontFragment") != null)
        {
            i.a("TextFontFragment");
            c.setBackgroundResource(0x7f0200c2);
            return true;
        }
        if (i.getSupportFragmentManager().findFragmentByTag("FragmentTextColor") != null)
        {
            i.a("FragmentTextColor");
            d.setBackgroundResource(0x7f0200c2);
            return true;
        }
        if (i.getSupportFragmentManager().findFragmentByTag("FragmentTextAlpha") != null)
        {
            i.a("FragmentTextAlpha");
            g.setBackgroundResource(0x7f0200c2);
            return true;
        }
        if (i.getSupportFragmentManager().findFragmentByTag("FragmentTextOrder") != null)
        {
            i.a("FragmentTextOrder");
            h.setBackgroundResource(0x7f0200c2);
            return true;
        }
        if (i.getSupportFragmentManager().findFragmentByTag("FragmentBgListSub") != null || i.getSupportFragmentManager().findFragmentByTag("FragmentBgColor") != null)
        {
            i.a("FragmentBgListSub");
            i.a("FragmentBgColor");
            by by1 = new by();
            by1.a(true, false, 1);
            i.a(0x7f0d03ec, by1, "FragmentBgList");
            return true;
        }
        if (i.getSupportFragmentManager().findFragmentByTag("FragmentBgList") != null)
        {
            i.a("FragmentBgList");
            e.setBackgroundResource(0x7f0200c2);
            return true;
        } else
        {
            return false;
        }
    }

    protected final void c()
    {
        if (i == null || i.isFinishing())
        {
            return;
        } else
        {
            i.O().a();
            i.O().a = false;
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        i = (PhotoGridActivity)activity;
        k = i.O();
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131559122 2131559136: default 80
    //                   2131559122 799
    //                   2131559123 80
    //                   2131559124 81
    //                   2131559125 80
    //                   2131559126 140
    //                   2131559127 80
    //                   2131559128 473
    //                   2131559129 80
    //                   2131559130 254
    //                   2131559131 80
    //                   2131559132 368
    //                   2131559133 80
    //                   2131559134 571
    //                   2131559135 80
    //                   2131559136 685;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L5 _L1 _L6 _L1 _L7 _L1 _L8 _L1 _L9
_L1:
        return;
_L3:
        if (((view = k.g()) instanceof ra) && !((ao) (view)).x)
        {
            i.a((ra)view);
            ((ra)view).C();
            view = i.P();
            if (view != null)
            {
                view.setVisibility(8);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = k.g();
        if (view == null || !(view instanceof ra)) goto _L1; else goto _L10
_L10:
        a(true, true, true, false, true, true);
        if ((ge)i.getSupportFragmentManager().findFragmentByTag("TextFontFragment") == null)
        {
            j = true;
            view = new ge();
            i.a(0x7f0d03ec, view, "TextFontFragment");
            c.setBackgroundResource(0x7f020075);
            return;
        } else
        {
            j = false;
            i.a("TextFontFragment");
            c.setBackgroundResource(0x7f0200c2);
            return;
        }
_L6:
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = k.g();
        if (view == null || !(view instanceof ra)) goto _L1; else goto _L11
_L11:
        a(false, true, true, true, true, true);
        if ((fr)i.getSupportFragmentManager().findFragmentByTag("FragmentTextColor") == null)
        {
            j = true;
            view = new fr();
            i.a(0x7f0d03ec, view, "FragmentTextColor");
            d.setBackgroundResource(0x7f020075);
            return;
        } else
        {
            j = false;
            i.a("FragmentTextColor");
            d.setBackgroundResource(0x7f0200c2);
            return;
        }
_L7:
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = k.g();
        if (view == null || !(view instanceof ra)) goto _L1; else goto _L12
_L12:
        a(true, false, true, true, true, true);
        if (!i.b("FragmentBgList"))
        {
            view = new by();
            view.a(true, false, 1);
            i.a(0x7f0d03ec, view, "FragmentBgList");
            e.setBackgroundResource(0x7f020075);
            return;
        } else
        {
            i.a("FragmentBgList");
            e.setBackgroundResource(0x7f0200c2);
            return;
        }
_L5:
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = k.g();
        if (view == null || !(view instanceof ra)) goto _L1; else goto _L13
_L13:
        a(true, true, false, true, true, true);
        if (!i.b("FragmentAlignList"))
        {
            view = new bt();
            i.a(0x7f0d03ec, view, "FragmentAlignList");
            f.setBackgroundResource(0x7f020075);
            return;
        } else
        {
            i.a("FragmentAlignList");
            f.setBackgroundResource(0x7f0200c2);
            return;
        }
_L8:
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = k.g();
        if (view == null || !(view instanceof ra)) goto _L1; else goto _L14
_L14:
        a(true, true, true, true, false, true);
        if ((fo)i.getSupportFragmentManager().findFragmentByTag("FragmentTextAlpha") == null)
        {
            j = true;
            view = new fo();
            i.a(0x7f0d03ec, view, "FragmentTextAlpha");
            g.setBackgroundResource(0x7f020075);
            return;
        } else
        {
            j = false;
            i.a("FragmentTextAlpha");
            g.setBackgroundResource(0x7f0200c2);
            return;
        }
_L9:
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view = k.g();
        if (view == null || !(view instanceof ra)) goto _L1; else goto _L15
_L15:
        a(true, true, true, true, true, false);
        if ((hc)i.getSupportFragmentManager().findFragmentByTag("FragmentTextOrder") == null)
        {
            j = true;
            view = new hc();
            i.a(0x7f0d03ec, view, "FragmentTextOrder");
            h.setBackgroundResource(0x7f020075);
            return;
        } else
        {
            j = false;
            i.a("FragmentTextOrder");
            h.setBackgroundResource(0x7f0200c2);
            return;
        }
_L2:
        a(true, true, true, true, true, true);
        c();
        if (i != null && !i.isFinishing())
        {
            i.a("FragmentIEPanel");
            view = new cs();
            i.a(0x7f0d028d, view, "FragmentBottomMain");
            return;
        }
        if (true) goto _L1; else goto _L16
_L16:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b6, viewgroup, false);
        b = (TextView)layoutinflater.findViewById(0x7f0d02d4);
        c = (TextView)layoutinflater.findViewById(0x7f0d02d6);
        d = (TextView)layoutinflater.findViewById(0x7f0d02da);
        e = (TextView)layoutinflater.findViewById(0x7f0d02dc);
        f = (TextView)layoutinflater.findViewById(0x7f0d02d8);
        g = (TextView)layoutinflater.findViewById(0x7f0d02de);
        h = (TextView)layoutinflater.findViewById(0x7f0d02e0);
        a = (ImageView)layoutinflater.findViewById(0x7f0d02d2);
        h = (TextView)layoutinflater.findViewById(0x7f0d02e0);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        a.setOnClickListener(this);
        viewgroup = getResources().getDrawable(0x7f020361);
        if (viewgroup != null)
        {
            viewgroup.setAlpha(255);
        }
        l = (LinearLayout)layoutinflater.findViewById(0x7f0d02d3);
        l.getViewTreeObserver().addOnGlobalLayoutListener(new fa(this));
        return layoutinflater;
    }

    public final void onDestroy()
    {
        try
        {
            a(true, true, true, true, true, true);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        super.onDestroy();
    }
}
