// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class evo
    implements evk
{

    private static final String a[] = {
        "_id", "width", "height", "protobuf"
    };
    private final evs b;
    private final noz c;

    private evo(Context context)
    {
        c = noz.a(context, "DimensionsProcessor", new String[0]);
        b = new evs(context, 50);
    }

    static int a(SQLiteDatabase sqlitedatabase, long l, byte abyte0[], ContentValues contentvalues, noz noz1)
    {
        return b(sqlitedatabase, l, abyte0, contentvalues, noz1);
    }

    static ezz a(Context context)
    {
        return new ezz(context, evt.c, new evo(context), "DimensionsProcessor");
    }

    static String[] a()
    {
        return a;
    }

    private static int b(SQLiteDatabase sqlitedatabase, long l, byte abyte0[], ContentValues contentvalues, noz noz1)
    {
        int i = 0;
        euv euv1;
        boolean flag;
        try
        {
            abyte0 = qgg.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            return 0;
        }
        euv1 = b.a(abyte0);
        if (euv1 == euv.b || euv1 == euv.e || euv1 == euv.d)
        {
            if (((qgg) (abyte0)).d != null && ((qgg) (abyte0)).d.b != null && ((qgg) (abyte0)).d.b.a != null)
            {
                contentvalues.put("width", ((qgg) (abyte0)).d.b.a.b);
                contentvalues.put("height", ((qgg) (abyte0)).d.b.a.c);
            }
        } else
        if (euv1 == euv.c)
        {
            if (((qgg) (abyte0)).d != null && ((qgg) (abyte0)).d.c != null && ((qgg) (abyte0)).d.c.d != null)
            {
                contentvalues.put("width", ((qgg) (abyte0)).d.c.d.c);
                contentvalues.put("height", ((qgg) (abyte0)).d.c.d.d);
            }
        } else
        if (noz1.a())
        {
            noy.a("type", euv1);
        }
        if (contentvalues.get("width") != null || contentvalues.get("height") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = sqlitedatabase.update("remote_media", contentvalues, "_id = ?", new String[] {
                String.valueOf(l)
            });
        }
        return i;
    }

    public final int a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = new evp(sqlitedatabase, c);
        b.a(2000, sqlitedatabase);
        return ((evp) (sqlitedatabase)).a;
    }

    public final boolean a(int i)
    {
        return b.a(i);
    }

}
