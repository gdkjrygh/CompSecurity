// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.mobvista.sdk.m.a.b.a.a;

public class n extends BitmapDrawable
{

    private int a;
    private int b;
    private boolean c;

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a <= 0 && b <= 0 && c && b())
        {
            com.mobvista.sdk.m.a.b.a.a.b("CountingBitmapDrawable", (new StringBuilder("No longer being used or cached so recycling. ")).append(toString()).toString());
            getBitmap().recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = getBitmap();
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        boolean flag = bitmap.isRecycled();
        if (flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        a = a + 1;
_L1:
        this;
        JVM INSTR monitorexit ;
        a();
        return;
        a = a - 1;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }
}
