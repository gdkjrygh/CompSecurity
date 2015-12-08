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
//            dw, ed, dm, dz, 
//            ei, ef, ej, ee

public class ec extends dw
    implements SafeParcelable
{

    public static final ed CREATOR = new ed();
    private final int iM;
    private final dz lH;
    private final Parcel lP;
    private final int lQ;
    private int lR;
    private int lS;
    private final String mClassName;

    ec(int i, Parcel parcel, dz dz1)
    {
        iM = i;
        lP = (Parcel)dm.e(parcel);
        lQ = 2;
        lH = dz1;
        if (lH == null)
        {
            mClassName = null;
        } else
        {
            mClassName = lH.bF();
        }
        lR = 2;
    }

    private ec(SafeParcelable safeparcelable, dz dz1, String s)
    {
        iM = 1;
        lP = Parcel.obtain();
        safeparcelable.writeToParcel(lP, 0);
        lQ = 1;
        lH = (dz)dm.e(dz1);
        mClassName = (String)dm.e(s);
        lR = 2;
    }

    public static ec a(dw dw1)
    {
        String s = dw1.getClass().getCanonicalName();
        dz dz1 = b(dw1);
        return new ec((SafeParcelable)dw1, dz1, s);
    }

    private static void a(dz dz1, dw dw1)
    {
        Object obj = dw1.getClass();
        if (!dz1.b(((Class) (obj))))
        {
            HashMap hashmap = dw1.bp();
            dz1.a(((Class) (obj)), dw1.bp());
            obj = hashmap.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                dw1 = (dw.a)hashmap.get((String)((Iterator) (obj)).next());
                Class class1 = dw1.bx();
                if (class1 != null)
                {
                    try
                    {
                        a(dz1, (dw)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (dz dz1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not instantiate an object of type ").append(dw1.bx().getCanonicalName()).toString(), dz1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (dz dz1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not access object of type ").append(dw1.bx().getCanonicalName()).toString(), dz1);
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
            stringbuilder.append("\"").append(ei.I(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(com.google.android.gms.internal.ef.b((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(ef.c((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.ej.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, dw.a a1, Parcel parcel, int i)
    {
        switch (a1.bo())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(a1.bo()).toString());

        case 0: // '\0'
            b(stringbuilder, a1, a(a1, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i))));
            return;

        case 1: // '\001'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.h(parcel, i)));
            return;

        case 2: // '\002'
            b(stringbuilder, a1, a(a1, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
            return;

        case 3: // '\003'
            b(stringbuilder, a1, a(a1, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i))));
            return;

        case 4: // '\004'
            b(stringbuilder, a1, a(a1, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i))));
            return;

        case 5: // '\005'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.k(parcel, i)));
            return;

        case 6: // '\006'
            b(stringbuilder, a1, a(a1, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
            return;

        case 7: // '\007'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.l(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
            return;

        case 10: // '\n'
            b(stringbuilder, a1, a(a1, b(com.google.android.gms.common.internal.safeparcel.a.n(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, String s, dw.a a1, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.bz())
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
        int i = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.y(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (dw.a)entry.getValue(), parcel, j);
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

    private static dz b(dw dw1)
    {
        dz dz1 = new dz(dw1.getClass());
        a(dz1, dw1);
        dz1.bD();
        dz1.bC();
        return dz1;
    }

    public static HashMap b(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static HashMap b(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); hashmap1.put(Integer.valueOf(((dw.a)entry.getValue()).bw()), entry))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return hashmap1;
    }

    private void b(StringBuilder stringbuilder, dw.a a1, Parcel parcel, int i)
    {
        if (!a1.bu()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.bo();
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
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.ee.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.z(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, a1.bB(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.bo())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
            return;

        case 7: // '\007'
            a1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i);
            stringbuilder.append("\"").append(ei.I(a1)).append("\"");
            return;

        case 8: // '\b'
            a1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.ef.b(a1)).append("\"");
            return;

        case 9: // '\t'
            a1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(ef.c(a1));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            a1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i);
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
                stringbuilder.append("\"").append(ei.I(a1.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.y(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, a1.bB(), parcel);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, dw.a a1, Object obj)
    {
        if (a1.bt())
        {
            b(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.bn(), obj);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, dw.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.bn(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    protected Object D(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean E(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel bH()
    {
        lR;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return lP;
_L2:
        lS = com.google.android.gms.common.internal.safeparcel.b.k(lP);
        com.google.android.gms.common.internal.safeparcel.b.C(lP, lS);
        lR = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.b.C(lP, lS);
        lR = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    dz bI()
    {
        switch (lQ)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(lQ).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return lH;

        case 2: // '\002'
            return lH;
        }
    }

    public HashMap bp()
    {
        if (lH == null)
        {
            return null;
        } else
        {
            return lH.H(mClassName);
        }
    }

    public int describeContents()
    {
        ed ed1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public String toString()
    {
        com.google.android.gms.internal.dm.a(lH, "Cannot convert to JSON on client side.");
        Parcel parcel = bH();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, lH.H(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ed ed1 = CREATOR;
        com.google.android.gms.internal.ed.a(this, parcel, i);
    }

}
