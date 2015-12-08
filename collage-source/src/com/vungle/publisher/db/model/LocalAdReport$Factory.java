// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.database.Cursor;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            LocalAdReport, AdReport

public static class _cls9 extends _cls9
{

     b;
     d;
    Provider e;

    private LocalAdReport a(LocalAdReport localadreport, Cursor cursor, boolean flag)
    {
        super.(localadreport, cursor, flag);
        localadreport.p = bg.e(cursor, "download_end_millis");
        return localadreport;
    }

    public final volatile int a(List list)
    {
        return super.(list);
    }

    protected final volatile bi a(bi bi, Cursor cursor)
    {
        return a((LocalAdReport)bi, cursor, false);
    }

    protected final volatile a a()
    {
        return b;
    }

    protected final volatile AdReport a(AdReport adreport, Cursor cursor, boolean flag)
    {
        return a((LocalAdReport)adreport, cursor, flag);
    }

    protected final volatile a b()
    {
        return d;
    }

    protected final volatile Object[] b(int i)
    {
        return new Integer[i];
    }

    protected final d c()
    {
        return d;
    }

    protected final volatile bi[] c(int i)
    {
        return new LocalAdReport[i];
    }

    protected final bi c_()
    {
        return (LocalAdReport)e.get();
    }

    public final volatile List d()
    {
        return super.();
    }

    public final volatile List d(int i)
    {
        return super.(i);
    }

    protected final String e_()
    {
        return "ad_report";
    }

    protected _cls9()
    {
    }
}
