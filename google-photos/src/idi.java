// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class idi
    implements nuc
{

    public final nud a = new nua(this);
    private final Context b;
    private final noz c;

    idi(Context context)
    {
        b = context;
        c = noz.a(context, 3, "CloudSettingsStorage", new String[0]);
    }

    public final nud a()
    {
        return a;
    }

    public final nwc a(int i)
    {
        nwc nwc1 = b(i);
        nwc nwc = nwc1;
        if (nwc1 == null)
        {
            if (c.a())
            {
                noy.a(i);
            }
            try
            {
                c(i);
                nwc = b(i);
            }
            catch (idj idj1)
            {
                idj1 = nwc1;
                if (c.a())
                {
                    noy.a(i);
                    return nwc1;
                }
            }
        }
        return nwc;
    }

    public final void a(Map map, int i)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(b, i);
        sqlitedatabase.beginTransactionNonExclusive();
        map = map.entrySet().iterator();
_L1:
        Object obj;
        boolean flag;
        if (!map.hasNext())
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj = (java.util.Map.Entry)map.next();
        icv icv1 = (icv)((java.util.Map.Entry) (obj)).getKey();
        flag = ((Boolean)((java.util.Map.Entry) (obj)).getValue()).booleanValue();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("setting_name", icv1.g);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj)).put("is_enabled", Integer.valueOf(i));
        sqlitedatabase.insertWithOnConflict("settings", null, ((ContentValues) (obj)), 5);
          goto _L1
        map;
        sqlitedatabase.endTransaction();
        throw map;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        a.b();
        return;
    }

    public final nwc b(int i)
    {
        Object obj;
        Object obj1;
        int j;
        obj = new mvu(mvj.b(b, i));
        obj.a = "settings";
        obj = ((mvu) (obj)).a();
        obj1 = new nwe();
        j = 0;
_L2:
        String s;
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("setting_name"));
        boolean flag;
        if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("is_enabled")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        icv.a(s).a(((nwe) (obj1)), flag);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
        if (j != icv.values().length)
        {
            if (c.a())
            {
                noy.a(i);
                noy.a("settings found", Integer.valueOf(j));
                noy.a("settings total", Integer.valueOf(icv.values().length));
            }
            return null;
        } else
        {
            return ((nwe) (obj1)).a();
        }
        obj1;
        ((Cursor) (obj)).close();
        throw obj1;
    }

    public final void c(int i)
    {
        Object obj = ((mmv)olm.a(b, mmv)).a(i).b("gaia_id");
        obj = new nwb(b, new nyg(b, i), ((String) (obj)));
        obj.a = true;
        obj.g = true;
        obj.d = true;
        obj.b = true;
        obj.c = true;
        obj.e = true;
        obj = ((nwb) (obj)).a();
        ((nwa) (obj)).d();
        if (((nwa) (obj)).l())
        {
            throw new idj(((nxx) (obj)).n);
        }
        HashMap hashmap = new HashMap();
        icv aicv[] = icv.values();
        int k = aicv.length;
        for (int j = 0; j < k; j++)
        {
            icv icv1 = aicv[j];
            hashmap.put(icv1, Boolean.valueOf(icv1.a(((nwa) (obj)).c())));
        }

        a(hashmap, i);
    }
}
