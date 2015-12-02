// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public class Countable
{

    static final boolean a;
    private int mInstance;

    public Countable()
    {
    }

    private native void addref();

    private native void release();

    protected void a(int i)
    {
        if (!a && mInstance != 0)
        {
            throw new AssertionError();
        } else
        {
            mInstance = i;
            addref();
            return;
        }
    }

    protected void finalize()
    {
        h();
        super.finalize();
    }

    public void h()
    {
        if (mInstance != 0)
        {
            release();
            mInstance = 0;
        }
    }

    static 
    {
        boolean flag;
        if (!com/facebook/reflex/Countable.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
