// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.ads.d;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;
import com.roidapp.photogrid.video.TrackSelector;
import com.roidapp.videolib.core.e;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.roidapp.photogrid.release:
//            eh, dy, dz, ei, 
//            PhotoGridActivity, ht, ng, ih, 
//            ig, dq, ds, dr, 
//            dt, du, dv, ec, 
//            ed, ef, ee, eg, 
//            dm, do, dn, dp, 
//            by, dx, dl, dw, 
//            hh, ea, eb

public final class dk extends Fragment
{

    private PhotoGridActivity a;
    private int b;
    private ng c;
    private boolean d;
    private View e;
    private float f;
    private HorizontalScrollViewEx g;
    private SparseArray h;

    public dk()
    {
        b = -1;
        f = -0.3F;
        g = null;
        h = null;
    }

    static int a(dk dk1, int i1)
    {
        dk1.b = i1;
        return i1;
    }

    static SparseArray a(dk dk1)
    {
        return dk1.h;
    }

    private View a(int i1)
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.a(i1 - 1);
        }
    }

    static View a(dk dk1, View view)
    {
        dk1.e = view;
        return view;
    }

    private void a(int i1, boolean flag)
    {
        TextView textview;
        Object obj;
        ImageView imageview;
        try
        {
            if (h == null)
            {
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        obj = (eh)h.get(i1 - 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        textview = (TextView)a(i1).findViewById(0x7f0d031b);
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj = getResources().getDrawable(((eh) (obj)).c);
        imageview = (ImageView)a(i1).findViewById(0x7f0d031c);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        textview.setTextColor(getResources().getColor(0x7f0c00c0));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        ((Drawable) (obj)).setAlpha(50);
        textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
        if (imageview.getVisibility() == 0)
        {
            imageview.getDrawable().setAlpha(50);
            return;
        }
        break MISSING_BLOCK_LABEL_186;
        textview.setTextColor(getResources().getColor(0x7f0c00bf));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((Drawable) (obj)).setAlpha(255);
        textview.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
        if (imageview.getVisibility() == 0)
        {
            imageview.getDrawable().setAlpha(255);
        }
    }

    private void a(Context context)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (sharedpreferences.getBoolean("event_video_show", false)) goto _L2; else goto _L1
_L1:
        d d1;
        List list;
        d1 = com.roidapp.cloudlib.ads.d.a(context);
        list = d1.a();
        if (list.size() <= 0) goto _L2; else goto _L3
_L3:
        int i1 = list.size() - 1;
_L9:
        if (i1 < 0) goto _L2; else goto _L4
_L4:
        Object obj = (String)list.get(i1);
        if (!((String) (obj)).contains("video") || !com.roidapp.cloudlib.a.a.a(context).a("event", ((String) (obj)), false)) goto _L6; else goto _L5
_L5:
        obj = d1.b(((String) (obj)));
        if (obj == null) goto _L6; else goto _L7
_L7:
        View view = LayoutInflater.from(context).inflate(0x7f030097, null);
        WebView webview = (WebView)view.findViewById(0x7f0d010a);
        RelativeLayout relativelayout = (RelativeLayout)view.findViewById(0x7f0d0269);
        RelativeLayout relativelayout1 = (RelativeLayout)view.findViewById(0x7f0d026a);
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(context)).create();
        webview.loadUrl((new StringBuilder("file://")).append(((String) (obj))).toString());
        obj = webview.getSettings();
        ((WebSettings) (obj)).setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        ((WebSettings) (obj)).setSupportZoom(false);
        ((WebSettings) (obj)).setUseWideViewPort(true);
        relativelayout.setVisibility(8);
        relativelayout1.setOnClickListener(new dy(this, alertdialog));
        alertdialog.show();
        alertdialog.getWindow().setContentView(view);
        obj = alertdialog.getWindow().getAttributes();
        obj.width = context.getResources().getDimensionPixelSize(0x7f09005d);
        alertdialog.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
        sharedpreferences.edit().putBoolean("event_video_show", true).apply();
_L2:
        return;
_L6:
        i1--;
        if (true) goto _L9; else goto _L8
_L8:
        context;
        context.printStackTrace();
        return;
    }

    static boolean a(dk dk1, boolean flag)
    {
        dk1.d = flag;
        return flag;
    }

    static View b(dk dk1, int i1)
    {
        return dk1.a(i1);
    }

    static PhotoGridActivity b(dk dk1)
    {
        return dk1.a;
    }

    static int c(dk dk1)
    {
        return dk1.b;
    }

    static void c(dk dk1, int i1)
    {
        String s;
        String s1;
        s1 = "";
        s = s1;
        if (i1 == -1) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.release.dz.a[com.roidapp.photogrid.release.ei.a()[dk1.b] - 1];
        JVM INSTR tableswitch 1 6: default 64
    //                   1 100
    //                   2 107
    //                   3 114
    //                   4 121
    //                   5 128
    //                   6 135;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_135;
_L3:
        s = s1;
_L2:
        if (dk1.a.b("FragmentBgListSub"))
        {
            dk1.a.a("FragmentBgListSub");
        } else
        if (dk1.a.b("FragmentBgColor"))
        {
            dk1.a.a("FragmentBgColor");
        }
        dk1.a.a(s);
        return;
_L4:
        s = "fragmentEditVideoPopupMusic";
          goto _L2
_L5:
        s = "fragmentEditVideoPopupTime";
          goto _L2
_L6:
        s = ht.b;
          goto _L2
_L7:
        s = "FragmentBgList";
          goto _L2
_L8:
        s = "FragmentBorder";
          goto _L2
        s = "FragmentEditVideoFilter";
          goto _L2
    }

    static View d(dk dk1)
    {
        return dk1.e;
    }

    private boolean d()
    {
        if (c != null && c.i != null)
        {
            return c.i.length > 1;
        } else
        {
            return false;
        }
    }

    private boolean e()
    {
        if (c != null)
        {
            return com.roidapp.videolib.core.e.a(c.Z);
        } else
        {
            return false;
        }
    }

    static boolean e(dk dk1)
    {
        return dk1.e();
    }

    static ng f(dk dk1)
    {
        return dk1.c;
    }

    private void f()
    {
        c.a(true, true);
        ih ih1 = ih.C();
        ig aig[] = ih1.M();
        int i1 = c.p();
        if (aig == null || i1 < 0 || i1 > aig.length)
        {
            return;
        }
        ig ig1 = aig[i1];
        float f1;
        boolean flag;
        if (e())
        {
            f1 = 0.0F;
        } else
        {
            f1 = c.q();
        }
        ih1.a(f1);
        ih1.k(1);
        ih1.j(null);
        ih1.b(aig);
        ih1.i(0);
        ig1.h = i1;
        if (!ih1.ax())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ig1.B = flag;
        a.e = (new ig[] {
            ig1
        });
        ig1.f();
        ih1.a(new ig[] {
            ig1
        });
        a.a(9);
        a.a(9, 0, false);
    }

    static void g(dk dk1)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(dk1.getActivity());
        if (sharedpreferences.getBoolean("video_single_edit_tip", true))
        {
            View view = LayoutInflater.from(dk1.getActivity()).inflate(0x7f0300ed, null);
            if (view != null)
            {
                CheckBox checkbox = (CheckBox)view.findViewById(0x7f0d03c1);
                ((TextView)view.findViewById(0x7f0d03bf)).setText(0x7f07031a);
                view.findViewById(0x7f0d03c0).setOnClickListener(new dq(dk1, checkbox));
                (new android.app.AlertDialog.Builder(dk1.getActivity())).setIcon(0x1080027).setTitle(0x7f0702e7).setView(view).setPositiveButton(0x7f07016b, new ds(dk1, checkbox, sharedpreferences)).setNegativeButton(0x7f07016a, new dr(dk1)).show();
            }
            return;
        } else
        {
            dk1.f();
            return;
        }
    }

    static void h(dk dk1)
    {
        dk1.f();
    }

    static void i(dk dk1)
    {
        dk1.c.a(false, false);
        View view = LayoutInflater.from(dk1.a).inflate(0x7f030133, null);
        if (dk1.a != null)
        {
            dk1.a.a(dk1.a.k);
            dk1.a.a(dk1.a.l);
            dk1.a.k = null;
        }
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(dk1.a)).setTitle(0x7f0701c3).setView(view).setOnCancelListener(new dt(dk1)).create();
        view.findViewById(0x7f0d04de).setOnClickListener(new du(dk1, alertdialog));
        view.findViewById(0x7f0d04df).setOnClickListener(new dv(dk1, alertdialog));
        alertdialog.show();
    }

    static void j(dk dk1)
    {
        if (!dk1.a.isFinishing())
        {
            View view = View.inflate(dk1.a, 0x7f030137, null);
            View view1 = View.inflate(dk1.a, 0x7f030138, null);
            Object obj = (TextView)view1.findViewById(0x7f0d04ed);
            TextView textview = (TextView)view1.findViewById(0x7f0d04ee);
            EditText edittext = (EditText)view.findViewById(0x7f0d04eb);
            CheckBox checkbox = (CheckBox)view.findViewById(0x7f0d04ec);
            boolean flag = PreferenceManager.getDefaultSharedPreferences(dk1.a).getBoolean("show_sign", false);
            if (com.roidapp.baselib.c.n.f())
            {
                ((TextView) (obj)).setTextAppearance(dk1.a, 0x1030117);
            } else
            {
                ((TextView) (obj)).setTextAppearance(dk1.a, 0x1030041);
            }
            checkbox.setChecked(flag);
            obj = PreferenceManager.getDefaultSharedPreferences(dk1.a).getString("sign_text", "");
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "Directed by your name";
            }
            edittext.setText(((CharSequence) (obj)), android.widget.TextView.BufferType.SPANNABLE);
            if (flag)
            {
                edittext.setCursorVisible(true);
                obj = edittext.getText().toString();
                if (((String) (obj)).contains("Directed by ") && ((String) (obj)).length() > 12)
                {
                    edittext.setSelection(12, ((String) (obj)).length());
                }
                (new Timer(true)).schedule(new ec(dk1, edittext), 300L);
            } else
            {
                edittext.setEnabled(false);
            }
            checkbox.setOnClickListener(new ed(dk1, checkbox, edittext));
            obj = (new android.app.AlertDialog.Builder(dk1.getActivity())).setCustomTitle(view1).setView(view).setPositiveButton(0x7f07010f, new ef(dk1, checkbox, edittext)).setNegativeButton(0x7f070049, new ee(dk1)).create();
            ((AlertDialog) (obj)).setOnDismissListener(new eg(dk1));
            ((AlertDialog) (obj)).show();
            edittext.addTextChangedListener(new dm(dk1, textview, ((AlertDialog) (obj)), edittext));
            textview.setText(String.valueOf(140 - edittext.getEditableText().length()));
        }
    }

    static HorizontalScrollViewEx k(dk dk1)
    {
        return dk1.g;
    }

    static void l(dk dk1)
    {
        if (dk1.a == null || dk1.a.isFinishing() || !dk1.isAdded())
        {
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("audio/*");
        try
        {
            dk1.getActivity().startActivityForResult(intent, 43524);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dk dk1)
        {
            dk1.printStackTrace();
        }
    }

    static void m(dk dk1)
    {
        dk1.c.a(false, false);
        Intent intent = new Intent(dk1.a, com/roidapp/photogrid/video/TrackSelector);
        dk1.a.startActivityForResult(intent, 43524);
    }

    static boolean n(dk dk1)
    {
        return dk1.d;
    }

    static void o(dk dk1)
    {
        Object obj1 = LayoutInflater.from(dk1.a).inflate(0x7f030132, null);
        Object obj = LayoutInflater.from(dk1.a).inflate(0x7f0300e9, null);
        obj1 = (new android.app.AlertDialog.Builder(dk1.a)).setCustomTitle(((View) (obj))).setView(((View) (obj1))).setPositiveButton(dk1.getResources().getString(0x7f0701ca), new do(dk1)).setOnCancelListener(new dn(dk1)).show();
        obj = (ImageView)((View) (obj)).findViewById(0x7f0d03b0);
        if (obj != null)
        {
            ((ImageView) (obj)).setOnClickListener(new dp(dk1, ((AlertDialog) (obj1))));
        }
    }

    public final void a()
    {
        boolean flag1 = true;
        a(ei.h, e());
        a(ei.i, e());
        a(ei.g, e());
        a(ei.j, e());
        int i1 = com.roidapp.photogrid.release.ei.d;
        boolean flag;
        if (e() || !d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag);
        i1 = com.roidapp.photogrid.release.ei.a;
        if (!d())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(i1, flag);
    }

    public final void a(boolean flag)
    {
        if (e != a(ei.b))
        {
            e = a(ei.b);
        }
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e.setSelected(flag);
        if (flag)
        {
            try
            {
                b = e.getId();
                return;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_67;
        }
        b = -1;
        return;
    }

    public final boolean b()
    {
        FragmentManager fragmentmanager = a.getSupportFragmentManager();
        if (fragmentmanager.findFragmentByTag("FragmentBgListSub") != null || fragmentmanager.findFragmentByTag("FragmentBgColor") != null)
        {
            by by1 = new by();
            by1.a(true, false, 0);
            a.a(0x7f0d03ec, by1, "FragmentBgList");
        } else
        if (a.k != null && a.a(a.k))
        {
            b = -1;
            if (e != null)
            {
                e.setSelected(false);
                return true;
            }
        } else
        {
            return false;
        }
        return true;
    }

    public final void c()
    {
        if (isAdded())
        {
            Object obj = getActivity();
            Object obj1 = PreferenceManager.getDefaultSharedPreferences(((Context) (obj)));
            if (((SharedPreferences) (obj1)).getBoolean("video_new_preview", false))
            {
                ((SharedPreferences) (obj1)).edit().putBoolean("video_new_preview", false).apply();
                obj1 = a(ei.b);
                if (obj1 != null && c != null)
                {
                    Object obj2 = c.t();
                    if (obj2 != null && isAdded())
                    {
                        obj = new Dialog(getActivity(), 0x7f0b001d);
                        android.view.ViewGroup.LayoutParams layoutparams;
                        int i1;
                        int j1;
                        int k1;
                        try
                        {
                            ((Dialog) (obj)).setContentView(0x7f0300f5);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            ((OutOfMemoryError) (obj)).printStackTrace();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            ((Exception) (obj)).printStackTrace();
                            return;
                        }
                        ((Dialog) (obj)).findViewById(0x7f0d0279).setOnClickListener(new dx(this, ((Dialog) (obj))));
                        layoutparams = ((Dialog) (obj)).findViewById(0x7f0d03d4).getLayoutParams();
                        layoutparams.width = ((android.view.ViewGroup.LayoutParams) (obj2)).width;
                        layoutparams.height = ((android.view.ViewGroup.LayoutParams) (obj2)).height;
                        obj2 = (android.widget.RelativeLayout.LayoutParams)((Dialog) (obj)).findViewById(0x7f0d03d6).getLayoutParams();
                        i1 = ((View) (obj1)).getMeasuredWidth();
                        j1 = ((View) (obj1)).getLeft();
                        obj2.leftMargin = j1;
                        obj2.width = Integer.valueOf(i1).intValue();
                        ((android.widget.RelativeLayout.LayoutParams)((Dialog) (obj)).findViewById(0x7f0d03d7).getLayoutParams()).leftMargin = j1;
                        ((Dialog) (obj)).findViewById(0x7f0d03d8).getLayoutParams().width = Integer.valueOf(i1).intValue();
                        obj1 = ((Dialog) (obj)).findViewById(0x7f0d03ce).getLayoutParams();
                        k1 = Integer.valueOf(i1).intValue() / 10;
                        obj1.width = j1 + k1;
                        ((Dialog) (obj)).findViewById(0x7f0d03cf).getLayoutParams().width = Integer.valueOf(i1).intValue() - k1 * 2;
                        ((Dialog) (obj)).findViewById(0x7f0d03d0).getLayoutParams().width = k1 * 2;
                        ((Dialog) (obj)).findViewById(0x7f0d03d1).getLayoutParams().width = Integer.valueOf(i1).intValue() - k1 * 2;
                        ((Dialog) (obj)).show();
                        return;
                    }
                }
            } else
            {
                a(((Context) (obj)));
                return;
            }
        }
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        c = (ng)a.b;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c1, viewgroup, false);
        layoutinflater.getViewTreeObserver().addOnGlobalLayoutListener(new dl(this, layoutinflater));
        getResources().getDrawable(0x7f020361).setAlpha(255);
        getResources().getDrawable(0x7f020367).setAlpha(255);
        viewgroup = PreferenceManager.getDefaultSharedPreferences(getActivity());
        h = new SparseArray();
        if (com.roidapp.photogrid.release.ng.a(getActivity()))
        {
            h.put(com.roidapp.photogrid.release.ei.a - 1, new eh(this, com.roidapp.photogrid.release.ei.a - 1, 0x7f0703c5, 0x7f0203c1, false));
        }
        h.put(ei.b - 1, new eh(this, ei.b - 1, 0x7f070307, 0x7f0203bb, false));
        h.put(ei.c - 1, new eh(this, ei.c - 1, 0x7f07031b, 0x7f02040a, false));
        h.put(com.roidapp.photogrid.release.ei.d - 1, new eh(this, com.roidapp.photogrid.release.ei.d - 1, 0x7f07031f, 0x7f02040d, false));
        h.put(com.roidapp.photogrid.release.ei.e - 1, new eh(this, com.roidapp.photogrid.release.ei.e - 1, 0x7f07013c, 0x7f020417, false));
        h.put(ei.f - 1, new eh(this, ei.f - 1, 0x7f07015f, 0x7f020578, viewgroup.getBoolean("new_feature_video_entry", true)));
        h.put(ei.g - 1, new eh(this, ei.g - 1, 0x7f070040, 0x7f020364, viewgroup.getBoolean("new_feature_video_blur_entry", true)));
        h.put(ei.h - 1, new eh(this, ei.h - 1, 0x7f070033, 0x7f020361, false));
        h.put(ei.i - 1, new eh(this, ei.i - 1, 0x7f070041, 0x7f020367, false));
        h.put(ei.j - 1, new eh(this, ei.j - 1, 0x7f0702c9, 0x7f0203f5, false));
        g = (HorizontalScrollViewEx)layoutinflater.findViewById(0x7f0d031a);
        g.a(new dw(this));
        if (a.B && b == -1 && PhotoGridActivity.j() >= 2)
        {
            a.a(0x7f0d03ec, new hh(), com.roidapp.photogrid.release.hh.a);
            e = a(com.roidapp.photogrid.release.ei.a);
            if (e != null)
            {
                e.setSelected(true);
                b = e.getId();
            }
            a.B = false;
        }
        g.a(new ea(this));
        d = viewgroup.getBoolean("music_policy", true);
        g.getViewTreeObserver().addOnGlobalLayoutListener(new eb(this));
        a();
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        if (g != null)
        {
            g.b();
            g = null;
        }
    }
}
