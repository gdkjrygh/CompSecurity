// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, FieldCreator, SafeParcelResponse, FieldMappingDictionary

public static class mConverter
    implements SafeParcelable
{

    public static final FieldCreator CREATOR = new FieldCreator();
    protected final Class mConcreteType;
    protected final String mConcreteTypeName;
    onverter mConverter;
    FieldMappingDictionary mDictionary;
    protected final String mOutputFieldName;
    protected final int mSafeParcelableFieldId;
    protected final int mTypeIn;
    protected final boolean mTypeInArray;
    protected final int mTypeOut;
    protected final boolean mTypeOutArray;
    final int mVersionCode;

    public static mConverter forBase64UrlSafe(String s)
    {
        return new <init>(9, false, 9, false, s, -1, null, null);
    }

    public static onverter forBoolean(String s)
    {
        return new <init>(6, false, 6, false, s, -1, null, null);
    }

    public static onverter forBoolean(String s, int i)
    {
        return new <init>(6, false, 6, false, s, i, null, null);
    }

    public static onverter forConcreteType(String s, int i, Class class1)
    {
        return new <init>(11, false, 11, false, s, i, class1, null);
    }

    public static onverter forConcreteType(String s, Class class1)
    {
        return new <init>(11, false, 11, false, s, -1, class1, null);
    }

    public static onverter forConcreteTypeArray(String s, int i, Class class1)
    {
        return new <init>(11, true, 11, true, s, i, class1, null);
    }

    public static onverter forConcreteTypeArray(String s, Class class1)
    {
        return new <init>(11, true, 11, true, s, -1, class1, null);
    }

    public static onverter forDouble(String s, int i)
    {
        return new <init>(4, false, 4, false, s, i, null, null);
    }

    public static onverter forFloat(String s)
    {
        return new <init>(3, false, 3, false, s, -1, null, null);
    }

    public static onverter forFloat(String s, int i)
    {
        return new <init>(3, false, 3, false, s, i, null, null);
    }

    public static onverter forInteger(String s)
    {
        return new <init>(0, false, 0, false, s, -1, null, null);
    }

    public static onverter forInteger(String s, int i)
    {
        return new <init>(0, false, 0, false, s, i, null, null);
    }

    public static onverter forLong(String s)
    {
        return new <init>(2, false, 2, false, s, -1, null, null);
    }

    public static onverter forLong(String s, int i)
    {
        return new <init>(2, false, 2, false, s, i, null, null);
    }

    public static onverter forString(String s)
    {
        return new <init>(7, false, 7, false, s, -1, null, null);
    }

    public static onverter forString(String s, int i)
    {
        return new <init>(7, false, 7, false, s, i, null, null);
    }

    public static onverter forStrings(String s)
    {
        return new <init>(7, true, 7, true, s, -1, null, null);
    }

    public static onverter forStrings(String s, int i)
    {
        return new <init>(7, true, 7, true, s, i, null, null);
    }

    public static onverter withConverter(String s, int i, onverter onverter, boolean flag)
    {
        return new <init>(7, flag, onverter.getTypeOut(), false, s, i, null, onverter);
    }

    public static onverter withConverter(String s, Class class1, boolean flag)
    {
        return withConverter$1311eb53(s, class1, flag);
    }

    private static withConverter._cls1311eb53 withConverter$1311eb53(String s, Class class1, boolean flag)
    {
        try
        {
            s = withConverter(s, -1, (onverter)class1.newInstance(), flag);
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



    onverter(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
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

    private onverter(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
            onverter onverter)
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
        mConverter = onverter;
    }
}
