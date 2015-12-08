// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, PhotoView, ps, ao, 
//            cs

public final class db extends Fragment
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
    private TextView i;
    private LinearLayout j;
    private PhotoGridActivity k;
    private boolean l;

    public db()
    {
    }

    public final void a()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = k.O()) == null) goto _L1; else goto _L3
_L3:
        Drawable drawable;
        Drawable drawable1;
        drawable = k.getResources().getDrawable(0x7f02039c);
        drawable1 = k.getResources().getDrawable(0x7f02039e);
        obj = ((PhotoView) (obj)).g();
        if (obj == null || !(obj instanceof ps)) goto _L1; else goto _L4
_L4:
        if (!((ao) (obj)).x) goto _L6; else goto _L5
_L5:
        h.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020413, 0, 0);
        h.setText(k.getResources().getString(0x7f0702fc));
        drawable.setAlpha(50);
        f.setTextColor(k.getResources().getColor(0x7f0c00c0));
        drawable1.setAlpha(50);
        g.setTextColor(k.getResources().getColor(0x7f0c00c0));
_L8:
        f.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        g.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        return;
_L6:
        h.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203b4, 0, 0);
        h.setText(k.getResources().getString(0x7f0701a4));
        if (!((ao) (obj)).z)
        {
            drawable.setAlpha(255);
            f.setTextColor(k.getResources().getColor(0x7f0c00bf));
        }
        if (!((ao) (obj)).y)
        {
            drawable1.setAlpha(255);
            g.setTextColor(k.getResources().getColor(0x7f0c00bf));
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = k.O()) == null) goto _L1; else goto _L3
_L3:
        Drawable drawable;
        Drawable drawable1;
        drawable = k.getResources().getDrawable(0x7f02039c);
        drawable1 = k.getResources().getDrawable(0x7f02039e);
        obj = ((PhotoView) (obj)).g();
        if (obj == null || !(obj instanceof ps) || ((ao) (obj)).x) goto _L1; else goto _L4
_L4:
        if (!((ao) (obj)).y || !((ao) (obj)).z) goto _L6; else goto _L5
_L5:
        drawable.setAlpha(50);
        f.setTextColor(k.getResources().getColor(0x7f0c00c0));
        drawable1.setAlpha(50);
        g.setTextColor(k.getResources().getColor(0x7f0c00c0));
_L8:
        f.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        g.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        return;
