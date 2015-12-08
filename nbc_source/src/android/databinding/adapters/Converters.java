// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;

public class Converters
{

    public Converters()
    {
    }

    public static ColorStateList convertColorToColorStateList(int i)
    {
        return ColorStateList.valueOf(i);
    }

    public static ColorDrawable convertColorToDrawable(int i)
    {
        return new ColorDrawable(i);
    }
}
