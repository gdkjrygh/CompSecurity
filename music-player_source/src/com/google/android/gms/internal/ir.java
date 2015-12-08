// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fb, js, ey

public final class ir extends fb
    implements SafeParcelable, a
{

    public static final js a = new js();
    private static final HashMap b;
    private List A;
    private boolean B;
    private final Set c;
    private final int d;
    private String e;
    private a f;
    private String g;
    private String h;
    private int i;
    private b j;
    private String k;
    private String l;
    private int m;
    private String n;
    private c o;
    private boolean p;
    private String q;
    private d r;
    private String s;
    private int t;
    private List u;
    private List v;
    private int w;
    private int x;
    private String y;
    private String z;

    public ir()
    {
        d = 2;
        c = new HashSet();
    }

    ir(Set set, int i1, String s1, a a1, String s2, String s3, int j1, 
            b b1, String s4, String s5, int k1, String s6, c c1, boolean flag, 
            String s7, d d1, String s8, int l1, List list, List list1, int i2, 
            int j2, String s9, String s10, List list2, boolean flag1)
    {
        c = set;
        d = i1;
        e = s1;
        f = a1;
        g = s2;
        h = s3;
        i = j1;
        j = b1;
        k = s4;
        l = s5;
        m = k1;
        n = s6;
        o = c1;
        p = flag;
        q = s7;
        r = d1;
        s = s8;
        t = l1;
        u = list;
        v = list1;
        w = i2;
        x = j2;
        y = s9;
        z = s10;
        A = list2;
        B = flag1;
    }

    public final String A()
    {
        return y;
    }

    public final String B()
    {
        return z;
    }

    final List C()
    {
        return A;
    }

    public final boolean D()
    {
        return B;
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
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.g()).toString());

        case 2: // '\002'
            return e;

        case 3: // '\003'
            return f;

        case 4: // '\004'
            return g;

        case 5: // '\005'
            return h;

        case 6: // '\006'
            return Integer.valueOf(i);

        case 7: // '\007'
            return j;

        case 8: // '\b'
            return k;

        case 9: // '\t'
            return l;

        case 12: // '\f'
            return Integer.valueOf(m);

        case 14: // '\016'
            return n;

        case 15: // '\017'
            return o;

        case 16: // '\020'
            return Boolean.valueOf(p);

        case 18: // '\022'
            return q;

        case 19: // '\023'
            return r;

        case 20: // '\024'
            return s;

        case 21: // '\025'
            return Integer.valueOf(t);

        case 22: // '\026'
            return u;

        case 23: // '\027'
            return v;

        case 24: // '\030'
            return Integer.valueOf(w);

        case 25: // '\031'
            return Integer.valueOf(x);

        case 26: // '\032'
            return y;

        case 27: // '\033'
            return z;

        case 28: // '\034'
            return A;

        case 29: // '\035'
            return Boolean.valueOf(B);
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
        js js1 = a;
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
            if (!(obj instanceof ir))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ir)obj;
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
                    if (((ir) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((ir) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ir) (obj)).a(a1));
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

    final a h()
    {
        return f;
    }

    public final int hashCode()
    {
        Iterator iterator = b.values().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fb.a a1 = (fb.a)iterator.next();
            if (a(a1))
            {
                int j1 = a1.g();
                i1 = b(a1).hashCode() + (i1 + j1);
            }
        } while (true);
        return i1;
    }

    public final String i()
    {
        return g;
    }

    public final String j()
    {
        return h;
    }

    public final int k()
    {
        return i;
    }

    final b l()
    {
        return j;
    }

    public final String m()
    {
        return k;
    }

    public final String n()
    {
        return l;
    }

    public final int o()
    {
        return m;
    }

    public final String p()
    {
        return n;
    }

    final c q()
    {
        return o;
    }

    public final boolean r()
    {
        return p;
    }

    public final String s()
    {
        return q;
    }

    final d t()
    {
        return r;
    }

    public final String u()
    {
        return s;
    }

    public final int v()
    {
        return t;
    }

    final List w()
    {
        return u;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        js js1 = a;
        com.google.android.gms.internal.js.a(this, parcel, i1);
    }

    final List x()
    {
        return v;
    }

    public final int y()
    {
        return w;
    }

    public final int z()
    {
        return x;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("aboutMe", fb.a.d("aboutMe", 2));
        b.put("ageRange", com.google.android.gms.internal.fb.a.a("ageRange", 3, com/google/android/gms/internal/ir$a));
        b.put("birthday", fb.a.d("birthday", 4));
        b.put("braggingRights", fb.a.d("braggingRights", 5));
        b.put("circledByCount", com.google.android.gms.internal.fb.a.a("circledByCount", 6));
        b.put("cover", com.google.android.gms.internal.fb.a.a("cover", 7, com/google/android/gms/internal/ir$b));
        b.put("currentLocation", fb.a.d("currentLocation", 8));
        b.put("displayName", fb.a.d("displayName", 9));
        b.put("gender", com.google.android.gms.internal.fb.a.a("gender", 12, (new ey()).a("male", 0).a("female", 1).a("other", 2)));
        b.put("id", fb.a.d("id", 14));
        b.put("image", com.google.android.gms.internal.fb.a.a("image", 15, com/google/android/gms/internal/ir$c));
        b.put("isPlusUser", fb.a.c("isPlusUser", 16));
        b.put("language", fb.a.d("language", 18));
        b.put("name", com.google.android.gms.internal.fb.a.a("name", 19, com/google/android/gms/internal/ir$d));
        b.put("nickname", fb.a.d("nickname", 20));
        b.put("objectType", com.google.android.gms.internal.fb.a.a("objectType", 21, (new ey()).a("person", 0).a("page", 1)));
        b.put("organizations", fb.a.b("organizations", 22, com/google/android/gms/internal/ir$f));
        b.put("placesLived", fb.a.b("placesLived", 23, com/google/android/gms/internal/ir$g));
        b.put("plusOneCount", com.google.android.gms.internal.fb.a.a("plusOneCount", 24));
        b.put("relationshipStatus", com.google.android.gms.internal.fb.a.a("relationshipStatus", 25, (new ey()).a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8)));
        b.put("tagline", fb.a.d("tagline", 26));
        b.put("url", fb.a.d("url", 27));
        b.put("urls", fb.a.b("urls", 28, com/google/android/gms/internal/ir$h));
        b.put("verified", fb.a.c("verified", 29));
    }
}
