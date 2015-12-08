// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.DisplayMetrics;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.gl.c;
import com.roidapp.cloudlib.a.a;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.imagelib.filter.s;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ih, cx, cg, 
//            if, ck, by, fb, 
//            cy, az, da, PhotoView, 
//            ao, ra, fi, ig, 
//            dj, mq, br, ct, 
//            cu, cw

public final class cs extends Fragment
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener
{

    private PhotoGridActivity a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private LinearLayout g;
    private View h;
    private ImageView i;
    private ImageView j;
    private HorizontalScrollView k;
    private float l;
    private int m;
    private int n;
    private if o;
    private ImageView p;
    private String q;
    private String r[] = {
        "switch", "layout", "crop", "edit", "retouch", "blur", "background", "text", "sticker", "border", 
        "draw", "add"
    };
    private String s[] = {
        "layout", "crop", "edit", "retouch", "blur", "background", "text", "sticker", "border", "draw"
    };
    private String t[] = {
        "switch", "layout", "crop", "edit", "retouch", "blur", "background", "text", "sticker", "border", 
        "draw"
    };
    private String u[] = {
        "edit", "text", "size"
    };
    private String v[] = {
        "layout", "background", "edit", "border", "text", "sticker", "draw", "add"
    };
    private String w[] = {
        "background", "edit", "ratio", "border_on", "text", "sticker", "draw", "add"
    };
    private String x[] = {
        "layout", "background", "edit", "border", "text", "sticker", "draw", "add"
    };

    public cs()
    {
        b = "GridActivity";
        e = true;
        l = -0.3F;
        n = 1;
    }

    static HorizontalScrollView a(cs cs1)
    {
        return cs1.k;
    }

    private void a(LayoutInflater layoutinflater, String as[], boolean flag)
    {
        Object obj;
        String s1;
        View view;
        TextView textview;
        int i1;
        int j1;
        i1 = 0;
        int k1 = a.getResources().getDimensionPixelSize(0x7f09004f);
        int i2 = a.getResources().getDimensionPixelSize(0x7f0900cb);
        j1 = a.getResources().getDisplayMetrics().widthPixels;
        int l1;
        int j2;
        if (as.length * k1 <= j1)
        {
            k1 = j1 / as.length;
        }
        j2 = as.length;
        l1 = 0;
_L7:
        if (l1 >= j2)
        {
            break MISSING_BLOCK_LABEL_2207;
        }
        s1 = as[l1];
        view = layoutinflater.inflate(0x7f030008, g, false);
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(k1, i2));
        textview = (TextView)view.findViewById(0x7f0d005a);
        obj = (ImageView)view.findViewById(0x7f0d005c);
        textview.setOnClickListener(this);
        if (s1.equalsIgnoreCase("edit"))
        {
            if (flag)
            {
                i1 = 1;
                obj = getResources().getDrawable(0x7f02038e);
                if (az.q == 1 && m == 0 || 4 == az.q && ih.C().b(0))
                {
                    textview.setTextColor(getResources().getColor(0x7f0c00c0));
                    if (obj != null)
                    {
                        ((Drawable) (obj)).setAlpha(50);
                        textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                    }
                } else
                {
                    textview.setTextColor(getResources().getColor(0x7f0c00bf));
                    if (obj != null)
                    {
                        ((Drawable) (obj)).setAlpha(255);
                        textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                    }
                }
                textview.setText(0x7f07015f);
            } else
            if (ih.C().M().length != 1)
            {
                i1 = 1;
                obj = getResources().getDrawable(0x7f020379);
                if (az.q == 1 && m == 0)
                {
                    textview.setTextColor(getResources().getColor(0x7f0c00c0));
                    if (obj != null)
                    {
                        ((Drawable) (obj)).setAlpha(50);
                        textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                    }
                } else
                {
                    textview.setTextColor(getResources().getColor(0x7f0c00bf));
                    if (obj != null)
                    {
                        ((Drawable) (obj)).setAlpha(255);
                        textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                    }
                }
                textview.setText(0x7f070115);
            }
            textview.setBackgroundResource(0x7f0200b3);
            textview.setTag("edit");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("background"))
        {
            obj = getResources().getDrawable(0x7f020361);
            if (4 == az.q && !ih.C().f())
            {
                textview.setTextColor(getResources().getColor(0x7f0c00c0));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(50);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            } else
            {
                textview.setTextColor(getResources().getColor(0x7f0c00bf));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(255);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            }
            textview.setText(0x7f070033);
            textview.setTag("background");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("ratio"))
        {
            obj = getResources().getDrawable(0x7f0203dc);
            j1 = 1;
            if (az.q == 4 && !ih.C().g())
            {
                j1 = 0;
            } else
            if (az.q == 9)
            {
                j1 = 0;
            }
            if (j1 == 0)
            {
                textview.setTextColor(getResources().getColor(0x7f0c00c0));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(50);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            } else
            {
                textview.setTextColor(getResources().getColor(0x7f0c00bf));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(255);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            }
            textview.setText(0x7f07025d);
            textview.setTag("ratio");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("layout"))
        {
            obj = getResources().getDrawable(0x7f0203a1);
            if (4 == az.q && !ih.C().h())
            {
                textview.setTextColor(getResources().getColor(0x7f0c00c0));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(50);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            } else
            {
                textview.setTextColor(getResources().getColor(0x7f0c00bf));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(255);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            }
            q = com.roidapp.cloudlib.a.a.a(aj.a()).a("other", "templateLayout");
            if (q != null && !q.equals(PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("current_template_active_icon_url", "")))
            {
                obj = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("current_template_active_icon_url", q);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("new_feature_template_entry", true);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
            if (az.q != 4 && PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("new_feature_template_entry", true))
            {
                j = (ImageView)view.findViewById(0x7f0d005b);
                j.setVisibility(0);
            }
            textview.setText(0x7f07019c);
            textview.setTag("layout");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("border"))
        {
            if (az.q == 4)
            {
                obj = getResources().getDrawable(0x7f020367);
            } else
            {
                obj = getResources().getDrawable(0x7f020366);
            }
            if (4 == az.q && !ih.C().h())
            {
                textview.setTextColor(getResources().getColor(0x7f0c00c0));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(50);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            } else
            {
                textview.setTextColor(getResources().getColor(0x7f0c00bf));
                if (obj != null)
                {
                    ((Drawable) (obj)).setAlpha(255);
                    textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                }
            }
            textview.setText(0x7f070041);
            textview.setTag("border");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("border_on"))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020397, 0, 0);
            textview.setTag("border_on");
            obj = ih.C().M();
            if (obj != null && obj.length == 0)
            {
                if (!ih.C().aD())
                {
                    obj = getResources().getDrawable(0x7f020397);
                    textview.setText(0x7f070041);
                } else
                {
                    textview.setText(0x7f0701ed);
                    obj = getResources().getDrawable(0x7f020398);
                }
                ((Drawable) (obj)).setAlpha(50);
                textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                textview.setTextColor(getResources().getColor(0x7f0c00c0));
                j1 = i1;
            } else
            {
                if (!ih.C().aD())
                {
                    textview.setText(0x7f070041);
                    obj = getResources().getDrawable(0x7f020397);
                } else
                {
                    textview.setText(0x7f0701ed);
                    obj = getResources().getDrawable(0x7f020398);
                }
                ((Drawable) (obj)).setAlpha(255);
                textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                j1 = i1;
            }
        } else
        if (s1.equalsIgnoreCase("draw"))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f02037f, 0, 0);
            textview.setText(0x7f070139);
            textview.setTag("draw");
            textview.setBackgroundResource(0x7f0200b3);
            j1 = i1;
        } else
        {
label0:
            {
                if (!s1.equalsIgnoreCase("text"))
                {
                    break label0;
                }
                textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020394, 0, 0);
                if (az.q == 8)
                {
                    j1 = 0x7f07037b;
                } else
                {
                    j1 = 0x7f0702e5;
                }
                textview.setText(j1);
                textview.setTag("text");
                j1 = i1;
            }
        }
