// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class gcw
{

    public static String a(Cursor cursor, int i, String s)
    {
        cursor = ((Cursor)ctz.a(cursor)).getString(i);
        if (cursor == null || cursor.length() == 0)
        {
            return s;
        } else
        {
            return cursor;
        }
    }

    public static String a(Cursor cursor, String s, String s1)
    {
        return a(cursor, ((Cursor)ctz.a(cursor)).getColumnIndexOrThrow((String)ctz.a(s)), s1);
    }

    public static boolean a(Cursor cursor, int i)
    {
        return ((Cursor)ctz.a(cursor)).getInt(i) != 0;
    }

    public static boolean a(Cursor cursor, String s)
    {
        return a(cursor, ((Cursor)ctz.a(cursor)).getColumnIndexOrThrow((String)ctz.a(s)));
    }

    public static int b(Cursor cursor, String s)
    {
        return ((Cursor)ctz.a(cursor)).getInt(cursor.getColumnIndexOrThrow((String)ctz.a(s)));
    }
}
