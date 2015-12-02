// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

class it> extends CharMatcher
{

    final CharMatcher this$0;
    final kupTable val$table;

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return val$table.get(c);
    }

    public CharMatcher precomputed()
    {
        return this;
    }

    kupTable()
    {
        this$0 = final_charmatcher;
        val$table = kupTable.this;
        super();
    }
}
