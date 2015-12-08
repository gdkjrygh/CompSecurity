// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class eqa
{

    public final Serializable a;

    private eqa(Serializable serializable)
    {
        a = serializable;
    }

    public static eqa a(Serializable serializable)
    {
        return new eqa(serializable);
    }
}
