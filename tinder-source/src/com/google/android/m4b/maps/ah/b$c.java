// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.y.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            b

static final class a
{

    private final TypeVariable a;

    static Object a(Type type)
    {
        if (type instanceof TypeVariable)
        {
            return new <init>((TypeVariable)type);
        } else
        {
            return null;
        }
    }

    private boolean a(TypeVariable typevariable)
    {
        return a.getGenericDeclaration().equals(typevariable.getGenericDeclaration()) && a.getName().equals(typevariable.getName());
    }

    final boolean b(Type type)
    {
        if (type instanceof TypeVariable)
        {
            return a((TypeVariable)type);
        } else
        {
            return false;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            return a(((a)obj).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a.getGenericDeclaration(), a.getName()
        });
    }

    public final String toString()
    {
        return a.toString();
    }

    (TypeVariable typevariable)
    {
        a = (TypeVariable)j.a(typevariable);
    }
}
