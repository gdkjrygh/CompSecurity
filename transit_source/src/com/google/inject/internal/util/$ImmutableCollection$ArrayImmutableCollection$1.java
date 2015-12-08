// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $UnmodifiableIterator, $ImmutableCollection

class i extends $UnmodifiableIterator
{

    int i;
    final i this$0;

    public boolean hasNext()
    {
        return i < cess._mth300(this._cls0.this).length;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            Object aobj[] = cess._mth300(this._cls0.this);
            int j = i;
            i = j + 1;
            return aobj[j];
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
        i = 0;
    }
}
