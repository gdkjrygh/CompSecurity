// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;


public class ByteQueue
{

    private byte a[];
    private int b;
    private int c;

    public ByteQueue()
    {
        a = new byte[1024];
        b = 0;
        c = 0;
    }
}
