// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.Set;

class hev
{

    final Context a;
    final ekw b;
    final NumberFormat c = NumberFormat.getInstance();

    public hev(Context context, ekw ekw1)
    {
        a = context;
        b = ekw1;
    }

    int a()
    {
        if (b.f.size() == 1)
        {
            if (b.f.contains(euv.c))
            {
                return b.vv;
            } else
            {
                return b.vt;
            }
        } else
        {
            return b.vu;
        }
    }

    public String a(long l)
    {
        return a.getResources().getQuantityString(a(), (int)l, new Object[] {
            c.format(l)
        });
    }
}
