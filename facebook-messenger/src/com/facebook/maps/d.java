// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.facebook.i;
import com.facebook.k;
import com.google.android.maps.MapActivity;

// Referenced classes of package com.facebook.maps:
//            a

public class d extends MapActivity
{

    private FrameLayout a;
    private a b;
    private Activity c;

    public d()
    {
    }

    public a a()
    {
        return b;
    }

    public boolean isRouteDisplayed()
    {
        return false;
    }

    public void onBackPressed()
    {
        c.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = getParent();
        bundle = getIntent().getExtras().getString("API_KEY");
        setContentView(k.embeddable_map);
        a = (FrameLayout)findViewById(i.embeddable_map_frame);
        b = new a(this, bundle);
        bundle = new android.widget.FrameLayout.LayoutParams(-1, -1);
        b.setLayoutParams(bundle);
        a.addView(b);
    }
}
