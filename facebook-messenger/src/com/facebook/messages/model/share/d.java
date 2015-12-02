// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;


// Referenced classes of package com.facebook.messages.model.share:
//            ShareMedia, ShareMediaPhoto, ShareMediaVideo

public class d
{

    private String a;
    private String b;
    private String c;
    private String d;
    private ShareMediaPhoto e;
    private ShareMediaVideo f;

    public d()
    {
    }

    public d a(ShareMediaPhoto sharemediaphoto)
    {
        e = sharemediaphoto;
        return this;
    }

    public d a(ShareMediaVideo sharemediavideo)
    {
        f = sharemediavideo;
        return this;
    }

    public d a(String s)
    {
        a = s;
        return this;
    }

    public String a()
    {
        return a;
    }

    public d b(String s)
    {
        b = s;
        return this;
    }

    public String b()
    {
        return b;
    }

    public d c(String s)
    {
        c = s;
        return this;
    }

    public String c()
    {
        return c;
    }

    public d d(String s)
    {
        d = s;
        return this;
    }

    public String d()
    {
        return d;
    }

    public ShareMediaPhoto e()
    {
        return e;
    }

    public ShareMediaVideo f()
    {
        return f;
    }

    public ShareMedia g()
    {
        return new ShareMedia(this);
    }
}
