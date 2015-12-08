// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driverdocuments;

import me.lyft.android.common.Strings;

public class DriverDocument
{

    String photoUploadUrl;
    String photoUrl;

    public DriverDocument(String s, String s1)
    {
        photoUrl = s;
        photoUploadUrl = s1;
    }

    public String getPhotoUploadUrl()
    {
        return Strings.nullToEmpty(photoUploadUrl);
    }

    public String getPhotoUrl()
    {
        return Strings.nullToEmpty(photoUrl);
    }

    public void setPhotoUploadUrl(String s)
    {
        photoUploadUrl = s;
    }

    public void setPhotoUrl(String s)
    {
        photoUrl = s;
    }
}
