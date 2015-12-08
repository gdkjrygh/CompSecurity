// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dlz
    implements dkl
{

    static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "width", "height"
    })));

    dlz()
    {
    }

    public static ekf a(Cursor cursor)
    {
        int i = cursor.getColumnIndexOrThrow("width");
        int j = cursor.getColumnIndexOrThrow("height");
        if (!cursor.isNull(i) && !cursor.isNull(j) && cursor.getInt(i) > 0 && cursor.getInt(j) > 0)
        {
            return new gag(cursor.getInt(i), cursor.getInt(j));
        } else
        {
            return null;
        }
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
        return gaf;
    }

}
