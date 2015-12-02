// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.common.w.o;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.widget.f;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.zero.ui:
//            a, CarrierBottomBannerData, b, c

public class CarrierBottomBanner extends f
{

    private c a;
    private final Resources b;
    private final TextView c;
    private final TextView d;
    private final Button e;

    public CarrierBottomBanner(Context context)
    {
        this(context, null);
    }

    public CarrierBottomBanner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CarrierBottomBanner(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = (Resources)t.a(context).a(android/content/res/Resources);
        setContentView(k.carrier_bottom_banner);
        c = (TextView)findViewById(i.carrier_bottom_banner_title);
        d = (TextView)findViewById(i.carrier_bottom_banner_content);
        e = (Button)findViewById(i.carrier_bottom_banner_close);
        e.setOnClickListener(new a(this));
    }

    static c a(CarrierBottomBanner carrierbottombanner)
    {
        return carrierbottombanner.a;
    }

    public void setBottomBannerData(CarrierBottomBannerData carrierbottombannerdata)
    {
        Object obj = carrierbottombannerdata.getActionUrl();
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new b(this, ((String) (obj))));
        obj = new o(b);
        ((o) (obj)).a(com.facebook.o.zero_bottom_banner_content);
        ((o) (obj)).a("[[content]]", carrierbottombannerdata.getContent(), null, 33);
        ((o) (obj)).a("[[cta]]", carrierbottombannerdata.getActionTitle(), customurllikespan, 33);
        c.setText(carrierbottombannerdata.getTitle());
        d.setText(((o) (obj)).b());
        d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setListener(c c1)
    {
        a = c1;
    }
}
