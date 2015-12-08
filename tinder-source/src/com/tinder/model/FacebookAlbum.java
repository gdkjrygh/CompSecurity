// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


public class FacebookAlbum
{

    public int count;
    public String id;
    public String name;
    public String thumbnailId;
    public String thumbnailUrl;

    public FacebookAlbum()
    {
    }

    public FacebookAlbum(String s, String s1, String s2, String s3, int i)
    {
        id = s;
        name = s1;
        thumbnailId = s2;
        thumbnailUrl = s3;
        count = i;
    }
}
