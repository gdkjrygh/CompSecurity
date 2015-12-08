// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastParser, PostProcessor, FieldCreator, SafeParcelResponse, 
//            FieldMappingDictionary

public abstract class FastJsonResponse
{
    public static class Field
        implements SafeParcelable
    {

        public static final FieldCreator CREATOR = new FieldCreator();
        protected final Class mConcreteType;
        protected final String mConcreteTypeName;
        FieldConverter mConverter;
        FieldMappingDictionary mDictionary;
        protected final String mOutputFieldName;
        protected final int mSafeParcelableFieldId;
        protected final int mTypeIn;
        protected final boolean mTypeInArray;
        protected final int mTypeOut;
        protected final boolean mTypeOutArray;
        final int mVersionCode;

        public static Field forBase64UrlSafe(String s)
        {
            return new Field(9, false, 9, false, s, -1, null, null);
        }

        public static Field forBoolean(String s)
        {
            return new Field(6, false, 6, false, s, -1, null, null);
        }

        public static Field forBoolean(String s, int i)
        {
            return new Field(6, false, 6, false, s, i, null, null);
        }

        public static Field forConcreteType(String s, int i, Class class1)
        {
            return new Field(11, false, 11, false, s, i, class1, null);
        }

        public static Field forConcreteType(String s, Class class1)
        {
            return new Field(11, false, 11, false, s, -1, class1, null);
        }

        public static Field forConcreteTypeArray(String s, int i, Class class1)
        {
            return new Field(11, true, 11, true, s, i, class1, null);
        }

        public static Field forConcreteTypeArray(String s, Class class1)
        {
            return new Field(11, true, 11, true, s, -1, class1, null);
        }

        public static Field forDouble(String s, int i)
        {
            return new Field(4, false, 4, false, s, i, null, null);
        }

        public static Field forFloat(String s)
        {
            return new Field(3, false, 3, false, s, -1, null, null);
        }

        public static Field forFloat(String s, int i)
        {
            return new Field(3, false, 3, false, s, i, null, null);
        }

        public static Field forInteger(String s)
        {
            return new Field(0, false, 0, false, s, -1, null, null);
        }

        public static Field forInteger(String s, int i)
        {
            return new Field(0, false, 0, false, s, i, null, null);
        }

        public static Field forLong(String s)
        {
            return new Field(2, false, 2, false, s, -1, null, null);
        }

        public static Field forLong(String s, int i)
        {
            return new Field(2, false, 2, false, s, i, null, null);
        }

        public static Field forString(String s)
        {
            return new Field(7, false, 7, false, s, -1, null, null);
        }

        public static Field forString(String s, int i)
        {
            return new Field(7, false, 7, false, s, i, null, null);
        }

        public static Field forStrings(String s)
        {
            return new Field(7, true, 7, true, s, -1, null, null);
        }

        public static Field forStrings(String s, int i)
        {
            return new Field(7, true, 7, true, s, i, null, null);
        }

        public static Field withConverter(String s, int i, FieldConverter fieldconverter, boolean flag)
        {
            return new Field(7, flag, fieldconverter.getTypeOut(), false, s, i, null, fieldconverter);
        }

        public static Field withConverter(String s, Class class1, boolean flag)
        {
            return withConverter$1311eb53(s, class1, flag);
        }

        private static Field withConverter$1311eb53(String s, Class class1, boolean flag)
        {
            try
            {
                s = withConverter(s, -1, (FieldConverter)class1.newInstance(), flag);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            return s;
        }

        public int describeContents()
        {
            return 0;
        }

        public final Class getConcreteType()
        {
            return mConcreteType;
        }

        public final Map getConcreteTypeFieldMappingFromDictionary()
        {
            Preconditions.checkNotNull(mConcreteTypeName);
            Preconditions.checkNotNull(mDictionary);
            return mDictionary.getFieldMapping(mConcreteTypeName);
        }

        final String getConcreteTypeName()
        {
            if (mConcreteTypeName == null)
            {
                return null;
            } else
            {
                return mConcreteTypeName;
            }
        }

        public final String getOutputFieldName()
        {
            return mOutputFieldName;
        }

        public final int getSafeParcelableFieldId()
        {
            return mSafeParcelableFieldId;
        }

        public final int getTypeIn()
        {
            return mTypeIn;
        }

        public final int getTypeOut()
        {
            return mTypeOut;
        }

        public final boolean isTypeInArray()
        {
            return mTypeInArray;
        }

        public final boolean isTypeOutArray()
        {
            return mTypeOutArray;
        }

        public final boolean isValidSafeParcelableFieldId()
        {
            return mSafeParcelableFieldId != -1;
        }

        public final FastJsonResponse newConcreteTypeInstance()
            throws InstantiationException, IllegalAccessException
        {
            if (mConcreteType == com/google/android/gms/common/server/response/SafeParcelResponse)
            {
                Preconditions.checkNotNull(mDictionary, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(mDictionary, mConcreteTypeName);
            } else
            {
                return (FastJsonResponse)mConcreteType.newInstance();
            }
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(mVersionCode).append('\n');
            stringbuilder.append("                 typeIn=").append(mTypeIn).append('\n');
            stringbuilder.append("            typeInArray=").append(mTypeInArray).append('\n');
            stringbuilder.append("                typeOut=").append(mTypeOut).append('\n');
            stringbuilder.append("           typeOutArray=").append(mTypeOutArray).append('\n');
            stringbuilder.append("        outputFieldName=").append(mOutputFieldName).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(mSafeParcelableFieldId).append('\n');
            stringbuilder.append("       concreteTypeName=").append(getConcreteTypeName()).append('\n');
            if (mConcreteType != null)
            {
                stringbuilder.append("     concreteType.class=").append(mConcreteType.getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (mConverter == null)
            {
                s = "null";
            } else
            {
                s = mConverter.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            FieldCreator.writeToParcel(this, parcel, i);
        }



        Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
                String s1, ConverterWrapper converterwrapper)
        {
            Object obj = null;
            super();
            mVersionCode = i;
            mTypeIn = j;
            mTypeInArray = flag;
            mTypeOut = k;
            mTypeOutArray = flag1;
            mOutputFieldName = s;
            mSafeParcelableFieldId = l;
            if (s1 == null)
            {
                mConcreteType = null;
                mConcreteTypeName = null;
            } else
            {
                mConcreteType = com/google/android/gms/common/server/response/SafeParcelResponse;
                mConcreteTypeName = s1;
            }
            if (converterwrapper == null)
            {
                s = obj;
            } else
            if (converterwrapper.mStringToIntConverter != null)
            {
                s = converterwrapper.mStringToIntConverter;
            } else
            {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            mConverter = s;
        }

        private Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
                FieldConverter fieldconverter)
        {
            mVersionCode = 1;
            mTypeIn = i;
            mTypeInArray = flag;
            mTypeOut = j;
            mTypeOutArray = flag1;
            mOutputFieldName = s;
            mSafeParcelableFieldId = k;
            mConcreteType = class1;
            if (class1 == null)
            {
                mConcreteTypeName = null;
            } else
            {
                mConcreteTypeName = class1.getCanonicalName();
            }
            mConverter = fieldconverter;
        }
    }

    public static interface FieldConverter
    {

        public abstract Object convert(Object obj);

        public abstract Object convertBack(Object obj);

        public abstract int getTypeOut();
    }


    private boolean mHasResponse;
    private byte mResponseBody[];
    private int mResponseCode;

    public FastJsonResponse()
    {
    }

    private static void appendValue(StringBuilder stringbuilder, Field field, Object obj)
    {
        if (field.getTypeIn() == 11)
        {
            stringbuilder.append(((FastJsonResponse)field.getConcreteType().cast(obj)).toString());
            return;
        }
        if (field.getTypeIn() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(JsonUtils.escapeString((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private static void appendValueArray(StringBuilder stringbuilder, Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            Object obj = arraylist.get(i);
            if (obj != null)
            {
                appendValue(stringbuilder, field, obj);
            }
        }

        stringbuilder.append("]");
    }

    protected static Object getOriginalValue(Field field, Object obj)
    {
        Object obj1 = obj;
        if (field.mConverter != null)
        {
            obj1 = field.mConverter.convertBack(obj);
        }
        return obj1;
    }

    public static InputStream getUnzippedStream(byte abyte0[])
    {
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        Object obj = bytearrayinputstream;
        if (IOUtils.isGzipByteBuffer(abyte0))
        {
            try
            {
                obj = new GZIPInputStream(bytearrayinputstream);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return bytearrayinputstream;
            }
        }
        return ((InputStream) (obj));
    }

    private static boolean isOutputNonNull(String s, Object obj)
    {
        if (obj == null)
        {
            if (Log.isLoggable("FastJsonResponse", 6))
            {
                Log.e("FastJsonResponse", (new StringBuilder("Output field (")).append(s).append(") has a null value, but expected a primitive").toString());
            }
            return false;
        } else
        {
            return true;
        }
    }

    private void setConvertedValue(Field field, Object obj)
    {
        String s;
        s = field.getOutputFieldName();
        obj = field.mConverter.convert(obj);
        field.getTypeOut();
        JVM INSTR tableswitch 0 9: default 76
    //                   0 103
    //                   1 125
    //                   2 136
    //                   3 76
    //                   4 158
    //                   5 180
    //                   6 191
    //                   7 213
    //                   8 224
    //                   9 224;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L9 _L9
_L1:
        throw new IllegalStateException((new StringBuilder("Unsupported type for conversion: ")).append(field.getTypeOut()).toString());
_L2:
        if (isOutputNonNull(s, obj))
        {
            setIntegerInternal(field, s, ((Integer)obj).intValue());
        }
_L11:
        return;
_L3:
        setBigIntegerInternal(field, s, (BigInteger)obj);
        return;
_L4:
        if (isOutputNonNull(s, obj))
        {
            setLongInternal(field, s, ((Long)obj).longValue());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (isOutputNonNull(s, obj))
        {
            setDoubleInternal(field, s, ((Double)obj).doubleValue());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        setBigDecimalInternal(field, s, (BigDecimal)obj);
        return;
_L7:
        if (isOutputNonNull(s, obj))
        {
            setBooleanInternal(field, s, ((Boolean)obj).booleanValue());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        setStringInternal(field, s, (String)obj);
        return;
_L9:
        if (isOutputNonNull(s, obj))
        {
            setDecodedBytesInternal(field, s, (byte[])obj);
            return;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public void addConcreteTypeArrayInternal(Field field, String s, ArrayList arraylist)
    {
        addConcreteTypeArray(s, arraylist);
    }

    public void addConcreteTypeInternal(Field field, String s, FastJsonResponse fastjsonresponse)
    {
        addConcreteType(s, fastjsonresponse);
    }

    public abstract Map getFieldMappings();

    public Object getFieldValue(Field field)
    {
        String s = field.getOutputFieldName();
        if (field.getConcreteType() != null)
        {
            boolean flag;
            if (getValueObject(field.getOutputFieldName()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                field.getOutputFieldName()
            });
            field.isTypeOutArray();
            try
            {
                field = (new StringBuilder("get")).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                field = ((Field) (getClass().getMethod(field, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Field field)
            {
                throw new RuntimeException(field);
            }
            return field;
        } else
        {
            return getValueObject(field.getOutputFieldName());
        }
    }

    public PostProcessor getPostProcessor()
    {
        return null;
    }

    public final byte[] getResponseBody()
    {
        Object obj;
        Object obj2;
        Preconditions.checkState(mHasResponse);
        obj = null;
        obj2 = null;
        Object obj1 = new GZIPInputStream(new ByteArrayInputStream(mResponseBody));
        obj = new byte[4096];
        obj2 = new ByteArrayOutputStream();
_L3:
        int i = ((InputStream) (obj1)).read(((byte []) (obj)), 0, 4096);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((ByteArrayOutputStream) (obj2)).write(((byte []) (obj)), 0, i);
          goto _L3
        obj;
_L7:
        obj = obj1;
        obj2 = mResponseBody;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return ((byte []) (obj2));
            }
        }
        return ((byte []) (obj2));
_L2:
        ((ByteArrayOutputStream) (obj2)).flush();
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        return ((byte []) (obj));
        obj1;
_L5:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        IOException ioexception;
        ioexception;
        obj1 = obj2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public abstract Object getValueObject(String s);

    public boolean isConcreteTypeArrayFieldSet(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public boolean isConcreteTypeFieldSet(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public boolean isFieldSet(Field field)
    {
        if (field.getTypeOut() == 11)
        {
            if (field.isTypeOutArray())
            {
                return isConcreteTypeArrayFieldSet(field.getOutputFieldName());
            } else
            {
                return isConcreteTypeFieldSet(field.getOutputFieldName());
            }
        } else
        {
            return isPrimitiveFieldSet(field.getOutputFieldName());
        }
    }

    public abstract boolean isPrimitiveFieldSet(String s);

    public final void parseNetworkResponse(int i, byte abyte0[])
        throws FastParser.ParseException
    {
        InputStream inputstream;
        mResponseCode = i;
        mResponseBody = abyte0;
        mHasResponse = true;
        inputstream = getUnzippedStream(abyte0);
        (new FastParser()).parse(inputstream, this);
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
        abyte0;
        try
        {
            inputstream.close();
        }
        catch (IOException ioexception) { }
        throw abyte0;
    }

    public final void setBigDecimal(Field field, BigDecimal bigdecimal)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, bigdecimal);
            return;
        } else
        {
            setBigDecimalInternal(field, field.getOutputFieldName(), bigdecimal);
            return;
        }
    }

    protected void setBigDecimal(String s, BigDecimal bigdecimal)
    {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    protected void setBigDecimalInternal(Field field, String s, BigDecimal bigdecimal)
    {
        setBigDecimal(s, bigdecimal);
    }

    public final void setBigDecimals(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setBigDecimalsInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setBigDecimals(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    protected void setBigDecimalsInternal(Field field, String s, ArrayList arraylist)
    {
        setBigDecimals(s, arraylist);
    }

    public final void setBigInteger(Field field, BigInteger biginteger)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, biginteger);
            return;
        } else
        {
            setBigIntegerInternal(field, field.getOutputFieldName(), biginteger);
            return;
        }
    }

    protected void setBigInteger(String s, BigInteger biginteger)
    {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    protected void setBigIntegerInternal(Field field, String s, BigInteger biginteger)
    {
        setBigInteger(s, biginteger);
    }

    public final void setBigIntegers(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setBigIntegersInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setBigIntegers(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    protected void setBigIntegersInternal(Field field, String s, ArrayList arraylist)
    {
        setBigIntegers(s, arraylist);
    }

    public final void setBoolean(Field field, boolean flag)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, Boolean.valueOf(flag));
            return;
        } else
        {
            setBooleanInternal(field, field.getOutputFieldName(), flag);
            return;
        }
    }

    protected void setBoolean(String s, boolean flag)
    {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setBooleanInternal(Field field, String s, boolean flag)
    {
        setBoolean(s, flag);
    }

    public final void setBooleans(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setBooleansInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setBooleans(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    protected void setBooleansInternal(Field field, String s, ArrayList arraylist)
    {
        setBooleans(s, arraylist);
    }

    public final void setDecodedBytes(Field field, byte abyte0[])
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, abyte0);
            return;
        } else
        {
            setDecodedBytesInternal(field, field.getOutputFieldName(), abyte0);
            return;
        }
    }

    protected void setDecodedBytes(String s, byte abyte0[])
    {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setDecodedBytesInternal(Field field, String s, byte abyte0[])
    {
        setDecodedBytes(s, abyte0);
    }

    public final void setDouble(Field field, double d)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, Double.valueOf(d));
            return;
        } else
        {
            setDoubleInternal(field, field.getOutputFieldName(), d);
            return;
        }
    }

    protected void setDouble(String s, double d)
    {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void setDoubleInternal(Field field, String s, double d)
    {
        setDouble(s, d);
    }

    public final void setDoubles(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setDoublesInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setDoubles(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("Double list not supported");
    }

    protected void setDoublesInternal(Field field, String s, ArrayList arraylist)
    {
        setDoubles(s, arraylist);
    }

    public final void setFloat(Field field, float f)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, Float.valueOf(f));
            return;
        } else
        {
            setFloatInternal(field, field.getOutputFieldName(), f);
            return;
        }
    }

    protected void setFloat(String s, float f)
    {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void setFloatInternal(Field field, String s, float f)
    {
        setFloat(s, f);
    }

    public final void setFloats(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setFloatsInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setFloats(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("Float list not supported");
    }

    protected void setFloatsInternal(Field field, String s, ArrayList arraylist)
    {
        setFloats(s, arraylist);
    }

    public final void setInteger(Field field, int i)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, Integer.valueOf(i));
            return;
        } else
        {
            setIntegerInternal(field, field.getOutputFieldName(), i);
            return;
        }
    }

    protected void setInteger(String s, int i)
    {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setIntegerInternal(Field field, String s, int i)
    {
        setInteger(s, i);
    }

    public final void setIntegers(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setIntegersInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setIntegers(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    protected void setIntegersInternal(Field field, String s, ArrayList arraylist)
    {
        setIntegers(s, arraylist);
    }

    public final void setLong(Field field, long l)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, Long.valueOf(l));
            return;
        } else
        {
            setLongInternal(field, field.getOutputFieldName(), l);
            return;
        }
    }

    protected void setLong(String s, long l)
    {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setLongInternal(Field field, String s, long l)
    {
        setLong(s, l);
    }

    public final void setLongs(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setLongsInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setLongs(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("Long list not supported");
    }

    protected void setLongsInternal(Field field, String s, ArrayList arraylist)
    {
        setLongs(s, arraylist);
    }

    public final void setString(Field field, String s)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, s);
            return;
        } else
        {
            setStringInternal(field, field.getOutputFieldName(), s);
            return;
        }
    }

    protected void setString(String s, String s1)
    {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringInternal(Field field, String s, String s1)
    {
        setString(s, s1);
    }

    public final void setStringMap(Field field, Map map)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, map);
            return;
        } else
        {
            setStringMapInternal(field, field.getOutputFieldName(), map);
            return;
        }
    }

    protected void setStringMap(String s, Map map)
    {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringMapInternal(Field field, String s, Map map)
    {
        setStringMap(s, map);
    }

    public final void setStrings(Field field, ArrayList arraylist)
    {
        if (field.mConverter != null)
        {
            setConvertedValue(field, arraylist);
            return;
        } else
        {
            setStringsInternal(field, field.getOutputFieldName(), arraylist);
            return;
        }
    }

    protected void setStrings(String s, ArrayList arraylist)
    {
        throw new UnsupportedOperationException("String list not supported");
    }

    public void setStringsInternal(Field field, String s, ArrayList arraylist)
    {
        setStrings(s, arraylist);
    }

    public String toString()
    {
        Map map = getFieldMappings();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = map.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Field field = (Field)map.get(s);
                if (isFieldSet(field))
                {
                    Object obj = getOriginalValue(field, getFieldValue(field));
                    if (stringbuilder.length() == 0)
                    {
                        stringbuilder.append("{");
                    } else
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append("\"").append(s).append("\":");
                    if (obj == null)
                    {
                        stringbuilder.append("null");
                    } else
                    {
                        switch (field.getTypeOut())
                        {
                        default:
                            if (field.isTypeInArray())
                            {
                                appendValueArray(stringbuilder, field, (ArrayList)obj);
                            } else
                            {
                                appendValue(stringbuilder, field, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(Base64Utils.encode((byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(Base64Utils.encodeUrlSafe((byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj);
                            break;
                        }
                        continue label0;
                    }
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("}");
            } else
            {
                stringbuilder.append("{}");
            }
            return stringbuilder.toString();
        } while (true);
    }
}
