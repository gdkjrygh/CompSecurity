// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.content.res.ColorStateList;

class ContextCompatApi23
{

    public static ColorStateList a(Context context, int i)
    {
        return context.getColorStateList(i);
    }

    public static int b(Context context, int i)
    {
        return context.getColor(i);
    }
}
