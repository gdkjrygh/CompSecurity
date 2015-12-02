// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em, fd, ex, mh

class fc extends em
{

    final ex a;

    fc(ex ex1)
    {
        a = ex1;
    }

    boolean a()
    {
        return true;
    }

    public mh h_()
    {
        return new fd(this, a.n().h_());
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return a.d();
    }
}
