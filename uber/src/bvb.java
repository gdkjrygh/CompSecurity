// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class bvb
{

    public LinearLayout a;
    public TextView b;
    private LinearLayout c;

    public bvb(Context context)
    {
        c = new LinearLayout(context);
        c.setOrientation(0);
        b = new TextView(context);
        b.setText("server");
        b.setTextColor(-1);
        b.setBackgroundColor(bul.e);
        b.setGravity(17);
        c.addView(b);
        bum.a(b, "8dip", "8dip", "8dip", "8dip");
        bum.a(b, -2, -2);
        bum.b(b, null, "15dip", null, "15dip");
        bum.a(b, 1, 1.0F);
        a = c;
    }
}
