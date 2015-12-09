// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

public class Annotation
    implements JacksonModel
{

    private String mDescription;
    private String mImageUri;
    private String mName;
    private AnnotateService.Status mStatus;
    private long mTimestamp;

    public Annotation(String s, String s1, String s2, AnnotateService.Status status, long l)
    {
        mName = (String)ctz.a(s);
        mDescription = s1;
        mImageUri = s2;
        mStatus = (AnnotateService.Status)ctz.a(status);
        mTimestamp = l;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getImageUri()
    {
        return mImageUri;
    }

    public String getName()
    {
        return mName;
    }

    public AnnotateService.Status getStatus()
    {
        return mStatus;
    }

    public long getTimestamp()
    {
        return mTimestamp;
    }

    public void setStatus(AnnotateService.Status status)
    {
        mStatus = status;
    }
}
