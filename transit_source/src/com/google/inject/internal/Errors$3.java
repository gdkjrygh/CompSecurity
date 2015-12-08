// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Classes;
import java.lang.reflect.Member;

// Referenced classes of package com.google.inject.internal:
//            Errors

static final class nverter extends nverter
{

    public volatile String toString(Object obj)
    {
        return toString((Member)obj);
    }

    public String toString(Member member)
    {
        return $Classes.toString(member);
    }

    sses(Class class1)
    {
        super(class1);
    }
}
