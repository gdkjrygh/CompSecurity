// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.wc;
import com.google.android.gms.internal.wd;
import com.google.android.gms.internal.wl;
import com.google.android.gms.internal.wm;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, f, FieldMappingDictionary

public class SafeParcelResponse extends FastJsonResponse
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final FieldMappingDictionary d;
    private final String e;
    private int f;
    private int g;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
    {
        a = i;
        b = (Parcel)bl.a(parcel);
        d = fieldmappingdictionary;
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
            stringbuilder.append("\"").append(wl.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(wd.a((byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(wd.b((byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            wm.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
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
        if (!field.e()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        field.d();
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
        field = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i);
        j = field.length;
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
            stringbuilder.append(Integer.toString(field[i]));
            i++;
        } while (true);
_L5:
        int l1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i2 = parcel.dataPosition();
        if (l1 == 0)
        {
            field = obj;
        } else
        {
            int j2 = parcel.readInt();
            field = new BigInteger[j2];
            for (i = j; i < j2; i++)
            {
                field[i] = new BigInteger(parcel.createByteArray());
            }

            parcel.setDataPosition(l1 + i2);
        }
        wc.a(stringbuilder, field);
_L14:
        stringbuilder.append("]");
        return;
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int k = parcel.dataPosition();
        if (i == 0)
        {
            field = obj1;
        } else
        {
            field = parcel.createLongArray();
            parcel.setDataPosition(i + k);
        }
        wc.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L7:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int l = parcel.dataPosition();
        if (i == 0)
        {
            field = obj2;
        } else
        {
            field = parcel.createFloatArray();
            parcel.setDataPosition(i + l);
        }
        wc.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L8:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int i1 = parcel.dataPosition();
        if (i == 0)
        {
            field = obj3;
        } else
        {
            field = parcel.createDoubleArray();
            parcel.setDataPosition(i + i1);
        }
        wc.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L9:
        wc.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.o(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i);
        int j1 = parcel.dataPosition();
        if (i == 0)
        {
            field = obj4;
        } else
        {
            field = parcel.createBooleanArray();
            parcel.setDataPosition(i + j1);
        }
        wc.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L11:
        wc.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.a.s(parcel, i);
        int k1 = parcel.length;
        i = 0;
        while (i < k1) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, field.l(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (field.d())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.d(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.e(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
            return;

        case 7: // '\007'
            field = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i);
            stringbuilder.append("\"").append(wl.a(field)).append("\"");
            return;

        case 8: // '\b'
            field = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i);
            stringbuilder.append("\"").append(wd.a(field)).append("\"");
            return;

        case 9: // '\t'
            field = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i);
            stringbuilder.append("\"").append(wd.b(field));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            field = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i);
            parcel = field.keySet();
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
                stringbuilder.append("\"").append(wl.a(field.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.a.r(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, field.l(), parcel);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
    {
        if (field.c())
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
                a(stringbuilder, field.b(), ((ArrayList) (obj)).get(i));
            }

            stringbuilder.append("]");
            return;
        } else
        {
            a(stringbuilder, field.b(), obj);
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
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((FastJsonResponse.Field)entry.getValue()).g()), entry))
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
        obj = (FastJsonResponse.Field)((java.util.Map.Entry) (obj)).getValue();
        stringbuilder.append("\"").append(map).append("\":");
        if (!((FastJsonResponse.Field) (obj)).j())
        {
            break MISSING_BLOCK_LABEL_512;
        }
        ((FastJsonResponse.Field) (obj)).d();
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
        throw new IllegalArgumentException((new StringBuilder("Unknown field out type = ")).append(((FastJsonResponse.Field) (obj)).d()).toString());
_L2:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.d(parcel, j))));
_L15:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), com.google.android.gms.common.internal.safeparcel.a.f(parcel, j)));
          goto _L15
_L4:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.e(parcel, j))));
          goto _L15
_L5:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, j))));
          goto _L15
_L6:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.h(parcel, j))));
          goto _L15
_L7:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), com.google.android.gms.common.internal.safeparcel.a.i(parcel, j)));
          goto _L15
_L8:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, j))));
          goto _L15
_L9:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), com.google.android.gms.common.internal.safeparcel.a.j(parcel, j)));
          goto _L15
_L10:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), com.google.android.gms.common.internal.safeparcel.a.m(parcel, j)));
          goto _L15
_L11:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), a(com.google.android.gms.common.internal.safeparcel.a.l(parcel, j))));
          goto _L15
_L12:
        throw new IllegalArgumentException("Method does not accept concrete type.");
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), parcel, j);
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

    final FieldMappingDictionary f()
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
        bl.a(d, "Cannot convert to JSON on client side.");
        Parcel parcel = e();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, d.a(e), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.response.f.a(this, parcel, i);
    }

}
