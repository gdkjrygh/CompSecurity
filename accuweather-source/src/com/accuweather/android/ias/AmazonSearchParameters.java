// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;


public class AmazonSearchParameters
{

    private String category;
    private String keyword;

    public AmazonSearchParameters(String s, String s1)
    {
        category = s1;
        keyword = s;
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
        obj = (AmazonSearchParameters)obj;
        if (category == null)
        {
            if (((AmazonSearchParameters) (obj)).category != null)
            {
                return false;
            }
        } else
        if (!category.equals(((AmazonSearchParameters) (obj)).category))
        {
            return false;
        }
        if (keyword != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AmazonSearchParameters) (obj)).keyword == null) goto _L1; else goto _L3
_L3:
        return false;
        if (keyword.equals(((AmazonSearchParameters) (obj)).keyword)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCategory()
    {
        return category;
    }

    public String getKeyword()
    {
        return keyword;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (category == null)
        {
            i = 0;
        } else
        {
            i = category.hashCode();
        }
        if (keyword != null)
        {
            j = keyword.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public void setKeyword(String s)
    {
        keyword = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AmazonSearchParameters [category=").append(category).append(", keyword=").append(keyword).append("]").toString();
    }
}
