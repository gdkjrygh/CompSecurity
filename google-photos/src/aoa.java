// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

public final class aoa
    implements anq
{

    private final aqp a;

    public aoa(aqp aqp)
    {
        a = aqp;
    }

    public final anp a(Object obj)
    {
        return new anz((InputStream)obj, a);
    }

    public final Class a()
    {
        return java/io/InputStream;
    }
}
