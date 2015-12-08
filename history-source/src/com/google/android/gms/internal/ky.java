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
//            kr, kz, jx, kv, 
//            li, lb, lj, la

public class ky extends kr
    implements SafeParcelable
{

    public static final kz CREATOR = new kz();
    private final int CK;
    private final kv NT;
    private final Parcel Oa;
    private final int Ob;
    private int Oc;
    private int Od;
    private final String mClassName;

    ky(int i, Parcel parcel, kv kv1)
    {
        CK = i;
        Oa = (Parcel)jx.i(parcel);
        Ob = 2;
        NT = kv1;
        if (NT == null)
        {
            mClassName = null;
        } else
        {
            mClassName = NT.ia();
        }
        Oc = 2;
    }

    private ky(SafeParcelable safeparcelable, kv kv1, String s)
    {
        CK = 1;
        Oa = Parcel.obtain();
        safeparcelable.writeToParcel(Oa, 0);
        Ob = 1;
        NT = (kv)jx.i(kv1);
        mClassName = (String)jx.i(s);
        Oc = 2;
    }

    public static ky a(kr kr1)
    {
        String s = kr1.getClass().getCanonicalName();
        kv kv1 = b(kr1);
        return new ky((SafeParcelable)kr1, kv1, s);
    }

    private static void a(kv kv1, kr kr1)
    {
        Object obj = kr1.getClass();
        if (!kv1.b(((Class) (obj))))
        {
            HashMap hashmap = kr1.hK();
            kv1.a(((Class) (obj)), kr1.hK());
            obj = hashmap.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                kr1 = (kr.a)hashmap.get((String)((Iterator) (obj)).next());
                Class class1 = kr1.hS();
                if (class1 != null)
                {
                    try
                    {
                        a(kv1, (kr)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (kv kv1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not instantiate an object of type ").append(kr1.hS().getCanonicalName()).toString(), kv1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (kv kv1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not access object of type ").append(kr1.hS().getCanonicalName()).toString(), kv1);
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
            stringbuilder.append("\"").append(li.bh(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(lb.d((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(lb.e((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.lj.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, kr.a a1, Parcel parcel, int i)
    {
        switch (a1.hJ())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(a1.hJ()).toString());

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
            b(stringbuilder, a1, a(a1, g(com.google.android.gms.common.internal.safeparcel.a.q(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, String s, kr.a a1, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.hU())
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
        int i = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.aH(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (kr.a)entry.getValue(), parcel, j);
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

    private static kv b(kr kr1)
    {
        kv kv1 = new kv(kr1.getClass());
        a(kv1, kr1);
        kv1.hY();
        kv1.hX();
        return kv1;
    }

    private static HashMap b(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); hashmap1.put(Integer.valueOf(((kr.a)entry.getValue()).hR()), entry))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return hashmap1;
    }

    private void b(StringBuilder stringbuilder, kr.a a1, Parcel parcel, int i)
    {
        if (!a1.hP()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.hJ();
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
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.x(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.y(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.z(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.la.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.A(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.E(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, a1.hW(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.hJ())
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
            stringbuilder.append("\"").append(li.bh(a1)).append("\"");
            return;

        case 8: // '\b'
            a1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            stringbuilder.append("\"").append(lb.d(a1)).append("\"");
            return;

        case 9: // '\t'
            a1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            stringbuilder.append("\"").append(lb.e(a1));
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
                stringbuilder.append("\"").append(li.bh(a1.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.D(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, a1.hW(), parcel);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, kr.a a1, Object obj)
    {
        if (a1.hO())
        {
            b(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.hI(), obj);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, kr.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.hI(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    public static HashMap g(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    protected Object bc(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean bd(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents()
    {
        kz kz1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public HashMap hK()
    {
        if (NT == null)
        {
            return null;
        } else
        {
            return NT.bg(mClassName);
        }
    }

    public Parcel ic()
    {
        Oc;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return Oa;
_L2:
        Od = com.google.android.gms.common.internal.safeparcel.b.H(Oa);
        com.google.android.gms.common.internal.safeparcel.b.H(Oa, Od);
        Oc = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.b.H(Oa, Od);
        Oc = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    kv id()
    {
        switch (Ob)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(Ob).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return NT;

        case 2: // '\002'
            return NT;
        }
    }

    public String toString()
    {
        com.google.android.gms.internal.jx.b(NT, "Cannot convert to JSON on client side.");
        Parcel parcel = ic();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, NT.bg(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kz kz1 = CREATOR;
        com.google.android.gms.internal.kz.a(this, parcel, i);
    }

}
