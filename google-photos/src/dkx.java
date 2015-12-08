// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class dkx
    implements dkl
{

    static final Set a = new HashSet(Arrays.asList(new String[] {
        "content_uri", "auto_backup_state"
    }));

    dkx()
    {
    }

    public static ekf a(Cursor cursor)
    {
        return new efu(cursor.getString(cursor.getColumnIndexOrThrow("content_uri")), euu.a(cursor.getInt(cursor.getColumnIndexOrThrow("auto_backup_state"))));
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
        return eft;
    }

}
