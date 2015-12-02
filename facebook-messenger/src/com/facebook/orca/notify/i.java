// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            ai, aj

public class i extends ai
{

    private final String b;
    private boolean c;

    public i(String s)
    {
        super(aj.FAILED_TO_SEND);
        b = s;
    }

    public String a()
    {
        return b;
    }

    public void a(boolean flag)
    {
        c = flag;
    }
}
