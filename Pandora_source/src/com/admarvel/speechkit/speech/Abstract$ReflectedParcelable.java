// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;

// Referenced classes of package com.admarvel.speechkit.speech:
//            Abstract, NavigationStringEnum, TransitionStringEnum

public static class ng
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
_L2:
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
            parcel.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            parcel.printStackTrace();
            return;
        }
        obj = afield[i];
        obj1 = ((Field) (obj)).getType();
        if (!((Class) (obj1)).isEnum())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj1 = ((Class) (obj1)).toString();
        if (((String) (obj1)).equals("class com.nuance.dragon.mraid.util.NavigationStringEnum"))
        {
            parcel.writeString(((NavigationStringEnum)((Field) (obj)).get(this)).getText());
            break MISSING_BLOCK_LABEL_139;
        }
        if (((String) (obj1)).equals("class com.nuance.dragon.mraid.util.TransitionStringEnum"))
        {
            parcel.writeString(((TransitionStringEnum)((Field) (obj)).get(this)).getText());
        }
        break MISSING_BLOCK_LABEL_139;
        obj = ((Field) (obj)).get(this);
        if (!(obj instanceof android.os.StringEnum.getText))
        {
            parcel.writeValue(obj);
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ()
    {
    }

    protected (Parcel parcel)
    {
        Field afield[];
        int i;
        afield = getClass().getDeclaredFields();
        i = 0;
_L2:
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
            parcel.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            parcel.printStackTrace();
            return;
        }
        field = afield[i];
        obj = field.getType();
        if (!((Class) (obj)).isEnum())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = ((Class) (obj)).toString();
        if (((String) (obj)).equals("class com.nuance.dragon.mraid.util.NavigationStringEnum"))
        {
            field.set(this, NavigationStringEnum.fromString(parcel.readString()));
            break MISSING_BLOCK_LABEL_135;
        }
        if (((String) (obj)).equals("class com.nuance.dragon.mraid.util.TransitionStringEnum"))
        {
            field.set(this, TransitionStringEnum.fromString(parcel.readString()));
        }
        break MISSING_BLOCK_LABEL_135;
        if (!(field.get(this) instanceof android.os.StringEnum.fromString))
        {
            field.set(this, parcel.readValue(null));
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
