// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            CharMatcher, Preconditions

static final class  extends CharMatcher
{

    public final boolean matches(char c)
    {
        return false;
    }

    public final boolean matchesAllOf(CharSequence charsequence)
    {
        return charsequence.length() == 0;
    }

    public final CharMatcher or(CharMatcher charmatcher)
    {
        return (CharMatcher)Preconditions.checkNotNull(charmatcher);
    }

    ()
    {
    }
}
