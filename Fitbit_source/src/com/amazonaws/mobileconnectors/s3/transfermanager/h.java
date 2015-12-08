// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;


// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            PauseStatus

public final class h
{

    private final PauseStatus a;
    private final Object b;

    public h(PauseStatus pausestatus)
    {
        this(pausestatus, null);
    }

    public h(PauseStatus pausestatus, Object obj)
    {
        if (pausestatus == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = pausestatus;
            b = obj;
            return;
        }
    }

    public PauseStatus a()
    {
        return a;
    }

    public Object b()
    {
        return b;
    }
}
