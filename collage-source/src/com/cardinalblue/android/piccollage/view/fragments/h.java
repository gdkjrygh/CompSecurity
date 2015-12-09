// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

public abstract class h extends i
    implements android.support.v4.widget.CBSwipeRefreshLayout.OnRefreshListener
{

    protected String a;

    public h()
    {
    }

    private void k()
    {
        Object obj = getActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        ((Display) (obj)).getSize(point);
        int j = point.x;
        int l = point.y;
        float f1 = 0.0F;
        obj = new TypedValue();
        if (getActivity().getTheme().resolveAttribute(0x10102eb, ((TypedValue) (obj)), true))
        {
            f1 = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj)).data, getResources().getDisplayMetrics());
        }
        float f2 = getResources().getDimension(0x7f0b017b);
        float f3 = getResources().getDimension(0x7f0b0176);
        l = (int)((float)l - (f1 + f3 + f2));
        g.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(j, l));
    }

    protected View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(0x7f0300cf, viewgroup, false);
    }

    protected d a(CBCollagesResponse cbcollagesresponse)
    {
        return new d(getActivity(), cbcollagesresponse, 0x7f03008c, getResources().getInteger(0x7f09001f));
    }

    public void a(String s)
    {
        if (a != null && a.equals(s))
        {
            return;
        }
        a = s;
        if (TextUtils.isEmpty(a))
        {
            d();
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (TextUtils.isEmpty(a))
        {
            com.cardinalblue.android.b.k.a(getActivity(), 0x7f0700f8, 1);
            return;
        } else
        {
            super.a(flag);
            return;
        }
    }

    protected boolean a(Exception exception)
    {
        if (exception instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
        {
            f.a(exception);
            return true;
        }
        if (exception instanceof com.cardinalblue.android.piccollage.controller.network.f.b)
        {
            com.cardinalblue.android.b.k.a(getActivity(), 0x7f07013f, 0);
            return true;
        } else
        {
            return false;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            a = bundle.getString("user_id");
        } else
        {
            bundle = getArguments();
            if (bundle != null)
            {
                a = bundle.getString("user_id");
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        k();
        return layoutinflater;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("user_id", a);
    }

    public void onStart()
    {
        super.onStart();
        if (!TextUtils.isEmpty(a))
        {
            a(true);
            return;
        } else
        {
            d();
            return;
        }
    }
}
