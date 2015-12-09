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
//            ga, gh, fq, gd, 
//            gp, gj, gq, gi

public class gg extends ga
    implements SafeParcelable
{

    public static final gh CREATOR = new gh();
    private final gd Eg;
    private final Parcel En;
    private final int Eo;
    private int Ep;
    private int Eq;
    private final String mClassName;
    private final int xH;

    gg(int i, Parcel parcel, gd gd1)
    {
        xH = i;
        En = (Parcel)com.google.android.gms.internal.fq.f(parcel);
        Eo = 2;
        Eg = gd1;
        if (Eg == null)
        {
            mClassName = null;
        } else
        {
            mClassName = Eg.fo();
        }
        Ep = 2;
    }

    private gg(SafeParcelable safeparcelable, gd gd1, String s)
    {
        xH = 1;
        En = Parcel.obtain();
        safeparcelable.writeToParcel(En, 0);
        Eo = 1;
        Eg = (gd)com.google.android.gms.internal.fq.f(gd1);
        mClassName = (String)com.google.android.gms.internal.fq.f(s);
        Ep = 2;
    }

    public static gg a(ga ga1)
    {
        String s = ga1.getClass().getCanonicalName();
        gd gd1 = b(ga1);
        return new gg((SafeParcelable)ga1, gd1, s);
    }

    private static void a(gd gd1, ga ga1)
    {
        Object obj = ga1.getClass();
        if (!gd1.b(((Class) (obj))))
        {
            HashMap hashmap = ga1.eY();
            gd1.a(((Class) (obj)), ga1.eY());
            obj = hashmap.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ga1 = (ga.a)hashmap.get((String)((Iterator) (obj)).next());
                Class class1 = ga1.fg();
                if (class1 != null)
                {
                    try
                    {
                        a(gd1, (ga)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (gd gd1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not instantiate an object of type ").append(ga1.fg().getCanonicalName()).toString(), gd1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (gd gd1)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not access object of type ").append(ga1.fg().getCanonicalName()).toString(), gd1);
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
            stringbuilder.append("\"").append(gp.av(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(gj.d((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(gj.e((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.gq.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, ga.a a1, Parcel parcel, int i)
    {
        switch (a1.eX())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(a1.eX()).toString());

        case 0: // '\0'
            b(stringbuilder, a1, a(a1, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
            return;

        case 1: // '\001'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.j(parcel, i)));
            return;

        case 2: // '\002'
            b(stringbuilder, a1, a(a1, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i))));
            return;

        case 3: // '\003'
            b(stringbuilder, a1, a(a1, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i))));
            return;

        case 4: // '\004'
            b(stringbuilder, a1, a(a1, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i))));
            return;

        case 5: // '\005'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.m(parcel, i)));
            return;

        case 6: // '\006'
            b(stringbuilder, a1, a(a1, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
            return;

        case 7: // '\007'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.n(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            b(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i)));
            return;

        case 10: // '\n'
            b(stringbuilder, a1, a(a1, c(com.google.android.gms.common.internal.safeparcel.a.p(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, String s, ga.a a1, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.fi())
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
        hashmap = c(hashmap);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.R(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (ga.a)entry.getValue(), parcel, j);
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

    private static gd b(ga ga1)
    {
        gd gd1 = new gd(ga1.getClass());
        a(gd1, ga1);
        gd1.fm();
        gd1.fl();
        return gd1;
    }

    private void b(StringBuilder stringbuilder, ga.a a1, Parcel parcel, int i)
    {
        if (!a1.fd()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.eX();
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
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.x(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.y(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.gi.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.z(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.C(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, a1.fk(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.eX())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.m(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
            return;

        case 7: // '\007'
            a1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i);
            stringbuilder.append("\"").append(gp.av(a1)).append("\"");
            return;

        case 8: // '\b'
            a1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i);
            stringbuilder.append("\"").append(gj.d(a1)).append("\"");
            return;

        case 9: // '\t'
            a1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i);
            stringbuilder.append("\"").append(gj.e(a1));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            a1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i);
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
                stringbuilder.append("\"").append(gp.av(a1.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.B(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, a1.fk(), parcel);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, ga.a a1, Object obj)
    {
        if (a1.fc())
        {
            b(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.eW(), obj);
            return;
        }
    }

    private void b(StringBuilder stringbuilder, ga.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.eW(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    public static HashMap c(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static HashMap c(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); hashmap1.put(Integer.valueOf(((ga.a)entry.getValue()).ff()), entry))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return hashmap1;
    }

    protected Object aq(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean ar(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents()
    {
        gh gh1 = CREATOR;
        return 0;
    }

    public HashMap eY()
    {
        if (Eg == null)
        {
            return null;
        } else
        {
            return Eg.au(mClassName);
        }
    }

    public Parcel fq()
    {
        Ep;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return En;
_L2:
        Eq = com.google.android.gms.common.internal.safeparcel.b.p(En);
        com.google.android.gms.common.internal.safeparcel.b.F(En, Eq);
        Ep = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.b.F(En, Eq);
        Ep = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    gd fr()
    {
        switch (Eo)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(Eo).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return Eg;

        case 2: // '\002'
            return Eg;
        }
    }

    public int getVersionCode()
    {
        return xH;
    }

    public String toString()
    {
        com.google.android.gms.internal.fq.b(Eg, "Cannot convert to JSON on client side.");
        Parcel parcel = fq();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, Eg.au(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gh gh1 = CREATOR;
        com.google.android.gms.internal.gh.a(this, parcel, i);
    }

}
