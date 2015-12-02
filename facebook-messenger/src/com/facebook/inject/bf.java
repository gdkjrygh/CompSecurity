// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;


// Referenced classes of package com.facebook.inject:
//            bg, be

class bf extends ThreadLocal
{

    final be a;

    bf(be be)
    {
        a = be;
        super();
    }

    protected bg a()
    {
        return new bg(null);
    }

    protected Object initialValue()
    {
        return a();
    }
}
