// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class owi extends afc
{

    private owh a;

    public owi(owh owh1)
    {
        a = owh1;
        super();
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        boolean flag = true;
        recyclerview = a;
        if (i != 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            flag = false;
        }
        recyclerview.a = flag;
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
    }
}
