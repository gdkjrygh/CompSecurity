// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;

final class mox
    implements moz
{

    Menu a;
    SparseArray b;
    final mov c;

    mox(mov mov1, Menu menu)
    {
        c = mov1;
        super();
        b = new SparseArray();
        a = menu;
    }

    public final MenuItem a(int i)
    {
        MenuItem menuitem = b(i);
        menuitem.setVisible(true);
        return menuitem;
    }

    public final void a(CharSequence charsequence)
    {
        mov.b(c).a(charsequence);
    }

    public final MenuItem b(int i)
    {
        return a.findItem(i);
    }
}
