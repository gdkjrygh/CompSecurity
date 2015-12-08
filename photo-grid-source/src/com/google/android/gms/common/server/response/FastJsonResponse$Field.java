// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            b, SafeParcelResponse, a, FieldMappingDictionary

public class k
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    protected final int a;
    protected final boolean b;
    protected final int c;
    protected final boolean d;
    protected final String e;
    protected final int f;
    protected final Class g;
    protected final String h;
    private final int i;
    private FieldMappingDictionary j;
    private a k;

    public static k a(String s)
    {
        return new <init>(7, true, 7, true, s, 3, null, null);
    }

    public static <init> a(String s, int i1)
    {
        return new <init>(0, false, 0, false, s, i1, null, null);
    }

    public static <init> a(String s, int i1, a a1)
    {
        return new <init>(7, false, 0, false, s, i1, null, a1);
    }

    public static <init> a(String s, int i1, Class class1)
    {
        return new <init>(11, false, 11, false, s, i1, class1, null);
    }

    static a a(<init> <init>1)
    {
        return <init>1.k;
    }

    public static k b(String s, int i1)
    {
        return new <init>(4, false, 4, false, s, i1, null, null);
    }

    public static <init> b(String s, int i1, Class class1)
    {
        return new <init>(11, true, 11, true, s, i1, class1, null);
    }

    public static <init> c(String s, int i1)
    {
        return new <init>(6, false, 6, false, s, i1, null, null);
    }

    public static <init> d(String s, int i1)
    {
        return new <init>(7, false, 7, false, s, i1, null, null);
    }

    public final int a()
    {
        return i;
    }

    public final Object a(Object obj)
    {
        return k.a(obj);
    }

    public final void a(FieldMappingDictionary fieldmappingdictionary)
    {
        j = fieldmappingdictionary;
    }

    public final int b()
    {
        return a;
    }

    public final boolean c()
    {
        return b;
    }

    public final int d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return d;
    }

    public final String f()
    {
        return e;
    }

    public final int g()
    {
        return f;
    }

    public final Class h()
    {
        return g;
    }

    final String i()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h;
        }
    }

    public final boolean j()
    {
        return k != null;
    }

    final ConverterWrapper k()
    {
        if (k == null)
        {
            return null;
        } else
        {
            return ConverterWrapper.a(k);
        }
    }

    public final Map l()
    {
        bl.a(h);
        bl.a(j);
        return j.a(h);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Field\n");
        stringbuilder.append("            versionCode=").append(i).append('\n');
        stringbuilder.append("                 typeIn=").append(a).append('\n');
        stringbuilder.append("            typeInArray=").append(b).append('\n');
        stringbuilder.append("                typeOut=").append(c).append('\n');
        stringbuilder.append("           typeOutArray=").append(d).append('\n');
        stringbuilder.append("        outputFieldName=").append(e).append('\n');
        stringbuilder.append("      safeParcelFieldId=").append(f).append('\n');
        stringbuilder.append("       concreteTypeName=").append(i()).append('\n');
        if (g != null)
        {
            stringbuilder.append("     concreteType.class=").append(g.getCanonicalName()).append('\n');
        }
        StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
        String s;
        if (k == null)
        {
            s = "null";
        } else
        {
            s = k.getClass().getCanonicalName();
        }
        stringbuilder1.append(s).append('\n');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.server.response.b.a(this, parcel, i1);
    }


    (int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
            String s1, ConverterWrapper converterwrapper)
    {
        i = i1;
        a = j1;
        b = flag;
        c = k1;
        d = flag1;
        e = s;
        f = l1;
        if (s1 == null)
        {
            g = null;
            h = null;
        } else
        {
            g = com/google/android/gms/common/server/response/SafeParcelResponse;
            h = s1;
        }
        if (converterwrapper == null)
        {
            k = null;
            return;
        } else
        {
            k = converterwrapper.c();
            return;
        }
    }

    private k(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
            a a1)
    {
        i = 1;
        a = i1;
        b = flag;
        c = j1;
        d = flag1;
        e = s;
        f = k1;
        g = class1;
        if (class1 == null)
        {
            h = null;
        } else
        {
            h = class1.getCanonicalName();
        }
        k = a1;
    }
}
