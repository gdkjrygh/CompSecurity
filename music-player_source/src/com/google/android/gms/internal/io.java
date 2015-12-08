// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fb, jq, im

public final class io extends fb
    implements SafeParcelable, b
{

    public static final jq a = new jq();
    private static final HashMap b;
    private final Set c;
    private final int d;
    private String e;
    private im f;
    private String g;
    private im h;
    private String i;

    public io()
    {
        d = 1;
        c = new HashSet();
    }

    io(Set set, int l, String s, im im1, String s1, im im2, String s2)
    {
        c = set;
        d = l;
        e = s;
        f = im1;
        g = s1;
        h = im2;
        i = s2;
    }

    public final Object a()
    {
        return this;
    }

    protected final boolean a(fb.a a1)
    {
        return c.contains(Integer.valueOf(a1.g()));
    }

    protected final Object b(fb.a a1)
    {
        switch (a1.g())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.g()).toString());

        case 2: // '\002'
            return e;

        case 4: // '\004'
            return f;

        case 5: // '\005'
            return g;

        case 6: // '\006'
            return h;

        case 7: // '\007'
            return i;
        }
    }

    public final HashMap b()
    {
        return b;
    }

    protected final Object c()
    {
        return null;
    }

    protected final boolean d()
    {
        return false;
    }

    public final int describeContents()
    {
        jq jq1 = a;
        return 0;
    }

    final Set e()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof io))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (io)obj;
            fb.a a1;
label1:
            do
            {
                for (Iterator iterator = b.values().iterator(); iterator.hasNext();)
                {
                    a1 = (fb.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((io) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((io) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((io) (obj)).a(a1));
            return false;
        }
        return true;
    }

    final int f()
    {
        return d;
    }

    public final String g()
    {
        return e;
    }

    final im h()
    {
        return f;
    }

    public final int hashCode()
    {
        Iterator iterator = b.values().iterator();
        int l = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fb.a a1 = (fb.a)iterator.next();
            if (a(a1))
            {
                int i1 = a1.g();
                l = b(a1).hashCode() + (l + i1);
            }
        } while (true);
        return l;
    }

    public final String i()
    {
        return g;
    }

    final im j()
    {
        return h;
    }

    public final String k()
    {
        return i;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        jq jq1 = a;
        jq.a(this, parcel, l);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("id", fb.a.d("id", 2));
        b.put("result", fb.a.a("result", 4, com/google/android/gms/internal/im));
        b.put("startDate", fb.a.d("startDate", 5));
        b.put("target", fb.a.a("target", 6, com/google/android/gms/internal/im));
        b.put("type", fb.a.d("type", 7));
    }
}
