// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.photos.actionqueue.InternalReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class dim extends mtf
{

    static final Executor a = Executors.newSingleThreadExecutor();
    private final dir b;
    private final dij c;

    public dim(Context context, String s, int i, dir dir)
    {
        this(s, dir, new dij(context.getApplicationContext(), i, new dik(context.getApplicationContext(), i)));
    }

    private dim(String s, dir dir, dij dij1)
    {
        super(s);
        b = dir;
        c = dij1;
    }

    protected final mue a(Context context)
    {
        Object obj1 = null;
        Object obj = c.a(b);
        InternalReceiver.a(context);
        Bundle bundle;
        boolean flag;
        if (!((din) (obj)).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = new mue(flag);
        bundle = ((din) (obj)).a;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        context.a().putAll(bundle);
        return context;
        context;
        obj = null;
_L2:
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((din) (obj)).b;
        }
        return new mue(0, context, ((String) (obj)));
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Executor c()
    {
        return a;
    }

}
