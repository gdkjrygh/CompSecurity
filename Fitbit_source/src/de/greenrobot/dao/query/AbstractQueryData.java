// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.query;

import android.os.Process;
import android.util.SparseArray;
import de.greenrobot.dao.AbstractDao;
import java.lang.ref.WeakReference;

// Referenced classes of package de.greenrobot.dao.query:
//            AbstractQuery

abstract class AbstractQueryData
{

    final AbstractDao dao;
    final String initialValues[];
    final SparseArray queriesForThreads = new SparseArray();
    final String sql;

    AbstractQueryData(AbstractDao abstractdao, String s, String as[])
    {
        dao = abstractdao;
        sql = s;
        initialValues = as;
    }

    protected abstract AbstractQuery createQuery();

    AbstractQuery forCurrentThread()
    {
        int i = Process.myTid();
        SparseArray sparsearray = queriesForThreads;
        sparsearray;
        JVM INSTR monitorenter ;
        Object obj = (WeakReference)queriesForThreads.get(i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (AbstractQuery)((WeakReference) (obj)).get();
_L5:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        gc();
        obj = createQuery();
        queriesForThreads.put(i, new WeakReference(obj));
_L3:
        sparsearray;
        JVM INSTR monitorexit ;
        return ((AbstractQuery) (obj));
        System.arraycopy(initialValues, 0, ((AbstractQuery) (obj)).parameters, 0, initialValues.length);
          goto _L3
        obj;
        sparsearray;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    AbstractQuery forCurrentThread(AbstractQuery abstractquery)
    {
        if (Thread.currentThread() == abstractquery.ownerThread)
        {
            System.arraycopy(initialValues, 0, abstractquery.parameters, 0, initialValues.length);
            return abstractquery;
        } else
        {
            return forCurrentThread();
        }
    }

    void gc()
    {
        SparseArray sparsearray = queriesForThreads;
        sparsearray;
        JVM INSTR monitorenter ;
        int i = queriesForThreads.size() - 1;
_L2:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (((WeakReference)queriesForThreads.valueAt(i)).get() == null)
        {
            queriesForThreads.remove(queriesForThreads.keyAt(i));
        }
        break MISSING_BLOCK_LABEL_64;
        sparsearray;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
