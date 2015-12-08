// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class ijn
    implements ikf
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        "media_key", "start_time_ms", "end_time_ms"
    }));
    private final est b;

    ijn(est est1)
    {
        b = est1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        long l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("start_time_ms"));
        long l2 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("end_time_ms"));
        long l = l2;
        if (l2 == 0L)
        {
            l = l1;
        }
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key"));
        boolean flag;
        if (b.a(i, ((String) (obj))) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new hkd(l1, l, flag);
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
