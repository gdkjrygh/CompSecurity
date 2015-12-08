// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.view.SubMenu;

// Referenced classes of package android.support.design.internal:
//            c

public final class a extends f
{

    public a(Context context)
    {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = (h)a(i, j, k, charsequence);
        c c1 = new c(e(), this, charsequence);
        charsequence.a(c1);
        return c1;
    }
}
