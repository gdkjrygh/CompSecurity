// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            by, OrmmaPlayer

final class ax extends RelativeLayout
{

    private Button a;
    private OrmmaPlayer b;

    public ax(Context context)
    {
        super(context);
        a = null;
        b = null;
        setBackgroundColor(-1);
    }

    public static android.widget.RelativeLayout.LayoutParams a()
    {
        return new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    private static android.widget.LinearLayout.LayoutParams c()
    {
        return new android.widget.LinearLayout.LayoutParams(-1, -1);
    }

    public final void a(OrmmaPlayer ormmaplayer, Button button)
    {
        a = button;
        b = ormmaplayer;
        button = by.b(getContext(), a);
        if (ormmaplayer.b())
        {
            ormmaplayer.setLayoutParams(c());
            LinearLayout linearlayout = new LinearLayout(getContext());
            linearlayout.setLayoutParams(c());
            linearlayout.setGravity(17);
            linearlayout.addView(ormmaplayer);
            addView(linearlayout);
        } else
        {
            ImageView imageview = new ImageView(getContext());
            imageview.setImageDrawable(by.b(getContext(), "note.png"));
            imageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            LinearLayout linearlayout1 = new LinearLayout(getContext());
            linearlayout1.setLayoutParams(c());
            linearlayout1.setGravity(17);
            linearlayout1.addView(imageview);
            ormmaplayer.setLayoutParams(c());
            addView(ormmaplayer);
            addView(linearlayout1);
        }
        addView(button);
    }

    public final void b()
    {
        if (b != null)
        {
            b.c();
        }
    }
}
