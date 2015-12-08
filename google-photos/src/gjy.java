// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gjy
    implements mvi
{

    private final Context a;

    public gjy(Context context)
    {
        a = context;
    }

    public final String a()
    {
        return "OnDeviceSearchDatabasePartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add("CREATE TABLE on_device_search (tag TEXT NOT NULL, capture_day INTEGER NOT NULL, capture_offset INTEGER NOT NULL, dedup_key TEXT NOT NULL, PRIMARY KEY(tag, capture_day, capture_offset, dedup_key))");
        ((List) (obj)).add("CREATE TABLE on_device_person_cluster (id INTEGER NOT NULL, iconic_image_url INTEGER NOT NULL, topicality_score REAL, media_key TEXT NOT NULL, PRIMARY KEY(id))");
        ((List) (obj)).add("CREATE UNIQUE INDEX on_device_person_cluster_media_key_idx ON on_device_person_cluster(media_key)");
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); sqlitedatabase.execSQL((String)((Iterator) (obj)).next())) { }
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        for (sqlitedatabase = olm.c(a, gjz).iterator(); sqlitedatabase.hasNext(); ((gjz)sqlitedatabase.next()).a(i)) { }
        return false;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "on_device_search", "on_device_person_cluster"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 2;
    }
}
