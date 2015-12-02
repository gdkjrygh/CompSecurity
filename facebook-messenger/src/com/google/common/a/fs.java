// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            mh, fp

class fs extends mh
{

    final mh a;
    final fp b;

    fs(fp fp, mh mh1)
    {
        b = fp;
        a = mh1;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((java.util.Map.Entry)a.next()).getValue();
    }
}
