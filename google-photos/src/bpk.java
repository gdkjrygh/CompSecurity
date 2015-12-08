// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

final class bpk
    implements Runnable
{

    private bqz a;
    private Context b;

    bpk(bqz bqz1, Context context)
    {
        a = bqz1;
        b = context;
        super();
    }

    public final void run()
    {
        Object obj = a;
        int i = ((bqz) (obj)).a.getInt(((bqz) (obj)).b, 0);
        obj = bpi.a();
        Context context = b;
        deu deu1;
        for (; i < ((deq) (obj)).a.size(); i = deu1.a)
        {
            deu1 = (deu)((deq) (obj)).a.get(i);
            deu1.b.a(context);
        }

        obj = a;
        ((bqz) (obj)).a.edit().putInt(((bqz) (obj)).b, i).apply();
    }
}
