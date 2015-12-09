// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsProductOption

public class LabsTopping extends LabsProductOption
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private List Availability;
    private boolean Cheese;
    private String Code;
    private String Description;
    private String ExclusiveGroup;
    private boolean IgnoreQty;
    private boolean Meat;
    private String Name;
    private boolean NonMeat;
    private boolean Sauce;
    private boolean SteakHoagiePatty;
    private boolean Vege;
    private boolean WholeOnly;
    private double defaultQuantity;
    private List optionAvailability;

    public LabsTopping()
    {
        Code = "";
        Description = "";
        Name = "";
        ExclusiveGroup = "";
        reset();
        Availability = new ArrayList();
        optionAvailability = new ArrayList();
        optionAvailability.add(Double.valueOf(0.5D));
        optionAvailability.add(Double.valueOf(0.0D));
        optionAvailability.add(Double.valueOf(1.5D));
        optionAvailability.add(Double.valueOf(2D));
        optionAvailability.add(Double.valueOf(3D));
    }

    private LabsTopping(Parcel parcel)
    {
        Code = "";
        Description = "";
        Name = "";
        ExclusiveGroup = "";
        setCode(parcel.readString());
        setDescription(parcel.readString());
        setName(parcel.readString());
        if (optionAvailability == null)
        {
            optionAvailability = new ArrayList();
        }
        optionAvailability.clear();
        Object obj = new ArrayList();
        parcel.readStringList(((List) (obj)));
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); optionAvailability.add(Double.valueOf(Double.parseDouble(s))))
        {
            s = (String)((Iterator) (obj)).next();
        }

        defaultQuantity = parcel.readDouble();
        options = (HashMap)parcel.readBundle().get("Map");
    }

    LabsTopping(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public LabsTopping(LabsTopping labstopping)
    {
        Code = "";
        Description = "";
        Name = "";
        ExclusiveGroup = "";
        Availability = new ArrayList(labstopping.Availability);
        Code = labstopping.Code;
        Description = labstopping.Description;
        Name = labstopping.Name;
        WholeOnly = labstopping.WholeOnly;
        IgnoreQty = labstopping.IgnoreQty;
        Sauce = labstopping.Sauce;
        NonMeat = labstopping.NonMeat;
        Cheese = labstopping.Cheese;
        Vege = labstopping.Vege;
        Meat = labstopping.Meat;
        ExclusiveGroup = labstopping.ExclusiveGroup;
        SteakHoagiePatty = labstopping.SteakHoagiePatty;
        optionAvailability = new ArrayList(labstopping.optionAvailability);
        options = new HashMap(labstopping.options);
        defaultQuantity = labstopping.defaultQuantity;
    }

    public static String getOptionQuantityName(double d, HashMap hashmap)
    {
        return (String)hashmap.get(Double.valueOf(d));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof LabsTopping))
            {
                return false;
            }
            obj = (LabsTopping)obj;
            if (((LabsTopping) (obj)).getOptionMap() == null)
            {
                return false;
            }
            if (!((LabsTopping) (obj)).getOptionMap().equals(options))
            {
                return false;
            }
            if (!Code.equals(((LabsTopping) (obj)).Code))
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

    public double getDefaultQuantity()
    {
        return defaultQuantity;
    }

    public String getDescription()
    {
        return Description;
    }

    public String getExclusiveGroup()
    {
        return ExclusiveGroup;
    }

    public String getFormattedName(HashMap hashmap)
    {
        Object obj1 = "";
        if (getQuantityForPart("1/1") <= 0.0D) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (new StringBuilder()).append(getName());
        if (getQuantityForPart("1/1") != 1.0D)
        {
            hashmap = (new StringBuilder(" (")).append(getOptionQuantityName(getQuantityForPart("1/1"), hashmap)).append(") ").toString();
        } else
        {
            hashmap = "";
        }
        obj = ((StringBuilder) (obj)).append(hashmap).toString();
_L4:
        return StringHelper.trim(((String) (obj)));
_L2:
        if (getQuantityForPart("1/2") > 0.0D)
        {
            obj1 = (new StringBuilder()).append("").append(getName());
            if (getQuantityForPart("1/2") != 1.0D)
            {
                obj = (new StringBuilder(" (")).append(getOptionQuantityName(getQuantityForPart("1/2"), hashmap)).append(") ").toString();
            } else
            {
                obj = "";
            }
            obj1 = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        }
        obj = obj1;
        if (getQuantityForPart("2/2") > 0.0D)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(getName());
            if (getQuantityForPart("2/2") != 1.0D)
            {
                hashmap = (new StringBuilder(" (")).append(getOptionQuantityName(getQuantityForPart("2/2"), hashmap)).append(") ").toString();
            } else
            {
                hashmap = "";
            }
            obj = ((StringBuilder) (obj)).append(hashmap).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getName()
    {
        return Name;
    }

    public List getOptionAvailability()
    {
        return optionAvailability;
    }

    public Set getOptionKeyList()
    {
        return options.keySet();
    }

    public String getPartWithQuantity()
    {
        for (Iterator iterator = options.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (((Double)options.get(s)).doubleValue() > 0.0D)
            {
                return s;
            }
        }

        return "1/1";
    }

    public int hashCode()
    {
        return Code.hashCode();
    }

    public boolean isCheese()
    {
        return Cheese;
    }

    public boolean isIgnoreQty()
    {
        return IgnoreQty;
    }

    public boolean isMeat()
    {
        return Meat;
    }

    public boolean isNonMeat()
    {
        return NonMeat;
    }

    public boolean isSauce()
    {
        return Sauce;
    }

    public boolean isSteakHoagiePatty()
    {
        return SteakHoagiePatty;
    }

    public boolean isToppingAdded()
    {
        for (Iterator iterator = options.values().iterator(); iterator.hasNext();)
        {
            if (((Double)iterator.next()).doubleValue() != 0.0D)
            {
                return true;
            }
        }

        return false;
    }

    public boolean isVege()
    {
        return Vege;
    }

    public boolean isWholeOnly()
    {
        return WholeOnly;
    }

    public void setAvailability(List list)
    {
        Availability = list;
    }

    public void setCheese(boolean flag)
    {
        Cheese = flag;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setDefaultQuantity(double d)
    {
        defaultQuantity = d;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setExclusiveGroup(String s)
    {
        ExclusiveGroup = s;
    }

    public void setIgnoreQty(boolean flag)
    {
        IgnoreQty = flag;
    }

    public void setMeat(boolean flag)
    {
        Meat = flag;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setNonMeat(boolean flag)
    {
        NonMeat = flag;
    }

    public void setOptionAvailability(List list)
    {
        optionAvailability = list;
    }

    public void setOptions(HashMap hashmap)
    {
        options = hashmap;
    }

    public void setSauce(boolean flag)
    {
        Sauce = flag;
    }

    public void setSteakHoagiePatty(boolean flag)
    {
        SteakHoagiePatty = flag;
    }

    public void setVege(boolean flag)
    {
        Vege = flag;
    }

    public void setWholeOnly(boolean flag)
    {
        WholeOnly = flag;
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
        if (optionAvailability == null)
        {
            parcel.writeStringList(new ArrayList());
        } else
        {
            ArrayList arraylist = new ArrayList();
            for (i = 0; i < optionAvailability.size(); i++)
            {
                arraylist.add((new StringBuilder()).append(optionAvailability.get(i)).toString());
            }

            parcel.writeStringList(arraylist);
        }
        parcel.writeDouble(defaultQuantity);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsTopping createFromParcel(Parcel parcel)
        {
            return new LabsTopping(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsTopping[] newArray(int i)
        {
            return new LabsTopping[i];
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
