// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class dvu
    implements gfk
{

    private static final String a[] = {
        "offline_mode"
    };

    private dvu()
    {
    }

    public dvu(byte byte0)
    {
        this();
    }

    public static String[] a()
    {
        return a;
    }

    public final void a(gfi gfi, Cursor cursor)
    {
        boolean flag = false;
        int i;
        if (cursor.moveToFirst())
        {
            i = gcw.b(cursor, "offline_mode");
        } else
        {
            i = 0;
        }
        gfi = (dms)dmz.a(dms);
        if (i != 0)
        {
            flag = true;
        }
        gfi.c = flag;
    }

}
