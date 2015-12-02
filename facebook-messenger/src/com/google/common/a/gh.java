// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            mh

final class gh extends mh
{

    gh()
    {
    }

    public boolean hasNext()
    {
        return false;
    }

    public Object next()
    {
        throw new NoSuchElementException();
    }
}
