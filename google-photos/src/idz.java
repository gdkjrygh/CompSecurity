// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

final class idz
    implements hhg
{

    idz()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == ce.f)
        {
            return new ifa(viewgroup);
        }
        if (i == ce.g)
        {
            return new ifi(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
