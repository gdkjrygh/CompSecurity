// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;


public class Exif
{

    public static final long serialVersionUID = 12L;
    private String clean;
    private String label;
    private String raw;
    private String tag;
    private String tagspace;
    private String tagspaceId;

    public Exif()
    {
    }

    public String getClean()
    {
        return clean;
    }

    public String getLabel()
    {
        return label;
    }

    public String getRaw()
    {
        return raw;
    }

    public String getTag()
    {
        return tag;
    }

    public String getTagspace()
    {
        return tagspace;
    }

    public String getTagspaceId()
    {
        return tagspaceId;
    }

    public void setClean(String s)
    {
        clean = s;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setRaw(String s)
    {
        raw = s;
    }

    public void setTag(String s)
    {
        tag = s;
    }

    public void setTagspace(String s)
    {
        tagspace = s;
    }

    public void setTagspaceId(String s)
    {
        tagspaceId = s;
    }
}
