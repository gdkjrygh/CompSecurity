// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class dvo
    implements gfk
{

    private final dvn a;
    private boolean b;
    private boolean c;

    public dvo(dvn dvn1)
    {
        ctz.a(dvn1);
        a = dvn1;
    }

    public final void a(gfi gfi, Cursor cursor)
    {
        if (cursor.moveToFirst())
        {
            boolean flag = b;
            b = gcw.a(cursor, cursor.getColumnIndexOrThrow("connected"));
            if (b != flag)
            {
                a.a(b);
            }
            gfi = cursor.getString(cursor.getColumnIndexOrThrow("current_user"));
            a.a(gfi);
            flag = c;
            c = gcw.a(cursor, cursor.getColumnIndexOrThrow("logged_in"));
            a.b(c);
            if (c && !flag)
            {
                a.a();
                return;
            }
            if (!c && flag)
            {
                a.b();
                return;
            }
        }
    }
}
