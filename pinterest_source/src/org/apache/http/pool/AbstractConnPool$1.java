// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.pool;


// Referenced classes of package org.apache.http.pool:
//            RouteSpecificPool, AbstractConnPool, PoolEntry

class init> extends RouteSpecificPool
{

    final AbstractConnPool this$0;
    final Object val$route;

    protected PoolEntry createEntry(Object obj)
    {
        return AbstractConnPool.this.createEntry(val$route, obj);
    }

    (Object obj1)
    {
        this$0 = final_abstractconnpool;
        val$route = obj1;
        super(Object.this);
    }
}
