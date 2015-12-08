// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.query;

import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.SessionScopeGetter;

// Referenced classes of package de.greenrobot.dao.query:
//            DeleteQuery

public class DeleteQueryExt
{

    private final DeleteQuery query;

    public DeleteQueryExt(DeleteQuery deletequery)
    {
        query = deletequery;
    }

    public void executeDeleteAndClearCache()
    {
        this;
        JVM INSTR monitorenter ;
        SessionScopeGetter.getSession(query.dao).runInTx(new _cls1());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void executeDeleteWithoutDetachingEntities()
    {
        this;
        JVM INSTR monitorenter ;
        query.executeDeleteWithoutDetachingEntities();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }


    /* member class not found */
    class _cls1 {}

}
