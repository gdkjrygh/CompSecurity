// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.s;
import com.google.android.m4b.maps.bo.t;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            j

static final class e
{

    final float a;
    final float b;
    final int c;
    final int d[];
    private final int e;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (e)obj;
            if (c != ((c) (obj)).c)
            {
                return false;
            }
            if (Float.compare(((c) (obj)).a, a) != 0)
            {
                return false;
            }
            if (Float.compare(((a) (obj)).b, b) != 0)
            {
                return false;
            }
            if (!Arrays.equals(d, ((d) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return e;
    }

    public final String toString()
    {
        int i = c;
        float f = b;
        float f1 = a;
        String s1 = String.valueOf(Arrays.toString(d));
        return (new StringBuilder(String.valueOf(s1).length() + 52)).append("c:").append(i).append(" w:").append(f).append(" s:").append(f1).append(" d:").append(s1).toString();
    }

    public (float f, t t1, int i)
    {
        Object obj = null;
        super();
        a = f;
        b = t1.c[i].b;
        c = t1.c[i].a;
        int k;
        int i1;
        int j1;
        if (t1.d())
        {
            if (t1.b() > i)
            {
                t1 = t1.c[i].c;
                if (t1.length == 0)
                {
                    t1 = obj;
                }
                d = t1;
            } else
            {
                if (ab.a("GLLineGroup", 6))
                {
                    int l = t1.b();
                    Log.e("GLLineGroup", (new StringBuilder(67)).append("Invalid stroke index : ").append(i).append("  available strokes : ").append(l).toString());
                }
                d = null;
            }
        } else
        {
            d = null;
        }
        k = Float.floatToIntBits(a);
        i1 = Float.floatToIntBits(b);
        j1 = c;
        if (d != null)
        {
            i = Arrays.hashCode(d);
        } else
        {
            i = 0;
        }
        e = i + ((k * 31 + i1) * 31 + j1) * 31;
    }
}
