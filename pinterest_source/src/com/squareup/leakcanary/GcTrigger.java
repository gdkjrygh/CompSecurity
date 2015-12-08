// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.leakcanary;


public interface GcTrigger
{

    public static final GcTrigger DEFAULT = new _cls1();

    public abstract void runGc();


    private class _cls1
        implements GcTrigger
    {

        public final void runGc()
        {
            Runtime.getRuntime().gc();
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedexception)
            {
                throw new AssertionError();
            }
            System.runFinalization();
        }

        _cls1()
        {
        }
    }

}
