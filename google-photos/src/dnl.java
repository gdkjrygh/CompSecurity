// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class dnl
    implements dkl
{

    static final Set a = new HashSet(Arrays.asList(new String[] {
        "is_from_drive", "is_shared"
    }));

    dnl()
    {
    }

    public static ekf a(Cursor cursor)
    {
        boolean flag1 = true;
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_from_drive")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_shared")) == 0)
        {
            flag1 = false;
        }
        return new gek(flag, flag1);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gej;
    }

}
