// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driverdocuments;


public class InsuranceDTO
{

    public final String expirationDate;
    public final String photoUploadUrl;
    public final String photoUrl;
    public final String state;
    public final String status;

    public InsuranceDTO(String s, String s1, String s2, String s3, String s4)
    {
        status = s;
        state = s1;
        expirationDate = s2;
        photoUrl = s3;
        photoUploadUrl = s4;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public String getPhotoUploadUrl()
    {
        return photoUploadUrl;
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public String getState()
    {
        return state;
    }

    public String getStatus()
    {
        return status;
    }
}
