// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

final class heo
    implements hhg
{

    heo()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == aw.i)
        {
            return new hfa(viewgroup);
        }
        if (i == aw.g)
        {
            return new hej(viewgroup);
        }
        if (i == aw.h)
        {
            return new hes(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(30)).append("Unknown view type: ").append(i).toString());
        }
    }
}
