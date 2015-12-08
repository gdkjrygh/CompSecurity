// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;


// Referenced classes of package com.googlecode.flickrjandroid:
//            RequestContext

final class a extends ThreadLocal
{

    private a()
    {
    }

    a(byte byte0)
    {
        this();
    }

    protected final Object initialValue()
    {
        return new RequestContext();
    }
}
