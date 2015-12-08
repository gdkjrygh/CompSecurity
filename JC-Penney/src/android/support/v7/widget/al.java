// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//            ac, ad

class al extends DataSetObserver
{

    final ac a;

    private al(ac ac1)
    {
        a = ac1;
        super();
    }

    al(ac ac1, ad ad)
    {
        this(ac1);
    }

    public void onChanged()
    {
        if (a.k())
        {
            a.c();
        }
    }

    public void onInvalidated()
    {
        a.i();
    }
}
