// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            dh, di, lr, PhotoGridActivity, 
//            cs, ih, ig, if, 
//            de, df, dg, dd

public final class dc extends Fragment
    implements android.view.View.OnClickListener
{

    private lr A;
    private ImageView a;
    private TextView b;
    private LinearLayout c;
    private RelativeLayout d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private PhotoGridActivity w;
    private boolean x;
    private String y;
    private ig z[];

    public dc()
    {
        y = "GridActivity";
    }

    static ImageView a(dc dc1)
    {
        return dc1.a;
    }

    static void a(View view)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, -0.2F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        translateanimation.setDuration(500L);
        view.startAnimation(translateanimation);
    }

    private void a(boolean flag, boolean flag1)
    {
        Drawable drawable;
        Drawable drawable1;
        drawable = getResources().getDrawable(0x7f020421);
        drawable1 = getResources().getDrawable(0x7f020422);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (drawable != null)
        {
            drawable.setAlpha(255);
            o.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            o.setTextColor(getResources().getColor(0x7f0c00bf));
        }
_L8:
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (drawable1 != null)
        {
            drawable1.setAlpha(255);
            p.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
            p.setTextColor(getResources().getColor(0x7f0c00bf));
        }
_L6:
        return;
_L2:
        if (drawable != null)
        {
            drawable.setAlpha(50);
            o.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            o.setTextColor(getResources().getColor(0x7f0c00c0));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (drawable1 == null) goto _L6; else goto _L5
_L5:
        drawable1.setAlpha(50);
        p.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        p.setTextColor(getResources().getColor(0x7f0c00c0));
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void b(dc dc1)
    {
        if (dc1.isAdded())
        {
            Dialog dialog = new Dialog(dc1.getActivity(), 0x7f0b001d);
            android.widget.LinearLayout.LayoutParams layoutparams;
            int i1;
            try
            {
                dialog.setContentView(0x7f0300ef);
            }
            // Misplaced declaration of an exception variable
            catch (dc dc1)
            {
                dc1.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (dc dc1)
            {
                dc1.printStackTrace();
                return;
            }
            layoutparams = (android.widget.LinearLayout.LayoutParams)dialog.findViewById(0x7f0d03c6).getLayoutParams();
            i1 = dc1.a.getMeasuredWidth();
            layoutparams.width = i1;
            ((android.widget.RelativeLayout.LayoutParams)dialog.findViewById(0x7f0d03c8).getLayoutParams()).setMargins(i1, 0, 0, 0);
            ((android.widget.RelativeLayout.LayoutParams)dialog.findViewById(0x7f0d03c9).getLayoutParams()).setMargins(i1, 0, 0, 0);
            dialog.findViewById(0x7f0d0279).setOnClickListener(new dh(dc1, dialog));
            dialog.setOnDismissListener(new di(dc1));
            dialog.show();
            dc1.A.f();
        }
    }

    static LinearLayout c(dc dc1)
    {
        return dc1.c;
    }

    static ig[] d(dc dc1)
    {
        return dc1.z;
    }

    static PhotoGridActivity e(dc dc1)
    {
        return dc1.w;
    }

    static lr f(dc dc1)
    {
        return dc1.A;
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            Drawable drawable = getResources().getDrawable(0x7f02038f);
            if (drawable != null)
            {
                drawable.setAlpha(255);
            }
            v.setText(getResources().getString(0x7f070161));
            v.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            return;
        }
        Drawable drawable1 = getResources().getDrawable(0x7f0203cb);
        if (drawable1 != null)
        {
            drawable1.setAlpha(255);
        }
        v.setText(getResources().getString(0x7f070166));
        v.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
    }

    public final boolean a()
    {
        boolean flag = false;
        if (b.getVisibility() == 0)
        {
            b.setVisibility(8);
            c.setVisibility(0);
            w.i = false;
            w.o = false;
            flag = true;
        }
        return flag;
    }

    protected final void b()
    {
        if (w == null || w.isFinishing())
        {
            return;
        } else
        {
            w.b(0);
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        w = (PhotoGridActivity)activity;
        super.onAttach(activity);
        if (activity instanceof lr)
        {
            A = (lr)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet NewbieDialogMgr.NewbieListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if if1;
        boolean flag1;
        boolean flag4;
        flag4 = false;
        flag1 = false;
        if1 = w.z();
        if (if1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view.getId();
        JVM INSTR tableswitch 2131559243 2131559269: default 144
    //                   2131559243 145
    //                   2131559244 144
    //                   2131559245 144
    //                   2131559246 607
    //                   2131559247 144
    //                   2131559248 2156
    //                   2131559249 144
    //                   2131559250 1910
    //                   2131559251 144
    //                   2131559252 1647
    //                   2131559253 144
    //                   2131559254 2629
    //                   2131559255 1448
    //                   2131559256 144
    //                   2131559257 2062
    //                   2131559258 144
    //                   2131559259 233
    //                   2131559260 726
    //                   2131559261 814
    //                   2131559262 371
    //                   2131559263 489
    //                   2131559264 902
    //                   2131559265 1001
    //                   2131559266 1104
    //                   2131559267 1190
    //                   2131559268 1276
    //                   2131559269 1362;
           goto _L3 _L4 _L3 _L3 _L5 _L3 _L6 _L3 _L7 _L3 _L8 _L3 _L9 _L10 _L3 _L11 _L3 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L3:
        return;
_L4:
        if (w.o)
        {
            w.i = false;
            w.o = false;
            c.setVisibility(0);
            b.setVisibility(8);
            return;
        }
        b();
        if (w != null && !w.isFinishing())
        {
            view = new cs();
            w.a(0x7f0d028d, view, "FragmentBottomMain");
            return;
        }
          goto _L1
_L12:
        view = ih.C().M();
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/+90\260").toString());
        if (az.q == 0)
        {
            int i1 = az.D;
            az.D = i1 + 1;
            com.roidapp.photogrid.b.f.b("+90\2602", i1);
        } else
        if (az.q == 5)
        {
            int j1 = az.E;
            az.E = j1 + 1;
            com.roidapp.photogrid.b.f.a("+90\2602", j1);
        }
        if (if1 != null)
        {
            if (ih.C().W() == 2)
            {
                if1 = view[0];
                if1.q = ((ig) (if1)).q + 90;
                ih.C().a(view);
                w.a(false, false);
                return;
            } else
            {
                if1.a(90F);
                return;
            }
        }
          goto _L1
_L15:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Flip").toString());
        if (az.q == 0)
        {
            int k1 = az.D;
            az.D = k1 + 1;
            com.roidapp.photogrid.b.f.b("Horizontal2", k1);
        } else
        if (az.q == 5)
        {
            int i2 = az.E;
            az.E = i2 + 1;
            com.roidapp.photogrid.b.f.a("Horizontal2", i2);
        }
        if (if1 != null)
        {
            int l1 = Math.abs(if1.c.p % 180);
            if (l1 >= 45 && l1 <= 135)
            {
                if1.e();
                return;
            } else
            {
                if1.d();
                return;
            }
        }
          goto _L1
_L16:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Flip_vertical").toString());
        if (az.q == 0)
        {
            int j2 = az.D;
            az.D = j2 + 1;
            com.roidapp.photogrid.b.f.b("Vertical2", j2);
        } else
        if (az.q == 5)
        {
            int l2 = az.E;
            az.E = l2 + 1;
            com.roidapp.photogrid.b.f.a("Vertical2", l2);
        }
        if (if1 != null)
        {
            int k2 = Math.abs(if1.c.p % 180);
            if (k2 >= 45 && k2 <= 135)
            {
                if1.d();
                return;
            } else
            {
                if1.e();
                return;
            }
        }
          goto _L1
_L5:
        if (x)
        {
            if (isAdded())
            {
                an.a(new WeakReference(w), getString(0x7f070209));
                return;
            }
        } else
        {
            com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Swap").toString());
            if (az.q == 0)
            {
                int i3 = az.D;
                az.D = i3 + 1;
                com.roidapp.photogrid.b.f.b("Swap2", i3);
            }
            w.i = true;
            w.o = true;
            c.setVisibility(8);
            b.setVisibility(0);
            return;
        }
          goto _L1
_L13:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/-10\260").toString());
        if (az.q == 0)
        {
            int j3 = az.D;
            az.D = j3 + 1;
            com.roidapp.photogrid.b.f.b("-10\2602", j3);
        } else
        if (az.q == 5)
        {
            int k3 = az.E;
            az.E = k3 + 1;
            com.roidapp.photogrid.b.f.a("-10\2602", k3);
        }
        if (if1 != null)
        {
            if1.a(-10F);
            return;
        }
          goto _L1
_L14:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/+10\260").toString());
        if (az.q == 0)
        {
            int l3 = az.D;
            az.D = l3 + 1;
            com.roidapp.photogrid.b.f.b("+10\2602", l3);
        } else
        if (az.q == 5)
        {
            int i4 = az.E;
            az.E = i4 + 1;
            com.roidapp.photogrid.b.f.a("+10\2602", i4);
        }
        if (if1 != null)
        {
            if1.a(10F);
            return;
        }
          goto _L1
_L17:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/ZoomIn").toString());
        if (az.q == 0)
        {
            int j4 = az.D;
            az.D = j4 + 1;
            com.roidapp.photogrid.b.f.b("ZoomIn2", j4);
        } else
        if (az.q == 5)
        {
            int k4 = az.E;
            az.E = k4 + 1;
            com.roidapp.photogrid.b.f.a("ZoomIn2", k4);
        }
        if (if1 != null)
        {
            if (!if1.a(false))
            {
                flag1 = true;
            }
            a(flag1, true);
            return;
        }
          goto _L1
_L18:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Zoom Out").toString());
        if (az.q == 0)
        {
            int l4 = az.D;
            az.D = l4 + 1;
            com.roidapp.photogrid.b.f.b("ZoomOut2", l4);
        } else
        if (az.q == 5)
        {
            int i5 = az.E;
            az.E = i5 + 1;
            com.roidapp.photogrid.b.f.a("ZoomOut2", i5);
        }
        if (if1 != null)
        {
            boolean flag2 = flag4;
            if (!if1.b(false))
            {
                flag2 = true;
            }
            a(true, flag2);
            return;
        }
          goto _L1
_L19:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Left").toString());
        if (az.q == 0)
        {
            int j5 = az.D;
            az.D = j5 + 1;
            com.roidapp.photogrid.b.f.b("Left2", j5);
        } else
        if (az.q == 5)
        {
            int k5 = az.E;
            az.E = k5 + 1;
            com.roidapp.photogrid.b.f.a("Left2", k5);
        }
        if (if1 != null)
        {
            if1.c(false);
            return;
        }
          goto _L1
_L20:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Right").toString());
        if (az.q == 0)
        {
            int l5 = az.D;
            az.D = l5 + 1;
            com.roidapp.photogrid.b.f.b("Right2", l5);
        } else
        if (az.q == 5)
        {
            int i6 = az.E;
            az.E = i6 + 1;
            com.roidapp.photogrid.b.f.a("Right2", i6);
        }
        if (if1 != null)
        {
            if1.c(true);
            return;
        }
          goto _L1
_L21:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Up").toString());
        if (az.q == 0)
        {
            int j6 = az.D;
            az.D = j6 + 1;
            com.roidapp.photogrid.b.f.b("Up2", j6);
        } else
        if (az.q == 5)
        {
            int k6 = az.E;
            az.E = k6 + 1;
            com.roidapp.photogrid.b.f.a("Up2", k6);
        }
        if (if1 != null)
        {
            if1.d(false);
            return;
        }
          goto _L1
_L22:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Down").toString());
        if (az.q == 0)
        {
            int l6 = az.D;
            az.D = l6 + 1;
            com.roidapp.photogrid.b.f.b("Down2", l6);
        } else
        if (az.q == 5)
        {
            int i7 = az.E;
            az.E = i7 + 1;
            com.roidapp.photogrid.b.f.a("Down2", i7);
        }
        if (if1 != null)
        {
            if1.d(true);
            return;
        }
          goto _L1
_L10:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/DeleteImg").toString());
        if (az.q == 0)
        {
            int j7 = az.D;
            az.D = j7 + 1;
            com.roidapp.photogrid.b.f.b("Delete2", j7);
        }
        if (x)
        {
            an.a(new WeakReference(w), getString(0x7f07020e));
            return;
        }
        if (az.q == 4 && !ih.C().h())
        {
            an.a(new WeakReference(w), getString(0x7f07004c));
            return;
        } else
        {
            view = new android.app.AlertDialog.Builder(w);
            view.setMessage(w.getResources().getString(0x7f070177));
            view.setPositiveButton(0x7f07032f, new de(this));
            view.setNegativeButton(0x7f0701ec, new df(this));
            view.setOnCancelListener(new dg(this));
            view.create().show();
            return;
        }
_L8:
        if (az.q == 4 && w.n > 0 && ih.C().b(w.n - 1))
        {
            an.a(new WeakReference(w), getString(0x7f070200));
            return;
        }
        view = w;
        com.roidapp.baselib.gl.c.a();
        if (!com.roidapp.baselib.gl.c.b(view)) goto _L24; else goto _L23
_L23:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Filter").toString());
        if (az.q != 0) goto _L26; else goto _L25
_L25:
        int k7 = az.D;
        az.D = k7 + 1;
        com.roidapp.photogrid.b.f.b("Filter2", k7);
_L27:
        w.a(w.n - 1, 0, 0);
        return;
_L26:
        if (az.q == 5)
        {
            int l7 = az.E;
            az.E = l7 + 1;
            com.roidapp.photogrid.b.f.a("Filter2", l7);
        }
        if (true) goto _L27; else goto _L24
_L24:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Crop").toString());
        if (az.q == 0)
        {
            int i8 = az.D;
            az.D = i8 + 1;
            com.roidapp.photogrid.b.f.b("Crop2", i8);
        } else
        if (az.q == 5)
        {
            int j8 = az.E;
            az.E = j8 + 1;
            com.roidapp.photogrid.b.f.a("Crop2", j8);
        }
        w.a(w.n - 1, 1, 0);
        return;
_L7:
        if (az.q == 4 && w.n > 0 && ih.C().b(w.n - 1))
        {
            an.a(new WeakReference(w), getString(0x7f070207));
            return;
        }
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/Crop").toString());
        if (az.q == 0)
        {
            int k8 = az.D;
            az.D = k8 + 1;
            com.roidapp.photogrid.b.f.b("Crop2", k8);
        } else
        if (az.q == 5)
        {
            int l8 = az.E;
            az.E = l8 + 1;
            com.roidapp.photogrid.b.f.a("Crop2", l8);
        }
        w.a(w.n - 1, 1, 0);
        return;
_L11:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/FreeCrop").toString());
        if (az.q == 0)
        {
            int i9 = az.D;
            az.D = i9 + 1;
            com.roidapp.photogrid.b.f.b("ClipPhoto2", i9);
        } else
        if (az.q == 5)
        {
            int j9 = az.E;
            az.E = j9 + 1;
            com.roidapp.photogrid.b.f.a("ClipPhoto2", j9);
        }
        w.b(1, w.n - 1);
        return;
_L6:
        if (if1 != null)
        {
            boolean flag3 = if1.C;
            boolean flag;
            if (ih.C().W() == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                flag3 = true;
            }
            if (flag && if1.c.v == 1.0F && if1.c.t == 0.0F && if1.c.u == 0.0F && if1.c.p == 0 && if1.c.x == 0 && if1.c.r == 1 && if1.c.s == 1)
            {
                an.a(w, 0x7f07002b);
                return;
            }
            if (flag3)
            {
                com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/FitIn").toString());
                if (az.q == 5)
                {
                    if (!flag)
                    {
                        int j10 = az.E;
                        az.E = j10 + 1;
                        com.roidapp.photogrid.b.f.a("In_FitIn2", j10);
                    } else
                    {
                        int k10 = az.E;
                        az.E = k10 + 1;
                        com.roidapp.photogrid.b.f.a("Or_FitIn2", k10);
                    }
                } else
                {
                    int l10 = az.D;
                    az.D = l10 + 1;
                    com.roidapp.photogrid.b.f.b("FitIn2", l10);
                }
                if (!flag)
                {
                    view = getResources().getDrawable(0x7f0203cb);
                    view.setAlpha(255);
                    v.setText(getResources().getString(0x7f070166));
                    v.setCompoundDrawablesWithIntrinsicBounds(null, view, null, null);
                }
                if1.C = false;
                if (az.q == 5)
                {
                    if1.A = false;
                }
                w.d(false);
                if1.b(if1.d);
                if1.invalidate();
                return;
            }
            com.roidapp.photogrid.common.b.a((new StringBuilder()).append(y).append("/banner/FitOut").toString());
            if (az.q == 5)
            {
                int k9 = az.E;
                az.E = k9 + 1;
                com.roidapp.photogrid.b.f.a("In_FitOut2", k9);
            } else
            {
                int l9 = az.D;
                az.D = l9 + 1;
                com.roidapp.photogrid.b.f.b("FitOut2", l9);
            }
            view = getResources().getDrawable(0x7f02038f);
            view.setAlpha(255);
            v.setText(getResources().getString(0x7f070161));
            v.setCompoundDrawablesWithIntrinsicBounds(null, view, null, null);
            if1.C = true;
            if (az.q == 5)
            {
                if1.A = true;
            }
            w.d(true);
            if1.b(if1.d);
            if1.invalidate();
            return;
        }
          goto _L1
_L9:
        int i10 = az.D;
        az.D = i10 + 1;
        com.roidapp.photogrid.b.f.b("Retouch2", i10);
        w.a(w.n - 1, 0);
        return;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag1 = false;
        layoutinflater = layoutinflater.inflate(0x7f0300cd, viewgroup, false);
        a = (ImageView)layoutinflater.findViewById(0x7f0d034b);
        a.getViewTreeObserver().addOnGlobalLayoutListener(new dd(this));
        b = (TextView)layoutinflater.findViewById(0x7f0d034c);
        c = (LinearLayout)layoutinflater.findViewById(0x7f0d034d);
        e = (TextView)layoutinflater.findViewById(0x7f0d034e);
        f = (TextView)layoutinflater.findViewById(0x7f0d0354);
        g = (TextView)layoutinflater.findViewById(0x7f0d0352);
        i = (TextView)layoutinflater.findViewById(0x7f0d0359);
        j = (TextView)layoutinflater.findViewById(0x7f0d035c);
        k = (TextView)layoutinflater.findViewById(0x7f0d035d);
        l = (TextView)layoutinflater.findViewById(0x7f0d035b);
        m = (TextView)layoutinflater.findViewById(0x7f0d035e);
        n = (TextView)layoutinflater.findViewById(0x7f0d035f);
        o = (TextView)layoutinflater.findViewById(0x7f0d0360);
        p = (TextView)layoutinflater.findViewById(0x7f0d0361);
        q = (TextView)layoutinflater.findViewById(0x7f0d0362);
        r = (TextView)layoutinflater.findViewById(0x7f0d0363);
        s = (TextView)layoutinflater.findViewById(0x7f0d0364);
        t = (TextView)layoutinflater.findViewById(0x7f0d0365);
        d = (RelativeLayout)layoutinflater.findViewById(0x7f0d0353);
        u = (TextView)layoutinflater.findViewById(0x7f0d0357);
        v = (TextView)layoutinflater.findViewById(0x7f0d0350);
        h = (TextView)layoutinflater.findViewById(0x7f0d0356);
        h.setOnClickListener(this);
        a.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        viewgroup = (RelativeLayout)layoutinflater.findViewById(0x7f0d034f);
        bundle = w;
        com.roidapp.baselib.gl.c.a();
        if (!com.roidapp.baselib.gl.c.b(bundle))
        {
            d.setVisibility(8);
        }
        z = ih.C().M();
        if (z == null)
        {
            com.roidapp.photogrid.common.c.a("130", w);
            return layoutinflater;
        }
        if (z.length == 1)
        {
            x = true;
            e.setVisibility(8);
            d.setVisibility(8);
            if (az.q != 4)
            {
                g.setVisibility(8);
            }
            u.setVisibility(8);
            if (az.q != 4)
            {
                layoutinflater.findViewById(0x7f0d0355).setVisibility(8);
            }
            if (az.q == 9 || az.q == 10)
            {
                viewgroup.setVisibility(8);
            }
        } else
        {
            if (!com.roidapp.baselib.gl.c.a().e(getActivity()))
            {
                layoutinflater.findViewById(0x7f0d0355).setVisibility(8);
            }
            e.setTextColor(getResources().getColor(0x7f0c00bf));
            bundle = getResources().getDrawable(0x7f0203fe);
            bundle.setAlpha(255);
            e.setCompoundDrawablesWithIntrinsicBounds(null, bundle, null, null);
            u.setTextColor(getResources().getColor(0x7f0c00bf));
            bundle = getResources().getDrawable(0x7f02037b);
            bundle.setAlpha(255);
            u.setCompoundDrawablesWithIntrinsicBounds(null, bundle, null, null);
        }
        if (az.q == 4 && !ih.C().h() || ih.C().W() == 4)
        {
            viewgroup.setVisibility(8);
        }
        if (az.q == 4 && !ih.C().h())
        {
            u.setTextColor(getResources().getColor(0x7f0c00c0));
            viewgroup = getResources().getDrawable(0x7f02037b);
            viewgroup.setAlpha(50);
            u.setCompoundDrawablesWithIntrinsicBounds(null, viewgroup, null, null);
        }
        if (w.n > 0 && ih.C().b(w.n - 1))
        {
            f.setTextColor(getResources().getColor(0x7f0c00c0));
            viewgroup = getResources().getDrawable(0x7f02038e);
            viewgroup.setAlpha(50);
            f.setCompoundDrawablesWithIntrinsicBounds(null, viewgroup, null, null);
        }
        if (w.n > 0 && ih.C().b(w.n - 1))
        {
            g.setTextColor(getResources().getColor(0x7f0c00c0));
            viewgroup = getResources().getDrawable(0x7f020379);
            viewgroup.setAlpha(50);
            g.setCompoundDrawablesWithIntrinsicBounds(null, viewgroup, null, null);
        }
        viewgroup = w.z();
        if (viewgroup != null)
        {
            boolean flag;
            if (ih.C().W() == 2)
            {
                flag = true;
            } else
            {
                flag = ((if) (viewgroup)).C;
            }
            a(flag);
            if (!viewgroup.a(true))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!viewgroup.b(true))
            {
                flag1 = true;
            }
            a(flag, flag1);
        }
        switch (az.q)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return layoutinflater;

        case 0: // '\0'
            y = "GridActivity/Edit";
            return layoutinflater;

        case 5: // '\005'
            if (ih.C().W() == 1)
            {
                y = "GridActivity/Single/Instagram/Edit";
                return layoutinflater;
            } else
            {
                y = "GridActivity/Single/Original/Edit";
                return layoutinflater;
            }

        case 9: // '\t'
            y = "VideoActivity/Single";
            return layoutinflater;

        case 10: // '\n'
            y = "CameraActivity/Single";
            return layoutinflater;

        case 4: // '\004'
            y = "GridActivity/Template/Edit";
            return layoutinflater;
        }
    }
}
