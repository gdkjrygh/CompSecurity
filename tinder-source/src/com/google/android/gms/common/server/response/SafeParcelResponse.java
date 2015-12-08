// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.ek;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, e, FieldMappingDictionary

public class SafeParcelResponse extends FastJsonResponse
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    final int a;
    final int b = 2;
    final FieldMappingDictionary c;
    private final Parcel d;
    private final String e;
    private int f;
    private int g;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
    {
        a = i;
        d = (Parcel)u.a(parcel);
        c = fieldmappingdictionary;
        if (c == null)
        {
            e = null;
        } else
        {
            e = c.c;
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
            stringbuilder.append("\"").append(ej.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(ec.a((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(ec.b((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            ek.a(stringbuilder, (HashMap)obj);
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
        if (!field.d()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        field.c();
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
        field = zza.p(parcel, i);
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
        int l1 = zza.a(parcel, i);
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
        eb.a(stringbuilder, field);
_L14:
        stringbuilder.append("]");
        return;
_L6:
        i = zza.a(parcel, i);
        int k = parcel.dataPosition();
        if (i == 0)
        {
            field = obj1;
        } else
        {
            field = parcel.createLongArray();
            parcel.setDataPosition(i + k);
        }
        eb.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L7:
        i = zza.a(parcel, i);
        int l = parcel.dataPosition();
        if (i == 0)
        {
            field = obj2;
        } else
        {
            field = parcel.createFloatArray();
            parcel.setDataPosition(i + l);
        }
        eb.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L8:
        i = zza.a(parcel, i);
        int i1 = parcel.dataPosition();
        if (i == 0)
        {
            field = obj3;
        } else
        {
            field = parcel.createDoubleArray();
            parcel.setDataPosition(i + i1);
        }
        eb.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L9:
        eb.a(stringbuilder, zza.q(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        i = zza.a(parcel, i);
        int j1 = parcel.dataPosition();
        if (i == 0)
        {
            field = obj4;
        } else
        {
            field = parcel.createBooleanArray();
            parcel.setDataPosition(i + j1);
        }
        eb.a(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L11:
        eb.a(stringbuilder, zza.r(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = zza.v(parcel, i);
        int k1 = parcel.length;
        i = 0;
        while (i < k1) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            a(stringbuilder, field.i(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (field.c())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(zza.e(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(zza.h(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(zza.f(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(zza.i(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(zza.j(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(zza.k(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(zza.c(parcel, i));
            return;

        case 7: // '\007'
            field = zza.l(parcel, i);
            stringbuilder.append("\"").append(ej.a(field)).append("\"");
            return;

        case 8: // '\b'
            field = zza.o(parcel, i);
            stringbuilder.append("\"").append(ec.a(field)).append("\"");
            return;

        case 9: // '\t'
            field = zza.o(parcel, i);
            stringbuilder.append("\"").append(ec.b(field));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            field = zza.n(parcel, i);
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
                stringbuilder.append("\"").append(ej.a(field.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = zza.u(parcel, i);
            parcel.setDataPosition(0);
            a(stringbuilder, field.i(), parcel);
            return;
        }
    }

    private static void a(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
    {
        if (field.b())
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
                a(stringbuilder, field.a(), ((ArrayList) (obj)).get(i));
            }

            stringbuilder.append("]");
            return;
        } else
        {
            a(stringbuilder, field.a(), obj);
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
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((FastJsonResponse.Field)entry.getValue()).f()), entry))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        stringbuilder.append('{');
        i = zza.a(parcel);
        flag = false;
_L14:
        Object obj;
        int j;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break MISSING_BLOCK_LABEL_539;
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
        if (((FastJsonResponse.Field) (obj)).k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        ((FastJsonResponse.Field) (obj)).c();
        JVM INSTR tableswitch 0 11: default 260
    //                   0 295
    //                   1 321
    //                   2 341
    //                   3 364
    //                   4 387
    //                   5 410
    //                   6 430
    //                   7 453
    //                   8 473
    //                   9 473
    //                   10 493
    //                   11 516;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown field out type = ")).append(((FastJsonResponse.Field) (obj)).c()).toString());
_L2:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Integer.valueOf(zza.e(parcel, j))));
_L15:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), zza.h(parcel, j)));
          goto _L15
_L4:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Long.valueOf(zza.f(parcel, j))));
          goto _L15
_L5:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Float.valueOf(zza.i(parcel, j))));
          goto _L15
_L6:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Double.valueOf(zza.j(parcel, j))));
          goto _L15
_L7:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), zza.k(parcel, j)));
          goto _L15
_L8:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), Boolean.valueOf(zza.c(parcel, j))));
          goto _L15
_L9:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), zza.l(parcel, j)));
          goto _L15
_L10:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), zza.o(parcel, j)));
          goto _L15
_L11:
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), a(((FastJsonResponse.Field) (obj)), a(zza.n(parcel, j))));
          goto _L15
_L12:
        throw new IllegalArgumentException("Method does not accept concrete type.");
        a(stringbuilder, ((FastJsonResponse.Field) (obj)), parcel, j);
          goto _L15
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    public final Map a()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.a(e);
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

    public final Parcel d()
    {
        f;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 47;
           goto _L1 _L2 _L3
_L1:
        return d;
_L2:
        g = com.google.android.gms.common.internal.safeparcel.a.a(d, 20293);
_L3:
        com.google.android.gms.common.internal.safeparcel.a.b(d, g);
        f = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        u.a(c, "Cannot convert to JSON on client side.");
        Parcel parcel = d();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, c.a(e), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.response.e.a(this, parcel, i);
    }

}
