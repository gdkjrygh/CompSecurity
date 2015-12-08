// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ab;
import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class ad extends af
{

    ad()
    {
    }

    public Character a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        a1 = a1.h();
        if (a1.length() != 1)
        {
            throw new ab((new StringBuilder()).append("Expecting character, got: ").append(a1).toString());
        } else
        {
            return Character.valueOf(a1.charAt(0));
        }
    }

    public void a(d d1, Character character)
    {
        if (character == null)
        {
            character = null;
        } else
        {
            character = String.valueOf(character);
        }
        d1.b(character);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Character)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
