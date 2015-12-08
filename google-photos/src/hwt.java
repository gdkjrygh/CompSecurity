// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class hwt
    implements hhg
{

    public hwt()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == c.eT)
        {
            return new hwx(viewgroup);
        }
        if (i == c.eZ)
        {
            return hwq.a(viewgroup);
        }
        if (i == c.eY)
        {
            return new hwj(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
