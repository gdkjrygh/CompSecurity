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
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, PhotoView, qz, ao, 
//            cs

public final class fn extends Fragment
    implements android.view.View.OnClickListener
{

    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private PhotoGridActivity g;

    public fn()
    {
    }

    private void b()
    {
        Object obj;
        if (g != null)
        {
            if ((obj = g.O()) != null)
            {
                int i = ((PhotoView) (obj)).k();
                obj = g.getResources().getDrawable(0x7f020378);
                if (i >= 15)
                {
                    ((Drawable) (obj)).setAlpha(50);
                    f.setTextColor(g.getResources().getColor(0x7f0c00c0));
                } else
                {
                    ((Drawable) (obj)).setAlpha(255);
                    f.setTextColor(g.getResources().getColor(0x7f0c00bf));
                }
                f.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                return;
            }
        }
    }

    private void c()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = g.O()) == null) goto _L1; else goto _L3
_L3:
        Drawable drawable;
        Drawable drawable1;
        drawable = g.getResources().getDrawable(0x7f02039c);
        drawable1 = g.getResources().getDrawable(0x7f02039e);
        obj = ((PhotoView) (obj)).g();
        if (obj == null || !(obj instanceof qz)) goto _L1; else goto _L4
_L4:
        if (!((ao) (obj)).x) goto _L6; else goto _L5
_L5:
        d.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020413, 0, 0);
        d.setText(g.getResources().getString(0x7f0702fc));
        drawable.setAlpha(50);
        b.setTextColor(g.getResources().getColor(0x7f0c00c0));
        drawable1.setAlpha(50);
        c.setTextColor(g.getResources().getColor(0x7f0c00c0));
_L8:
        b.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        c.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        return;
_L6:
        d.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203b4, 0, 0);
        d.setText(g.getResources().getString(0x7f0701a4));
        if (!((ao) (obj)).z)
        {
            drawable.setAlpha(255);
            b.setTextColor(g.getResources().getColor(0x7f0c00bf));
        }
        if (!((ao) (obj)).y)
        {
            drawable1.setAlpha(255);
            c.setTextColor(g.getResources().getColor(0x7f0c00bf));
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void d()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = g.O()) == null) goto _L1; else goto _L3
_L3:
        Drawable drawable;
        Drawable drawable1;
        drawable = g.getResources().getDrawable(0x7f02039c);
        drawable1 = g.getResources().getDrawable(0x7f02039e);
        obj = ((PhotoView) (obj)).g();
        if (obj == null || !(obj instanceof qz) || ((ao) (obj)).x) goto _L1; else goto _L4
_L4:
        if (!((ao) (obj)).y || !((ao) (obj)).z) goto _L6; else goto _L5
_L5:
        drawable.setAlpha(50);
        b.setTextColor(g.getResources().getColor(0x7f0c00c0));
        drawable1.setAlpha(50);
        c.setTextColor(g.getResources().getColor(0x7f0c00c0));
_L8:
        b.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        c.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        return;
