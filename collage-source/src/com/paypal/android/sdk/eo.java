// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//            dy, dz

public final class eo
{

    public LinearLayout a;
    public TextView b;
    private LinearLayout c;

    public eo(Context context)
    {
        c = new LinearLayout(context);
        c.setOrientation(0);
        b = new TextView(context);
        b.setText("server");
        b.setTextColor(-1);
        b.setBackgroundColor(dy.e);
        b.setGravity(17);
        c.addView(b);
        dz.a(b, "8dip", "8dip", "8dip", "8dip");
        dz.a(b, -2, -2);
        dz.b(b, null, "15dip", null, "15dip");
        dz.a(b, 1, 1.0F);
        a = c;
    }
}
