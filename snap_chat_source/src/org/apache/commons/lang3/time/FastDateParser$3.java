// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateParser

static final class mberStrategy extends mberStrategy
{

    final int modify(int i)
    {
        return i % 24;
    }

    mberStrategy(int i)
    {
        super(i);
    }
}
