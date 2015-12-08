// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;


// Referenced classes of package me.lyft.android.analytics:
//            ITrackerExtra

public class GoogleTrackerExtra
    implements ITrackerExtra
{

    private String category;
    private String label;
    private Long value;

    public GoogleTrackerExtra(String s)
    {
        category = s;
    }

    public String getCategory()
    {
        return category;
    }

    public String getLabel()
    {
        return label;
    }

    public Long getValue()
    {
        return value;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public GoogleTrackerExtra setLabel(String s)
    {
        label = s;
        return this;
    }

    public GoogleTrackerExtra setValue(Long long1)
    {
        value = long1;
        return this;
    }
}
