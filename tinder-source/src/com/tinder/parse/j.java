// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.b.a.a.b;
import com.tinder.model.Match;

final class j
    implements b
{

    private static final j a = new j();

    private j()
    {
    }

    public static b a()
    {
        return a;
    }

    public final boolean test(Object obj)
    {
        return ((Match)obj).hasNewMessage();
    }

}