_L4:
        if (s1.equalsIgnoreCase("retouch") && com.roidapp.baselib.gl.c.a().e(getActivity()))
        {
            g.addView(view);
        } else
        if (s1.equalsIgnoreCase("edit") && j1 != 0)
        {
            g.addView(view);
        } else
        if (!s1.equalsIgnoreCase("retouch") && !s1.equalsIgnoreCase("edit"))
        {
            g.addView(view);
        }
        l1++;
        i1 = j1;
        continue; /* Loop/switch isn't completed */
        if (!s1.equalsIgnoreCase("switch"))
        {
            break MISSING_BLOCK_LABEL_1695;
        }
        ih.C().W();
        JVM INSTR tableswitch 1 4: default 1588
    //                   1 1673
    //                   2 1651
    //                   3 1588
    //                   4 1651;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_1673;
_L5:
        if (PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("new_feature_original", true))
        {
            i = (ImageView)view.findViewById(0x7f0d005b);
            i.setVisibility(0);
        }
        textview.setBackgroundResource(0x7f0200b3);
        textview.setTag("switch");
        j1 = i1;
          goto _L4
_L3:
        textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203ad, 0, 0);
        textview.setText(0x7f070162);
          goto _L5
        textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203cc, 0, 0);
        textview.setText(0x7f070165);
          goto _L5
        if (s1.equalsIgnoreCase("sticker"))
        {
            if (a.y)
            {
                ((ImageView) (obj)).setVisibility(0);
                com.roidapp.baselib.c.n.a(((ImageView) (obj)), 0x7f020392);
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203fa, 0, 0);
            textview.setText(0x7f0702d0);
            textview.setTag("sticker");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("add"))
        {
            obj = a.getResources().getDrawable(0x7f0204e6);
            if (e)
            {
                ((Drawable) (obj)).setAlpha(255);
                textview.setTextColor(a.getResources().getColor(0x7f0c00bf));
            } else
            {
                ((Drawable) (obj)).setAlpha(50);
                textview.setTextColor(a.getResources().getColor(0x7f0c00c0));
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
            textview.setText(0x7f07003d);
            textview.setBackgroundResource(0x7f0200b3);
            textview.setTag("add");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("crop"))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020379, 0, 0);
            textview.setText(0x7f070115);
            textview.setTag("crop");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("retouch") && com.roidapp.baselib.gl.c.a().b() && !com.roidapp.baselib.gl.c.a().c() && com.roidapp.baselib.gl.c.a().e(getActivity()))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203e0, 0, 0);
            textview.setText(0x7f07026a);
            textview.setTag("retouch");
            j1 = i1;
        } else
        if (s1.equalsIgnoreCase("size"))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f02035b, 0, 0);
            textview.setText(0x7f07037c);
            textview.setTag("size");
            j1 = i1;
        } else
        {
            j1 = i1;
            if (s1.equalsIgnoreCase("blur"))
            {
                textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020364, 0, 0);
                textview.setText(0x7f070040);
                textview.setTag("blur");
                p = (ImageView)view.findViewById(0x7f0d005b);
                if (PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("new_feature_blur", true))
                {
                    p.setVisibility(0);
                    j1 = i1;
                } else
                {
                    p.setVisibility(8);
                    j1 = i1;
                }
            }
        }
          goto _L4
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void b(cs cs1)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, cs1.l, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        translateanimation.setDuration(700L);
        translateanimation.setAnimationListener(new cx(cs1));
        cs1.g.setAnimation(translateanimation);
    }

    static LinearLayout c(cs cs1)
    {
        return cs1.g;
    }

    static PhotoGridActivity d(cs cs1)
    {
        return cs1.a;
    }

    private void d()
    {
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Blur").toString());
        View view = g.findViewWithTag("blur");
        if (!a.b("FragmentBlur"))
        {
            cg cg1 = new cg();
            if (!az.A && PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("new_feature_blur", true))
            {
                PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("new_feature_blur", false).apply();
                p.setVisibility(8);
            }
            o = (if)a.a.findViewById(1);
            if (o != null)
            {
                n = 1;
                ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.8F, 1.0F, 0.8F, o.getWidth() / 2, o.getHeight() / 2);
                scaleanimation.setDuration(200L);
                o.startAnimation(scaleanimation);
                scaleanimation.setAnimationListener(this);
            }
            ih.C().g(false);
            a.a(ih.C().bd(), true);
            a.a(0x7f0d03ec, cg1, "FragmentBlur");
            if (view != null)
            {
                view.setBackgroundResource(0x7f0c000a);
            }
        } else
        {
            a.a("FragmentBlur");
            if (view != null)
            {
                view.setBackgroundResource(0x7f0200b3);
                return;
            }
        }
    }

    public final void a()
    {
        if (az.A)
        {
            d();
            az.A = false;
        }
    }

    public final void b()
    {
        TextView textview = (TextView)g.findViewWithTag("switch");
        if (textview == null) goto _L2; else goto _L1
_L1:
        ih.C().W();
        JVM INSTR tableswitch 1 4: default 52
    //                   1 88
    //                   2 53
    //                   3 52
    //                   4 53;
           goto _L2 _L3 _L4 _L2 _L4
_L2:
        return;
_L4:
        int i1 = az.E;
        az.E = i1 + 1;
        com.roidapp.photogrid.b.f.a("Original", i1);
        textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203ad, 0, 0);
        textview.setText(0x7f070162);
        return;
