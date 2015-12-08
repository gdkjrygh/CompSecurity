// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class ExternalAccessoryData
    implements JacksonModel
{

    public static final String CATEGORY_APP = "app";
    public static final String CATEGORY_AUTO = "auto";
    public static final String CATEGORY_WEARABLE = "wearable";
    private long mAccessoryId;
    private String mBrand;
    private String mCategory;
    private String mIntegrationType;
    private String mModel;
    private String mModelYear;
    private String mTrim;
    private String mVersion;

    public ExternalAccessoryData(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            long l)
    {
        mBrand = s;
        mModel = s1;
        mVersion = s2;
        mModelYear = s3;
        mTrim = s4;
        mCategory = s5;
        mIntegrationType = s6;
        mAccessoryId = l;
    }

    public String getBrand()
    {
        return mBrand;
    }

    public long getmAccessoryId()
    {
        return mAccessoryId;
    }

    public String getmIntegrationType()
    {
        return mIntegrationType;
    }

    public String toString()
    {
        String s;
        try
        {
            s = (new ObjectMapper()).writeValueAsString(this);
        }
        catch (JsonProcessingException jsonprocessingexception)
        {
            return (new StringBuilder("{")).append(getClass().getSimpleName()).append("}").toString();
        }
        return s;
    }
}
