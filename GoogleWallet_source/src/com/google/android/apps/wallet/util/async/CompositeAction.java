// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import java.util.concurrent.Callable;

public abstract class CompositeAction
    implements Callable
{

    public CompositeAction()
    {
    }

    public Object call()
        throws Exception
    {
        throw new IllegalAccessError();
    }

    public abstract Callable[] getActions();
}
