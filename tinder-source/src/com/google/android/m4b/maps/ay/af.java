// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import java.io.DataInput;
import java.io.DataOutput;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            n

public class af extends n
{

    private final int a;
    private final byte b[];
    private final boolean c;
    private final Object d = null;

    public af(int i, byte abyte0[], boolean flag)
    {
        a = i;
        b = abyte0;
        c = flag;
    }

    public final void a(DataOutput dataoutput)
    {
        dataoutput.write(b);
        if (d != null)
        {
            synchronized (d)
            {
                d.notifyAll();
            }
            return;
        } else
        {
            return;
        }
        exception;
        dataoutput;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(DataInput datainput)
    {
        if (d != null)
        {
            synchronized (d)
            {
                d.notifyAll();
            }
        }
        break MISSING_BLOCK_LABEL_31;
        exception;
        datainput;
        JVM INSTR monitorexit ;
        throw exception;
        return true;
    }

    public final boolean c()
    {
        return c;
    }

    public final int g()
    {
        return a;
    }
}
