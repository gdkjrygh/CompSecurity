// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class iji
    implements ikf
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        "is_joined", "is_pinned"
    }));

    iji()
    {
    }

    public final ekf a(int i, Object obj)
    {
        boolean flag1 = true;
        obj = (Cursor)obj;
        boolean flag;
        if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("is_pinned")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("is_joined")) != 1)
        {
            flag1 = false;
        }
        return new ikw(flag, flag1);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return ikw;
    }

}
