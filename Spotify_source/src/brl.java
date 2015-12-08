// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

public abstract class brl
{

    public final DataHolder a;
    public int b;
    public int c;

    public brl(DataHolder dataholder, int i)
    {
        a = (DataHolder)btl.a(dataholder);
        boolean flag;
        if (i >= 0 && i < a.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        b = i;
        c = a.a(b);
    }

    public final int a(String s)
    {
        DataHolder dataholder = a;
        int i = b;
        int j = c;
        dataholder.a(s, i);
        return dataholder.d[j].getInt(i, dataholder.c.getInt(s));
    }

    public final String b(String s)
    {
        return a.a(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof brl)
        {
            obj = (brl)obj;
            flag = flag1;
            if (btj.a(Integer.valueOf(((brl) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (btj.a(Integer.valueOf(((brl) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((brl) (obj)).a == a)
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
