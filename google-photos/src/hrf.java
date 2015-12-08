// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

final class hrf
    implements hqh
{

    private final eto a;
    private final noz b;

    hrf(Context context, eto eto1)
    {
        a = eto1;
        b = noz.a(context, 3, "ClearResultsBgJob", new String[] {
            "sync"
        });
    }

    public final String a()
    {
        return "ClearResultsBgJob";
    }

    public final void a(int i, hqo hqo)
    {
        eto eto1;
        eto1 = a;
        hqo = mvj.a(eto1.a, i);
        hqo.beginTransactionNonExclusive();
        hqo.delete("search_results", null, null);
        hqo.setTransactionSuccessful();
        hqo.endTransaction();
        eto1.e.a(i, "delete all search results", null);
        return;
        Exception exception;
        exception;
        hqo.endTransaction();
        throw exception;
    }

    public final String b()
    {
        return "com.google.android.apps.photos.search.clear_search_results_job";
    }

    public final long c()
    {
        return TimeUnit.HOURS.toMillis(12L);
    }
}
