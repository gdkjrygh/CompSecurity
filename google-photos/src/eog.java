// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

final class eog
    implements hhg
{

    eog()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == s.r)
        {
            return new eow(viewgroup);
        }
        if (i == s.q)
        {
            return new eoq(viewgroup);
        }
        if (i == s.p)
        {
            return new eou(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
