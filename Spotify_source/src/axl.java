// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.transport.TransportType;

public abstract class axl
{

    protected boolean b;
    public int c;

    public axl()
    {
        b = true;
        c = 0x7fffffff;
    }

    public abstract TransportType a();

    public final boolean b()
    {
        return b;
    }
}
