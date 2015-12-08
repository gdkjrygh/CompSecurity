// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class dkv
{

    public static final Set a = Collections.unmodifiableSet(new HashSet(Collections.singletonList("composition_type")));
    public static final Class b = eev;

    public static ekf a(Cursor cursor)
    {
        int i = 0;
        boolean flag;
        if (!cursor.isNull(cursor.getColumnIndexOrThrow("composition_type")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = cursor.getInt(cursor.getColumnIndexOrThrow("composition_type"));
        }
        return new eew(flag, i);
    }

}
