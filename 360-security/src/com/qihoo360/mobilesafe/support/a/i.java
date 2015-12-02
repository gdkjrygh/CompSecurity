// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;


public class i
{

    private boolean a;

    public i()
    {
        a = true;
    }

    public void a()
    {
        super.notify();
        a = false;
    }

    public void a(int j)
    {
        if (!a)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (j == 0)
        {
            try
            {
                super.wait();
                return;
            }
            catch (InterruptedException interruptedexception) { }
            break MISSING_BLOCK_LABEL_24;
        }
        super.wait(j);
        return;
    }
}
