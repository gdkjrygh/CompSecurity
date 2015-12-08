// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class huk
    implements hhg
{

    public huk()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == au.D)
        {
            return new hui(viewgroup);
        }
        if (i == au.B)
        {
            return new hua(viewgroup);
        }
        if (i == au.C)
        {
            return new hue(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
