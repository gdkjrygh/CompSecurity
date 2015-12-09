// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

final class fqu
    implements gfk
{

    private static final String a[] = {
        "connected"
    };
    private final fqs b;

    fqu(fqs fqs1)
    {
        b = fqs1;
    }

    static String[] a()
    {
        return a;
    }

    public final void a(gfi gfi, Cursor cursor)
    {
        if (!cursor.moveToFirst())
        {
            return;
        } else
        {
            fqs.b(b, gcw.a(cursor, 0));
            return;
        }
    }

}
