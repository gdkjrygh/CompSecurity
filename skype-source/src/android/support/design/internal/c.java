// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.o;
import android.view.MenuItem;

// Referenced classes of package android.support.design.internal:
//            a

public final class c extends o
{

    public c(Context context, a a, h h)
    {
        super(context, a, h);
    }

    private void s()
    {
        ((f)r()).b(true);
    }

    public final MenuItem add(int i)
    {
        MenuItem menuitem = super.add(i);
        s();
        return menuitem;
    }

    public final MenuItem add(int i, int j, int k, int l)
    {
        MenuItem menuitem = super.add(i, j, k, l);
        s();
        return menuitem;
    }

    public final MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = super.add(i, j, k, charsequence);
        s();
        return charsequence;
    }

    public final MenuItem add(CharSequence charsequence)
    {
        charsequence = super.add(charsequence);
        s();
        return charsequence;
    }
}
