// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;


public class GiftEntity
{

    private String icon_imagePath;
    private int id;
    private String packagename;
    private String title;

    public GiftEntity()
    {
        icon_imagePath = "";
    }

    public String getIcon_imagePath()
    {
        return icon_imagePath;
    }

    public int getId()
    {
        return id;
    }

    public String getPackagename()
    {
        return packagename;
    }

    public String getTitle()
    {
        return title;
    }

    public void setIcon_imagePath(String s)
    {
        icon_imagePath = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setPackagename(String s)
    {
        packagename = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
