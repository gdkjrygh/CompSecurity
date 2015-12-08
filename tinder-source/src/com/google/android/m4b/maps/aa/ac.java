// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            af, z, d, al, 
//            e, x, ah, ax

final class ac extends af
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private EnumMap a;

        final Object readResolve()
        {
            return new ac(a, (byte)0);
        }

        a(EnumMap enummap)
        {
            a = enummap;
        }
    }


    private final transient EnumMap a;

    private ac(EnumMap enummap)
    {
        a = enummap;
        boolean flag;
        if (!enummap.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
    }

    ac(EnumMap enummap, byte byte0)
    {
        this(enummap);
    }

    static af a(EnumMap enummap)
    {
        switch (enummap.size())
        {
        default:
            return new ac(enummap);

        case 0: // '\0'
            return com.google.android.m4b.maps.aa.z.j();

        case 1: // '\001'
            enummap = (java.util.Map.Entry)d.a(enummap.entrySet());
            break;
        }
        return z.c(enummap.getKey(), enummap.getValue());
    }

    static EnumMap a(ac ac1)
    {
        return ac1.a;
    }

    final al a()
    {
        return new al() {

            private ac a;

            public final x a()
            {
                return e.a(ac.a(a).keySet().iterator());
            }

            public final boolean contains(Object obj)
            {
                return ac.a(a).containsKey(obj);
            }

            final boolean d()
            {
                return true;
            }

            public final Iterator iterator()
            {
                return a();
            }

            public final int size()
            {
                return a.size();
            }

            
            {
                a = ac.this;
                super();
            }
        };
    }

    final al b()
    {
        return new ah() {

            final ac a;

            public final x a()
            {
                return new x(this) {

                    private final Iterator a;
                    private _cls2 b;

                    public final boolean hasNext()
                    {
                        return a.hasNext();
                    }

                    public final Object next()
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
                        return ax.a(entry.getKey(), entry.getValue());
                    }

            
            {
                b = _pcls2;
                super();
                a = ac.a(b.a).entrySet().iterator();
            }
                };
            }

            final af e()
            {
                return a;
            }

            public final Iterator iterator()
            {
                return a();
            }

            
            {
                a = ac.this;
                super();
            }
        };
    }

    final boolean c()
    {
        return false;
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    public final Object get(Object obj)
    {
        return a.get(obj);
    }

    public final int size()
    {
        return a.size();
    }

    final Object writeReplace()
    {
        return new a(a);
    }
}
