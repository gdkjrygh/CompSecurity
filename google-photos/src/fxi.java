// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class fxi
    implements hhg
{

    public fxi()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == aa.y)
        {
            return new fwz(viewgroup);
        }
        if (i == aa.x)
        {
            return new fro(viewgroup);
        }
        if (i == aa.A)
        {
            return new fxy(viewgroup);
        }
        if (i == aa.z)
        {
            return new fxq(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
