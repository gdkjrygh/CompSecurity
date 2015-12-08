// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.format.Formatter;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class iax extends mvc
{

    private final int l;
    private final List m;

    public iax(Context context, int i, List list)
    {
        super(context);
        l = i;
        m = list;
    }

    private String a(File file)
    {
        StringBuilder stringbuilder = new StringBuilder();
        file = file.listFiles();
        if (file == null)
        {
            return "";
        }
        Arrays.sort(file, new iay(this));
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            File file1 = file[i];
            String s = Formatter.formatFileSize(super.f, b(file1));
            stringbuilder.append("      ").append(file1.getName()).append(": ").append(s);
            if (file1.isDirectory())
            {
                stringbuilder.append(", ").append(file1.listFiles().length).append(" files");
            }
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }

    private static long b(File file)
    {
        if (!file.isFile()) goto _L2; else goto _L1
_L1:
        long l2 = file.length();
_L4:
        return l2;
_L2:
        file = file.listFiles();
        int j = file.length;
        long l1 = 0L;
        int i = 0;
        do
        {
            l2 = l1;
            if (i >= j)
            {
                continue;
            }
            l2 = b(file[i]);
            i++;
            l1 = l2 + l1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Object d()
    {
        Object obj = super.f;
        int i = l;
        Object obj2 = m;
        android.database.sqlite.SQLiteDatabase sqlitedatabase = ((mvh)olm.a(((Context) (obj)), mvh)).b(((Context) (obj)), i).getReadableDatabase();
        dpj dpj1 = (dpj)olm.a(((Context) (obj)), dpj);
        HashMap hashmap = new HashMap(((List) (obj2)).size());
        String s;
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); hashmap.put(s, String.valueOf(DatabaseUtils.queryNumEntries(sqlitedatabase, s))))
        {
            s = (String)((Iterator) (obj2)).next();
        }

        hashmap.put("cached_all_media_count", String.valueOf(dpj1.a(i)));
        hashmap.put("All Deduplicated Media Count: ", String.valueOf(((eto)olm.a(((Context) (obj)), eto)).e(i)));
        hashmap.put("Total Local Trash Photos:    ", String.valueOf(DatabaseUtils.queryNumEntries(((izr)olm.a(((Context) (obj)), izr)).getReadableDatabase(), "local")));
        if (Log.isLoggable("DATA_STATS_FRAGMENT", 3))
        {
            Object obj1 = String.valueOf(hashmap.toString());
            if (((String) (obj1)).length() != 0)
            {
                "MAPS COUNT ".concat(((String) (obj1)));
            } else
            {
                new String("MAPS COUNT ");
            }
        }
        hashmap.put("Data subfolders:\n", a(((Context) (obj)).getFilesDir()));
        hashmap.put("Cache subfolders:\n", a(((Context) (obj)).getCacheDir()));
        hashmap.put("Database files:\n", a(((Context) (obj)).getDatabasePath("fake").getParentFile()));
        obj1 = ((gdn)olm.a(((Context) (obj)), gdn)).b(i);
        if (gcp.a(((gcp) (obj1))))
        {
            obj = "complete";
        } else
        {
            obj = "not complete";
        }
        hashmap.put("Bootstrap status: ", obj);
        if (gcp.d.equals(obj1))
        {
            obj = "complete";
        } else
        {
            obj = "not complete";
        }
        hashmap.put("Library sync status: ", obj);
        return Collections.unmodifiableMap(hashmap);
    }
}