_L6:
        if (((ao) (obj)).y)
        {
            drawable.setAlpha(255);
            f.setTextColor(k.getResources().getColor(0x7f0c00bf));
            drawable1.setAlpha(50);
            g.setTextColor(k.getResources().getColor(0x7f0c00c0));
        }
        if (((ao) (obj)).z)
        {
            drawable.setAlpha(50);
            f.setTextColor(k.getResources().getColor(0x7f0c00c0));
            drawable1.setAlpha(255);
            g.setTextColor(k.getResources().getColor(0x7f0c00bf));
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean c()
    {
        return l;
    }

    public final void onAttach(Activity activity)
    {
        k = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
_L2:
        return;
        if (k == null || k.O() == null) goto _L2; else goto _L1
_L1:
        switch (view.getId())
        {
        case 2131559226: 
        case 2131559227: 
        case 2131559229: 
        case 2131559230: 
        case 2131559232: 
        case 2131559233: 
        case 2131559235: 
        case 2131559236: 
        case 2131559238: 
        default:
            return;

        case 2131559225: 
            if (k != null && !k.isFinishing())
            {
                k.O().a();
            }
            if (k != null && !k.isFinishing())
            {
                k.a("FragmentFreeEdit");
                view = new cs();
                k.a(0x7f0d028d, view, "FragmentBottomMain");
                return;
            }
            break;

        case 2131559231: 
            view = k;
            com.roidapp.baselib.gl.c.a();
            if (com.roidapp.baselib.gl.c.b(view))
            {
                com.roidapp.photogrid.common.b.a("FreeActivity/banner/Filter");
                k.a(k.O().l(), 0, 0);
                return;
            } else
            {
                com.roidapp.photogrid.common.b.a("FreeActivity/banner/Crop");
                k.a(k.O().l(), 1, 0);
                return;
            }

        case 2131559228: 
            com.roidapp.photogrid.common.b.a("FreeActivity/banner/Crop");
            k.a(k.O().l(), 1, 0);
            return;

        case 2131559237: 
            com.roidapp.photogrid.common.b.a("FreeActivity/banner/FreeCrop");
            k.b(1, k.O().l());
            return;

        case 2131559240: 
            if (k != null)
            {
                view = k.O();
                if (view != null)
                {
                    com.roidapp.photogrid.common.b.a("DropPic");
                    view = view.g();
                    if (view != null && (view instanceof ps) && !((ao) (view)).x)
                    {
                        if (!((ao) (view)).z)
                        {
                            k.O().d(view);
                        } else
                        {
                            an.a(new WeakReference(k), getString(0x7f07002c));
                        }
                    } else
                    if (view != null && (view instanceof ps) && ((ao) (view)).x)
                    {
                        an.a(new WeakReference(k), getString(0x7f0702fd));
                    }
                    b();
                    return;
                }
            }
            break;

        case 2131559241: 
            if (k != null)
            {
                view = k.O();
                if (view != null)
                {
                    com.roidapp.photogrid.common.b.a("RisePic");
                    view = view.g();
                    if (view != null && (view instanceof ps) && !((ao) (view)).x)
                    {
                        if (!((ao) (view)).y)
                        {
                            k.O().b(view);
                        } else
                        {
                            an.a(new WeakReference(k), getString(0x7f07002d));
                        }
                    } else
                    if (view != null && (view instanceof ps) && ((ao) (view)).x)
                    {
                        an.a(new WeakReference(k), getString(0x7f0702fd));
                    }
                    b();
                    return;
                }
            }
            break;

        case 2131559242: 
            if (k != null)
            {
                Object obj = k.O();
                if (obj != null)
                {
                    view = k.getResources().getDrawable(0x7f02039c);
                    Drawable drawable = k.getResources().getDrawable(0x7f02039e);
                    obj = ((PhotoView) (obj)).g();
                    if (obj != null && (obj instanceof ps))
                    {
                        k.O().c(((ao) (obj)));
                        if (((ao) (obj)).x)
                        {
                            com.roidapp.photogrid.common.b.a("UnlockPic");
                            h.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203b4, 0, 0);
                            h.setText(k.getResources().getString(0x7f0701a4));
                            obj.x = false;
                            if (!((ao) (obj)).z)
                            {
                                view.setAlpha(255);
                                f.setTextColor(k.getResources().getColor(0x7f0c00bf));
                            }
                            if (!((ao) (obj)).y)
                            {
                                drawable.setAlpha(255);
                                g.setTextColor(k.getResources().getColor(0x7f0c00bf));
                            }
                        } else
                        {
                            com.roidapp.photogrid.common.b.a("LockPic");
                            h.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020413, 0, 0);
                            h.setText(k.getResources().getString(0x7f0702fc));
                            obj.x = true;
                            view.setAlpha(50);
                            f.setTextColor(k.getResources().getColor(0x7f0c00c0));
                            drawable.setAlpha(50);
                            g.setTextColor(k.getResources().getColor(0x7f0c00c0));
                        }
                        f.setCompoundDrawablesWithIntrinsicBounds(null, view, null, null);
                        g.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
                        return;
                    }
                }
            }
            break;

        case 2131559239: 
            if (k != null)
            {
                view = k.O();
                if (view != null)
                {
                    com.roidapp.photogrid.common.b.a("FlipPic");
                    view = view.g();
                    if (view != null && (view instanceof ps))
                    {
                        view = (ps)view;
                        view.K = -((ps) (view)).K;
                        k.O().invalidate();
                        return;
                    }
                }
            }
            break;

        case 2131559234: 
            k.a(k.O().l(), 0);
            return;
        }
        if (true) goto _L2; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300cc, null);
        j = (LinearLayout)layoutinflater.findViewById(0x7f0d033a);
        a = (ImageView)layoutinflater.findViewById(0x7f0d0339);
        b = (TextView)layoutinflater.findViewById(0x7f0d033f);
        c = (TextView)layoutinflater.findViewById(0x7f0d033c);
        i = (TextView)layoutinflater.findViewById(0x7f0d0345);
        f = (TextView)layoutinflater.findViewById(0x7f0d0348);
        g = (TextView)layoutinflater.findViewById(0x7f0d0349);
        h = (TextView)layoutinflater.findViewById(0x7f0d034a);
        e = (TextView)layoutinflater.findViewById(0x7f0d0347);
        viewgroup = k;
        com.roidapp.baselib.gl.c.a();
        if (!com.roidapp.baselib.gl.c.b(viewgroup))
        {
            ((RelativeLayout)layoutinflater.findViewById(0x7f0d033e)).setVisibility(8);
        }
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        i.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        e.setOnClickListener(this);
        a();
        b();
        if (com.roidapp.baselib.gl.c.a().e(getActivity()))
        {
            d = (TextView)layoutinflater.findViewById(0x7f0d0342);
            d.setOnClickListener(this);
        } else
        {
            ((RelativeLayout)layoutinflater.findViewById(0x7f0d0341)).setVisibility(8);
        }
        viewgroup = j;
        bundle = new TranslateAnimation(1, -0.2F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        bundle.setDuration(300L);
        viewgroup.startAnimation(bundle);
        return layoutinflater;
    }
}
