// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $AbstractIterator, $ImmutableSet

class index extends $AbstractIterator
{

    int index;
    final endOfData this$0;

    protected Object computeNext()
    {
        if (index < urce.length)
        {
            index index1 = this._cls0.this;
            Object aobj[] = urce;
            int i = index;
            index = i + 1;
            return index1.ansform(aobj[i]);
        } else
        {
            return endOfData();
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
        index = 0;
    }
}
