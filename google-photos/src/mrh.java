// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public class mrh
    implements android.os.Handler.Callback, Runnable
{

    final Set a;
    final Executor b;
    private final Context c;
    private final Handler d;

    public mrh(Context context)
    {
        this(context, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private mrh(Context context, Executor executor)
    {
        p.b(context, "context must be non-null");
        c = context;
        d = new Handler(Looper.getMainLooper(), this);
        a = Collections.synchronizedSet(new HashSet());
        b = executor;
    }

    private void a(Collection collection)
    {
        Object obj;
        for (collection = collection.iterator(); collection.hasNext(); d.dispatchMessage(d.obtainMessage(1, obj)))
        {
            obj = (mqm)collection.next();
            obj = (new mrm(c, ((mqm) (obj)).a)).c(((mqm) (obj)));
        }

    }

    public final void a(mqm mqm1)
    {
        HashSet hashset = new HashSet();
        Set set = a;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        mre mre1;
        mqm mqm2;
        mre1 = (mre)iterator.next();
        mqm2 = mre1.b;
        if (mqm2.a == mqm1.a) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L7:
        if (!flag) goto _L6; else goto _L5
_L5:
        mre1.c = false;
        hashset.add(mre1.b);
          goto _L6
        mqm1;
        set;
        JVM INSTR monitorexit ;
        throw mqm1;
_L4:
        if (mqm2.b == null || mqm2.b.equals(mqm1.b))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = false;
          goto _L7
        if (mqm2.c != -1L && mqm2.c != mqm1.c)
        {
            flag = false;
        } else
        {
            flag = true;
        }
          goto _L7
_L2:
        set;
        JVM INSTR monitorexit ;
        a(((Collection) (hashset)));
        return;
          goto _L6
    }

    public boolean handleMessage(Message message)
    {
        mqp mqp1;
        if (message.what != 1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        mqp1 = (mqp)message.obj;
        message = a;
        message;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            mre mre1 = (mre)iterator.next();
            if (mre1.b.equals(mqp1.a))
            {
                mre1.a.a(mqp1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_87;
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        message;
        JVM INSTR monitorexit ;
        return true;
        return false;
    }

    public void run()
    {
        Object obj = new HashSet();
        Set set = a;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            mre mre1 = (mre)iterator.next();
            if (mre1.c)
            {
                mre1.c = false;
                ((Set) (obj)).add(mre1.b);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_79;
        obj;
        set;
        JVM INSTR monitorexit ;
        throw obj;
        set;
        JVM INSTR monitorexit ;
        a(((Collection) (obj)));
        return;
    }
}
