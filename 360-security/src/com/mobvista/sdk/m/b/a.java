// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mobvista.sdk.m.a.d.a.d;
import com.mobvista.sdk.m.a.d.a.k;
import com.mobvista.sdk.m.a.f.j;
import com.mobvista.sdk.m.core.entity.CampaignEx;

// Referenced classes of package com.mobvista.sdk.m.b:
//            c, b

public final class a extends Dialog
{

    private CampaignEx a;
    private RelativeLayout b;
    private Context c;
    private ImageView d;
    private k e;

    public a(Context context, CampaignEx campaignex)
    {
        super(context, 0x1030005);
        setOwnerActivity((Activity)context);
        a = campaignex;
        c = context;
        e = k.a(context);
    }

    private View a()
    {
        if (b == null)
        {
            b = new RelativeLayout(c);
            RelativeLayout relativelayout = new RelativeLayout(c);
            int i = j.a(c, 15F);
            relativelayout.setPadding(i, i, i, i);
            relativelayout.setBackgroundDrawable(e.a("bg_loading_camera.jpg"));
            Object obj = new TextView(c);
            ((TextView) (obj)).setBackgroundDrawable(e.a("img_camera_title.png"));
            relativelayout.addView(((View) (obj)), new android.widget.RelativeLayout.LayoutParams(j.a(c, 140F), j.a(c, 31.5F)));
            d = new ImageView(c);
            d.setId(j.a());
            d.setTag(a.getIconUrl());
            if (a != null)
            {
                com.mobvista.sdk.m.a.d.a.d.a().a(a.getIconUrl(), new c(this));
            }
            i = j.a(c, 64F);
            obj = new android.widget.RelativeLayout.LayoutParams(i, i);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13, -1);
            relativelayout.addView(d, ((android.view.ViewGroup.LayoutParams) (obj)));
            obj = new TextView(c);
            ((TextView) (obj)).setSingleLine();
            ((TextView) (obj)).setTextColor(-1);
            ((TextView) (obj)).setTextSize(16F);
            ((TextView) (obj)).setText("Relax while loading....");
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(3, d.getId());
            layoutparams.addRule(14, -1);
            relativelayout.addView(((View) (obj)), layoutparams);
            b.addView(relativelayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        return b;
    }

    static ImageView a(a a1)
    {
        return a1.d;
    }

    public final void a(CampaignEx campaignex)
    {
        if (d != null && campaignex != null)
        {
            d.setImageBitmap(null);
            d.setTag(campaignex.getIconUrl());
            com.mobvista.sdk.m.a.d.a.d.a().a(campaignex.getIconUrl(), new b(this));
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(a());
    }
}
