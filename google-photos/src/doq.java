// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class doq
    implements evg
{

    private final ive a = new ive();
    private final SQLiteDatabase b;
    private final int c;
    private final noz d;
    private final dos e;
    private final Set f = new HashSet();
    private int g;

    doq(Context context, SQLiteDatabase sqlitedatabase, int i, dos dos1)
    {
        b = sqlitedatabase;
        c = i;
        e = dos1;
        d = noz.a(context, 2, "ChapterAllMediaListener", new String[0]);
    }

    private void b(long l)
    {
        f.add(a.a(l));
        g = g + 1;
    }

    public final String a()
    {
        return "ChapterAllMediaListener";
    }

    public final void a(long l)
    {
        b(l);
    }

    public final void a(evh evh1)
    {
        b(evh1.b);
    }

    public final void a(String s, long l)
    {
        b(l);
    }

    public final void b()
    {
        if (d.a())
        {
            noy.a("updatesInBatch", Integer.valueOf(g));
            noy.a("chaptersInBatch", Integer.valueOf(f.size()));
        }
        ivd ivd1;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); e.a(b, c, ivd1))
        {
            ivd1 = (ivd)iterator.next();
        }

        f.clear();
        g = 0;
    }

    public final void b(evh evh1)
    {
    }

    public final void c()
    {
        Object obj = e;
        int i = c;
        for (obj = ((dos) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); ((eru)((Iterator) (obj)).next()).a(i)) { }
    }
}
