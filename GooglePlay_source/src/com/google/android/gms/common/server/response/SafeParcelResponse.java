// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, SafeParcelResponseCreator, FieldMappingDictionary

public class SafeParcelResponse extends FastJsonResponse
    implements SafeParcelable
{

    public static final SafeParcelResponseCreator CREATOR = new SafeParcelResponseCreator();
    private final String mClassName;
    final int mCreationType;
    final FieldMappingDictionary mDictionary;
    private final Parcel mParcel;
    private int mParseStartPosition;
    private int mParseState;
    final int mVersionCode;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
    {
        mVersionCode = i;
        mParcel = (Parcel)Preconditions.checkNotNull(parcel);
        mCreationType = 2;
        mDictionary = fieldmappingdictionary;
        if (mDictionary == null)
        {
            mClassName = null;
        } else
        {
            mClassName = mDictionary.mRootClassName;
        }
        mParseState = 2;
    }

    public SafeParcelResponse(FieldMappingDictionary fieldmappingdictionary, String s)
    {
        mVersionCode = 1;
        mParcel = Parcel.obtain();
        mCreationType = 0;
        mDictionary = (FieldMappingDictionary)Preconditions.checkNotNull(fieldmappingdictionary);
        mClassName = (String)Preconditions.checkNotNull(s);
        mParseState = 0;
    }

    private static HashMap convertBundleToStringMap(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private void ensureValidForParsing(FastJsonResponse.Field field)
    {
        if (!field.isValidSafeParcelableFieldId())
        {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        if (mParcel == null)
        {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        switch (mParseState)
        {
        default:
            throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");

        case 0: // '\0'
            mParseStartPosition = SafeParcelWriter.beginVariableData(mParcel, 20293);
            mParseState = 1;
            // fall through

        case 1: // '\001'
            return;

        case 2: // '\002'
            throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
        }
    }

    private static void writeBackConvertedValueToJson(StringBuilder stringbuilder, int i, Object obj)
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
            stringbuilder.append("\"").append(JsonUtils.escapeString(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(Base64Utils.encode((byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(Base64Utils.encodeUrlSafe((byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void writeObjectToJson(StringBuilder stringbuilder, Map map, Parcel parcel)
    {
        HashMap hashmap;
        boolean flag;
        int i;
        hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((FastJsonResponse.Field)entry.getValue()).getSafeParcelableFieldId()), entry))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        stringbuilder.append('{');
        i = SafeParcelReader.validateObjectHeader(parcel);
        flag = false;
_L14:
        Object obj;
        int j;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break MISSING_BLOCK_LABEL_544;
            }
            j = parcel.readInt();
            obj = (java.util.Map.Entry)hashmap.get(Integer.valueOf(j & 0xffff));
        } while (obj == null);
        if (flag)
        {
            stringbuilder.append(",");
        }
        map = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (FastJsonResponse.Field)((java.util.Map.Entry) (obj)).getValue();
        stringbuilder.append("\"").append(map).append("\":");
        if (((FastJsonResponse.Field) (obj)).mConverter != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_531;
        }
        ((FastJsonResponse.Field) (obj)).getTypeOut();
        JVM INSTR tableswitch 0 11: default 256
    //                   0 290
    //                   1 317
    //                   2 338
    //                   3 362
    //                   4 386
    //                   5 410
    //                   6 431
    //                   7 455
    //                   8 476
    //                   9 476
    //                   10 497
    //                   11 521;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown field out type = ")).append(((FastJsonResponse.Field) (obj)).getTypeOut()).toString());
_L2:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), Integer.valueOf(SafeParcelReader.readInt(parcel, j))));
_L15:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), SafeParcelReader.createBigInteger(parcel, j)));
          goto _L15
_L4:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), Long.valueOf(SafeParcelReader.readLong(parcel, j))));
          goto _L15
_L5:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), Float.valueOf(SafeParcelReader.readFloat(parcel, j))));
          goto _L15
_L6:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), Double.valueOf(SafeParcelReader.readDouble(parcel, j))));
          goto _L15
_L7:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), SafeParcelReader.createBigDecimal(parcel, j)));
          goto _L15
_L8:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), Boolean.valueOf(SafeParcelReader.readBoolean(parcel, j))));
          goto _L15
_L9:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), SafeParcelReader.createString(parcel, j)));
          goto _L15
