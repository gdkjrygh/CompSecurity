// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em, fp, mh

class fw extends em
{

    private final fp a;

    fw(fp fp1)
    {
        a = fp1;
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
        return a.h();
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return a.size();
    }
}
