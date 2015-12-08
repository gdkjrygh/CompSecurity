// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.uploader;

import com.googlecode.flickrjandroid.Parameter;

public class ImageParameter extends Parameter
{

    private String imageName;
    private String imageType;

    public ImageParameter(String s, Object obj)
    {
        super("photo", obj);
        imageType = "jpeg";
        imageName = s;
    }

    public String getImageName()
    {
        return imageName;
    }

    public String getImageType()
    {
        return imageType;
    }

    public void setImageName(String s)
    {
        imageName = s;
    }

    public void setImageType(String s)
    {
        imageType = s;
    }
}
