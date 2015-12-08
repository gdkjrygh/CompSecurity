// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//            MessageThreadUtil

static class 
{

    private  mRoot;

     next()
    {
        this;
        JVM INSTR monitorenter ;
          = mRoot;
        if ( != null) goto _L2; else goto _L1
_L1:
         = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ;
_L2:
         = mRoot;
        mRoot = .access._mth200(mRoot);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }


// JavaClassFileOutputException: Prev chain is broken

    void sendMessage( )
    {
        this;
        JVM INSTR monitorenter ;
        if (mRoot != null) goto _L2; else goto _L1
_L1:
        mRoot = ;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
         1;
        for (1 = mRoot; .access._mth200(1) != null; 1 = .access._mth200(1)) { }
        .access._mth202(1, );
        if (true) goto _L4; else goto _L3
_L3:
        ;
        throw ;
    }

    void sendMessageAtFrontOfQueue( )
    {
        this;
        JVM INSTR monitorenter ;
        .access._mth202(, mRoot);
        mRoot = ;
        this;
        JVM INSTR monitorexit ;
        return;
        ;
        throw ;
    }

    ()
    {
    }
}
