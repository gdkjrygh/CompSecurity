// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;


// Referenced classes of package com.facebook.messages.model.threads:
//            TitanAttachmentInfo

public class k
{

    private String a;
    private int b;
    private String c;
    private String d;
    private int e;
    private TitanAttachmentInfo.ImageData f;

    public k()
    {
    }

    public k a(int i)
    {
        b = i;
        return this;
    }

    public k a(TitanAttachmentInfo.ImageData imagedata)
    {
        f = imagedata;
        return this;
    }

    public k a(String s)
    {
        a = s;
        return this;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public k b(int i)
    {
        e = i;
        return this;
    }

    public k b(String s)
    {
        c = s;
        return this;
    }

    public k c(String s)
    {
        d = s;
        return this;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public TitanAttachmentInfo.ImageData f()
    {
        return f;
    }

    public TitanAttachmentInfo g()
    {
        return new TitanAttachmentInfo(this);
    }
}
