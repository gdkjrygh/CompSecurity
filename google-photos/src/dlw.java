// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dlw
    implements dkl
{

    static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "capture_frame_rate", "encoded_frame_rate"
    })));

    dlw()
    {
    }

    public static ekf a(Cursor cursor)
    {
        return new jgj(cursor.getFloat(cursor.getColumnIndexOrThrow("capture_frame_rate")), cursor.getFloat(cursor.getColumnIndexOrThrow("encoded_frame_rate")));
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
        return jgi;
    }

}
