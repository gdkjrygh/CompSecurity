// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public final class etb
{

    private final Context a;
    private final int b;
    private final noz c;

    etb(Context context, int i)
    {
        a = context;
        b = i;
        c = noz.a(context, "CollectionModifier", new String[0]);
    }

    public final List a(List list, etd etd1)
    {
        ArrayList arraylist;
        list = mvj.a(a, b).query("collections", etc.a, etc.a(list), etc.b(list), null, null, null);
        arraylist = new ArrayList();
_L2:
        byte abyte0[];
        if (!list.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0 = list.getBlob(list.getColumnIndexOrThrow("protobuf"));
        try
        {
            arraylist.add(etd1.a((qfz)qfz.a(new qfz(), abyte0)));
        }
        catch (qlv qlv1) { }
        if (true) goto _L2; else goto _L1
_L1:
        list.close();
        return arraylist;
        etd1;
        list.close();
        throw etd1;
    }
}
