// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fb, ic, gt, fe, 
//            ii, if, ij, ie

public class fh extends fb
    implements SafeParcelable
{

    public static final ic a = new ic();
    private final int b;
    private final Parcel c;
    private final int d = 2;
    private final fe e;
    private final String f;
    private int g;
    private int h;

    fh(int i, Parcel parcel, fe fe1)
    {
        b = i;
        c = (Parcel)com.google.android.gms.internal.gt.a(parcel);
        e = fe1;
        if (e == null)
        {
            f = null;
        } else
        {
            f = e.c();
        }
        g = 2;
    }

    private static HashMap a(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static void a(StringBuilder stringbuilder, int i, Object obj)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type = ")).append(i).toString());

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
            stringbuilder.append("\"").append(com.google.android.gms.internal.ii.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(com.google.android.gms.internal.if.a((byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(com.google.android.gms.internal.if.b((byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.ij.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, fb.a a1, Parcel parcel, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean flag;
        int l1;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        obj = null;
        l1 = 0;
        flag = false;
        if (!a1.e()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.d();
        JVM INSTR tableswitch 0 11: default 104
    //                   0 114
    //                   1 201
    //                   2 295
    //                   3 342
    //                   4 389
    //                   5 436
    //                   6 449
    //                   7 496
    //                   8 509
    //                   9 509
    //                   10 509
    //                   11 519;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        l1 = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj;
        } else
        {
            a1 = parcel.createIntArray();
            parcel.setDataPosition(i + l1);
        }
        l1 = a1.length;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= l1)
            {
                break; /* Loop/switch isn't completed */
            }
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toString(a1[i]));
            i++;
        } while (true);
_L5:
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i2 = parcel.dataPosition();
        if (j == 0)
        {
            a1 = obj1;
        } else
        {
            int j2 = parcel.readInt();
            a1 = new BigInteger[j2];
            for (i = l1; i < j2; i++)
            {
                a1[i] = new BigInteger(parcel.createByteArray());
            }

            parcel.setDataPosition(j + i2);
        }
        com.google.android.gms.internal.ie.a(stringbuilder, a1);
_L14:
        stringbuilder.append("]");
        return;
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int k = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj2;
        } else
        {
            a1 = parcel.createLongArray();
            parcel.setDataPosition(i + k);
        }
        com.google.android.gms.internal.ie.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L7:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int l = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj3;
        } else
        {
            a1 = parcel.createFloatArray();
            parcel.setDataPosition(i + l);
        }
        com.google.android.gms.internal.ie.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L8:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i1 = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj4;
        } else
        {
            a1 = parcel.createDoubleArray();
            parcel.setDataPosition(i + i1);
        }
        com.google.android.gms.internal.ie.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.ie.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int j1 = parcel.dataPosition();
        if (i == 0)
        {
            a1 = obj5;
        } else
        {
            a1 = parcel.createBooleanArray();
            parcel.setDataPosition(i + j1);
        }
        com.google.android.gms.internal.ie.a(stringbuilder, a1);
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.ie.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i);
        int k1 = parcel.length;
        i = 0;
        while (i < k1) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, a1.l(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.d())
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
            stringbuilder.append("\"").append(com.google.android.gms.internal.ii.a(a1)).append("\"");
            return;

        case 8: // '\b'
            a1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.if.a(a1)).append("\"");
            return;

        case 9: // '\t'
            a1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.if.b(a1));
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
                stringbuilder.append("\"").append(com.google.android.gms.internal.ii.a(a1.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.s(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, a1.l(), parcel);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, fb.a a1, Object obj)
    {
        if (a1.c())
        {
            obj = (ArrayList)obj;
            stringbuilder.append("[");
            int j = ((ArrayList) (obj)).size();
            for (int i = 0; i < j; i++)
            {
                if (i != 0)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, a1.b(), ((ArrayList) (obj)).get(i));
            }

            stringbuilder.append("]");
            return;
        } else
        {
            a(stringbuilder, a1.b(), obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, HashMap hashmap, Parcel parcel)
    {
        HashMap hashmap1;
        boolean flag;
        int i;
        hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); hashmap1.put(Integer.valueOf(((fb.a)entry.getValue()).g()), entry))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        stringbuilder.append('{');
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        flag = false;
_L14:
        Object obj;
        int j;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break MISSING_BLOCK_LABEL_521;
            }
            j = parcel.readInt();
            obj = (java.util.Map.Entry)hashmap1.get(Integer.valueOf(0xffff & j));
        } while (obj == null);
        if (flag)
        {
            stringbuilder.append(",");
        }
        hashmap = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (fb.a)((java.util.Map.Entry) (obj)).getValue();
        stringbuilder.append("\"").append(hashmap).append("\":");
        if (!((fb.a) (obj)).j())
        {
            break MISSING_BLOCK_LABEL_508;
        }
        ((fb.a) (obj)).d();
        JVM INSTR tableswitch 0 11: default 248
    //                   0 277
    //                   1 303
    //                   2 323
    //                   3 346
    //                   4 369
    //                   5 392
    //                   6 412
    //                   7 435
    //                   8 455
    //                   9 455
    //                   10 475
    //                   11 498;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown field out type = ")).append(((fb.a) (obj)).d()).toString());
_L2:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, j))));
_L15:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), com.google.android.gms.common.internal.safeparcel.a.h(parcel, j)));
          goto _L15
_L4:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, j))));
          goto _L15
_L5:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, j))));
          goto _L15
_L6:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, j))));
          goto _L15
_L7:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), com.google.android.gms.common.internal.safeparcel.a.k(parcel, j)));
          goto _L15
_L8:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, j))));
          goto _L15
_L9:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), com.google.android.gms.common.internal.safeparcel.a.l(parcel, j)));
          goto _L15
_L10:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), com.google.android.gms.common.internal.safeparcel.a.o(parcel, j)));
          goto _L15
_L11:
        a(stringbuilder, ((fb.a) (obj)), a(((fb.a) (obj)), a(com.google.android.gms.common.internal.safeparcel.a.n(parcel, j))));
          goto _L15
_L12:
        throw new IllegalArgumentException("Method does not accept concrete type.");
        a(stringbuilder, ((fb.a) (obj)), parcel, j);
          goto _L15
        if (parcel.dataPosition() != i)
        {
            throw new b((new StringBuilder("Overread allowed size end=")).append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    public final int a()
    {
        return b;
    }

    public final HashMap b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a(f);
        }
    }

    protected final Object c()
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected final boolean d()
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents()
    {
        ic ic1 = a;
        return 0;
    }

    public final Parcel e()
    {
        g;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 44;
           goto _L1 _L2 _L3
_L1:
        return c;
_L2:
        h = com.google.android.gms.common.internal.safeparcel.c.a(c);
_L3:
        com.google.android.gms.common.internal.safeparcel.c.a(c, h);
        g = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    final fe f()
    {
        switch (d)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Invalid creation type: ")).append(d).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return e;

        case 2: // '\002'
            return e;
        }
    }

    public String toString()
    {
        com.google.android.gms.internal.gt.a(e, "Cannot convert to JSON on client side.");
        Parcel parcel = e();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, e.a(f), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ic ic1 = a;
        com.google.android.gms.internal.ic.a(this, parcel, i);
    }

}
