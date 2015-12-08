// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import android.graphics.Bitmap;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            Moa

public class MoaResult
{

    public volatile int active;
    public Bitmap inputBitmap;
    public String inputString;
    public Bitmap outputBitmap;
    public String outputString;

    public MoaResult()
    {
        active = 1;
    }

    public void cancel()
    {
        active = 0;
    }

    public void execute()
    {
        this;
        JVM INSTR monitorenter ;
        Moa.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
