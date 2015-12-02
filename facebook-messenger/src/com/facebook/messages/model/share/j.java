// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;


// Referenced classes of package com.facebook.messages.model.share:
//            ShareProperty

public class j
{

    private String a;
    private String b;
    private String c;

    public j()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public ShareProperty d()
    {
        return new ShareProperty(this);
    }
}
