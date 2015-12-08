// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driverdocuments;


public class RegistrationDTO
{

    public final String photoUploadUrl;
    public final String photoUrl;

    public RegistrationDTO(String s, String s1)
    {
        photoUrl = s;
        photoUploadUrl = s1;
    }

    public String getPhotoUploadUrl()
    {
        return photoUploadUrl;
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }
}
