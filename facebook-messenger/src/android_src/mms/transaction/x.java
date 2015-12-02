// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.net.Uri;

public class x
{

    private Uri a;
    private int b;

    public x()
    {
        b = 0;
        a = null;
    }

    public int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i >= 0 || i <= 2)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Bad state: ").append(i).toString());
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        b = i;
        this;
        JVM INSTR monitorexit ;
    }

    void a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        a = uri;
        this;
        JVM INSTR monitorexit ;
        return;
        uri;
        throw uri;
    }

    public Uri b()
    {
        this;
        JVM INSTR monitorenter ;
        Uri uri = a;
        this;
        JVM INSTR monitorexit ;
        return uri;
        Exception exception;
        exception;
        throw exception;
    }
}
