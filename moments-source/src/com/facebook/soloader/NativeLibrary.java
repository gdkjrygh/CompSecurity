// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import android.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.soloader:
//            SoLoader

public abstract class NativeLibrary
{

    private static final String a = com/facebook/soloader/NativeLibrary.getName();
    private final Object b = new Object();
    private List c;
    private Boolean d;
    private boolean e;
    private volatile UnsatisfiedLinkError f;

    protected NativeLibrary(List list)
    {
        d = Boolean.valueOf(true);
        e = false;
        f = null;
        c = list;
    }

    public final boolean a()
    {
label0:
        {
            boolean flag;
            synchronized (b)
            {
                if (d.booleanValue())
                {
                    break label0;
                }
                flag = e;
            }
            return flag;
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); SoLoader.a((String)iterator.next())) { }
        break MISSING_BLOCK_LABEL_103;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        Log.e(a, "Failed to load native lib: ", unsatisfiedlinkerror);
        f = unsatisfiedlinkerror;
        e = false;
_L1:
        boolean flag1;
        d = Boolean.valueOf(false);
        flag1 = e;
        obj;
        JVM INSTR monitorexit ;
        return flag1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b();
        e = true;
        c = null;
          goto _L1
    }

    protected void b()
    {
    }

}
