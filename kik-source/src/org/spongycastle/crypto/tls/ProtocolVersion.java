// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;


public class ProtocolVersion
{

    public static final ProtocolVersion a = new ProtocolVersion(768);
    public static final ProtocolVersion b = new ProtocolVersion(769);
    public static final ProtocolVersion c = new ProtocolVersion(770);
    public static final ProtocolVersion d = new ProtocolVersion(771);
    private int e;

    private ProtocolVersion(int i)
    {
        e = 0xffff & i;
    }

    public boolean equals(Object obj)
    {
        return this == obj;
    }

    public int hashCode()
    {
        return e;
    }

}
