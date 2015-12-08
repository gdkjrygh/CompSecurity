// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public class gbr
{

    public final aav h;

    public gbr(aav aav1)
    {
        h = (aav)ctz.a(aav1);
    }

    public final boolean a(RecyclerView recyclerview)
    {
        return recyclerview.c() == h;
    }

    public final boolean b(RecyclerView recyclerview)
    {
        if (!a(recyclerview))
        {
            recyclerview.a(null);
            recyclerview.a(h);
            return true;
        } else
        {
            return false;
        }
    }
}
