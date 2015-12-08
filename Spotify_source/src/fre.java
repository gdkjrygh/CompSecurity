// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class fre
    implements gfk
{

    private static final String a[] = {
        "country_code"
    };
    private final frc b;

    public fre(frc frc1)
    {
        b = frc1;
    }

    public static String[] a()
    {
        return a;
    }

    public final void a(gfi gfi1, Cursor cursor)
    {
        if (!cursor.moveToFirst())
        {
            return;
        }
        gfi1 = cursor.getString(0);
        cursor = b;
        if (((frc) (cursor)).d != null)
        {
            ((frc) (cursor)).d.b();
            cursor.d = null;
        }
        cursor.e = gfi1;
        ((frc) (cursor)).c.a();
    }

}
