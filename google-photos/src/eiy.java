// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.MatrixCursor;

public final class eiy
{

    final Object a[];
    private eix b;

    eiy(eix eix1)
    {
        b = eix1;
        super();
        a = new Object[eix1.a.getColumnNames().length];
    }

    public final eiy a(String s, Object obj)
    {
        String as[] = b.a.getColumnNames();
        for (int i = 0; i < as.length; i++)
        {
            if (s.equals(as[i]))
            {
                a[i] = obj;
            }
        }

        return this;
    }
}
