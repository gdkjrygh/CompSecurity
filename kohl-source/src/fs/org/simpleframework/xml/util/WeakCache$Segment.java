// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.util;

import java.util.WeakHashMap;

// Referenced classes of package fs.org.simpleframework.xml.util:
//            WeakCache

private class <init> extends WeakHashMap
{

    final WeakCache this$0;

    public void cache(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public boolean contains(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = containsKey(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public Object fetch(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    private ()
    {
        this$0 = WeakCache.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
