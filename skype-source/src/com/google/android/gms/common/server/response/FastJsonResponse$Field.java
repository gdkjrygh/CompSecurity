// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, a, SafeParcelResponse, FieldMappingDictionary

public static class k
    implements SafeParcelable
{

    public static final a CREATOR = new a();
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
    private k k;

    static k a(k k1)
    {
        return k1.k;
    }

    public final int a()
    {
        return i;
    }

    public final Object a(Object obj)
    {
        return k.k(obj);
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
        y.a(h);
        y.a(j);
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
        com.google.android.gms.common.server.response.a.a(this, parcel, i1);
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
}
