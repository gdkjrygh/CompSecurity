// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;

class ResourcesCompatApi23
{

    ResourcesCompatApi23()
    {
    }

    public static int getColor(Resources resources, int i, android.content.res.Resources.Theme theme)
        throws android.content.res.Resources.NotFoundException
    {
        return resources.getColor(i, theme);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, android.content.res.Resources.Theme theme)
        throws android.content.res.Resources.NotFoundException
    {
        return resources.getColorStateList(i, theme);
    }
}
