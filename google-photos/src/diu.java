// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.photos.actionqueue.InternalReceiver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class diu extends mtf
{

    private static final Executor a;
    private final List b;
    private final dij c;

    public diu(Context context, String s, int i, List list)
    {
        this(s, list, new dij(context.getApplicationContext(), i, new dik(context.getApplicationContext(), i)));
    }

    private diu(String s, List list, dij dij1)
    {
        super(s);
        b = list;
        c = dij1;
    }

    protected final mue a(Context context)
    {
        Iterator iterator;
        boolean flag;
        iterator = b.iterator();
        flag = false;
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (dir)iterator.next();
        obj = c.a(((dir) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        flag = ((din) (obj)).a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
        flag = false;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        InternalReceiver.a(context);
        return new mue(flag);
    }

    protected final Executor c()
    {
        return a;
    }

    static 
    {
        a = dim.a;
    }
}
