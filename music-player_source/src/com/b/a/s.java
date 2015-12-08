// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


public abstract class s
    implements Runnable
{

    public s()
    {
    }

    public abstract void a();

    public void run()
    {
        try
        {
            a();
            return;
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
        }
    }
}
