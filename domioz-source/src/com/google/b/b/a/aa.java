// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;

final class aa extends al
{

    aa()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    public final void a(d d1, Object obj)
    {
        obj = (Class)obj;
        if (obj == null)
        {
            d1.f();
            return;
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder("Attempted to serialize java.lang.Class: ")).append(((Class) (obj)).getName()).append(". Forgot to register a type adapter?").toString());
        }
    }
}
