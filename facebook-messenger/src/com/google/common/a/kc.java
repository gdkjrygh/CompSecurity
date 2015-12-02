// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em, jw, kd, mh

class kc extends em
{

    final jw a;

    kc(jw jw1)
    {
        a = jw1;
    }

    boolean a()
    {
        return true;
    }

    public boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    public mh h_()
    {
        return new kd(this, jw.a(a).length);
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return jw.a(a).length;
    }
}
