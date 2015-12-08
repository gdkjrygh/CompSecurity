// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;

public class ga
    implements Serializable
{

    private final boolean a;
    public final byte b;
    private final String c;
    private final boolean d;

    public ga(byte byte0)
    {
        this(byte0, false);
    }

    public ga(byte byte0, boolean flag)
    {
        b = byte0;
        a = false;
        c = null;
        d = flag;
    }
}
