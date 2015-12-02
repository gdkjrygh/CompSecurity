// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.SendWebrtcMessageMethod;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class ad extends d
{

    final com.facebook.orca.protocol.d a;

    private ad(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    ad(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public SendWebrtcMessageMethod a()
    {
        return new SendWebrtcMessageMethod();
    }

    public Object b()
    {
        return a();
    }
}
