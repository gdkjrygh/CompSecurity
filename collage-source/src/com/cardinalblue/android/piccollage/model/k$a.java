// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;


// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            k

public static class a extends Exception
{

    public Throwable a;

    public (String s)
    {
        this(new Throwable(s));
    }

    public <init>(Throwable throwable)
    {
        super(throwable.getMessage());
        a = throwable;
    }
}