_L3:
        int j1 = az.E;
        az.E = j1 + 1;
        com.roidapp.photogrid.b.f.a("Instagram", j1);
        textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203cc, 0, 0);
        textview.setText(0x7f070165);
        return;
    }

    public final boolean c()
    {
        boolean flag = false;
        Object obj = a.getSupportFragmentManager();
        if (((FragmentManager) (obj)).findFragmentByTag("FragmentBgListSub") != null || ((FragmentManager) (obj)).findFragmentByTag("FragmentBgColor") != null)
        {
            if (ih.C().aw() == 0 && h != null && !"background".equals(h.getTag()))
            {
                obj = new ck();
                a.a(0x7f0d03ec, ((Fragment) (obj)), "FragmentBorder");
            } else
            {
                obj = new by();
                if (az.q == 4 || az.q == 1)
                {
                    ((by) (obj)).a(false, false, 0);
                }
                if (az.q == 0 || az.q == 5)
                {
                    ((by) (obj)).a(true, false, 0);
                }
                a.a(0x7f0d03ec, ((Fragment) (obj)), "FragmentBgList");
            }
            flag = true;
        } else
        {
            if (((FragmentManager) (obj)).findFragmentByTag("ProportionFragment") != null)
            {
                if (az.q == 1)
                {
                    a.a("ProportionFragment");
                    obj = (TextView)g.findViewWithTag("ratio");
                    if (obj != null)
                    {
                        ((TextView) (obj)).setBackgroundResource(0x7f0200b3);
                    }
                } else
                {
                    obj = new fb();
                    a.a(0x7f0d03ec, ((Fragment) (obj)), "FragmentLayout");
                }
                return true;
            }
            if (((FragmentManager) (obj)).findFragmentByTag("FragmentBgList") != null)
            {
                a.a("FragmentBgList");
                obj = (TextView)g.findViewWithTag("background");
                if (obj != null)
                {
                    ((TextView) (obj)).setBackgroundResource(0x7f0200b3);
                }
                return true;
            }
            if (((FragmentManager) (obj)).findFragmentByTag("FragmentLayout") != null)
            {
                a.a("FragmentLayout");
                obj = (TextView)g.findViewWithTag("layout");
                if (obj != null)
                {
                    ((TextView) (obj)).setBackgroundResource(0x7f0200b3);
                }
                return true;
            }
            if (((FragmentManager) (obj)).findFragmentByTag("FragmentBorder") != null)
            {
                a.a("FragmentBorder");
                obj = (TextView)g.findViewWithTag("border");
                if (obj != null)
                {
                    ((TextView) (obj)).setBackgroundResource(0x7f0200b3);
                }
                return true;
            }
            if (((FragmentManager) (obj)).findFragmentByTag("FragmentAdjustTextSize") != null)
            {
                a.a("FragmentAdjustTextSize");
                obj = g.findViewWithTag("size");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
                return true;
            }
            if (((FragmentManager) (obj)).findFragmentByTag(s.f) != null)
            {
                a.a(s.f);
                obj = g.findViewWithTag("edit");
                a.a(s.f);
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
                return true;
            }
            if (((FragmentManager) (obj)).findFragmentByTag("FragmentBlur") != null)
            {
                a.a("FragmentBlur");
                View view = g.findViewWithTag("blur");
                if (view != null)
                {
                    view.setBackgroundResource(0x7f0200b3);
                }
                return true;
            }
        }
        return flag;
    }

    public final void onAnimationEnd(Animation animation)
    {
        switch (n)
        {
        default:
            return;

        case 1: // '\001'
            n = n + 1;
            break;
        }
        animation = new ScaleAnimation(0.8F, 1.0F, 0.8F, 1.0F, o.getWidth() / 2, o.getHeight() / 2);
        animation.setDuration(500L);
        o.startAnimation(animation);
        animation.setAnimationListener(this);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        if (!a.i && isAdded() && getActivity() != null)
        {
            h = view;
            Object obj;
            if (view.getTag().equals("ratio"))
            {
                if (az.q == 4 && !ih.C().g())
                {
                    com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Ratio").toString());
                    an.a(new WeakReference(a), getString(0x7f070202));
                } else
                if (az.q == 9 || az.q == 10)
                {
                    com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Ratio").toString());
                    an.a(new WeakReference(a), getString(0x7f070203));
                } else
                {
                    com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Ratio").toString());
                    obj = g.findViewWithTag("ratio");
                    if (!a.b("ProportionFragment"))
                    {
                        a.a(a.k);
                        obj1 = new fi();
                        a.a(0x7f0d03ec, ((Fragment) (obj1)), "ProportionFragment");
                        ((View) (obj)).setBackgroundResource(0x7f0c000a);
                    } else
                    {
                        a.a("ProportionFragment");
                        ((View) (obj)).setBackgroundResource(0x7f0200b3);
                    }
                }
            } else
            {
                obj = g.findViewWithTag("ratio");
                a.a("ProportionFragment");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("layout"))
            {
                int j1;
                if (az.q == 0)
                {
                    int i1 = az.D;
                    az.D = i1 + 1;
                    com.roidapp.photogrid.b.f.b("Layout", i1);
                } else
                if (az.q == 5)
                {
                    int k1 = az.E;
                    az.E = k1 + 1;
                    com.roidapp.photogrid.b.f.a("Layout", k1);
                }
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/LayoutMain").toString());
                obj = g.findViewWithTag("layout");
                if (az.q == 4 && !ih.C().h())
                {
                    an.a(new WeakReference(a), getString(0x7f070201));
                } else
                if (!a.b("FragmentLayout"))
                {
                    a.a(a.k);
                    obj1 = new fb();
                    if (j != null && j.getVisibility() == 0)
                    {
                        j.setVisibility(8);
                        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("new_feature_template_entry", false).apply();
                        ((fb) (obj1)).b();
                    }
                    ((fb) (obj1)).a(q);
                    a.a(0x7f0d03ec, ((Fragment) (obj1)), "FragmentLayout");
                    ((View) (obj)).setBackgroundResource(0x7f0c000a);
                } else
                {
                    a.a("FragmentLayout");
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            } else
            {
                obj = g.findViewWithTag("layout");
                a.a("FragmentLayout");
                a.a("FragmentBorder");
                a.a("ProportionFragment");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("background"))
            {
                if (az.q == 0)
                {
                    j1 = az.D;
                    az.D = j1 + 1;
                    com.roidapp.photogrid.b.f.b("Background", j1);
                } else
                if (az.q == 5)
                {
                    int l1 = az.E;
                    az.E = l1 + 1;
                    com.roidapp.photogrid.b.f.a("Background", l1);
                }
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Background").toString());
                if (4 == az.q && !ih.C().f())
                {
                    an.a(new WeakReference(a), getString(0x7f0701fd));
                } else
                {
                    obj = g.findViewWithTag("background");
                    if (!a.b("FragmentBgList"))
                    {
                        obj1 = new by();
                        boolean flag;
                        if (az.q != 1 && az.q != 4)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        ((by) (obj1)).a(flag, false, 0);
                        a.a(0x7f0d03ec, ((Fragment) (obj1)), "FragmentBgList");
                        ((View) (obj)).setBackgroundResource(0x7f0c000a);
                    } else
                    {
                        a.a("FragmentBgList");
                        ((View) (obj)).setBackgroundResource(0x7f0200b3);
                    }
                }
            } else
            {
                obj = g.findViewWithTag("background");
                a.a("FragmentBgList");
                a.a("FragmentBgListSub");
                a.a("FragmentBgColor");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("edit"))
            {
                Object obj1 = g.findViewWithTag("edit");
                if (az.q == 8 && a.b(s.f))
                {
                    a.a(s.f);
                    if (obj1 != null)
                    {
                        ((View) (obj1)).setBackgroundResource(0x7f0200b3);
                    }
                } else
                {
                    if (c)
                    {
                        if (az.q == 0)
                        {
                            int i2 = az.D;
                            az.D = i2 + 1;
                            com.roidapp.photogrid.b.f.b("Filter", i2);
                        } else
                        if (az.q == 5)
                        {
                            int j2 = az.E;
                            az.E = j2 + 1;
                            com.roidapp.photogrid.b.f.a("Filter", j2);
                        }
                        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Filter").toString());
                    } else
                    {
                        if (az.q == 0)
                        {
                            int k2 = az.D;
                            az.D = k2 + 1;
                            com.roidapp.photogrid.b.f.b("Crop", k2);
                        } else
                        if (az.q == 5)
                        {
                            int l2 = az.E;
                            az.E = l2 + 1;
                            com.roidapp.photogrid.b.f.a("Crop", l2);
                        }
                        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Crop").toString());
                    }
                    if (az.q == 5 || az.q == 0 && d)
                    {
                        ((View) (obj1)).setBackgroundResource(0x7f0c000a);
                        if (c)
                        {
                            a.a(0, 0, 0);
                        } else
                        {
                            a.a(0, 1, 0);
                        }
                    } else
                    if (az.q == 4 && ih.C().b(0))
                    {
                        ((View) (obj1)).setBackgroundResource(0x7f0200b3);
                        an.a(new WeakReference(a), getString(0x7f070200));
                    } else
                    {
                        obj = ih.C().M();
                        if (obj != null && obj.length > 0)
                        {
                            ((View) (obj1)).setBackgroundResource(0x7f0c000a);
                            if (d && az.q != 8)
                            {
                                if (c)
                                {
                                    a.a(0, 0, 0);
                                } else
                                {
                                    a.a(0, 1, 0);
                                }
                            } else
                            if (!com.roidapp.baselib.gl.c.a().c())
                            {
                                if (a != null)
                                {
                                    obj1 = new Bundle();
                                    ((Bundle) (obj1)).putParcelable("globalGroupInfo", aa.a().d());
                                    ((Bundle) (obj1)).putParcelable("globalFilterInfo", aa.a().c());
                                    com.roidapp.imagelib.b.b b1 = aa.a().e();
                                    if (b1 != null)
                                    {
                                        ((Bundle) (obj1)).putInt("global_image_property_contast", b1.b);
                                        ((Bundle) (obj1)).putInt("global_image_property_hue", b1.d);
                                        ((Bundle) (obj1)).putInt("global_image_property_lightness", b1.a);
                                        ((Bundle) (obj1)).putInt("global_image_property_saturation", b1.c);
                                    }
                                    boolean flag1;
                                    if (az.q == 8)
                                    {
                                        flag1 = true;
                                    } else
                                    {
                                        flag1 = false;
                                    }
                                    ((Bundle) (obj1)).putBoolean("current_mode_moview", flag1);
                                    ((Bundle) (obj1)).putString("current_image_path", ((ig) (obj[0])).c);
                                    obj = new s();
                                    ((Fragment) (obj)).setArguments(((Bundle) (obj1)));
                                    if (az.q == 8)
                                    {
                                        a.a(0x7f0d03ec, ((Fragment) (obj)), s.f);
                                    } else
                                    {
                                        a.a(0x7f0d028d, ((Fragment) (obj)), s.f);
                                    }
                                }
                            } else
                            if (a != null)
                            {
                                obj = new dj();
                                ((dj) (obj)).a();
                                a.a(0x7f0d028d, ((Fragment) (obj)), "FragmentEditTip");
                            }
                        } else
                        {
                            ((View) (obj1)).setBackgroundResource(0x7f0200b3);
                            an.a(new WeakReference(a), getString(0x7f0701e9));
                        }
                    }
                }
            } else
            {
                a.a(s.f);
                obj = g.findViewWithTag("edit");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("border"))
            {
                if (az.q == 0)
                {
                    j1 = az.D;
                    az.D = j1 + 1;
                    com.roidapp.photogrid.b.f.b("Border", j1);
                } else
                if (az.q == 5)
                {
                    int i3 = az.E;
                    az.E = i3 + 1;
                    com.roidapp.photogrid.b.f.a("Border", i3);
                }
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Border").toString());
                if (az.q == 4 && !ih.C().h())
                {
                    an.a(new WeakReference(a), getString(0x7f0701fe));
                } else
                {
                    obj = g.findViewWithTag("border");
                    if (!a.b("FragmentBorder"))
                    {
                        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/LayoutMain/Border").toString());
                        ck ck1 = new ck();
                        a.a(0x7f0d03ec, ck1, "FragmentBorder");
                        if (obj != null)
                        {
                            ((View) (obj)).setBackgroundResource(0x7f0c000a);
                        }
                    } else
                    {
                        a.a("FragmentBorder");
                        if (obj != null)
                        {
                            ((View) (obj)).setBackgroundResource(0x7f0200b3);
                        }
                    }
                }
            } else
            {
                obj = g.findViewWithTag("border");
                a.a("FragmentBgList");
                a.a("FragmentBgListSub");
                a.a("FragmentBgColor");
                a.a("FragmentBorder");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("border_on"))
            {
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Border_switch").toString());
                obj = (TextView)g.findViewWithTag("border_on");
                obj1 = ih.C().M();
                if (obj1 != null && obj1.length == 0)
                {
                    an.a(new WeakReference(a), getString(0x7f07020e));
                } else
                {
                    if (ih.C().aD())
                    {
                        ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020397, 0, 0);
                        ((TextView) (obj)).setText(0x7f070041);
                    } else
                    {
                        ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020398, 0, 0);
                        ((TextView) (obj)).setText(0x7f0701ed);
                    }
                    ((TextView) (obj)).invalidate();
                    obj = a;
                    if (((PhotoGridActivity) (obj)).b instanceof mq)
                    {
                        boolean flag2;
                        if (!ih.C().aD())
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        ((mq)((PhotoGridActivity) (obj)).b).c(flag2);
                        ih.C().n(flag2);
                    }
                }
            }
            if (view.getTag().equals("draw"))
            {
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Draw").toString());
                if (az.q == 0)
                {
                    j1 = az.D;
                    az.D = j1 + 1;
                    com.roidapp.photogrid.b.f.b("Draw", j1);
                } else
                if (az.q == 5)
                {
                    int j3 = az.E;
                    az.E = j3 + 1;
                    com.roidapp.photogrid.b.f.a("Draw", j3);
                }
                obj = g.findViewWithTag("draw");
                if (!a.b("FragmentDoodle"))
                {
                    a.a(a.k);
                    obj1 = new cy();
                    a.a(0x7f0d028d, ((Fragment) (obj1)), "FragmentDoodle");
                    a.P().a(true);
                    if (obj != null)
                    {
                        ((View) (obj)).setBackgroundResource(0x7f0c000a);
                    }
                } else
                {
                    a.a("FragmentDoodle");
                    if (obj != null)
                    {
                        ((View) (obj)).setBackgroundResource(0x7f0200b3);
                    }
                }
                if (!a.b("FragmentDoodleTop"))
                {
                    obj = new da();
                    a.a(0x7f0d03ed, ((Fragment) (obj)), "FragmentDoodleTop");
                } else
                {
                    a.a("FragmentDoodleTop");
                }
            }
            if (view.getTag().equals("add"))
            {
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/AddImg").toString());
                if (az.q == 0)
                {
                    j1 = az.D;
                    az.D = j1 + 1;
                    com.roidapp.photogrid.b.f.b("AddImage", j1);
                } else
                if (az.q == 5)
                {
                    int k3 = az.E;
                    az.E = k3 + 1;
                    com.roidapp.photogrid.b.f.a("AddImage", k3);
                }
                if (e)
                {
                    obj = a;
                    if (!((PhotoGridActivity) (obj)).isFinishing())
                    {
                        obj1 = new Intent("android.intent.action.GET_CONTENT");
                        ((Intent) (obj1)).setType("image/*");
                        try
                        {
                            ((PhotoGridActivity) (obj)).startActivityForResult(((Intent) (obj1)), 43521);
                        }
                        catch (ActivityNotFoundException activitynotfoundexception)
                        {
                            an.a(((android.content.Context) (obj)), ((PhotoGridActivity) (obj)).getResources().getString(0x7f0701ef));
                            activitynotfoundexception.printStackTrace();
                        }
                    }
                    if (az.q == 5);
                } else
                if (az.q == 4 && !ih.C().h())
                {
                    an.a(new WeakReference(a), getString(0x7f07004a));
                } else
                if (az.q == 0 || az.q == 1 || az.q == 4)
                {
                    an.a(new WeakReference(a), String.format(getString(0x7f0701f7), new Object[] {
                        Integer.valueOf(f)
                    }));
                } else
                if (az.q == 9)
                {
                    an.a(new WeakReference(a), String.format(getString(0x7f0701f7), new Object[] {
                        Integer.valueOf(1)
                    }));
                }
            }
            if (view.getTag().equals("switch"))
            {
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/SingleSwitch").toString());
                if (i != null && i.getVisibility() == 0)
                {
                    i.setVisibility(8);
                    PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("new_feature_original", false).apply();
                }
                a.b(false, 0);
                b();
            }
            if (view.getTag().equals("text"))
            {
                obj = g.findViewWithTag("text");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0c000a);
                }
                if (az.q == 8)
                {
                    obj = (ao)a.O().e().get(0);
                    if (obj instanceof ra)
                    {
                        a.a((ra)obj);
                        ((ra)obj).C();
                    }
                } else
                {
                    com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Text").toString());
                    if (az.q == 0)
                    {
                        int l3 = az.D;
                        az.D = l3 + 1;
                        com.roidapp.photogrid.b.f.b("Text", l3);
                    } else
                    if (az.q == 5)
                    {
                        int j4 = az.E;
                        az.E = j4 + 1;
                        com.roidapp.photogrid.b.f.a("Text", j4);
                    }
                    if (a != null && a.O() != null)
                    {
                        obj = new ra(a);
                        obj.c = a.O().getLayoutParams().width;
                        obj.d = a.O().getLayoutParams().height;
                        ((ra) (obj)).b(((ra) (obj)).c, ((ra) (obj)).d);
                        ((ra) (obj)).g();
                        ((ra) (obj)).l();
                        int i4 = ((ra) (obj)).c / 2;
                        int l4 = ((ra) (obj)).c() / 2;
                        int i5 = (((ra) (obj)).d / 2 - ((ra) (obj)).d() / 2) / 2;
                        ((ra) (obj)).b(i4 - l4, i5);
                        obj.at = ((ra) (obj)).c();
                        a.O().a(((ao) (obj)));
                        a.O().b(((ao) (obj)));
                        a.a(((ra) (obj)));
                        ((ra) (obj)).C();
                        obj = a.P();
                        if (obj != null)
                        {
                            ((com.roidapp.photogrid.release.az) (obj)).setVisibility(8);
                        }
                    }
                }
            } else
            {
                obj = g.findViewWithTag("text");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("sticker"))
            {
                obj = g.findViewWithTag("sticker");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0c000a);
                }
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Sticker").toString());
                if (az.q == 0)
                {
                    j1 = az.D;
                    az.D = j1 + 1;
                    com.roidapp.photogrid.b.f.b("Sticker", j1);
                } else
                if (az.q == 5)
                {
                    int k4 = az.E;
                    az.E = k4 + 1;
                    com.roidapp.photogrid.b.f.a("Sticker", k4);
                }
                a.d(18);
            } else
            {
                obj = g.findViewWithTag("sticker");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("crop"))
            {
                obj = g.findViewWithTag("crop");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0c000a);
                }
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(b).append("/banner/Crop").toString());
                j1 = az.E;
                az.E = j1 + 1;
                com.roidapp.photogrid.b.f.a("Crop", j1);
                a.a(0, 1, 0);
            } else
            {
                obj = g.findViewWithTag("crop");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("retouch"))
            {
                j1 = az.E;
                az.E = j1 + 1;
                com.roidapp.photogrid.b.f.a("Retouch", j1);
                obj = g.findViewWithTag("retouch");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0c000a);
                }
                a.a(0, 0);
            } else
            {
                obj = g.findViewWithTag("retouch");
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("size"))
            {
                obj = g.findViewWithTag("size");
                if (az.q == 8)
                {
                    if (a.b("FragmentAdjustTextSize"))
                    {
                        a.a("FragmentAdjustTextSize");
                        if (obj != null)
                        {
                            ((View) (obj)).setBackgroundResource(0x7f0200b3);
                        }
                    } else
                    if (((ra)a.O().e().get(0)).A())
                    {
                        an.a(a, 0x7f0703b6);
                    } else
                    {
                        a.a(0x7f0d03ec, new br(), "FragmentAdjustTextSize");
                        if (obj != null)
                        {
                            ((View) (obj)).setBackgroundResource(0x7f0c000a);
                        }
                    }
                }
            } else
            if (a.b("FragmentAdjustTextSize"))
            {
                a.a("FragmentAdjustTextSize");
                View view1 = g.findViewWithTag("size");
                if (view1 != null)
                {
                    view1.setBackgroundResource(0x7f0200b3);
                }
            }
            if (view.getTag().equals("blur"))
            {
                d();
                j1 = az.E;
                az.E = j1 + 1;
                com.roidapp.photogrid.b.f.a("Blur", j1);
                return;
            }
            view = g.findViewWithTag("blur");
            a.a("FragmentBlur");
            if (view != null)
            {
                view.setBackgroundResource(0x7f0200b3);
                return;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(0x7f0300ac, viewgroup, false);
        k = (HorizontalScrollView)bundle.findViewById(0x7f0d028e);
        k.getViewTreeObserver().addOnGlobalLayoutListener(new ct(this));
        k.setOnTouchListener(new cu(this));
        viewgroup = bundle;
_L2:
        g = (LinearLayout)viewgroup.findViewById(0x7f0d028d);
        if (a.z)
        {
            a.z = false;
            ih.C().a(0);
            if (az.q == 9)
            {
                l = -0.1F;
            }
            g.getViewTreeObserver().addOnGlobalLayoutListener(new cw(this));
        }
        bundle = a;
        com.roidapp.baselib.gl.c.a();
        c = com.roidapp.baselib.gl.c.b(bundle);
        bundle = ih.C().M();
        if (bundle == null)
        {
            com.roidapp.photogrid.common.c.a("120", a);
            return null;
        }
        break; /* Loop/switch isn't completed */
        bundle;
        bundle.printStackTrace();
        System.gc();
        System.gc();
        viewgroup = layoutinflater.inflate(0x7f0300ab, viewgroup, false);
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (bundle.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        m = bundle.length;
        f = ih.C().K();
        az.q;
        JVM INSTR tableswitch 0 10: default 288
    //                   0 290
    //                   1 329
    //                   2 595
    //                   3 586
    //                   4 535
    //                   5 365
    //                   6 288
    //                   7 288
    //                   8 499
    //                   9 445
    //                   10 472;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L3 _L3 _L10 _L11 _L12
_L3:
        return viewgroup;
_L4:
        b = "GridActivity";
        if (bundle.length >= 15)
        {
            e = false;
        }
        a(layoutinflater, v, c);
        return viewgroup;
_L5:
        if (bundle.length >= f)
        {
            e = false;
        }
        a(layoutinflater, w, c);
        b = "FreeActivity";
        return viewgroup;
_L9:
        ih.C().W();
        JVM INSTR tableswitch 1 4: default 400
    //                   1 415
    //                   2 425
    //                   3 400
    //                   4 435;
           goto _L13 _L14 _L15 _L13 _L16
_L13:
        a(layoutinflater, r, c);
        return viewgroup;
_L14:
        b = "GridActivity/Single/Instagram";
          goto _L13
_L15:
        b = "GridActivity/Single/Original";
          goto _L13
_L16:
        b = "GridActivity/Single/Shape";
          goto _L13
_L11:
        b = "VideoActivity/Single";
        e = false;
        a(layoutinflater, s, c);
        return viewgroup;
_L12:
        b = "CameraActivity/Single";
        e = false;
        a(layoutinflater, t, c);
        return viewgroup;
_L10:
        if (bundle.length >= f)
        {
            e = false;
        }
        a(layoutinflater, u, c);
        b = "GridActivity/Movie";
        return viewgroup;
_L8:
        if (!ih.C().h())
        {
            e = false;
        } else
        if (bundle.length >= 15)
        {
            e = false;
        }
        b = "GridActivity/Template";
        a(layoutinflater, x, c);
        return viewgroup;
_L7:
        b = "HighActivity";
        return viewgroup;
_L6:
        b = "WideActivity";
        return viewgroup;
    }
}
