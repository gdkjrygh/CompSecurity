// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            em, ex, fb, ev, 
//            fi, mh

class fa extends em
{

    final ex a;

    fa(ex ex1)
    {
        a = ex1;
    }

    boolean a()
    {
        return a.k();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            return a.b(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
        } else
        {
            return false;
        }
    }

    public mh h_()
    {
        return new fb(this, a.b.a().h_());
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
