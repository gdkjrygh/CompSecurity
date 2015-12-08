// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hz, ig, hn, ic, 
//            io, ii, ip, ih

public class if extends hz
    implements SafeParcelable
{

    public static final ig CREATOR = new ig();
    private final ic Hg;
    private final Parcel Hn;
    private final int Ho;
    private int Hp;
    private int Hq;
    private final String mClassName;
    private final int xJ;

    if(int i, Parcel parcel, ic ic1)
    {
        xJ = i;
        Hn = (Parcel)hn.f(parcel);
        Ho = 2;
        Hg = ic1;
        if (Hg == null)
        {
            mClassName = null;
        } else
        {
            mClassName = Hg.fR();
        }
        Hp = 2;
    }

    private if(SafeParcelable safeparcelable, ic ic1, String s)
    {
        xJ = 1;
        Hn = Parcel.obtain();
        safeparcelable.writeToParcel(Hn, 0);
        Ho = 1;
        Hg = (ic)hn.f(ic1);
        mClassName = (String)hn.f(s);
        Hp = 2;
    }

    public static if a(hz hz1)
    {
        String s = hz1.getClass().getCanonicalName();
        ic ic1 = b(hz1);
        return new if((SafeParcelable)hz1, ic1, s);
    }

    private static void a(ic ic1, hz hz1)
    {
        Object obj = hz1.getClass();
        if (!ic1.b(((Class) (obj))))
        {
            HashMap hashmap = hz1.fB();
            ic1.a(((Class) (obj)), hz1.fB());
            obj = hashmap.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                hz1 = (hz.a)hashmap.get((String)((Iterator) (obj)).next());
                Class class1 = hz1.fJ();
                if (class1 != null)
                {
                    try
                    {
                        a(ic1, (hz)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (ic ic1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not instantiate an object of type ").append(hz1.fJ().getCanonicalName()).toString(), ic1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (ic ic1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not access object of type ").append(hz1.fJ().getCanonicalName()).toString(), ic1);
                    }
                }
            } while (true);
        }
    }

    private void a(StringBuilder stringbuilder, int i, Object obj)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type = ").append(i).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            stringbuilder.append(obj);
            return;

        case 7: // '\007'
            stringbuilder.append("\"").append(io.aK(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(ii.d((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(ii.e((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.ip.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, hz.a a1, Parcel parcel, int i)
    {
        switch (a1.fA())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(a1.fA()).toString());

        case 0: // '\0'
            b(stringbuilder, a1, a(a1, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
            return;

        case 1: // '\001'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.k(parcel, i)));
            return;

        case 2: // '\002'
            b(stringbuilder, a1, a(a1, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i))));
            return;

        case 3: // '\003'
            b(stringbuilder, a1, a(a1, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i))));
            return;

        case 4: // '\004'
            b(stringbuilder, a1, a(a1, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.m(parcel, i))));
            return;

        case 5: // '\005'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.n(parcel, i)));
            return;

        case 6: // '\006'
            b(stringbuilder, a1, a(a1, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
            return;

        case 7: // '\007'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i)));
            return;

        case 10: // '\n'
            b(stringbuilder, a1, a(a1, d(com.google.android.gms.common.internal.safeparcel.a.q(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, String s, hz.a a1, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.fL())
        {
            a(stringbuilder, a1, parcel, i);
            return;
        } else
        {
            b(stringbuilder, a1, parcel, i);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, HashMap hashmap, Parcel parcel)
    {
        hashmap = b(hashmap);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.ar(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (hz.a)entry.getValue(), parcel, j);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private static ic b(hz hz1)
    {
        ic ic1 = new ic(hz1.getClass());
        a(ic1, hz1);
        ic1.fP();
        ic1.fO();
        return ic1;
    }

    private static HashMap b(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); hashmap1.put(Integer.valueOf(((hz.a)entry.getValue()).fI()), entry))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return hashmap1;
    }

    private void b(StringBuilder stringbuilder, hz.a a1, Parcel parcel, int i)
    {
        if (!a1.fG()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.fA();
        JVM INSTR tableswitch 0 11: default 80
    //                   0 91
    //                   1 110
    //                   2 123
    //                   3 136
    //                   4 149
    //                   5 162
    //                   6 175
    //                   7 188
    //                   8 201
    //                   9 201
    //                   10 201
    //                   11 212;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.x(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.y(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.z(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.ih.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.A(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.D(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, a1.fN(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.fA())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.m(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.n(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
            return;

        case 7: // '\007'
            a1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(io.aK(a1)).append("\"");
            return;

        case 8: // '\b'
            a1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            stringbuilder.append("\"").append(ii.d(a1)).append("\"");
            return;

        case 9: // '\t'
            a1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            stringbuilder.append("\"").append(ii.e(a1));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            a1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i);
            parcel = a1.keySet();
            parcel.size();
            stringbuilder.append("{");
            parcel = parcel.iterator();
            for (i = 1; parcel.hasNext(); i = 0)
            {
                String s = (String)parcel.next();
                if (i == 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append("\"").append(s).append("\"");
                stringbuilder.append(":");
                stringbuilder.append("\"").append(io.aK(a1.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.C(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, a1.fN(), parcel);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, hz.a a1, Object obj)
    {
        if (a1.fF())
        {
            b(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.fz(), obj);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, hz.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.fz(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    public static HashMap d(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    protected Object aF(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean aG(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents()
    {
        ig ig1 = CREATOR;
        return 0;
    }

    public HashMap fB()
    {
        if (Hg == null)
        {
            return null;
        } else
        {
            return Hg.aJ(mClassName);
        }
    }

    public Parcel fT()
    {
        Hp;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return Hn;
_L2:
        Hq = com.google.android.gms.common.internal.safeparcel.b.C(Hn);
        com.google.android.gms.common.internal.safeparcel.b.G(Hn, Hq);
        Hp = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.b.G(Hn, Hq);
        Hp = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    ic fU()
    {
        switch (Ho)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(Ho).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return Hg;

        case 2: // '\002'
            return Hg;
        }
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public String toString()
    {
        com.google.android.gms.internal.hn.b(Hg, "Cannot convert to JSON on client side.");
        Parcel parcel = fT();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, Hg.aJ(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ig ig1 = CREATOR;
        com.google.android.gms.internal.ig.a(this, parcel, i);
    }

}
