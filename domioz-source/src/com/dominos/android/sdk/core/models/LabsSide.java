// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsProductOption

public class LabsSide extends LabsProductOption
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private List Availability;
    private String Code;
    private String Description;
    private String EffectiveOn;
    private String Name;
    private boolean Side;
    private int defaultQuantity;
    private int maxQuanity;

    public LabsSide()
    {
        maxQuanity = 25;
        Availability = new ArrayList();
    }

    private LabsSide(Parcel parcel)
    {
        maxQuanity = 25;
        setCode(parcel.readString());
        setDescription(parcel.readString());
        setName(parcel.readString());
        options = (HashMap)parcel.readBundle().get("Map");
        defaultQuantity = parcel.readInt();
    }

    LabsSide(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public LabsSide(LabsSide labsside)
    {
        maxQuanity = 25;
        if (labsside.Availability != null)
        {
            Availability = new ArrayList(labsside.Availability);
        }
        Code = labsside.Code;
        Description = labsside.Description;
        Name = labsside.Name;
        Side = labsside.Side;
        EffectiveOn = labsside.EffectiveOn;
        options = labsside.getOptionMap();
        defaultQuantity = labsside.defaultQuantity;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof LabsSide))
            {
                return false;
            }
            obj = (LabsSide)obj;
            if (!Code.equals(((LabsSide) (obj)).Code))
            {
                return false;
            }
        }
        return true;
    }

    public List getAvailability()
    {
        return Availability;
    }

    public String getCode()
    {
        return Code;
    }

    public int getDefaultQuantity()
    {
        return defaultQuantity;
    }

    public String getDescription()
    {
        return Description;
    }

    public String getEffectiveOn()
    {
        return EffectiveOn;
    }

    public int getMaxQuantity()
    {
        return maxQuanity;
    }

    public String getName()
    {
        return Name;
    }

    public int hashCode()
    {
        return Code.hashCode() * 31;
    }

    public boolean isSide()
    {
        return Side;
    }

    public void setAvailability(List list)
    {
        Availability = list;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setDefaultQuantity(int i)
    {
        defaultQuantity = i;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setEffectiveOn(String s)
    {
        EffectiveOn = s;
    }

    public void setMaxQuanity(int i)
    {
        maxQuanity = i;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setOptions(HashMap hashmap)
    {
    }

    public void setSide(boolean flag)
    {
        Side = flag;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("Map", options);
        parcel.writeBundle(bundle);
        parcel.writeString(getCode());
        parcel.writeString(getDescription());
        parcel.writeString(getName());
        parcel.writeInt(defaultQuantity);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsSide createFromParcel(Parcel parcel)
        {
            return new LabsSide(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsSide[] newArray(int i)
        {
            return new LabsSide[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
