// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.AdjustFilter;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.widget.AdjustImageView;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a

public class d extends com.aviary.android.feather.sdk.panels.a
    implements android.view.View.OnClickListener, com.aviary.android.feather.sdk.widget.AdjustImageView.b
{

    boolean s;
    private AviaryHighlightImageButton t;
    private AviaryHighlightImageButton u;
    private AviaryHighlightImageButton v;
    private AviaryHighlightImageButton w;
    private AdjustImageView x;

    public d(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1, com.aviary.android.feather.library.filters.a.a a2)
    {
        super(iaviarycontroller, a1);
        k = com.aviary.android.feather.library.filters.a.d(a2);
    }

    public void A()
    {
        x.setOnResetListener(null);
        t.setOnClickListener(null);
        u.setOnClickListener(null);
        v.setOnClickListener(null);
        w.setOnClickListener(null);
        super.A();
    }

    protected void F()
    {
        int i = (int)x.getCurrentRotation();
        double d1 = x.getStraightenAngle();
        boolean flag = x.getHorizontalFlip();
        boolean flag1 = x.getVerticalFlip();
        double d2 = 1.0D / x.getGrowthFactor();
        AdjustFilter adjustfilter = (AdjustFilter)k;
        adjustfilter.a(flag, flag1);
        adjustfilter.b(i);
        adjustfilter.a(d1, d2, d2);
        Bitmap bitmap;
        try
        {
            bitmap = adjustfilter.b(g, null, 1, 1);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            a(jsonexception);
            return;
        }
        x.setImageBitmap(bitmap);
        e.a(adjustfilter.a());
        e.a(new c(Integer.valueOf(0)));
        b(bitmap);
    }

    public void a()
    {
        B().e();
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        x = (AdjustImageView)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_overlay);
        bitmap = f();
        t = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.aviary_button1);
        u = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.aviary_button2);
        v = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.aviary_button3);
        w = (AviaryHighlightImageButton)bitmap.findViewById(com.aviary.android.feather.sdk.R.id.aviary_button4);
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_adjust, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_adjust, viewgroup, false);
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void onClick(View view)
    {
        if (n() && m())
        {
            int i = view.getId();
            if (i == com.aviary.android.feather.sdk.R.id.aviary_button1)
            {
                x.a(false);
                return;
            }
            if (i == com.aviary.android.feather.sdk.R.id.aviary_button2)
            {
                x.a(true);
                return;
            }
            if (i == com.aviary.android.feather.sdk.R.id.aviary_button3)
            {
                x.b(true);
                return;
            }
            if (i == com.aviary.android.feather.sdk.R.id.aviary_button4)
            {
                x.b(false);
                return;
            }
        }
    }

    public boolean v()
    {
        if (s)
        {
            return true;
        }
        s = true;
        a(false);
        int i = (int)x.getCurrentRotation();
        boolean flag = x.getHorizontalFlip();
        boolean flag1 = x.getVerticalFlip();
        boolean flag2 = x.getStraightenStarted();
        double d1 = x.getStraightenAngle();
        if (i != 0 || flag || flag1 || flag2 && d1 != 0.0D)
        {
            x.c();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean x()
    {
        boolean flag = x.getStraightenStarted();
        int i = (int)x.getCurrentRotation();
        int j = x.getFlipType();
        return i != 0 || j != com.aviary.android.feather.sdk.widget.AdjustImageView.a.a.d || flag;
    }

    public void y()
    {
        x.setImageBitmap(null);
        super.y();
    }

    public void z()
    {
        super.z();
        x.setImageBitmap(g);
        x.setOnResetListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        d();
    }
}
