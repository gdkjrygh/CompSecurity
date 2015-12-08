// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

// Referenced classes of package com.taplytics:
//            gs, al, ci

public abstract class s
{

    public SQLiteDatabase a;
    public SQLiteOpenHelper b;

    public s()
    {
    }

    public final int a(String s1)
    {
        int i;
        try
        {
            if (a == null || !a.isOpen())
            {
                a = b.getReadableDatabase();
            }
            s1 = a.rawQuery((new StringBuilder("SELECT * FROM ")).append(s1).toString(), null);
            i = s1.getCount();
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("count error: ")).append(s1.getMessage()).toString());
            }
            return 0;
        }
        return i;
    }

    public final Boolean a(String s1, s s2)
    {
        try
        {
            b = new al(ci.b().u, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            gs.b("External Analytics", s1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public final ArrayList a(String s1, String s2)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        try
        {
            if (a == null || !a.isOpen())
            {
                a = b.getReadableDatabase();
            }
            for (s1 = a.rawQuery((new StringBuilder("SELECT * FROM ")).append(s1).toString(), null); s1.moveToNext(); arraylist.add(s1.getString(s1.getColumnIndex(s2)))) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Error getting data from db: ")).append(s1.getMessage()).toString());
            }
            a.close();
            return arraylist;
        }
        s1.close();
        return arraylist;
    }

    public abstract void a();
}
