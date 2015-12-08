// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Splitter

class val.sequence
    implements Iterable
{

    final Splitter this$0;
    final CharSequence val$sequence;

    public Iterator iterator()
    {
        return Splitter.access$000(Splitter.this).iterator(Splitter.this, val$sequence);
    }

    rategy()
    {
        this$0 = final_splitter;
        val$sequence = CharSequence.this;
        super();
    }
}
