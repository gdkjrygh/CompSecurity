// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            al, af

abstract class ah extends al
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private af a;

        final Object readResolve()
        {
            return a.f();
        }

        a(af af1)
        {
            a = af1;
        }
    }


    ah()
    {
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = e().get(((java.util.Map.Entry) (obj)).getKey());
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    final boolean d()
    {
        return e().c();
    }

    abstract af e();

    public int size()
    {
        return e().size();
    }

    Object writeReplace()
    {
        return new a(e());
    }
}
