// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.places;


public class PlaceType
{

    private static final long serialVersionUID = 12L;
    int placeTypeId;
    String placeTypeName;

    public PlaceType()
    {
    }

    public int getPlaceTypeId()
    {
        return placeTypeId;
    }

    public String getPlaceTypeName()
    {
        return placeTypeName;
    }

    public void setPlaceTypeId(int i)
    {
        placeTypeId = i;
    }

    public void setPlaceTypeId(String s)
    {
        try
        {
            setPlaceTypeId(Integer.parseInt(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setPlaceTypeName(String s)
    {
        placeTypeName = s;
    }
}
