// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            b

final class nit> extends nit>
{

    private TypeVariable a;
    private b b;
    private b c;

    public final Type a(TypeVariable typevariable, nit> nit>)
    {
        if (typevariable.getGenericDeclaration().equals(a.getGenericDeclaration()))
        {
            return typevariable;
        } else
        {
            return b.b(typevariable, nit>);
        }
    }

    ( , TypeVariable typevariable,  1)
    {
        c = ;
        a = typevariable;
        b = 1;
        super();
    }
}
