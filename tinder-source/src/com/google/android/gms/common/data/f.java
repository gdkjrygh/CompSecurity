// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class f
{

    public final DataHolder a;
    public int b;
    private int c;

    public f(DataHolder dataholder, int i)
    {
        a = (DataHolder)u.a(dataholder);
        boolean flag;
        if (i >= 0 && i < a.h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag);
        b = i;
        c = a.a(b);
    }

    public final boolean a(String s)
    {
        return a.c.containsKey(s);
    }

    public final int b(String s)
    {
        DataHolder dataholder = a;
        int i = b;
        int j = c;
        dataholder.a(s, i);
        return dataholder.d[j].getInt(i, dataholder.c.getInt(s));
    }

    public final String c(String s)
    {
        return a.a(s, b, c);
    }

    public final byte[] d(String s)
    {
        DataHolder dataholder = a;
        int i = b;
        int j = c;
        dataholder.a(s, i);
        return dataholder.d[j].getBlob(i, dataholder.c.getInt(s));
    }

    public final boolean e(String s)
    {
        DataHolder dataholder = a;
        int i = b;
        int j = c;
        dataholder.a(s, i);
        return dataholder.d[j].isNull(i, dataholder.c.getInt(s));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof f)
        {
            obj = (f)obj;
            flag = flag1;
            if (t.a(Integer.valueOf(((f) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (t.a(Integer.valueOf(((f) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((f) (obj)).a == a)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a
        });
    }
}
