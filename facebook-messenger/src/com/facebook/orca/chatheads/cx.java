// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.inject.d;
import com.facebook.orca.chatheads.annotations.IsChatHeadsMultiProcessEnabled;

// Referenced classes of package com.facebook.orca.chatheads:
//            cz, cn, co

class cx extends d
{

    final cn a;

    private cx(cn cn)
    {
        a = cn;
        super();
    }

    cx(cn cn, co co)
    {
        this(cn);
    }

    public cz a()
    {
        return new cz(b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsMultiProcessEnabled));
    }

    public Object b()
    {
        return a();
    }
}
