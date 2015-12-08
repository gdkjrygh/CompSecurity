// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.os.Parcel;
import android.os.Parcelable;
import com.amobee.richmedia.controller.util.NavigationStringEnum;
import com.amobee.richmedia.controller.util.TransitionStringEnum;
import java.lang.reflect.Field;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public static class 
    implements Parcelable
{

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Field afield[];
        afield = getClass().getDeclaredFields();
        i = 0;
_L1:
        Object obj;
        Object obj1;
        try
        {
            if (i >= afield.length)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
        obj = afield[i];
        obj1 = ((Field) (obj)).getType();
        if (!((Class) (obj1)).isEnum())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj1 = ((Class) (obj1)).toString();
        if (((String) (obj1)).equals("class com.ormma.NavigationStringEnum"))
        {
            parcel.writeString(((NavigationStringEnum)((Field) (obj)).get(this)).getText());
            break MISSING_BLOCK_LABEL_129;
        }
        if (((String) (obj1)).equals("class com.ormma.TransitionStringEnum"))
        {
            parcel.writeString(((TransitionStringEnum)((Field) (obj)).get(this)).getText());
        }
        break MISSING_BLOCK_LABEL_129;
        obj = ((Field) (obj)).get(this);
        if (!(obj instanceof android.os.StringEnum.getText))
        {
            parcel.writeValue(obj);
        }
        i++;
          goto _L1
    }

    public I()
    {
    }

    protected I(Parcel parcel)
    {
        Field afield[];
        int i;
        afield = getClass().getDeclaredFields();
        i = 0;
_L1:
        Field field;
        Object obj;
        try
        {
            if (i >= afield.length)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
        field = afield[i];
        obj = field.getType();
        if (!((Class) (obj)).isEnum())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = ((Class) (obj)).toString();
        if (((String) (obj)).equals("class com.ormma.NavigationStringEnum"))
        {
            field.set(this, NavigationStringEnum.fromString(parcel.readString()));
            break MISSING_BLOCK_LABEL_125;
        }
        if (((String) (obj)).equals("class com.ormma.TransitionStringEnum"))
        {
            field.set(this, TransitionStringEnum.fromString(parcel.readString()));
        }
        break MISSING_BLOCK_LABEL_125;
        if (!(field.get(this) instanceof android.os.StringEnum.fromString))
        {
            field.set(this, parcel.readValue(null));
        }
        i++;
          goto _L1
    }
}
