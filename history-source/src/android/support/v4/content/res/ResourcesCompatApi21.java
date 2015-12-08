// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content.res;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class ResourcesCompatApi21
{

    ResourcesCompatApi21()
    {
    }

    public static Drawable getDrawable(Resources resources, int i, android.content.res.Resources.Theme theme)
    {
        return resources.getDrawable(i, theme);
    }
}
