// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//            bw, bx

public final class cJ
{

    public LinearLayout a;
    public TextView b;
    private LinearLayout c;

    public cJ(Context context)
    {
        c = new LinearLayout(context);
        c.setOrientation(0);
        b = new TextView(context);
        b.setText("server");
        b.setTextColor(-1);
        b.setBackgroundColor(bw.e);
        b.setGravity(17);
        c.addView(b);
        bx.a(b, "8dip", "8dip", "8dip", "8dip");
        bx.a(b, -2, -2);
        bx.b(b, null, "15dip", null, "15dip");
        bx.a(b, 1, 1.0F);
        a = c;
    }
}
