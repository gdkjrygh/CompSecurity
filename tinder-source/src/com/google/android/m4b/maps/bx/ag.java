// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.y.h;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            h, r

public final class ag
    implements Comparable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        private static final a j[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bx/ag$a, s);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        static 
        {
            a = new a("BASE", 0);
            b = new a("DROP_SHADOWS_OUTER", 1);
            c = new a("ELEVATED_COLOR", 2);
            d = new a("UNDERGROUND_MODE_MASK", 3);
            e = new a("UNDERGROUND_STENCIL", 4);
            f = new a("UNDERGROUND_COLOR", 5);
            g = new a("DROP_SHADOWS_INNER", 6);
            h = new a("ANIMATED_ELEVATED_COLOR", 7);
            i = new a("DEFAULT", 8);
            j = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    public final r a;
    public final a b;
    public final Map c;
    boolean d;
    boolean e;
    private final Map f;

    public ag(r r1, a a1, Collection collection, Collection collection1)
    {
        f = ax.b();
        c = ax.b();
        d = false;
        e = false;
        a = r1;
        b = a1;
        for (r1 = collection.iterator(); r1.hasNext();)
        {
            a1 = (com.google.android.m4b.maps.bx.h)r1.next();
            collection = a1.a().iterator();
            while (collection.hasNext()) 
            {
                com.google.android.m4b.maps.ak.a a2 = (com.google.android.m4b.maps.ak.a)collection.next();
                f.put(a2, a1);
            }
        }

        for (r1 = collection1.iterator(); r1.hasNext();)
        {
            a1 = (com.google.android.m4b.maps.bx.h)r1.next();
            collection = a1.a().iterator();
            while (collection.hasNext()) 
            {
                collection1 = (com.google.android.m4b.maps.ak.a)collection.next();
                c.put(collection1, a1);
            }
        }

    }

    public transient ag(r r1, a a1, com.google.android.m4b.maps.bx.h ah[])
    {
        f = ax.b();
        c = ax.b();
        d = false;
        e = false;
        a = r1;
        b = a1;
        int j = ah.length;
        for (int i = 0; i < j; i++)
        {
            r1 = ah[i];
            com.google.android.m4b.maps.ak.a a2;
            for (a1 = r1.a().iterator(); a1.hasNext(); f.put(a2, r1))
            {
                a2 = (com.google.android.m4b.maps.ak.a)a1.next();
            }

        }

    }

    public final com.google.android.m4b.maps.bx.h a(com.google.android.m4b.maps.ak.a a1)
    {
        return (com.google.android.m4b.maps.bx.h)f.get(a1);
    }

    public final boolean a()
    {
        return b == com.google.android.m4b.maps.bx.a.a || b == a.c || b == com.google.android.m4b.maps.bx.a.h || b == a.f || b == a.i;
    }

    public final boolean b()
    {
        return b == a.g || b == a.b;
    }

    public final boolean c()
    {
        return b == a.e;
    }

    public final int compareTo(Object obj)
    {
        obj = (ag)obj;
        int k = b.compareTo(((ag) (obj)).b);
        int j = k;
        if (k == 0)
        {
            r r1 = a;
            r r2 = ((ag) (obj)).a;
            int i = k;
            if (r1 != null)
            {
                i = k;
                if (r2 != null)
                {
                    i = r1.d().ordinal() - r2.d().ordinal();
                }
            }
            j = i;
            if (i == 0)
            {
                j = i;
                if (!f.isEmpty())
                {
                    j = i;
                    if (!((ag) (obj)).f.isEmpty())
                    {
                        j = ((com.google.android.m4b.maps.bx.h)Collections.max(f.values())).compareTo((com.google.android.m4b.maps.bx.h)Collections.max(((ag) (obj)).f.values()));
                    }
                }
            }
        }
        return j;
    }

    public final String toString()
    {
        return h.a(this).a("overlay", a).a("order", b).a("isFirstPassForOverlay", d).a("isLastPassForOverlay", e).a("overlayRenderTweaks", f).a("featureRenderTweaks", c).toString();
    }
}
