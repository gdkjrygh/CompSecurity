// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.auth.viewercontext:
//            f

class g extends ThreadLocal
{

    final f a;

    g(f f)
    {
        a = f;
        super();
    }

    protected List a()
    {
        return hq.a();
    }

    protected Object initialValue()
    {
        return a();
    }
}
