// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.callbacks;

import com.leanplum.Var;

public abstract class VariableCallback
    implements Runnable
{

    private Var a;

    public VariableCallback()
    {
    }

    public abstract void handle(Var var);

    public void run()
    {
        handle(a);
    }

    public void setVariable(Var var)
    {
        a = var;
    }
}
