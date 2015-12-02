// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.z;
import com.facebook.orca.g.t;
import com.facebook.orca.o.b;
import com.facebook.orca.protocol.a;
import com.facebook.orca.sms.bj;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.app:
//            g, h, i

class cl extends d
{

    final h a;

    private cl(h h)
    {
        a = h;
        super();
    }

    cl(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((z)a(com/facebook/orca/f/z), (ad)a(com/facebook/orca/f/ad), (g)a(com/facebook/orca/app/g), (t)a(com/facebook/orca/g/t), (bj)a(com/facebook/orca/sms/bj), (a)a(com/facebook/orca/protocol/a), b(com/facebook/orca/threads/FolderName, com/facebook/orca/annotations/CurrentFolder));
    }

    public Object b()
    {
        return a();
    }
}