_L10:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), SafeParcelReader.createByteArray(parcel, j)));
          goto _L15
_L11:
        writeOriginalValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), getOriginalValue(((FastJsonResponse.Field) (obj)), convertBundleToStringMap(SafeParcelReader.createBundle(parcel, j))));
          goto _L15
_L12:
        throw new IllegalArgumentException("Method does not accept concrete type.");
        writeUnconvertedValueToJson(stringbuilder, ((FastJsonResponse.Field) (obj)), parcel, j);
          goto _L15
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private void writeOriginalValueToJson(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
    {
        if (field.isTypeInArray())
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
                writeBackConvertedValueToJson(stringbuilder, field.getTypeIn(), ((ArrayList) (obj)).get(i));
            }

            stringbuilder.append("]");
            return;
        } else
        {
            writeBackConvertedValueToJson(stringbuilder, field.getTypeIn(), obj);
            return;
        }
    }

    private void writeUnconvertedValueToJson(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        if (!field.isTypeOutArray()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        field.getTypeOut();
        JVM INSTR tableswitch 0 11: default 80
    //                   0 91
    //                   1 145
    //                   2 238
    //                   3 251
    //                   4 297
    //                   5 343
    //                   6 356
    //                   7 402
    //                   8 415
    //                   9 415
    //                   10 415
    //                   11 426;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        field = SafeParcelReader.createIntArray(parcel, i);
        int j = field.length;
        i = 0;
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
        int k = SafeParcelReader.readSize(parcel, i);
        int l1 = parcel.dataPosition();
        if (k == 0)
        {
            field = null;
        } else
        {
            int i2 = parcel.readInt();
            field = new BigInteger[i2];
            for (i = 0; i < i2; i++)
            {
                field[i] = new BigInteger(parcel.createByteArray());
            }

            parcel.setDataPosition(l1 + k);
        }
        ArrayUtils.writeArray(stringbuilder, field);
_L14:
        stringbuilder.append("]");
        return;
_L6:
        ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createLongArray(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        i = SafeParcelReader.readSize(parcel, i);
        int l = parcel.dataPosition();
        if (i == 0)
        {
            field = null;
        } else
        {
            field = parcel.createFloatArray();
            parcel.setDataPosition(i + l);
        }
        ArrayUtils.writeArray(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L8:
        i = SafeParcelReader.readSize(parcel, i);
        int i1 = parcel.dataPosition();
        if (i == 0)
        {
            field = null;
        } else
        {
            field = parcel.createDoubleArray();
            parcel.setDataPosition(i + i1);
        }
        ArrayUtils.writeArray(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L9:
        ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createBigDecimalArray(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        i = SafeParcelReader.readSize(parcel, i);
        int j1 = parcel.dataPosition();
        if (i == 0)
        {
            field = null;
        } else
        {
            field = parcel.createBooleanArray();
            parcel.setDataPosition(i + j1);
        }
        ArrayUtils.writeArray(stringbuilder, field);
        continue; /* Loop/switch isn't completed */
_L11:
        ArrayUtils.writeStringArray(stringbuilder, SafeParcelReader.createStringArray(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = SafeParcelReader.createParcelArray(parcel, i);
        int k1 = parcel.length;
        i = 0;
        while (i < k1) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            writeObjectToJson(stringbuilder, field.getConcreteTypeFieldMappingFromDictionary(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (field.getTypeOut())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(SafeParcelReader.readInt(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(SafeParcelReader.createBigInteger(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(SafeParcelReader.readLong(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(SafeParcelReader.readFloat(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(SafeParcelReader.readDouble(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(SafeParcelReader.createBigDecimal(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(SafeParcelReader.readBoolean(parcel, i));
            return;

        case 7: // '\007'
            field = SafeParcelReader.createString(parcel, i);
            stringbuilder.append("\"").append(JsonUtils.escapeString(field)).append("\"");
            return;

        case 8: // '\b'
            field = SafeParcelReader.createByteArray(parcel, i);
            stringbuilder.append("\"").append(Base64Utils.encode(field)).append("\"");
            return;

        case 9: // '\t'
            field = SafeParcelReader.createByteArray(parcel, i);
            stringbuilder.append("\"").append(Base64Utils.encodeUrlSafe(field));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            field = SafeParcelReader.createBundle(parcel, i);
            parcel = field.keySet();
            parcel.size();
            stringbuilder.append("{");
            i = 1;
            String s;
            for (parcel = parcel.iterator(); parcel.hasNext(); stringbuilder.append("\"").append(JsonUtils.escapeString(field.getString(s))).append("\""))
            {
                s = (String)parcel.next();
                if (i == 0)
                {
                    stringbuilder.append(",");
                }
                i = 0;
                stringbuilder.append("\"").append(s).append("\"");
                stringbuilder.append(":");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = SafeParcelReader.createParcel(parcel, i);
            parcel.setDataPosition(0);
            writeObjectToJson(stringbuilder, field.getConcreteTypeFieldMappingFromDictionary(), parcel);
            return;
        }
    }

    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        s = new ArrayList();
        arraylist.size();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); s.add(((SafeParcelResponse)(FastJsonResponse)arraylist.next()).getParcel())) { }
        SafeParcelWriter.writeParcelList$62107c48(mParcel, field.getSafeParcelableFieldId(), s);
    }

    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        ensureValidForParsing(field);
        s = ((SafeParcelResponse)fastjsonresponse).getParcel();
        SafeParcelWriter.writeParcel(mParcel, field.getSafeParcelableFieldId(), s, true);
    }

    public int describeContents()
    {
        return 0;
    }

    public final Map getFieldMappings()
    {
        if (mDictionary == null)
        {
            return null;
        } else
        {
            return mDictionary.getFieldMapping(mClassName);
        }
    }

    public final Parcel getParcel()
    {
        mParseState;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 47;
           goto _L1 _L2 _L3
_L1:
        return mParcel;
_L2:
        mParseStartPosition = SafeParcelWriter.beginVariableData(mParcel, 20293);
_L3:
        SafeParcelWriter.finishVariableData(mParcel, mParseStartPosition);
        mParseState = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected final Object getValueObject(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected final void setBigDecimalInternal(FastJsonResponse.Field field, String s, BigDecimal bigdecimal)
    {
        ensureValidForParsing(field);
        s = mParcel;
        int i = field.getSafeParcelableFieldId();
        if (bigdecimal == null)
        {
            SafeParcelWriter.writeHeader(s, i, 0);
            return;
        } else
        {
            i = SafeParcelWriter.beginVariableData(s, i);
            s.writeByteArray(bigdecimal.unscaledValue().toByteArray());
            s.writeInt(bigdecimal.scale());
            SafeParcelWriter.finishVariableData(s, i);
            return;
        }
    }

    protected final void setBigDecimalsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int k = arraylist.size();
        s = new BigDecimal[k];
        for (int i = 0; i < k; i++)
        {
            s[i] = (BigDecimal)arraylist.get(i);
        }

        arraylist = mParcel;
        int l = SafeParcelWriter.beginVariableData(arraylist, field.getSafeParcelableFieldId());
        arraylist.writeInt(k);
        for (int j = 0; j < k; j++)
        {
            arraylist.writeByteArray(s[j].unscaledValue().toByteArray());
            arraylist.writeInt(s[j].scale());
        }

        SafeParcelWriter.finishVariableData(arraylist, l);
    }

    protected final void setBigIntegerInternal(FastJsonResponse.Field field, String s, BigInteger biginteger)
    {
        ensureValidForParsing(field);
        s = mParcel;
        int i = field.getSafeParcelableFieldId();
        if (biginteger == null)
        {
            SafeParcelWriter.writeHeader(s, i, 0);
            return;
        } else
        {
            i = SafeParcelWriter.beginVariableData(s, i);
            s.writeByteArray(biginteger.toByteArray());
            SafeParcelWriter.finishVariableData(s, i);
            return;
        }
    }

    protected final void setBigIntegersInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int k = arraylist.size();
        s = new BigInteger[k];
        for (int i = 0; i < k; i++)
        {
            s[i] = (BigInteger)arraylist.get(i);
        }

        arraylist = mParcel;
        int l = SafeParcelWriter.beginVariableData(arraylist, field.getSafeParcelableFieldId());
        arraylist.writeInt(k);
        for (int j = 0; j < k; j++)
        {
            arraylist.writeByteArray(s[j].toByteArray());
        }

        SafeParcelWriter.finishVariableData(arraylist, l);
    }

    protected final void setBooleanInternal(FastJsonResponse.Field field, String s, boolean flag)
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeBoolean(mParcel, field.getSafeParcelableFieldId(), flag);
    }

    protected final void setBooleansInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int k = arraylist.size();
        s = new boolean[k];
        for (int i = 0; i < k; i++)
        {
            s[i] = ((Boolean)arraylist.get(i)).booleanValue();
        }

        arraylist = mParcel;
        int j = SafeParcelWriter.beginVariableData(arraylist, field.getSafeParcelableFieldId());
        arraylist.writeBooleanArray(s);
        SafeParcelWriter.finishVariableData(arraylist, j);
    }

    protected final void setDecodedBytesInternal(FastJsonResponse.Field field, String s, byte abyte0[])
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeByteArray(mParcel, field.getSafeParcelableFieldId(), abyte0, true);
    }

    protected final void setDoubleInternal(FastJsonResponse.Field field, String s, double d)
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeDouble(mParcel, field.getSafeParcelableFieldId(), d);
    }

    protected final void setDoublesInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int k = arraylist.size();
        s = new double[k];
        for (int i = 0; i < k; i++)
        {
            s[i] = ((Double)arraylist.get(i)).doubleValue();
        }

        arraylist = mParcel;
        int j = SafeParcelWriter.beginVariableData(arraylist, field.getSafeParcelableFieldId());
        arraylist.writeDoubleArray(s);
        SafeParcelWriter.finishVariableData(arraylist, j);
    }

    protected final void setFloatInternal(FastJsonResponse.Field field, String s, float f)
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeFloat(mParcel, field.getSafeParcelableFieldId(), f);
    }

    protected final void setFloatsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int k = arraylist.size();
        s = new float[k];
        for (int i = 0; i < k; i++)
        {
            s[i] = ((Float)arraylist.get(i)).floatValue();
        }

        arraylist = mParcel;
        int j = SafeParcelWriter.beginVariableData(arraylist, field.getSafeParcelableFieldId());
        arraylist.writeFloatArray(s);
        SafeParcelWriter.finishVariableData(arraylist, j);
    }

    protected final void setIntegerInternal(FastJsonResponse.Field field, String s, int i)
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeInt(mParcel, field.getSafeParcelableFieldId(), i);
    }

    protected final void setIntegersInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int j = arraylist.size();
        s = new int[j];
        for (int i = 0; i < j; i++)
        {
            s[i] = ((Integer)arraylist.get(i)).intValue();
        }

        SafeParcelWriter.writeIntArray(mParcel, field.getSafeParcelableFieldId(), s, true);
    }

    protected final void setLongInternal(FastJsonResponse.Field field, String s, long l)
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeLong(mParcel, field.getSafeParcelableFieldId(), l);
    }

    protected final void setLongsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int j = arraylist.size();
        s = new long[j];
        for (int i = 0; i < j; i++)
        {
            s[i] = ((Long)arraylist.get(i)).longValue();
        }

        SafeParcelWriter.writeLongArray(mParcel, field.getSafeParcelableFieldId(), s, true);
    }

    protected final void setStringInternal(FastJsonResponse.Field field, String s, String s1)
    {
        ensureValidForParsing(field);
        SafeParcelWriter.writeString(mParcel, field.getSafeParcelableFieldId(), s1, true);
    }

    protected final void setStringMapInternal(FastJsonResponse.Field field, String s, Map map)
    {
        ensureValidForParsing(field);
        s = new Bundle();
        String s1;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); s.putString(s1, (String)map.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        SafeParcelWriter.writeBundle(mParcel, field.getSafeParcelableFieldId(), s, true);
    }

    protected final void setStringsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        ensureValidForParsing(field);
        int j = arraylist.size();
        s = new String[j];
        for (int i = 0; i < j; i++)
        {
            s[i] = (String)arraylist.get(i);
        }

        SafeParcelWriter.writeStringArray(mParcel, field.getSafeParcelableFieldId(), s, true);
    }

    public String toString()
    {
        Preconditions.checkNotNull(mDictionary, "Cannot convert to JSON on client side.");
        Parcel parcel = getParcel();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        writeObjectToJson(stringbuilder, mDictionary.getFieldMapping(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SafeParcelResponseCreator.writeToParcel(this, parcel, i);
    }

}
