// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.net.Uri;
import com.vungle.publisher.bi;

// Referenced classes of package com.vungle.publisher.db.model:
//            Viewable

public abstract class Video extends Viewable
{

    public Float e;
    public Integer f;
    public Integer g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Integer l;
    Integer m;
    public Integer n;

    protected Video()
    {
    }

    protected ContentValues a(boolean flag)
    {
        ContentValues contentvalues = super.a(flag);
        contentvalues.put("cta_clickable_percent", e);
        contentvalues.put("enable_cta_delay_seconds", f);
        contentvalues.put("height", g);
        contentvalues.put("is_cta_enabled", h);
        contentvalues.put("is_cta_shown_on_touch", i);
        contentvalues.put("show_cta_delay_seconds", j);
        contentvalues.put("show_close_delay_incentivized_seconds", k);
        contentvalues.put("show_close_delay_interstitial_seconds", l);
        contentvalues.put("show_countdown_delay_seconds", m);
        contentvalues.put("width", n);
        return contentvalues;
    }

    public abstract Uri i();

    protected StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "cta_clickable_percent", e, false);
        bi.a(stringbuilder, "enable_cta_delay_seconds", f, false);
        bi.a(stringbuilder, "height", g, false);
        bi.a(stringbuilder, "is_cta_enabled", h, false);
        bi.a(stringbuilder, "is_cta_shown_on_touch", i, false);
        bi.a(stringbuilder, "show_cta_delay_seconds", j, false);
        bi.a(stringbuilder, "show_close_delay_incentivized_seconds", k, false);
        bi.a(stringbuilder, "show_close_delay_interstitial_seconds", l, false);
        bi.a(stringbuilder, "show_countdown_delay_seconds", m, false);
        bi.a(stringbuilder, "width", n, false);
        return stringbuilder;
    }

    // Unreferenced inner class com/vungle/publisher/db/model/Video$Factory
    /* block-local class not found */
    class Factory {}

}
