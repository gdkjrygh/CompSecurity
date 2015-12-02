// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.bd;
import com.facebook.ui.media.b.a;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class ag extends d
{

    final com.facebook.orca.protocol.d a;

    private ag(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    ag(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public bd a()
    {
        return new bd((com.facebook.ui.media.attachments.d)a(com/facebook/ui/media/attachments/d), (a)a(com/facebook/ui/media/b/a));
    }

    public Object b()
    {
        return a();
    }
}
