// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import b;
import java.text.DateFormatSymbols;
import java.util.Locale;

public final class DateTileView extends FrameLayout
{

    public static String a[] = DateFormatSymbols.getInstance().getShortMonths();
    private static Locale i;
    public TextView b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public String h[];

    public DateTileView(Context context)
    {
        super(context);
        e = -1;
        f = -1;
        g = -1;
        h = a;
    }

    public DateTileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = -1;
        f = -1;
        g = -1;
        h = a;
    }

    public DateTileView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        e = -1;
        f = -1;
        g = -1;
        h = a;
    }

    public static boolean a()
    {
        Locale locale = Locale.getDefault();
        if (!locale.equals(i))
        {
            i = locale;
            a = DateFormatSymbols.getInstance(locale).getShortMonths();
            return true;
        } else
        {
            return false;
        }
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        b = (TextView)findViewById(b.Fw);
        c = (TextView)findViewById(b.Fx);
        d = (TextView)findViewById(b.Fy);
    }

    public final void onMeasure(int j, int k)
    {
        super.onMeasure(j, j);
    }

    static 
    {
        a();
    }
}
