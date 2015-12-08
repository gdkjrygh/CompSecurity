// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class cja
{

    public final Object a;
    public int b;
    public int c;
    public final cix d;
    public final String e;

    private cja(cix cix, String s)
    {
        a = new Object();
        d = cix;
        e = s;
    }

    public cja(String s)
    {
        this(bkv.h(), s);
    }

    public final Bundle a()
    {
        Bundle bundle;
        synchronized (a)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", b);
            bundle.putInt("pmnll", c);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
