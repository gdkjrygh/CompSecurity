// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

final class previousAccess extends nceEntry
{

     nextAccess;
     previousAccess;
    final  this$0;

    public final long getAccessTime()
    {
        return 0x7fffffffffffffffL;
    }

    public final  getNextInAccessQueue()
    {
        return nextAccess;
    }

    public final  getPreviousInAccessQueue()
    {
        return previousAccess;
    }

    public final void setAccessTime(long l)
    {
    }

    public final void setNextInAccessQueue( )
    {
        nextAccess = ;
    }

    public final void setPreviousInAccessQueue( )
    {
        previousAccess = ;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
        nextAccess = this;
        previousAccess = this;
    }
}
