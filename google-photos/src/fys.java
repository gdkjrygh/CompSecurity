// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

final class fys
    implements hhg
{

    fys()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == q.aq)
        {
            return new fzh(viewgroup);
        }
        if (i == q.an)
        {
            return new fyy(viewgroup);
        }
        if (i == q.ao)
        {
            return new fzc(viewgroup);
        }
        if (i == q.ap)
        {
            return new fyv(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
