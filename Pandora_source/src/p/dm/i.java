// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import p.dn.a;

public class i extends Exception
{

    public i(String s, byte abyte0[])
    {
        super((new StringBuilder()).append(s).append(" data=").append(a.b(abyte0)).toString());
    }
}
