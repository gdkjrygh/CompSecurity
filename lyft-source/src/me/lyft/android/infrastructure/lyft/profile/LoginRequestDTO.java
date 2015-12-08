// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;

import me.lyft.android.infrastructure.lyft.location.LocationDTO;

// Referenced classes of package me.lyft.android.infrastructure.lyft.profile:
//            PhoneDTO

public class LoginRequestDTO
{

    public final String couponCode;
    public final String email;
    public final String fbToken;
    public final String firstName;
    public final String lastName;
    public final LocationDTO location;
    public final String matId;
    public final PhoneDTO phone;
    public final Boolean termsAccepted;

    public LoginRequestDTO(String s, String s1, String s2, String s3, PhoneDTO phonedto, String s4, Boolean boolean1, 
            LocationDTO locationdto, String s5)
    {
        email = s;
        firstName = s1;
        lastName = s2;
        fbToken = s3;
        phone = phonedto;
        couponCode = s4;
        termsAccepted = boolean1;
        location = locationdto;
        matId = s5;
    }
}
