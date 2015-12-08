// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//            j

private final class <init> extends DataSetObserver
{

    final j a;

    public final void onChanged()
    {
        if (a.n())
        {
            a.c();
        }
    }

    public final void onInvalidated()
    {
        a.k();
    }

    private er(j j1)
    {
        a = j1;
        super();
    }

    er(j j1, byte byte0)
    {
        this(j1);
    }
}
