// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//            ANRError$$

class <init> extends Throwable
{

    final ANRError$$ this$0;

    public Throwable fillInStackTrace()
    {
        setStackTrace(b);
        return this;
    }

    private ( )
    {
        this$0 = ANRError$$.this;
        super(a, );
    }

    this._cls0(this._cls0 _pcls0, byte byte0)
    {
        this(_pcls0);
    }
}
