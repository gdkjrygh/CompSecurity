// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            b, e

static class a
{

    private final af a;

    final a a(Map map)
    {
        com.google.android.m4b.maps.aa.  = af.e();
        .a(a);
        map = map.entrySet().iterator();
        while (map.hasNext()) 
        {
            Object obj = (java.util.Entry)map.next();
             1 = (a)((java.util.Entry) (obj)).getKey();
            obj = (Type)((java.util.Entry) (obj)).getValue();
            boolean flag;
            if (!1.b(((Type) (obj))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.a(flag, "Type variable %s bound to itself", new Object[] {
                1
            });
            .a(1, obj);
        }
        return new <init>(.a());
    }

    Type a(TypeVariable typevariable, .a a1)
    {
        Type type;
        type = (Type)a.get(new <init>(typevariable));
        if (type != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        type = typevariable.getBounds();
        if (type.length != 0) goto _L2; else goto _L1
_L1:
        return typevariable;
_L2:
        a1 = (new b(a1, (byte)0)).a(type);
        if (a && Arrays.equals(type, a1)) goto _L1; else goto _L3
_L3:
        return e.a(typevariable.getGenericDeclaration(), typevariable.getName(), a1);
        return (new b(a1, (byte)0)).a(type);
    }

    <init>()
    {
        a = af.d();
    }

    private (af af1)
    {
        a = af1;
    }

    // Unreferenced inner class com/google/android/m4b/maps/ah/b$b$1

/* anonymous class */
    final class _cls1 extends b.b
    {

        private TypeVariable a;
        private b.b b;
        private b.b c;

        public final Type a(TypeVariable typevariable, b.b b1)
        {
            if (typevariable.getGenericDeclaration().equals(a.getGenericDeclaration()))
            {
                return typevariable;
            } else
            {
                return b.a(typevariable, b1);
            }
        }

            
            {
                c = b.b.this;
                a = typevariable;
                b = b2;
                super();
            }
    }

}
