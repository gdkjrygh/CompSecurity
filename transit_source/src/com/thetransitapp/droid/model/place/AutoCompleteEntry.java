// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.place;


public class AutoCompleteEntry
{

    private String description;
    private String id;
    private String reference;

    public AutoCompleteEntry()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof AutoCompleteEntry;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AutoCompleteEntry))
            {
                return false;
            }
            obj = (AutoCompleteEntry)obj;
            if (!((AutoCompleteEntry) (obj)).canEqual(this))
            {
                return false;
            }
            String s = getId();
            String s1 = ((AutoCompleteEntry) (obj)).getId();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = getDescription();
            s1 = ((AutoCompleteEntry) (obj)).getDescription();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = getReference();
            obj = ((AutoCompleteEntry) (obj)).getReference();
            if (s != null ? !s.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public String getReference()
    {
        return reference;
    }

    public int hashCode()
    {
        int k = 0;
        String s = getId();
        int i;
        int j;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = getDescription();
        if (s == null)
        {
            j = 0;
        } else
        {
            j = s.hashCode();
        }
        s = getReference();
        if (s != null)
        {
            k = s.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setReference(String s)
    {
        reference = s;
    }

    public String toString()
    {
        return (new StringBuilder("AutoCompleteEntry(id=")).append(getId()).append(", description=").append(getDescription()).append(", reference=").append(getReference()).append(")").toString();
    }
}
