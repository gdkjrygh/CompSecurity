// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;

// Referenced classes of package com.microsoft.advertising.android:
//            av

public class ReflectedParcelable
    implements Parcelable
{

    ReflectedParcelable()
    {
    }

    protected ReflectedParcelable(Parcel parcel)
    {
        int i;
        int j;
        Field afield[] = getClass().getDeclaredFields();
        Field field;
        try
        {
            j = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            av.c("ReflectedParcelable", parcel.getMessage());
            return;
        }
        i = 0;
          goto _L1
_L3:
        field = afield[i];
        if (!(field.get(this) instanceof android.os.Parcelable.Creator))
        {
            field.set(this, parcel.readValue(null));
        }
        i++;
_L1:
        if (i < j) goto _L3; else goto _L2
_L2:
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j;
        Field afield[] = getClass().getDeclaredFields();
        Object obj;
        try
        {
            j = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            av.c("writeToParcel", parcel.getMessage());
            return;
        }
        i = 0;
          goto _L1
_L3:
        obj = afield[i].get(this);
        if (!(obj instanceof android.os.Parcelable.Creator))
        {
            parcel.writeValue(obj);
        }
        i++;
_L1:
        if (i < j) goto _L3; else goto _L2
_L2:
    }
}
