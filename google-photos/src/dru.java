// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class dru
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "remote_url", "remote_state", "local_state", "content_uri"
    })));
    private final dsa b;
    private final drz c;

    public dru(dsa dsa1, drz drz1)
    {
        b = dsa1;
        c = drz1;
    }

    public static Set a()
    {
        return a;
    }

    public static Class b()
    {
        return gax;
    }

    public final ekf a(Cursor cursor)
    {
        eun eun3 = eun.a(cursor.getInt(cursor.getColumnIndexOrThrow("remote_state")));
        eun eun1 = eun.a(cursor.getInt(cursor.getColumnIndexOrThrow("local_state")));
        String s1 = cursor.getString(cursor.getColumnIndexOrThrow("remote_url"));
        String s = cursor.getString(cursor.getColumnIndexOrThrow("content_uri"));
        eun eun2 = b.a();
        if (eun3 == eun2)
        {
            cursor = s1;
        } else
        {
            cursor = null;
        }
        if (eun1 != eun2)
        {
            s = null;
        }
        cursor = drz.a(cursor, s);
        switch (drv.a[cursor.ordinal()])
        {
        default:
            cursor = String.valueOf(cursor);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(cursor).length() + 31)).append("Unrecognized media source set: ").append(cursor).toString());

        case 1: // '\001'
            return gax.a_;

        case 2: // '\002'
            return gax.b;

        case 3: // '\003'
            return gax.c;
        }
    }

}
