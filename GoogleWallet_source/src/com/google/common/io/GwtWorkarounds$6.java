// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;


// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

static final class val.builder
    implements arOutput
{

    final StringBuilder val$builder;

    public final String toString()
    {
        return val$builder.toString();
    }

    public final void write(char c)
    {
        val$builder.append(c);
    }

    arOutput(StringBuilder stringbuilder)
    {
        val$builder = stringbuilder;
        super();
    }
}
