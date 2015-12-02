// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.net.Uri;

// Referenced classes of package com.facebook.orca.attachments:
//            ImageAttachmentData

public class g
{

    private Uri a;
    private Uri b;
    private int c;
    private int d;
    private Uri e;
    private String f;

    public g()
    {
    }

    public Uri a()
    {
        return a;
    }

    public g a(int i)
    {
        c = i;
        return this;
    }

    public g a(Uri uri)
    {
        a = uri;
        return this;
    }

    public g a(String s)
    {
        f = s;
        return this;
    }

    public Uri b()
    {
        return b;
    }

    public g b(int i)
    {
        d = i;
        return this;
    }

    public g b(Uri uri)
    {
        b = uri;
        return this;
    }

    public int c()
    {
        return c;
    }

    public g c(Uri uri)
    {
        e = uri;
        return this;
    }

    public int d()
    {
        return d;
    }

    public Uri e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public ImageAttachmentData g()
    {
        return new ImageAttachmentData(this);
    }
}
