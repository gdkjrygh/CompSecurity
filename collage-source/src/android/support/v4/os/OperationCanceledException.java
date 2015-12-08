// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;


public class OperationCanceledException extends RuntimeException
{

    public OperationCanceledException()
    {
        this(null);
    }

    public OperationCanceledException(String s)
    {
        if (s == null)
        {
            s = "The operation has been canceled.";
        }
        super(s);
    }
}
