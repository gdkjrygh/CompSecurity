// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import dbh;
import java.util.List;

public class ThemeScrollView extends LinearLayout
{

    public dbh a;
    public List b;

    public ThemeScrollView(Context context)
    {
        super(context);
    }

    public ThemeScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static dbh a(ThemeScrollView themescrollview)
    {
        return themescrollview.a;
    }

    public static List b(ThemeScrollView themescrollview)
    {
        return themescrollview.b;
    }
}
