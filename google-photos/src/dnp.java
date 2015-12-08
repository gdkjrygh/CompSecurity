// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

final class dnp
    implements eyt
{

    private static final ekz a = (new ela()).a();
    private static final Set b;
    private final Context c;
    private final noz d;

    dnp(Context context)
    {
        c = context;
        d = noz.a(context, 3, "SearchDateHeader", new String[] {
            "perf"
        });
    }

    private Map a(dnx dnx1, ekw ekw, Set set)
    {
        long l;
        if (!a.a(ekw))
        {
            dnx1 = String.valueOf(ekw);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(dnx1).length() + 21)).append("Unsupported options: ").append(dnx1).toString());
        }
        l = noy.a();
        ekw = mvj.b(c, dnx1.c).rawQuery("SELECT capture_timestamp FROM media WHERE dedup_key IN (SELECT dedup_key FROM search_results WHERE search_query = ? AND is_rejected != 1) AND is_deleted != 1 ORDER BY capture_timestamp DESC", new String[] {
            dnx1.a
        });
        Map map = b.a(ekw, 0).a(set);
        ekw.close();
        if (d.a())
        {
            b.a(dnx1);
            noy.a("total date headers", Integer.valueOf(map.size()));
            noy.a("types", set);
            noy.a("duration", l);
        }
        return map;
        dnx1;
        ekw.close();
        throw dnx1;
    }

    public final Class a()
    {
        return dnx;
    }

    public final volatile Map a(ekq ekq, ekw ekw, Set set)
    {
        return a((dnx)ekq, ekw, set);
    }

    public final boolean b(ekq ekq, ekw ekw, Set set)
    {
        return b.containsAll(set);
    }

    static 
    {
        b = Collections.unmodifiableSet(EnumSet.of(eyz.a, eyz.b));
    }
}
