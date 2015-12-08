// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.f;

final class z extends am
{

    z()
    {
    }

    public final Object a(a a1)
    {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    public final void a(f f, Object obj)
    {
        f = (Class)obj;
        throw new UnsupportedOperationException((new StringBuilder("Attempted to serialize java.lang.Class: ")).append(f.getName()).append(". Forgot to register a type adapter?").toString());
    }
}
