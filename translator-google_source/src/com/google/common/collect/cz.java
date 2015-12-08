// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ej

final class cz extends ej
{

    final ej a;

    cz(ej ej1)
    {
        a = ej1;
        super();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return ((java.util.Map.Entry)a.next()).getValue();
    }
}
