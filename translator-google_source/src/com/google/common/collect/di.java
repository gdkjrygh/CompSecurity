// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ei, dj, dh

final class di extends ei
{

    final dh a;

    di(dh dh, Iterator iterator)
    {
        a = dh;
        super(iterator);
    }

    final Object a(Object obj)
    {
        return new dj(this, (java.util.Map.Entry)obj);
    }
}
