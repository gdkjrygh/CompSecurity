// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.t;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            y, ag, ListPopupWindow

public final class ah extends y
{

    final ag a;

    public ah(ag ag1, View view)
    {
        a = ag1;
        super(view);
    }

    public final ListPopupWindow a()
    {
        return a.d.c;
    }

    protected final boolean b()
    {
        a.d.b();
        return true;
    }

    protected final boolean c()
    {
        a.d.d();
        return true;
    }
}