_L6:
        if (((ao) (obj)).y)
        {
            drawable.setAlpha(255);
            b.setTextColor(g.getResources().getColor(0x7f0c00bf));
            drawable1.setAlpha(50);
            c.setTextColor(g.getResources().getColor(0x7f0c00c0));
        }
        if (((ao) (obj)).z)
        {
            drawable.setAlpha(50);
            b.setTextColor(g.getResources().getColor(0x7f0c00c0));
            drawable1.setAlpha(255);
            c.setTextColor(g.getResources().getColor(0x7f0c00bf));
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void a()
    {
        PhotoView photoview;
        if (g != null && !g.isFinishing())
        {
            if ((photoview = g.O()) != null)
            {
                photoview.a();
                photoview.a = false;
                return;
            }
        }
    }

    public final void onAttach(Activity activity)
    {
        g = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = g.O()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131559153: 
            break; /* Loop/switch isn't completed */

        case 2131559122: 
            a();
            if (g != null && !g.isFinishing())
            {
                g.a("FragmentSticker");
                view = new cs();
                g.a(0x7f0d028d, view, "FragmentBottomMain");
                return;
            }
            break;

        case 2131559150: 
            com.roidapp.photogrid.common.b.a("RiseSticker");
            if (g != null)
            {
                view = g.O();
                if (view != null)
                {
                    obj = view.g();
                    if (obj != null && (obj instanceof qz) && !((ao) (obj)).x)
                    {
                        if (!((ao) (obj)).y)
                        {
                            view.b(((ao) (obj)));
                        } else
                        {
                            an.a(new WeakReference(g), getString(0x7f07002d));
                        }
                    } else
                    if (obj != null && (obj instanceof qz) && ((ao) (obj)).x)
                    {
                        an.a(new WeakReference(g), getString(0x7f0702fd));
                    }
                    d();
                    return;
                }
            }
            break;

        case 2131559149: 
            com.roidapp.photogrid.common.b.a("DropSticker");
            if (g != null)
            {
                view = g.O();
                if (view != null)
                {
                    obj = view.g();
                    if (obj != null && (obj instanceof qz) && !((ao) (obj)).x)
                    {
                        if (!((ao) (obj)).z)
                        {
                            view.d(((ao) (obj)));
                        } else
                        {
                            an.a(new WeakReference(g), getString(0x7f07002c));
                        }
                    } else
                    if (obj != null && (obj instanceof qz) && ((ao) (obj)).x)
                    {
                        an.a(new WeakReference(g), getString(0x7f0702fd));
                    }
                    d();
                    return;
                }
            }
            break;

        case 2131559151: 
            if (g != null)
            {
                view = g.O();
                if (view != null)
                {
                    obj = g.getResources().getDrawable(0x7f02039c);
                    Drawable drawable = g.getResources().getDrawable(0x7f02039e);
                    ao ao1 = view.g();
                    if (ao1 != null && (ao1 instanceof qz))
                    {
                        view.c(ao1);
                        if (ao1.x)
                        {
                            com.roidapp.photogrid.common.b.a("UnLockSticker");
                            d.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203b4, 0, 0);
                            d.setText(g.getResources().getString(0x7f0701a4));
                            ao1.x = false;
                            if (!ao1.z)
                            {
                                ((Drawable) (obj)).setAlpha(255);
                                b.setTextColor(g.getResources().getColor(0x7f0c00bf));
                            }
                            if (!ao1.y)
                            {
                                drawable.setAlpha(255);
                                c.setTextColor(g.getResources().getColor(0x7f0c00bf));
                            }
                        } else
                        {
                            com.roidapp.photogrid.common.b.a("LockSticker");
                            d.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020413, 0, 0);
                            d.setText(g.getResources().getString(0x7f0702fc));
                            ao1.x = true;
                            ((Drawable) (obj)).setAlpha(50);
                            b.setTextColor(g.getResources().getColor(0x7f0c00c0));
                            drawable.setAlpha(50);
                            c.setTextColor(g.getResources().getColor(0x7f0c00c0));
                        }
                        b.setCompoundDrawablesWithIntrinsicBounds(null, ((Drawable) (obj)), null, null);
                        c.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
                        return;
                    }
                }
            }
            break;

        case 2131559152: 
            if (g != null)
            {
                view = g.O();
                if (view != null)
                {
                    com.roidapp.photogrid.common.b.a("FlipSticker");
                    obj = view.g();
                    if (obj != null && (obj instanceof qz))
                    {
                        obj = (qz)obj;
                        obj.P = -((qz) (obj)).P;
                        view.invalidate();
                        return;
                    }
                }
            }
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (obj != null && ((PhotoView) (obj)).k() < 15)
        {
            if (g != null)
            {
                view = g.O();
                if (view != null && view.k() < 15)
                {
                    com.roidapp.photogrid.common.b.a("CopySticker");
                    Object obj1 = view.g();
                    if (obj1 != null && (obj1 instanceof qz))
                    {
                        obj1 = (qz)((ao) (obj1)).a(g);
                        ((qz) (obj1)).b(20F, 20F);
                        try
                        {
                            ((qz) (obj1)).g();
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view)
                        {
                            view.printStackTrace();
                            return;
                        }
                        view.a(((ao) (obj1)));
                        if (view.k() >= 15)
                        {
                            b();
                        }
                        view.b(((ao) (obj1)));
                        c();
                        d();
                        view.invalidate();
                        return;
                    }
                }
            }
        } else
        {
            an.a(new WeakReference(g), getString(0x7f07004b));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ba, null);
        b = (TextView)layoutinflater.findViewById(0x7f0d02ed);
        c = (TextView)layoutinflater.findViewById(0x7f0d02ee);
        d = (TextView)layoutinflater.findViewById(0x7f0d02ef);
        a = (ImageView)layoutinflater.findViewById(0x7f0d02d2);
        e = (TextView)layoutinflater.findViewById(0x7f0d02f0);
        f = (TextView)layoutinflater.findViewById(0x7f0d02f1);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        a.setOnClickListener(this);
        c();
        b();
        d();
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
    }
}
