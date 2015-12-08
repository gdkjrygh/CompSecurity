// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            CharMatcher

static final class nit> extends CharMatcher
{

    final char val$match;

    public final boolean matches(char c)
    {
        return c == val$match;
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        if (charmatcher.matches(val$match))
        {
            return charmatcher;
        } else
        {
            return super.or(charmatcher);
        }
    }

    (char c)
    {
        val$match = c;
        super();
    }
}
