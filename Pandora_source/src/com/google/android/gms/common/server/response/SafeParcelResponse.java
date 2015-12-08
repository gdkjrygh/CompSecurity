// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzhr;
import com.google.android.gms.internal.zzhz;
import com.google.android.gms.internal.zzia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, zze, FieldMappingDictionary

public class SafeParcelResponse extends FastJsonResponse
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    private final String mClassName;
    private final FieldMappingDictionary zzUG;
    private final Parcel zzUN;
    private final int zzUO;
    private int zzUP;
    private int zzUQ;
    private final int zzzH;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
    {
        zzzH = i;
        zzUN = (Parcel)zzv.zzr(parcel);
        zzUO = 2;
        zzUG = fieldmappingdictionary;
        if (zzUG == null)
        {
            mClassName = null;
        } else
        {
            mClassName = zzUG.zzmO();
        }
        zzUP = 2;
    }

    private SafeParcelResponse(SafeParcelable safeparcelable, FieldMappingDictionary fieldmappingdictionary, String s)
    {
        zzzH = 1;
        zzUN = Parcel.obtain();
        safeparcelable.writeToParcel(zzUN, 0);
        zzUO = 1;
        zzUG = (FieldMappingDictionary)zzv.zzr(fieldmappingdictionary);
        mClassName = (String)zzv.zzr(s);
        zzUP = 2;
    }

    private static HashMap zzB(Map map)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((FastJsonResponse.Field)entry.getValue()).zzmF()), entry))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return hashmap;
    }

    public static SafeParcelResponse zza(FastJsonResponse fastjsonresponse)
    {
        String s = fastjsonresponse.getClass().getCanonicalName();
        FieldMappingDictionary fieldmappingdictionary = zzb(fastjsonresponse);
        return new SafeParcelResponse((SafeParcelable)fastjsonresponse, fieldmappingdictionary, s);
    }

    private static void zza(FieldMappingDictionary fieldmappingdictionary, FastJsonResponse fastjsonresponse)
    {
        Object obj = fastjsonresponse.getClass();
        if (!fieldmappingdictionary.zzb(((Class) (obj))))
        {
            Map map = fastjsonresponse.zzmy();
            fieldmappingdictionary.zza(((Class) (obj)), map);
            obj = map.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                fastjsonresponse = (FastJsonResponse.Field)map.get((String)((Iterator) (obj)).next());
                Class class1 = fastjsonresponse.zzmG();
                if (class1 != null)
                {
                    try
                    {
                        zza(fieldmappingdictionary, (FastJsonResponse)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (FieldMappingDictionary fieldmappingdictionary)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not instantiate an object of type ").append(fastjsonresponse.zzmG().getCanonicalName()).toString(), fieldmappingdictionary);
                    }
                    // Misplaced declaration of an exception variable
                    catch (FieldMappingDictionary fieldmappingdictionary)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not access object of type ").append(fastjsonresponse.zzmG().getCanonicalName()).toString(), fieldmappingdictionary);
                    }
                }
            } while (true);
        }
    }

    private void zza(StringBuilder stringbuilder, int i, Object obj)
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
            stringbuilder.append("\"").append(zzhz.zzbY(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(zzhr.zzg((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(zzhr.zzh((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            zzia.zza(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void zza(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        switch (field.zzmx())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(field.zzmx()).toString());

        case 0: // '\0'
            zzb(stringbuilder, field, zza(field, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i))));
            return;

        case 1: // '\001'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzk(parcel, i)));
            return;

        case 2: // '\002'
            zzb(stringbuilder, field, zza(field, Long.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i))));
            return;

        case 3: // '\003'
            zzb(stringbuilder, field, zza(field, Float.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i))));
            return;

        case 4: // '\004'
            zzb(stringbuilder, field, zza(field, Double.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i))));
            return;

        case 5: // '\005'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzn(parcel, i)));
            return;

        case 6: // '\006'
            zzb(stringbuilder, field, zza(field, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i))));
            return;

        case 7: // '\007'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i)));
            return;

        case 10: // '\n'
            zzb(stringbuilder, field, zza(field, zzh(com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void zza(StringBuilder stringbuilder, String s, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (field.zzmI())
        {
            zza(stringbuilder, field, parcel, i);
            return;
        } else
        {
            zzb(stringbuilder, field, parcel, i);
            return;
        }
    }

    private void zza(StringBuilder stringbuilder, Map map, Parcel parcel)
    {
        map = zzB(map);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)map.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzaV(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                zza(stringbuilder, (String)entry.getKey(), (FastJsonResponse.Field)entry.getValue(), parcel, j);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private static FieldMappingDictionary zzb(FastJsonResponse fastjsonresponse)
    {
        FieldMappingDictionary fieldmappingdictionary = new FieldMappingDictionary(fastjsonresponse.getClass());
        zza(fieldmappingdictionary, fastjsonresponse);
        fieldmappingdictionary.zzmM();
        fieldmappingdictionary.zzmL();
        return fieldmappingdictionary;
    }

    private void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        if (!field.zzmD()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        field.zzmx();
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
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzu(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzw(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzv(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzx(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzy(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzz(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzt(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        zzhq.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.zza.zzE(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            zza(stringbuilder, field.zzmK(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (field.zzmx())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzk(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzn(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i));
            return;

        case 7: // '\007'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i);
            stringbuilder.append("\"").append(zzhz.zzbY(field)).append("\"");
            return;

        case 8: // '\b'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i);
            stringbuilder.append("\"").append(zzhr.zzg(field)).append("\"");
            return;

        case 9: // '\t'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i);
            stringbuilder.append("\"").append(zzhr.zzh(field));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i);
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
                stringbuilder.append("\"").append(zzhz.zzbY(field.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.zza.zzD(parcel, i);
            parcel.setDataPosition(0);
            zza(stringbuilder, field.zzmK(), parcel);
            return;
        }
    }

    private void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
    {
        if (field.zzmC())
        {
            zzb(stringbuilder, field, (ArrayList)obj);
            return;
        } else
        {
            zza(stringbuilder, field.zzmw(), obj);
            return;
        }
    }

    private void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            zza(stringbuilder, field.zzmw(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    public static HashMap zzh(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        zzv.zzb(zzUG, "Cannot convert to JSON on client side.");
        Parcel parcel = zzmQ();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        zza(stringbuilder, zzUG.zzbX(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        com.google.android.gms.common.server.response.zze.zza(this, parcel, i);
    }

    protected Object zzbT(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean zzbU(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel zzmQ()
    {
        zzUP;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return zzUN;
_L2:
        zzUQ = com.google.android.gms.common.internal.safeparcel.zzb.zzM(zzUN);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(zzUN, zzUQ);
        zzUP = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(zzUN, zzUQ);
        zzUP = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    FieldMappingDictionary zzmR()
    {
        switch (zzUO)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(zzUO).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return zzUG;

        case 2: // '\002'
            return zzUG;
        }
    }

    public Map zzmy()
    {
        if (zzUG == null)
        {
            return null;
        } else
        {
            return zzUG.zzbX(mClassName);
        }
    }

}
