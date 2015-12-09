// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.database.Cursor;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            t, l, j

static final class b
    implements t
{

    private int a;
    private int b[];

    public final Object a(Object obj, Object obj1)
    {
        if (obj instanceof Cursor)
        {
            obj = (Cursor)obj;
            double d = ((Cursor) (obj)).getPosition();
            int i;
            if (b == null)
            {
                i = 1;
            } else
            {
                i = b.length;
            }
            obj1 = new double[i];
            if (a >= 0)
            {
                d = ((Cursor) (obj)).getDouble(a);
            }
            if (b != null)
            {
                for (i = 0; i < b.length; i++)
                {
                    obj1[i] = ((Cursor) (obj)).getDouble(b[i]);
                }

            }
            return new j(d, ((double []) (obj1)));
        } else
        {
            return null;
        }
    }

    public (int i, int ai[])
    {
        a = i;
        b = ai;
    }
}
