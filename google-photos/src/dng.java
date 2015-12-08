// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class dng
    implements emd
{

    private final Context a;
    private final elp b;

    public dng(Context context, elp elp1)
    {
        a = context;
        b = elp1;
    }

    private elm a(dnd dnd1, ekk ekk)
    {
        Cursor cursor;
        String as[] = b.a(dnh.a, ekk);
        cursor = mvj.b(a, dnd1.a).query("collection_covers", as, "collection_media_key = ?", dnh.a(dnd1.b), null, null, "collection_media_key", "1");
        if (!cursor.moveToFirst())
        {
            throw new ekd(dnd1);
        }
        break MISSING_BLOCK_LABEL_72;
        dnd1;
        cursor.close();
        throw dnd1;
        dnd1 = b.a(dnd1.a, cursor, ekk);
        cursor.close();
        return dnd1;
    }

    public final ekq a(ekq ekq, elm elm)
    {
        ekq = (dnd)ekq;
        return new dnd(((dnd) (ekq)).a, ((dnd) (ekq)).b, ((dnd) (ekq)).c, elm);
    }

    public final volatile elm a(ekq ekq, ekk ekk)
    {
        return a((dnd)ekq, ekk);
    }

    public final Class a()
    {
        return dnd;
    }
}
