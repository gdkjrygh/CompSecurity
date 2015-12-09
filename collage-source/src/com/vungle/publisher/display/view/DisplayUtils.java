// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class DisplayUtils
{

    Context a;

    DisplayUtils()
    {
    }

    public final float a(int i)
    {
        return TypedValue.applyDimension(1, i, a.getResources().getDisplayMetrics());
    }
}
