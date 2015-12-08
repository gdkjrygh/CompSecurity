// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            OpenRetailPageRequest, an, SortType

public class OpenSearchPageRequest extends OpenRetailPageRequest
{

    private String a;
    private String b;
    private String c;
    private SortType d;

    public OpenSearchPageRequest(String s)
    {
        an.a(s, "searchTerm");
        a = s;
    }

    public OpenSearchPageRequest(String s, String s1)
    {
        an.a(s1, "searchTerm");
        an.a(s, "category");
        b = s;
        a = s1;
    }

    public String getBrand()
    {
        return c;
    }

    public String getCategory()
    {
        return b;
    }

    public String getSearchTerm()
    {
        return a;
    }

    public SortType getSortType()
    {
        return d;
    }

    public void setBrand(String s)
    {
        c = s;
    }

    public void setSortType(SortType sorttype)
    {
        d = sorttype;
    }
}
