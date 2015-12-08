// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;


public class OperationCanceledException extends RuntimeException
{

    public OperationCanceledException()
    {
        this((byte)0);
    }

    private OperationCanceledException(byte byte0)
    {
        super("The operation has been canceled.");
    }
}
