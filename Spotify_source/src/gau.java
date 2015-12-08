// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.android.paste.widget.SectionHeaderView;

final class gau extends ftr
{

    private gat a;

    gau(gat gat1, Context context)
    {
        a = gat1;
        super(context);
    }

    public final SectionHeaderView a(int i)
    {
        if (a.c.e(i) == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            return dgp.g(a.a);
        } else
        {
            return dgp.f(a.a);
        }
    }
}
