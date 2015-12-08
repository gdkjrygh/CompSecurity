// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class iio
    implements hhg
{

    public iio()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == ce.w)
        {
            return new iil(viewgroup);
        }
        if (i == ce.v)
        {
            return new iid(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Unknown viewType: ").append(i).toString());
        }
    }
}
