// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            ab, bb

abstract class ag extends ab
{
    static final class a extends ag
    {

        final ag a()
        {
            return null;
        }

        final ag b()
        {
            return null;
        }

        a(Object obj, Object obj1)
        {
            super(obj, obj1);
        }
    }


    ag(ag ag1)
    {
        super(ag1.getKey(), ag1.getValue());
    }

    ag(Object obj, Object obj1)
    {
        super(obj, obj1);
        bb.a(obj, obj1);
    }

    abstract ag a();

    abstract ag b();
}
