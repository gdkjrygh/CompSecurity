// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class gme
    implements gfk
{

    public final String a[] = {
        "private_session"
    };
    private gmd b;

    private gme(gmd gmd1)
    {
        b = gmd1;
        super();
    }

    public gme(gmd gmd1, byte byte0)
    {
        this(gmd1);
    }

    public final void a(gfi gfi, Cursor cursor)
    {
        boolean flag = true;
        if (cursor.moveToFirst())
        {
            flag = gcw.a(cursor, "private_session");
        }
        b.c = flag;
    }
}
