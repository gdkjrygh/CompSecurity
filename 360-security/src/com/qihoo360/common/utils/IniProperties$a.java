// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.util.Enumeration;
import java.util.Iterator;

// Referenced classes of package com.qihoo360.common.utils:
//            IniProperties

private static class a
    implements Iterator
{

    private Enumeration a;

    public boolean hasNext()
    {
        return a.hasMoreElements();
    }

    public Object next()
    {
        return a.nextElement();
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Can't change underlying enumeration");
    }

    public (Enumeration enumeration)
    {
        a = enumeration;
    }
}
