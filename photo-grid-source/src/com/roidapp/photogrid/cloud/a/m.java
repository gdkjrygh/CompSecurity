// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.ads.b;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            l, t

public final class m extends l
{

    private CharSequence a;
    private boolean b;

    public m(Context context, t t)
    {
        super(context, 4, t);
        if (com.roidapp.photogrid.a.m.a(context) == 1)
        {
            f = true;
        } else
        {
            f = n.a(context, "com.commsource.beautyplus");
        }
        t = Locale.getDefault().getCountry();
        if (!"ID".equals(t)) goto _L2; else goto _L1
_L1:
        a = "Lebih mulus, lebih cerah, dan lebih cantik! BeautyPlus\u2014\u2014penyempurna otomatis kecantikan Anda dalam satu ketuk.";
_L8:
        if (a != null) goto _L4; else goto _L3
_L3:
        f = true;
_L6:
        return;
_L2:
        if ("MY".equals(t))
        {
            a = "Lebih licin, lebih cerah dan lebih cantik! BeautyPlus\u2014\u2014penambah kecantikan auto magik anda dalam satu ketik.";
        } else
        if ("PH".equals(t))
        {
            a = "Mas makinis, mas makinang at mas maganda! BeautyPlus\u2014\u2014ang iyong magic na auto beauty enhancer sa isang tap lang.";
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (Math.random() >= (double)com.roidapp.cloudlib.a.a.a(context).b("ad", "beautyPlusRatio")) goto _L6; else goto _L5
_L5:
        f = true;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        if (f || layoutinflater == null)
        {
            return null;
        }
        if (view != null && !(view.getTag() instanceof m))
        {
            view = null;
        }
        if (view == null)
        {
            view = layoutinflater.inflate(0x7f030010, viewgroup, false);
        }
        if (view != null)
        {
            view.setVisibility(0);
            layoutinflater = (TextView)view.findViewById(0x7f0d006d);
            if (layoutinflater != null)
            {
                layoutinflater.setText(a);
            }
            layoutinflater = (ImageView)view.findViewById(0x7f0d006b);
            if (layoutinflater != null)
            {
                n.a(layoutinflater, 0x7f020342);
            }
            view.setOnClickListener(this);
            view.findViewById(0x7f0d006c).setVisibility(8);
            view.setTag(this);
        }
        if (!b)
        {
            b = true;
        }
        return view;
    }

    public final void onClick(View view)
    {
        if (d != null)
        {
            com.roidapp.cloudlib.ads.b.a(d, "http://app.appsflyer.com/com.commsource.beautyplus?pid=photogrid");
        }
        super.onClick(view);
    }
}
