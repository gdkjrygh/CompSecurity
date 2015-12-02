// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;


// Referenced classes of package com.facebook.inject:
//            av

final class aw extends ThreadLocal
{

    aw()
    {
    }

    protected av a()
    {
        return new av(null);
    }

    protected Object initialValue()
    {
        return a();
    }
}
