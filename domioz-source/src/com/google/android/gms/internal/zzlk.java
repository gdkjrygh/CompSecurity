// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzld, ie, zzlh, iq, 
//            im, ir, il

public class zzlk extends zzld
    implements SafeParcelable
{

    public static final ie CREATOR = new ie();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final zzlh d;
    private final String e;
    private int f;
    private int g;

    zzlk(int i, Parcel parcel, zzlh zzlh1)
    {
        a = i;
        b = (Parcel)ap.a(parcel);
        d = zzlh1;
        if (d == null)
        {
            e = null;
        } else
        {
            e = d.c();
        }
        f = 2;
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
            stringbuilder.append("\"").append(com.google.android.gms.internal.iq.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(com.google.android.gms.internal.im.a((byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(com.google.android.gms.internal.im.b((byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.ir.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, zzld.zza zza, Parcel parcel, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        int j;
        boolean flag;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj = null;
        j = 0;
        flag = false;
        if (!zza.e()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        zza.d();
        JVM INSTR tableswitch 0 11: default 100
    //                   0 110
    //                   1 165
    //                   2 259
    //                   3 306
    //                   4 353
    //                   5 400
    //                   6 413
    //                   7 460
    //                   8 473
    //                   9 473
    //                   10 473
    //                   11 483;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        zza = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i);
        j = zza.length;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toString(zza[i]));
            i++;
        } while (true);
_L5:
        int l1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i2 = parcel.dataPosition();
        if (l1 == 0)
        {
            zza = obj;
        } else
        {
            int j2 = parcel.readInt();
            zza = new BigInteger[j2];
            for (i = j; i < j2; i++)
            {
                zza[i] = new BigInteger(parcel.createByteArray());
            }

            parcel.setDataPosition(l1 + i2);
        }
        com.google.android.gms.internal.il.a(stringbuilder, zza);
_L14:
        stringbuilder.append("]");
        return;
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int k = parcel.dataPosition();
        if (i == 0)
        {
            zza = obj1;
        } else
        {
            zza = parcel.createLongArray();
            parcel.setDataPosition(i + k);
        }
        com.google.android.gms.internal.il.a(stringbuilder, zza);
        continue; /* Loop/switch isn't completed */
_L7:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int l = parcel.dataPosition();
        if (i == 0)
        {
            zza = obj2;
        } else
        {
            zza = parcel.createFloatArray();
            parcel.setDataPosition(i + l);
        }
        com.google.android.gms.internal.il.a(stringbuilder, zza);
        continue; /* Loop/switch isn't completed */
_L8:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i1 = parcel.dataPosition();
        if (i == 0)
        {
            zza = obj3;
        } else
        {
            zza = parcel.createDoubleArray();
            parcel.setDataPosition(i + i1);
        }
        com.google.android.gms.internal.il.a(stringbuilder, zza);
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.il.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int j1 = parcel.dataPosition();
        if (i == 0)
        {
            zza = obj4;
        } else
        {
            zza = parcel.createBooleanArray();
            parcel.setDataPosition(i + j1);
        }
        com.google.android.gms.internal.il.a(stringbuilder, zza);
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.il.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.v(parcel, i);
        int k1 = parcel.length;
        i = 0;
        while (i < k1) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, zza.l(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (zza.d())
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
            zza = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.iq.a(zza)).append("\"");
            return;

        case 8: // '\b'
            zza = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.im.a(zza)).append("\"");
            return;

        case 9: // '\t'
            zza = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i);
            stringbuilder.append("\"").append(com.google.android.gms.internal.im.b(zza));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            zza = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i);
            parcel = zza.keySet();
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
                stringbuilder.append("\"").append(com.google.android.gms.internal.iq.a(zza.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.u(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, zza.l(), parcel);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, zzld.zza zza, Object obj)
    {
        if (zza.c())
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
                a(stringbuilder, zza.b(), ((ArrayList) (obj)).get(i));
            }

            stringbuilder.append("]");
            return;
        } else
        {
            a(stringbuilder, zza.b(), obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, Map map, Parcel parcel)
    {
        HashMap hashmap;
        boolean flag;
        int i;
        hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((zzld.zza)entry.getValue()).g()), entry))
        {
            entry = (java.util.Map.Entry)map.next();
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
                break MISSING_BLOCK_LABEL_525;
            }
            j = parcel.readInt();
            obj = (java.util.Map.Entry)hashmap.get(Integer.valueOf(0xffff & j));
        } while (obj == null);
        if (flag)
        {
            stringbuilder.append(",");
        }
        map = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (zzld.zza)((java.util.Map.Entry) (obj)).getValue();
        stringbuilder.append("\"").append(map).append("\":");
        if (!((zzld.zza) (obj)).j())
        {
            break MISSING_BLOCK_LABEL_512;
        }
        ((zzld.zza) (obj)).d();
        JVM INSTR tableswitch 0 11: default 252
    //                   0 281
    //                   1 307
    //                   2 327
    //                   3 350
    //                   4 373
    //                   5 396
    //                   6 416
    //                   7 439
    //                   8 459
    //                   9 459
    //                   10 479
    //                   11 502;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown field out type = ")).append(((zzld.zza) (obj)).d()).toString());
_L2:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, j))));
_L15:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), com.google.android.gms.common.internal.safeparcel.a.h(parcel, j)));
          goto _L15
_L4:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, j))));
          goto _L15
_L5:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, j))));
          goto _L15
_L6:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, j))));
          goto _L15
_L7:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), com.google.android.gms.common.internal.safeparcel.a.k(parcel, j)));
          goto _L15
_L8:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, j))));
          goto _L15
_L9:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), com.google.android.gms.common.internal.safeparcel.a.l(parcel, j)));
          goto _L15
_L10:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), com.google.android.gms.common.internal.safeparcel.a.o(parcel, j)));
          goto _L15
_L11:
        a(stringbuilder, ((zzld.zza) (obj)), a(((zzld.zza) (obj)), a(com.google.android.gms.common.internal.safeparcel.a.n(parcel, j))));
          goto _L15
_L12:
        throw new IllegalArgumentException("Method does not accept concrete type.");
        a(stringbuilder, ((zzld.zza) (obj)), parcel, j);
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

    public final Map a()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.a(e);
        }
    }

    protected final Object b()
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected final boolean c()
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final int d()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Parcel e()
    {
        f;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 44;
           goto _L1 _L2 _L3
_L1:
        return b;
_L2:
        g = com.google.android.gms.common.internal.safeparcel.c.a(b);
_L3:
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    final zzlh f()
    {
        switch (c)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Invalid creation type: ")).append(c).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return d;

        case 2: // '\002'
            return d;
        }
    }

    public String toString()
    {
        ap.a(d, "Cannot convert to JSON on client side.");
        Parcel parcel = e();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, d.a(e), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.ie.a(this, parcel, i);
    }

}
