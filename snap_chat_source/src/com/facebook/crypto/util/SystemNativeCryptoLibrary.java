// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.crypto.util;

import com.facebook.crypto.exception.CryptoInitializationException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.crypto.util:
//            NativeCryptoLibrary

public class SystemNativeCryptoLibrary
    implements NativeCryptoLibrary
{

    private static final ArrayList LIBS = new ArrayList() {

            
            {
                add("conceal");
            }
    };
    private boolean mLibrariesLoaded;
    private volatile UnsatisfiedLinkError mLinkError;
    private boolean mLoadLibraries;

    public SystemNativeCryptoLibrary()
    {
        mLoadLibraries = true;
        mLibrariesLoaded = false;
        mLinkError = null;
    }

    private boolean loadLibraries()
    {
        this;
        JVM INSTR monitorenter ;
        if (mLoadLibraries) goto _L2; else goto _L1
_L1:
        boolean flag = mLibrariesLoaded;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        for (Iterator iterator = LIBS.iterator(); iterator.hasNext(); System.loadLibrary((String)iterator.next())) { }
        break MISSING_BLOCK_LABEL_73;
        Object obj;
        obj;
        mLinkError = ((UnsatisfiedLinkError) (obj));
        mLibrariesLoaded = false;
_L4:
        mLoadLibraries = false;
        flag = mLibrariesLoaded;
          goto _L3
        mLibrariesLoaded = true;
          goto _L4
        obj;
        throw obj;
    }

    public void ensureCryptoLoaded()
    {
        this;
        JVM INSTR monitorenter ;
        if (!loadLibraries())
        {
            throw new CryptoInitializationException(mLinkError);
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

}
