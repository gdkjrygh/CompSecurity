// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, PhotoView, ra, ao, 
//            hd, he, hf, hg

public final class hc extends Fragment
{

    private PhotoGridActivity a;
    private SharedPreferences b;
    private TextView c;
    private TextView d;
    private TextView e;

    public hc()
    {
    }

    private void a()
    {
        Drawable drawable;
        Drawable drawable1;
        ao ao1;
        drawable = a.getResources().getDrawable(0x7f02039c);
        drawable1 = a.getResources().getDrawable(0x7f02039e);
        ao1 = a.O().g();
        if (ao1 == null || !(ao1 instanceof ra) || ao1.x) goto _L2; else goto _L1
_L1:
        if (!ao1.y || !ao1.z) goto _L4; else goto _L3
_L3:
        drawable.setAlpha(50);
        c.setTextColor(a.getResources().getColor(0x7f0c00c0));
        drawable1.setAlpha(50);
        d.setTextColor(a.getResources().getColor(0x7f0c00c0));
_L6:
        c.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        d.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
_L2:
        return;
_L4:
        if (ao1.y)
        {
            drawable.setAlpha(255);
            c.setTextColor(a.getResources().getColor(0x7f0c00bf));
            drawable1.setAlpha(50);
            d.setTextColor(a.getResources().getColor(0x7f0c00c0));
        }
        if (ao1.z)
        {
            drawable.setAlpha(50);
            c.setTextColor(a.getResources().getColor(0x7f0c00c0));
            drawable1.setAlpha(255);
            d.setTextColor(a.getResources().getColor(0x7f0c00bf));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(hc hc1)
    {
        ao ao1;
        com.roidapp.photogrid.common.b.a("DropText");
        ao1 = hc1.a.O().g();
        if (ao1 == null || !(ao1 instanceof ra) || ao1.x) goto _L2; else goto _L1
_L1:
        if (!ao1.z)
        {
            hc1.a.O().d(ao1);
        } else
        {
            an.a(new WeakReference(hc1.a), hc1.getString(0x7f07002c));
        }
_L4:
        hc1.a();
        return;
_L2:
        if (ao1 != null && (ao1 instanceof ra) && ao1.x)
        {
            an.a(new WeakReference(hc1.a), hc1.getString(0x7f0702fd));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(hc hc1)
    {
        ao ao1;
        com.roidapp.photogrid.common.b.a("RiseText");
        ao1 = hc1.a.O().g();
        if (ao1 == null || !(ao1 instanceof ra) || ao1.x) goto _L2; else goto _L1
_L1:
        if (!ao1.y)
        {
            hc1.a.O().b(ao1);
        } else
        {
            an.a(new WeakReference(hc1.a), hc1.getString(0x7f07002d));
        }
_L4:
        hc1.a();
        return;
_L2:
        if (ao1 != null && (ao1 instanceof ra) && ao1.x)
        {
            an.a(new WeakReference(hc1.a), hc1.getString(0x7f0702fd));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void c(hc hc1)
    {
        Drawable drawable = hc1.a.getResources().getDrawable(0x7f02039c);
        Drawable drawable1 = hc1.a.getResources().getDrawable(0x7f02039e);
        ao ao1 = hc1.a.O().g();
        if (ao1 != null && (ao1 instanceof ra))
        {
            hc1.a.O().c(ao1);
            if (ao1.x)
            {
                com.roidapp.photogrid.common.b.a("UnlockText");
                hc1.e.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203b4, 0, 0);
                hc1.e.setText(hc1.a.getResources().getString(0x7f0701a4));
                ao1.x = false;
                if (!ao1.z)
                {
                    drawable.setAlpha(255);
                    hc1.c.setTextColor(hc1.a.getResources().getColor(0x7f0c00bf));
                }
                if (!ao1.y)
                {
                    drawable1.setAlpha(255);
                    hc1.d.setTextColor(hc1.a.getResources().getColor(0x7f0c00bf));
                }
            } else
            {
                com.roidapp.photogrid.common.b.a("LockText");
                hc1.e.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020413, 0, 0);
                hc1.e.setText(hc1.a.getResources().getString(0x7f0702fc));
                ao1.x = true;
                drawable.setAlpha(50);
                hc1.c.setTextColor(hc1.a.getResources().getColor(0x7f0c00c0));
                drawable1.setAlpha(50);
                hc1.d.setTextColor(hc1.a.getResources().getColor(0x7f0c00c0));
            }
            hc1.c.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            hc1.d.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        }
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        b = activity.getSharedPreferences(activity.getPackageName(), 0);
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ao ao1;
        layoutinflater = layoutinflater.inflate(0x7f0300c0, null);
        layoutinflater.setOnClickListener(new hd(this));
        c = (TextView)layoutinflater.findViewById(0x7f0d0317);
        c.setOnClickListener(new he(this));
        d = (TextView)layoutinflater.findViewById(0x7f0d0318);
        d.setOnClickListener(new hf(this));
        e = (TextView)layoutinflater.findViewById(0x7f0d0319);
        e.setOnClickListener(new hg(this));
        viewgroup = a.getResources().getDrawable(0x7f02039c);
        bundle = a.getResources().getDrawable(0x7f02039e);
        ao1 = a.O().g();
        if (ao1 == null || !(ao1 instanceof ra)) goto _L2; else goto _L1
_L1:
        if (!ao1.x) goto _L4; else goto _L3
_L3:
        e.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020413, 0, 0);
        e.setText(a.getResources().getString(0x7f0702fc));
        viewgroup.setAlpha(50);
        c.setTextColor(a.getResources().getColor(0x7f0c00c0));
        bundle.setAlpha(50);
        d.setTextColor(a.getResources().getColor(0x7f0c00c0));
_L6:
        c.setCompoundDrawablesWithIntrinsicBounds(null, viewgroup, null, null);
        d.setCompoundDrawablesWithIntrinsicBounds(null, bundle, null, null);
_L2:
        a();
        return layoutinflater;
_L4:
        e.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203b4, 0, 0);
        e.setText(a.getResources().getString(0x7f0701a4));
        if (!ao1.z)
        {
            viewgroup.setAlpha(255);
            c.setTextColor(a.getResources().getColor(0x7f0c00bf));
        }
        if (!ao1.y)
        {
            bundle.setAlpha(255);
            d.setTextColor(a.getResources().getColor(0x7f0c00bf));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
