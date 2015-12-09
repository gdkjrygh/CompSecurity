// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.b;
import com.afollestad.materialdialogs.util.a;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateProgressDrawable;

// Referenced classes of package com.afollestad.materialdialogs:
//            g, f, e, b, 
//            a

class d
{

    d()
    {
    }

    public static int a(f.a a1)
    {
        Object obj = a1.a;
        int i = R.attr.md_dark_theme;
        boolean flag;
        if (a1.F == com.afollestad.materialdialogs.g.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = com.afollestad.materialdialogs.util.a.a(((Context) (obj)), i, flag);
        if (flag)
        {
            obj = com.afollestad.materialdialogs.g.b;
        } else
        {
            obj = com.afollestad.materialdialogs.g.a;
        }
        a1.F = ((g) (obj));
        if (flag)
        {
            return R.style.MD_Dark;
        } else
        {
            return R.style.MD_Light;
        }
    }

    public static void a(f f1)
    {
        f.a a1 = f1.b;
        f1.setCancelable(a1.G);
        f1.setCanceledOnTouchOutside(a1.G);
        if (a1.Y == 0)
        {
            a1.Y = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_background_color);
        }
        if (a1.Y != 0)
        {
            GradientDrawable gradientdrawable = new GradientDrawable();
            gradientdrawable.setCornerRadius(a1.a.getResources().getDimension(R.dimen.md_bg_corner_radius));
            gradientdrawable.setColor(a1.Y);
            com.afollestad.materialdialogs.util.a.a(f1.a, gradientdrawable);
        }
        if (!a1.au)
        {
            a1.r = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_positive_color, a1.r);
        }
        if (!a1.av)
        {
            a1.t = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_neutral_color, a1.t);
        }
        if (!a1.aw)
        {
            a1.s = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_negative_color, a1.s);
        }
        if (!a1.ax)
        {
            a1.q = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_widget_color, a1.q);
        }
        if (!a1.ar)
        {
            int i = com.afollestad.materialdialogs.util.a.a(f1.getContext(), 0x1010036);
            a1.i = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_title_color, i);
        }
        if (!a1.as)
        {
            int j = com.afollestad.materialdialogs.util.a.a(f1.getContext(), 0x1010038);
            a1.j = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_content_color, j);
        }
        if (!a1.at)
        {
            a1.Z = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_item_color, a1.j);
        }
        f1.e = (TextView)f1.a.findViewById(R.id.title);
        f1.d = (ImageView)f1.a.findViewById(R.id.icon);
        f1.f = f1.a.findViewById(R.id.titleFrame);
        f1.k = (TextView)f1.a.findViewById(R.id.content);
        f1.c = (ListView)f1.a.findViewById(R.id.contentListView);
        f1.n = (MDButton)f1.a.findViewById(R.id.buttonDefaultPositive);
        f1.o = (MDButton)f1.a.findViewById(R.id.buttonDefaultNeutral);
        f1.p = (MDButton)f1.a.findViewById(R.id.buttonDefaultNegative);
        if (a1.ag != null && a1.m == null)
        {
            a1.m = a1.a.getText(0x104000a);
        }
        MDButton mdbutton = f1.n;
        int k;
        int l;
        boolean flag;
        if (a1.m != null)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        mdbutton.setVisibility(k);
        mdbutton = f1.o;
        if (a1.n != null)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        mdbutton.setVisibility(k);
        mdbutton = f1.p;
        if (a1.o != null)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        mdbutton.setVisibility(k);
        if (a1.N != null)
        {
            f1.d.setVisibility(0);
            f1.d.setImageDrawable(a1.N);
        } else
        {
            obj = com.afollestad.materialdialogs.util.a.d(a1.a, R.attr.md_icon);
            if (obj != null)
            {
                f1.d.setVisibility(0);
                f1.d.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                f1.d.setVisibility(8);
            }
        }
        l = a1.P;
        k = l;
        if (l == -1)
        {
            k = com.afollestad.materialdialogs.util.a.e(a1.a, R.attr.md_icon_max_size);
        }
        if (a1.O || com.afollestad.materialdialogs.util.a.f(a1.a, R.attr.md_icon_limit_icon_to_default_size))
        {
            k = a1.a.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size);
        }
        if (k > -1)
        {
            f1.d.setAdjustViewBounds(true);
            f1.d.setMaxHeight(k);
            f1.d.setMaxWidth(k);
            f1.d.requestLayout();
        }
        if (!a1.ay)
        {
            k = com.afollestad.materialdialogs.util.a.a(f1.getContext(), R.attr.md_divider);
            a1.X = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.md_divider_color, k);
        }
        f1.a.setDividerColor(a1.X);
        if (f1.e != null)
        {
            f1.a(f1.e, a1.M);
            f1.e.setTextColor(a1.i);
            f1.e.setGravity(a1.c.a());
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                f1.e.setTextAlignment(a1.c.b());
            }
            MDButton mdbutton1;
            FrameLayout framelayout;
            Resources resources;
            boolean flag1;
            if (a1.b == null)
            {
                f1.f.setVisibility(8);
            } else
            {
                f1.e.setText(a1.b);
                f1.f.setVisibility(0);
            }
        }
        if (f1.k != null)
        {
            f1.k.setMovementMethod(new LinkMovementMethod());
            f1.a(f1.k, a1.L);
            f1.k.setLineSpacing(0.0F, a1.H);
            if (a1.r == null)
            {
                f1.k.setLinkTextColor(com.afollestad.materialdialogs.util.a.a(f1.getContext(), 0x1010036));
            } else
            {
                f1.k.setLinkTextColor(a1.r);
            }
            f1.k.setTextColor(a1.j);
            f1.k.setGravity(a1.d.a());
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                f1.k.setTextAlignment(a1.d.b());
            }
            if (a1.k != null)
            {
                f1.k.setText(a1.k);
                f1.k.setVisibility(0);
            } else
            {
                f1.k.setVisibility(8);
            }
        }
        f1.a.setButtonGravity(a1.g);
        f1.a.setButtonStackedGravity(a1.e);
        f1.a.setForceStack(a1.V);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag1 = com.afollestad.materialdialogs.util.a.a(a1.a, 0x101038c, true);
            flag = flag1;
            if (flag1)
            {
                flag = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.textAllCaps, true);
            }
        } else
        {
            flag = com.afollestad.materialdialogs.util.a.a(a1.a, R.attr.textAllCaps, true);
        }
        mdbutton1 = f1.n;
        f1.a(mdbutton1, a1.M);
        mdbutton1.setAllCapsCompat(flag);
        mdbutton1.setText(a1.m);
        mdbutton1.setTextColor(a1.r);
        f1.n.setStackedSelector(f1.a(com.afollestad.materialdialogs.b.a, true));
        f1.n.setDefaultSelector(f1.a(com.afollestad.materialdialogs.b.a, false));
        f1.n.setTag(com.afollestad.materialdialogs.b.a);
        f1.n.setOnClickListener(f1);
        f1.n.setVisibility(0);
        mdbutton1 = f1.p;
        f1.a(mdbutton1, a1.M);
        mdbutton1.setAllCapsCompat(flag);
        mdbutton1.setText(a1.o);
        mdbutton1.setTextColor(a1.s);
        f1.p.setStackedSelector(f1.a(b.c, true));
        f1.p.setDefaultSelector(f1.a(b.c, false));
        f1.p.setTag(b.c);
        f1.p.setOnClickListener(f1);
        f1.p.setVisibility(0);
        mdbutton1 = f1.o;
        f1.a(mdbutton1, a1.M);
        mdbutton1.setAllCapsCompat(flag);
        mdbutton1.setText(a1.n);
        mdbutton1.setTextColor(a1.t);
        f1.o.setStackedSelector(f1.a(com.afollestad.materialdialogs.b.b, true));
        f1.o.setDefaultSelector(f1.a(com.afollestad.materialdialogs.b.b, false));
        f1.o.setTag(com.afollestad.materialdialogs.b.b);
        f1.o.setOnClickListener(f1);
        f1.o.setVisibility(0);
        if (a1.B != null)
        {
            f1.r = new ArrayList();
        }
        if (f1.c != null && (a1.l != null && a1.l.length > 0 || a1.Q != null))
        {
            f1.c.setSelector(f1.e());
            if (a1.Q == null)
            {
                if (a1.A != null)
                {
                    f1.q = com.afollestad.materialdialogs.f.h.b;
                } else
                if (a1.B != null)
                {
                    f1.q = f.h.c;
                    if (a1.J != null)
                    {
                        f1.r = new ArrayList(Arrays.asList(a1.J));
                        a1.J = null;
                    }
                } else
                {
                    f1.q = com.afollestad.materialdialogs.f.h.a;
                }
                a1.Q = new com.afollestad.materialdialogs.a(f1, com.afollestad.materialdialogs.f.h.a(f1.q));
            } else
            if (a1.Q instanceof com.afollestad.materialdialogs.internal.a)
            {
                ((com.afollestad.materialdialogs.internal.a)a1.Q).a(f1);
            }
        }
        b(f1);
        c(f1);
        if (a1.p != null)
        {
            ((MDRootLayout)f1.a.findViewById(R.id.root)).a();
            framelayout = (FrameLayout)f1.a.findViewById(R.id.customViewFrame);
            f1.g = framelayout;
            Object obj = a1.p;
            if (a1.W)
            {
                resources = f1.getContext().getResources();
                k = resources.getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
                ScrollView scrollview = new ScrollView(f1.getContext());
                int i1 = resources.getDimensionPixelSize(R.dimen.md_content_padding_top);
                int j1 = resources.getDimensionPixelSize(R.dimen.md_content_padding_bottom);
                scrollview.setClipToPadding(false);
                if (obj instanceof EditText)
                {
                    scrollview.setPadding(k, i1, k, j1);
                } else
                {
                    scrollview.setPadding(0, i1, 0, j1);
                    ((View) (obj)).setPadding(k, 0, k, 0);
                }
                scrollview.addView(((View) (obj)), new android.widget.FrameLayout.LayoutParams(-1, -2));
                obj = scrollview;
            }
            framelayout.addView(((View) (obj)), new android.view.ViewGroup.LayoutParams(-1, -2));
        }
        if (a1.U != null)
        {
            f1.setOnShowListener(a1.U);
        }
        if (a1.S != null)
        {
            f1.setOnCancelListener(a1.S);
        }
        if (a1.R != null)
        {
            f1.setOnDismissListener(a1.R);
        }
        if (a1.T != null)
        {
            f1.setOnKeyListener(a1.T);
        }
        f1.a();
        f1.d();
        f1.a(f1.a);
        f1.c();
    }

    public static int b(f.a a1)
    {
        if (a1.p != null)
        {
            return R.layout.md_dialog_custom;
        }
        if (a1.l != null && a1.l.length > 0 || a1.Q != null)
        {
            return R.layout.md_dialog_list;
        }
        if (a1.ac > -2)
        {
            return R.layout.md_dialog_progress;
        }
        if (a1.aa)
        {
            if (a1.aq)
            {
                return R.layout.md_dialog_progress_indeterminate_horizontal;
            } else
            {
                return R.layout.md_dialog_progress_indeterminate;
            }
        }
        if (a1.ag != null)
        {
            return R.layout.md_dialog_input;
        } else
        {
            return R.layout.md_dialog_basic;
        }
    }

    private static void b(f f1)
    {
        f.a a1 = f1.b;
        if (a1.aa || a1.ac > -2)
        {
            f1.h = (ProgressBar)f1.a.findViewById(0x102000d);
            if (f1.h != null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    if (a1.aa)
                    {
                        if (a1.aq)
                        {
                            IndeterminateHorizontalProgressDrawable indeterminatehorizontalprogressdrawable = new IndeterminateHorizontalProgressDrawable(a1.a());
                            indeterminatehorizontalprogressdrawable.setTint(a1.q);
                            f1.h.setProgressDrawable(indeterminatehorizontalprogressdrawable);
                            f1.h.setIndeterminateDrawable(indeterminatehorizontalprogressdrawable);
                        } else
                        {
                            IndeterminateProgressDrawable indeterminateprogressdrawable = new IndeterminateProgressDrawable(a1.a());
                            indeterminateprogressdrawable.setTint(a1.q);
                            f1.h.setProgressDrawable(indeterminateprogressdrawable);
                            f1.h.setIndeterminateDrawable(indeterminateprogressdrawable);
                        }
                    } else
                    {
                        HorizontalProgressDrawable horizontalprogressdrawable = new HorizontalProgressDrawable(a1.a());
                        horizontalprogressdrawable.setTint(a1.q);
                        f1.h.setProgressDrawable(horizontalprogressdrawable);
                        f1.h.setIndeterminateDrawable(horizontalprogressdrawable);
                    }
                } else
                {
                    com.afollestad.materialdialogs.internal.b.a(f1.h, a1.q);
                }
                if (!a1.aa || a1.aq)
                {
                    f1.h.setIndeterminate(a1.aq);
                    f1.h.setProgress(0);
                    f1.h.setMax(a1.ad);
                    f1.i = (TextView)f1.a.findViewById(R.id.label);
                    if (f1.i != null)
                    {
                        f1.i.setTextColor(a1.j);
                        f1.a(f1.i, a1.M);
                        f1.i.setText(a1.ap.format(0L));
                    }
                    f1.j = (TextView)f1.a.findViewById(R.id.minMax);
                    if (f1.j != null)
                    {
                        f1.j.setTextColor(a1.j);
                        f1.a(f1.j, a1.L);
                        if (a1.ab)
                        {
                            f1.j.setVisibility(0);
                            f1.j.setText(String.format(a1.ao, new Object[] {
                                Integer.valueOf(0), Integer.valueOf(a1.ad)
                            }));
                            f1 = (android.view.ViewGroup.MarginLayoutParams)f1.h.getLayoutParams();
                            f1.leftMargin = 0;
                            f1.rightMargin = 0;
                            return;
                        } else
                        {
                            f1.j.setVisibility(8);
                            return;
                        }
                    } else
                    {
                        a1.ab = false;
                        return;
                    }
                }
            }
        }
    }

    private static void c(f f1)
    {
        f.a a1 = f1.b;
        f1.l = (EditText)f1.a.findViewById(0x1020009);
        if (f1.l == null)
        {
            return;
        }
        f1.a(f1.l, a1.L);
        if (a1.ae != null)
        {
            f1.l.setText(a1.ae);
        }
        f1.i();
        f1.l.setHint(a1.af);
        f1.l.setSingleLine();
        f1.l.setTextColor(a1.j);
        f1.l.setHintTextColor(com.afollestad.materialdialogs.util.a.a(a1.j, 0.3F));
        com.afollestad.materialdialogs.internal.b.a(f1.l, f1.b.q);
        if (a1.ai != -1)
        {
            f1.l.setInputType(a1.ai);
            if ((a1.ai & 0x80) == 128)
            {
                f1.l.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        f1.m = (TextView)f1.a.findViewById(R.id.minMax);
        if (a1.ak > 0 || a1.al > -1)
        {
            int i = f1.l.getText().toString().length();
            boolean flag;
            if (!a1.ah)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1.a(i, flag);
            return;
        } else
        {
            f1.m.setVisibility(8);
            f1.m = null;
            return;
        }
    }
}
