// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ikh
    implements elf
{

    private static final ekz a = (new ela()).a();
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "protobuf", "media_key"
    })));
    private final Context c;
    private final elp d;
    private final noz e;

    ikh(Context context, elp elp1)
    {
        c = context;
        d = elp1;
        e = noz.a(context, "SharedCollectionHandler", new String[0]);
    }

    private List a(ikd ikd1, ekk ekk)
    {
        ArrayList arraylist;
        Cursor cursor;
        int i;
        arraylist = new ArrayList();
        i = ikd1.a;
        Object obj = mvj.b(c, i);
        String as[] = d.a(b, ekk);
        obj = new mvu(((android.database.sqlite.SQLiteDatabase) (obj)));
        obj.a = "shared_media";
        obj.b = as;
        obj.c = "collection_id = ?";
        obj.d = (new String[] {
            ikd1.b
        });
        obj.f = "utc_timestamp";
        cursor = ((mvu) (obj)).a();
_L2:
        boolean flag = cursor.moveToNext();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (qgg)qlw.a(new qgg(), cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf")));
        Object obj2 = b.a(((qgg) (obj1)));
        obj2 = new ikb(i, ((qgg) (obj1)).b.a, ((euv) (obj2)), ((qgg) (obj1)).c.f.longValue(), ikd1, elm.a);
        obj1 = d.a(i, obj1, ekk);
        arraylist.add(new ikb(((ikb) (obj2)).a, ((ikb) (obj2)).b, ((ikb) (obj2)).c, ((ikb) (obj2)).d, ikd1, ((elm) (obj1))));
        continue; /* Loop/switch isn't completed */
        ikd1;
        cursor.close();
        throw ikd1;
        qlv qlv1;
        qlv1;
        String s = cursor.getString(cursor.getColumnIndexOrThrow("media_key"));
        if (!e.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            "error loading proto - skipping media key: ".concat(s);
            continue; /* Loop/switch isn't completed */
        }
        new String("error loading proto - skipping media key: ");
        if (true) goto _L2; else goto _L1
_L1:
        cursor.close();
        return arraylist;
    }

    public final long a(ekq ekq, ekw ekw)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final Class a()
    {
        return ikd;
    }

    public final volatile List a(ekq ekq, ekw ekw, ekk ekk)
    {
        return a((ikd)ekq, ekk);
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        return a;
    }

}
