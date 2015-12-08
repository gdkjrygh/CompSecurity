// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content.res;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class a
{

    public a()
    {
    }

    public static Drawable a(Resources resources, int i)
        throws android.content.res.Resources.NotFoundException
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return resources.getDrawable(i, null);
        } else
        {
            return resources.getDrawable(i);
        }
    }
}
