// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import java.io.Serializable;

public class AirAndPollen
    implements Serializable
{

    private static final String AIR_QUALITY = "AirQuality";
    private static final String GRASS = "Grass";
    private static final String MOLD = "Mold";
    private static final String RAGWEED = "Ragweed";
    private static final String TREE = "Tree";
    private static final String UV_INDEX = "UVIndex";
    private static final long serialVersionUID = 1L;
    private String Category;
    private String Name;
    private String Type;
    private String Value;

    public AirAndPollen()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AirAndPollen)obj;
        if (Category == null)
        {
            if (((AirAndPollen) (obj)).Category != null)
            {
                return false;
            }
        } else
        if (!Category.equals(((AirAndPollen) (obj)).Category))
        {
            return false;
        }
        if (Name == null)
        {
            if (((AirAndPollen) (obj)).Name != null)
            {
                return false;
            }
        } else
        if (!Name.equals(((AirAndPollen) (obj)).Name))
        {
            return false;
        }
        if (Type == null)
        {
            if (((AirAndPollen) (obj)).Type != null)
            {
                return false;
            }
        } else
        if (!Type.equals(((AirAndPollen) (obj)).Type))
        {
            return false;
        }
        if (Value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AirAndPollen) (obj)).Value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Value.equals(((AirAndPollen) (obj)).Value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCategory()
    {
        return Category;
    }

    public String getName()
    {
        return Name;
    }

    public String getType()
    {
        return Type;
    }

    public String getValue()
    {
        return Value;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (Category == null)
        {
            i = 0;
        } else
        {
            i = Category.hashCode();
        }
        if (Name == null)
        {
            j = 0;
        } else
        {
            j = Name.hashCode();
        }
        if (Type == null)
        {
            k = 0;
        } else
        {
            k = Type.hashCode();
        }
        if (Value != null)
        {
            l = Value.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    public boolean isAirQuality()
    {
        return "AirQuality".equals(Name);
    }

    public boolean isGrass()
    {
        return "Grass".equals(Name);
    }

    public boolean isMold()
    {
        return "Mold".equals(Name);
    }

    public boolean isRagweed()
    {
        return "Ragweed".equals(Name);
    }

    public boolean isTree()
    {
        return "Tree".equals(Name);
    }

    public boolean isUvIndex()
    {
        return "UVIndex".equals(Name);
    }

    public void setCategory(String s)
    {
        Category = s;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setType(String s)
    {
        Type = s;
    }

    public void setValue(String s)
    {
        Value = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AirAndPollen [Name=").append(Name).append(", Value=").append(Value).append(", Category=").append(Category).append(", Type=").append(Type).append("]").toString();
    }
}
