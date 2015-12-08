// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class huy extends mtf
{

    private final int a;

    public huy(int i)
    {
        super("com.google.android.apps.photos.search.searchresults.CleanupSearchResultsTask");
        a = i;
    }

    protected final mue a(Context context)
    {
        context = (eto)olm.a(context, eto);
        int i = a;
        long l = noy.a();
        int j = mvj.a(((eto) (context)).a, i).delete("search_results", "date_header_start_timestamp IS NOT NULL", null);
        if (((eto) (context)).b.a())
        {
            noy.a("deleted", Integer.valueOf(j));
            noy.a("duration", l);
        }
        ((eto) (context)).e.a(i, "cleanup expanded search results", null);
        return new mue(true);
    }
}
