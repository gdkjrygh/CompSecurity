// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class ezh
    implements hhg
{

    public ezh()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == 0)
        {
            return new ezg(viewgroup);
        }
        if (i == 1)
        {
            return new ezj(viewgroup);
        }
        if (i == 2)
        {
            return new ezd(viewgroup);
        } else
        {
            return new ezl(viewgroup);
        }
    }
}
