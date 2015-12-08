// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class hnr
    implements hhg
{

    public hnr()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == ag.F)
        {
            return new fro(viewgroup, flj.a, false);
        }
        if (i == ag.E)
        {
            return new frf(viewgroup);
        }
        if (i == ag.J)
        {
            return new hji(viewgroup);
        }
        if (i == ag.H)
        {
            return new hje(viewgroup);
        }
        if (i == ag.I)
        {
            return new hjg(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
