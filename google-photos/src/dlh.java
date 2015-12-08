// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dlh
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "start", "end", "total_items"
    })));

    dlh()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        long l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("start"));
        long l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("end"));
        boolean flag;
        if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("total_items")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new hkd(l, l1, flag);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hkd;
    }

}
