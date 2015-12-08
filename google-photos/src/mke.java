// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

final class mke extends ThreadLocal
{

    mke()
    {
    }

    protected final Object initialValue()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new mkj();
        }
        Looper looper = Looper.myLooper();
        if (looper == null)
        {
            throw new IllegalStateException("The current thread must have a looper!");
        } else
        {
            return new mki(looper);
        }
    }
}
