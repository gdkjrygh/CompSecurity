// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, a, SafeParcelResponse, FieldMappingDictionary

public static class k
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    protected final int b;
    protected final boolean c;
    protected final int d;
    protected final boolean e;
    protected final String f;
    protected final int g;
    protected final Class h;
    protected final String i;
    FieldMappingDictionary j;
    k k;

    static k a(k k1)
    {
        return k1.k;
    }

    public final int a()
    {
        return b;
    }

    public final boolean b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return f;
    }

    public final int f()
    {
        return g;
    }

    public final Class g()
    {
        return h;
    }

    final String h()
    {
        if (i == null)
        {
            return null;
        } else
        {
            return i;
        }
    }

    public final Map i()
    {
        u.a(i);
        u.a(j);
        return j.a(i);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Field\n");
        stringbuilder.append("            versionCode=").append(a).append('\n');
        stringbuilder.append("                 typeIn=").append(b).append('\n');
        stringbuilder.append("            typeInArray=").append(c).append('\n');
        stringbuilder.append("                typeOut=").append(d).append('\n');
        stringbuilder.append("           typeOutArray=").append(e).append('\n');
        stringbuilder.append("        outputFieldName=").append(f).append('\n');
        stringbuilder.append("      safeParcelFieldId=").append(g).append('\n');
        stringbuilder.append("       concreteTypeName=").append(h()).append('\n');
        if (h != null)
        {
            stringbuilder.append("     concreteType.class=").append(h.getCanonicalName()).append('\n');
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

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.common.server.response.a.a(this, parcel, l);
    }


    (int l, int i1, boolean flag, int j1, boolean flag1, String s, int k1, 
            String s1, ConverterWrapper converterwrapper)
    {
        Object obj = null;
        super();
        a = l;
        b = i1;
        c = flag;
        d = j1;
        e = flag1;
        f = s;
        g = k1;
        if (s1 == null)
        {
            h = null;
            i = null;
        } else
        {
            h = com/google/android/gms/common/server/response/SafeParcelResponse;
            i = s1;
        }
        if (converterwrapper == null)
        {
            s = obj;
        } else
        if (converterwrapper.b != null)
        {
            s = converterwrapper.b;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        k = s;
    }
}
