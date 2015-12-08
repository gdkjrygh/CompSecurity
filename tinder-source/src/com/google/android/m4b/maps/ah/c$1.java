// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            d, c, e

static final class nit> extends d
{

    private com.google.android.m4b.maps.aa. a;

    final void a(Class class1)
    {
        a.c(class1);
    }

    final void a(GenericArrayType genericarraytype)
    {
        a.c(e.a(c.c(genericarraytype.getGenericComponentType())));
    }

    final void a(ParameterizedType parameterizedtype)
    {
        a.c((Class)parameterizedtype.getRawType());
    }

    final void a(TypeVariable typevariable)
    {
        a(typevariable.getBounds());
    }

    final void a(WildcardType wildcardtype)
    {
        a(wildcardtype.getUpperBounds());
    }

    (com.google.android.m4b.maps.aa. )
    {
        a = ;
        super();
    }
}
