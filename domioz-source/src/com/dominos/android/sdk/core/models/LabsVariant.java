// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsVariant
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean BONEIN;
    private boolean BONELESS;
    private String BreadType;
    private String Code;
    private String DefaultSides;
    private String DefaultToppings;
    private boolean Dessert;
    private String EffectiveOn;
    private boolean Feast;
    private String FlavorCode;
    private boolean Hoagies;
    private String ImageCode;
    private boolean Legend;
    private String MaxOptionQty;
    private String MaxSauceQty;
    private String Name;
    private boolean New;
    private boolean NoCustomization;
    private String Price;
    private String ProductCode;
    private String Promotion;
    private String SizeCode;
    private String WarnAfterOptionQty;
    private boolean Wings;

    public LabsVariant()
    {
        Code = "";
        FlavorCode = "";
        ImageCode = "";
        Name = "";
        Price = "";
        ProductCode = "";
        SizeCode = "";
        DefaultSides = "";
        DefaultToppings = "";
        BreadType = "";
        Promotion = "";
        MaxOptionQty = "";
        WarnAfterOptionQty = "";
        MaxSauceQty = "";
        EffectiveOn = "";
    }

    private LabsVariant(Parcel parcel)
    {
        Code = "";
        FlavorCode = "";
        ImageCode = "";
        Name = "";
        Price = "";
        ProductCode = "";
        SizeCode = "";
        DefaultSides = "";
        DefaultToppings = "";
        BreadType = "";
        Promotion = "";
        MaxOptionQty = "";
        WarnAfterOptionQty = "";
        MaxSauceQty = "";
        EffectiveOn = "";
        setCode(parcel.readString());
        setFlavorCode(parcel.readString());
        setImageCode(parcel.readString());
        setName(parcel.readString());
        setPrice(parcel.readString());
        setProductCode(parcel.readString());
        setSizeCode(parcel.readString());
        setDefaultSides(parcel.readString());
        setDefaultToppings(parcel.readString());
        setBreadType(parcel.readString());
        setPromotion(parcel.readString());
        setMaxOptionQty(parcel.readString());
        setWarnAfterOptionQty(parcel.readString());
        setMaxSauceQty(parcel.readString());
        setEffectiveOn(parcel.readString());
        boolean aflag[] = new boolean[9];
        parcel.readBooleanArray(aflag);
        setFeast(aflag[0]);
        setNoCustomization(aflag[1]);
        setDessert(aflag[2]);
        setLegend(aflag[3]);
        setNew(aflag[4]);
        setBONELESS(aflag[5]);
        setBONEIN(aflag[6]);
        setWings(aflag[7]);
        setHoagies(aflag[8]);
    }

    LabsVariant(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof LabsVariant))
            {
                return false;
            }
            obj = (LabsVariant)obj;
            if (!Code.equals(((LabsVariant) (obj)).Code))
            {
                return false;
            }
        }
        return true;
    }

    public String getBreadType()
    {
        return BreadType;
    }

    public String getCode()
    {
        return Code;
    }

    public String getDefaultSides()
    {
        return DefaultSides;
    }

    public String getDefaultToppings()
    {
        return DefaultToppings;
    }

    public String getEffectiveOn()
    {
        return EffectiveOn;
    }

    public String getFlavorCode()
    {
        return FlavorCode;
    }

    public String getImageCode()
    {
        return ImageCode;
    }

    public String getMaxOptionQty()
    {
        return MaxOptionQty;
    }

    public String getMaxSauceQty()
    {
        return MaxSauceQty;
    }

    public String getName()
    {
        return Name;
    }

    public String getPrice()
    {
        return Price;
    }

    public String getProductCode()
    {
        return ProductCode;
    }

    public String getPromotion()
    {
        return Promotion;
    }

    public String getSizeCode()
    {
        return SizeCode;
    }

    public String getWarnAfterOptionQty()
    {
        return WarnAfterOptionQty;
    }

    public int hashCode()
    {
        return Code.hashCode();
    }

    public boolean isBONEIN()
    {
        return BONEIN;
    }

    public boolean isBONELESS()
    {
        return BONELESS;
    }

    public boolean isDessert()
    {
        return Dessert;
    }

    public boolean isFeast()
    {
        return Feast;
    }

    public boolean isHoagies()
    {
        return Hoagies;
    }

    public boolean isLegend()
    {
        return Legend;
    }

    public boolean isNew()
    {
        return New;
    }

    public boolean isNoCustomization()
    {
        return NoCustomization;
    }

    public boolean isWings()
    {
        return Wings;
    }

    public void setBONEIN(boolean flag)
    {
        BONEIN = flag;
    }

    public void setBONELESS(boolean flag)
    {
        BONELESS = flag;
    }

    public void setBreadType(String s)
    {
        BreadType = s;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setDefaultSides(String s)
    {
        DefaultSides = s;
    }

    public void setDefaultToppings(String s)
    {
        DefaultToppings = s;
    }

    public void setDessert(boolean flag)
    {
        Dessert = flag;
    }

    public void setEffectiveOn(String s)
    {
        EffectiveOn = s;
    }

    public void setFeast(boolean flag)
    {
        Feast = flag;
    }

    public void setFlavorCode(String s)
    {
        FlavorCode = s;
    }

    public void setHoagies(boolean flag)
    {
        Hoagies = flag;
    }

    public void setImageCode(String s)
    {
        ImageCode = s;
    }

    public void setLegend(boolean flag)
    {
        Legend = flag;
    }

    public void setMaxOptionQty(String s)
    {
        MaxOptionQty = s;
    }

    public void setMaxSauceQty(String s)
    {
        MaxSauceQty = s;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setNew(boolean flag)
    {
        New = flag;
    }

    public void setNoCustomization(boolean flag)
    {
        NoCustomization = flag;
    }

    public void setPrice(String s)
    {
        Price = s;
    }

    public void setProductCode(String s)
    {
        ProductCode = s;
    }

    public void setPromotion(String s)
    {
        Promotion = s;
    }

    public void setSizeCode(String s)
    {
        SizeCode = s;
    }

    public void setWarnAfterOptionQty(String s)
    {
        WarnAfterOptionQty = s;
    }

    public void setWings(boolean flag)
    {
        Wings = flag;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getCode());
        parcel.writeString(getFlavorCode());
        parcel.writeString(getImageCode());
        parcel.writeString(getName());
        parcel.writeString(getPrice());
        parcel.writeString(getProductCode());
        parcel.writeString(getSizeCode());
        parcel.writeString(getDefaultSides());
        parcel.writeString(getDefaultToppings());
        parcel.writeString(getBreadType());
        parcel.writeString(getPromotion());
        parcel.writeString(getMaxOptionQty());
        parcel.writeString(getWarnAfterOptionQty());
        parcel.writeString(getMaxSauceQty());
        parcel.writeString(getEffectiveOn());
        parcel.writeBooleanArray(new boolean[] {
            isFeast(), isNoCustomization(), isDessert(), isLegend(), isNew(), isBONELESS(), isBONEIN(), isWings(), isHoagies()
        });
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsVariant createFromParcel(Parcel parcel)
        {
            return new LabsVariant(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsVariant[] newArray(int i)
        {
            return new LabsVariant[i];
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
