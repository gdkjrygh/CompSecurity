// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

final class hvx extends mtf
{

    private final int a;
    private final int b;
    private final List c;
    private final gjr j;
    private final hpb k;

    hvx(int i, int l, List list, gjr gjr1, hpb hpb1)
    {
        super("search_results_action_bar_mix_remove_task");
        a = i;
        b = l;
        c = list;
        j = gjr1;
        k = hpb1;
    }

    protected final mue a(Context context)
    {
        Object obj;
        if (c == null || c.isEmpty())
        {
            return new mue(true);
        }
        obj = k.a(c);
        context = mvj.a(context, a);
        context.beginTransaction();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); gjr.a(context, ((hpk)((Iterator) (obj)).next()).e, b)) { }
        break MISSING_BLOCK_LABEL_100;
        Exception exception;
        exception;
        context.endTransaction();
        throw exception;
        context.setTransactionSuccessful();
        context.endTransaction();
        return new mue(true);
    }
}
