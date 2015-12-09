// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.c.a.b;
import android.support.v4.c.a.c;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            q, l, ab

public final class y
{

    public static MenuItem a(Context context, b b)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new q(context, b);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new l(context, b);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static SubMenu a(Context context, c c)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new ab(context, c);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
