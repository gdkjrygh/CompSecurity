// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ftz extends afc
{

    public final List a = new ArrayList();

    public ftz()
    {
    }

    public final ftz a(afc afc1)
    {
        a.add(afc1);
        return this;
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((afc)iterator.next()).a(recyclerview, i)) { }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((afc)iterator.next()).a(recyclerview, i, j)) { }
    }
}
