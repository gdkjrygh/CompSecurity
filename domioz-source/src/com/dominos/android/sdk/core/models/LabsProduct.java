// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsProduct
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean Artisan;
    private String AvailableSides;
    private String AvailableToppings;
    private boolean BazaarVoice;
    private String BvCode;
    private String Code;
    private String DefaultSides;
    private String DefaultToppings;
    private String Description;
    private String EffectiveOn;
    private String ImageCode;
    private int MaxOptionQty;
    private int MaxQuantity;
    private int MaxSauceQty;
    private String Name;
    private boolean NeedsCustomization;
    private List OptionQtys;
    private int PartCount;
    private String ProductType;
    private List Variants;
    private boolean Wings;
    private boolean boneless;

    public LabsProduct()
    {
        AvailableToppings = "";
        AvailableSides = "";
        Code = "";
        DefaultToppings = "";
        DefaultSides = "";
        Description = "";
        ImageCode = "";
        Name = "";
        ProductType = "";
        MaxOptionQty = -1;
        PartCount = 1;
        EffectiveOn = "";
        BvCode = "";
        MaxQuantity = 25;
    }

    private LabsProduct(Parcel parcel)
    {
        AvailableToppings = "";
        AvailableSides = "";
        Code = "";
        DefaultToppings = "";
        DefaultSides = "";
        Description = "";
        ImageCode = "";
        Name = "";
        ProductType = "";
        MaxOptionQty = -1;
        PartCount = 1;
        EffectiveOn = "";
        BvCode = "";
        MaxQuantity = 25;
        setAvailableToppings(parcel.readString());
        setAvailableSides(parcel.readString());
        setCode(parcel.readString());
        setDefaultToppings(parcel.readString());
        setDefaultSides(parcel.readString());
        setDescription(parcel.readString());
        setImageCode(parcel.readString());
        setName(parcel.readString());
        setProductType(parcel.readString());
        Variants = new ArrayList();
        parcel.readStringList(Variants);
        OptionQtys = new ArrayList();
        parcel.readStringList(OptionQtys);
        setMaxOptionQty(parcel.readInt());
        setMaxSauceQty(parcel.readInt());
        boolean aflag[] = new boolean[4];
        parcel.readBooleanArray(aflag);
        setArtisan(aflag[0]);
        setBazaarVoice(aflag[1]);
        setNeedsCustomization(aflag[2]);
        setWings(aflag[3]);
        setPartCount(parcel.readInt());
        setEffectiveOn(parcel.readString());
        setBvCode(parcel.readString());
    }

    LabsProduct(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public LabsProduct(LabsProduct labsproduct)
    {
        AvailableToppings = "";
        AvailableSides = "";
        Code = "";
        DefaultToppings = "";
        DefaultSides = "";
        Description = "";
        ImageCode = "";
        Name = "";
        ProductType = "";
        MaxOptionQty = -1;
        PartCount = 1;
        EffectiveOn = "";
        BvCode = "";
        MaxQuantity = 25;
        AvailableToppings = labsproduct.AvailableToppings;
        AvailableSides = labsproduct.AvailableSides;
        Code = labsproduct.Code;
        DefaultToppings = labsproduct.DefaultToppings;
        DefaultSides = labsproduct.DefaultToppings;
        Description = labsproduct.Description;
        ImageCode = labsproduct.ImageCode;
        Name = labsproduct.Name;
        ProductType = labsproduct.ProductType;
        if (labsproduct.Variants != null)
        {
            Variants = new ArrayList(labsproduct.Variants);
        }
        if (labsproduct.OptionQtys != null)
        {
            OptionQtys = new ArrayList(labsproduct.OptionQtys);
        }
        MaxOptionQty = labsproduct.MaxOptionQty;
        MaxSauceQty = labsproduct.MaxSauceQty;
        Artisan = labsproduct.Artisan;
        BazaarVoice = labsproduct.BazaarVoice;
        NeedsCustomization = labsproduct.NeedsCustomization;
        PartCount = labsproduct.PartCount;
        Wings = labsproduct.Wings;
        EffectiveOn = labsproduct.EffectiveOn;
        BvCode = labsproduct.BvCode;
    }

    public void addVariant(String s)
    {
        if (Variants == null)
        {
            Variants = new ArrayList();
        }
        Variants.add(s);
    }

    public void clearVariants()
    {
        if (Variants == null)
        {
            Variants = new ArrayList();
        }
        Variants.clear();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAvailableSides()
    {
        return AvailableSides;
    }

    public String getAvailableToppings()
    {
        return AvailableToppings;
    }

    public String getBvCode()
    {
        return BvCode;
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

    public String getDescription()
    {
        return Description;
    }

    public String getEffectiveOn()
    {
        return EffectiveOn;
    }

    public String getImageCode()
    {
        return ImageCode;
    }

    public int getMaxOptionQty()
    {
        return MaxOptionQty;
    }

    public int getMaxQuantity()
    {
        return MaxQuantity;
    }

    public int getMaxSauceQty()
    {
        return MaxSauceQty;
    }

    public String getName()
    {
        return Name;
    }

    public List getOptionQtys()
    {
        return OptionQtys;
    }

    public int getPartCount()
    {
        return PartCount;
    }

    public String getProductType()
    {
        return ProductType;
    }

    public String getTitle()
    {
        String s;
label0:
        {
            String s1 = getName();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() > 0)
                {
                    break label0;
                }
            }
            s = getDescription();
        }
        return s;
    }

    public List getVariants()
    {
        return Variants;
    }

    public boolean hasVariants()
    {
        return getVariants().size() > 1;
    }

    public boolean isArtisan()
    {
        return Artisan;
    }

    public boolean isBazaarVoice()
    {
        return BazaarVoice;
    }

    public boolean isBoneless()
    {
        return boneless;
    }

    public boolean isNeedsCustomization()
    {
        return NeedsCustomization;
    }

    public boolean isParmesanBreadBites()
    {
        return Code != null && Code.equalsIgnoreCase("F_PBITES");
    }

    public boolean isPasta()
    {
        return ProductType != null && ProductType.equalsIgnoreCase("Pasta");
    }

    public boolean isPizza()
    {
        return ProductType != null && ProductType.equalsIgnoreCase("Pizza");
    }

    public boolean isSand()
    {
        return ProductType != null && ProductType.equalsIgnoreCase("Sandwich");
    }

    public boolean isStuffedCheesyBread()
    {
        return Code != null && Code.equalsIgnoreCase("F_SCBRD");
    }

    public boolean isWings()
    {
        return Wings;
    }

    public void setArtisan(boolean flag)
    {
        Artisan = flag;
    }

    public void setAvailableSides(String s)
    {
        AvailableSides = s;
    }

    public void setAvailableToppings(String s)
    {
        AvailableToppings = s;
    }

    public void setBazaarVoice(boolean flag)
    {
        BazaarVoice = flag;
    }

    public void setBoneless(boolean flag)
    {
        boneless = flag;
    }

    public void setBvCode(String s)
    {
        BvCode = s;
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

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setEffectiveOn(String s)
    {
        EffectiveOn = s;
    }

    public void setImageCode(String s)
    {
        ImageCode = s;
    }

    public void setMaxOptionQty(int i)
    {
        MaxOptionQty = i;
    }

    public void setMaxQuantity(int i)
    {
        MaxQuantity = i;
    }

    public void setMaxSauceQty(int i)
    {
        MaxSauceQty = i;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setNeedsCustomization(boolean flag)
    {
        NeedsCustomization = flag;
    }

    public void setOptionQtys(List list)
    {
        OptionQtys = list;
    }

    public void setPartCount(int i)
    {
        PartCount = i;
    }

    public void setProductType(String s)
    {
        ProductType = s;
    }

    public void setVariants(List list)
    {
        Variants = list;
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
        parcel.writeString(getAvailableToppings());
        parcel.writeString(getAvailableSides());
        parcel.writeString(getCode());
        parcel.writeString(getDefaultToppings());
        parcel.writeString(getDefaultSides());
        parcel.writeString(getDescription());
        parcel.writeString(getImageCode());
        parcel.writeString(getName());
        parcel.writeString(getProductType());
        Object obj;
        if (getVariants() != null)
        {
            obj = getVariants();
        } else
        {
            obj = new ArrayList();
        }
        parcel.writeStringList(((List) (obj)));
        if (getOptionQtys() != null)
        {
            obj = getOptionQtys();
        } else
        {
            obj = new ArrayList();
        }
        parcel.writeStringList(((List) (obj)));
        parcel.writeInt(getMaxOptionQty());
        parcel.writeInt(getMaxSauceQty());
        parcel.writeBooleanArray(new boolean[] {
            isArtisan(), isBazaarVoice(), isNeedsCustomization(), isWings()
        });
        parcel.writeInt(getPartCount());
        parcel.writeString(getEffectiveOn());
        parcel.writeString(getBvCode());
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsProduct createFromParcel(Parcel parcel)
        {
            return new LabsProduct(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsProduct[] newArray(int i)
        {
            return new LabsProduct[i];
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
