// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

final class hvo extends mtf
{

    private final long a;
    private final dnq b;

    public hvo(long l, dnq dnq1)
    {
        super("CollapseSearchHeaders");
        a = l;
        b = dnq1;
    }

    protected final mue a(Context context)
    {
        context = (eto)olm.a(context, eto);
        int i = b.a;
        long l = a;
        long l1 = noy.a();
        int j = mvj.a(((eto) (context)).a, i).delete("search_results", "date_header_start_timestamp = ?", new String[] {
            String.valueOf(l)
        });
        if (((eto) (context)).b.a())
        {
            noy.a("start time", Long.valueOf(l1));
            noy.a("deleted", Integer.valueOf(j));
        }
        ((eto) (context)).e.a(i, "delete expanded search results", null);
        context = new mue(true);
        context.a().putLong("start_time_ms_key", a);
        return context;
    }
}
