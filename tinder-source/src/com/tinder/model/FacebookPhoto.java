// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


public class FacebookPhoto
{

    public String id;
    public String sourceUrl;
    public String thumbnailUrl;

    public FacebookPhoto()
    {
    }

    public FacebookPhoto(String s, String s1, String s2)
    {
        thumbnailUrl = s;
        id = s1;
        sourceUrl = s2;
    }
}
