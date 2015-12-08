// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;


public class ImageUploadDTO
{

    public static final String PURPOSE_PROFILE_PICTURE = "profilePicture";
    public final String purpose;
    public final String uploadUrl;

    public ImageUploadDTO(String s, String s1)
    {
        purpose = s;
        uploadUrl = s1;
    }

    public String getUploadUrl()
    {
        return uploadUrl;
    }
}
