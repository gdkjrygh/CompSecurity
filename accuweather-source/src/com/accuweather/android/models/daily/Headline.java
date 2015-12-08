// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import java.io.Serializable;

public class Headline
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String Category;
    private String EffectiveDate;
    private Long EffectiveEpochDate;
    private String EndDate;
    private Integer Severity;
    private String Text;

    public Headline()
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
        obj = (Headline)obj;
        if (Category == null)
        {
            if (((Headline) (obj)).Category != null)
            {
                return false;
            }
        } else
        if (!Category.equals(((Headline) (obj)).Category))
        {
            return false;
        }
        if (EffectiveDate == null)
        {
            if (((Headline) (obj)).EffectiveDate != null)
            {
                return false;
            }
        } else
        if (!EffectiveDate.equals(((Headline) (obj)).EffectiveDate))
        {
            return false;
        }
        if (EffectiveEpochDate == null)
        {
            if (((Headline) (obj)).EffectiveEpochDate != null)
            {
                return false;
            }
        } else
        if (!EffectiveEpochDate.equals(((Headline) (obj)).EffectiveEpochDate))
        {
            return false;
        }
        if (EndDate == null)
        {
            if (((Headline) (obj)).EndDate != null)
            {
                return false;
            }
        } else
        if (!EndDate.equals(((Headline) (obj)).EndDate))
        {
            return false;
        }
        if (Severity == null)
        {
            if (((Headline) (obj)).Severity != null)
            {
                return false;
            }
        } else
        if (!Severity.equals(((Headline) (obj)).Severity))
        {
            return false;
        }
        if (Text != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Headline) (obj)).Text == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Text.equals(((Headline) (obj)).Text)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCategory()
    {
        return Category;
    }

    public String getEffectiveDate()
    {
        return EffectiveDate;
    }

    public Long getEffectiveEpochDate()
    {
        return EffectiveEpochDate;
    }

    public String getEndDate()
    {
        return EndDate;
    }

    public Integer getSeverity()
    {
        return Severity;
    }

    public String getText()
    {
        return Text;
    }

    public int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (Category == null)
        {
            i = 0;
        } else
        {
            i = Category.hashCode();
        }
        if (EffectiveDate == null)
        {
            j = 0;
        } else
        {
            j = EffectiveDate.hashCode();
        }
        if (EffectiveEpochDate == null)
        {
            k = 0;
        } else
        {
            k = EffectiveEpochDate.hashCode();
        }
        if (EndDate == null)
        {
            l = 0;
        } else
        {
            l = EndDate.hashCode();
        }
        if (Severity == null)
        {
            i1 = 0;
        } else
        {
            i1 = Severity.hashCode();
        }
        if (Text != null)
        {
            j1 = Text.hashCode();
        }
        return (((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1;
    }

    public void setCategory(String s)
    {
        Category = s;
    }

    public void setEffectiveDate(String s)
    {
        EffectiveDate = s;
    }

    public void setEffectiveEpochDate(Long long1)
    {
        EffectiveEpochDate = long1;
    }

    public void setEndDate(String s)
    {
        EndDate = s;
    }

    public void setSeverity(Integer integer)
    {
        Severity = integer;
    }

    public void setText(String s)
    {
        Text = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Headline [EffectiveDate=").append(EffectiveDate).append(", EffectiveEpochDate=").append(EffectiveEpochDate).append(", Severity=").append(Severity).append(", Text=").append(Text).append(", Category=").append(Category).append(", EndDate=").append(EndDate).append("]").toString();
    }
}
