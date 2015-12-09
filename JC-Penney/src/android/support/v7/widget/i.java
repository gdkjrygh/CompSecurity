// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.v;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            a, b

class i
    implements v
{

    final a a;

    private i(a a1)
    {
        a = a1;
        super();
    }

    i(a a1, b b)
    {
        this(a1);
    }

    public void a(g g1, boolean flag)
    {
        if (g1 instanceof aa)
        {
            ((aa)g1).l().a(false);
        }
        v v1 = a.a();
        if (v1 != null)
        {
            v1.a(g1, flag);
        }
    }

    public boolean a(g g1)
    {
        if (g1 == null)
        {
            return false;
        }
        a.h = ((aa)g1).getItem().getItemId();
        v v1 = a.a();
        boolean flag;
        if (v1 != null)
        {
            flag = v1.a(g1);
        } else
        {
            flag = false;
        }
        return flag;
    }
}
