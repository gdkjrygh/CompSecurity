// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.profile:
//            PermissionsDTO, PhoneDTO

public class UpdateUserRequestDTO
{

    public final String applePushToken;
    public final String couponCode;
    public final String email;
    public final String fbToken;
    public final String firstName;
    public final String googlePushToken;
    public final List images;
    public final Boolean isDriverLastRide;
    public final String lastName;
    public final String mode;
    public final PermissionsDTO permissions;
    public final PhoneDTO phone;
    public final List profileFields;
    public final Boolean termsAccepted;
    public final Boolean wheelchair;

    public UpdateUserRequestDTO(String s, String s1, String s2, String s3, String s4, String s5, PermissionsDTO permissionsdto, 
            List list, List list1, PhoneDTO phonedto, String s6, Boolean boolean1, String s7, Boolean boolean2, 
            Boolean boolean3)
    {
        email = s;
        firstName = s1;
        lastName = s2;
        mode = s3;
        googlePushToken = s4;
        applePushToken = s5;
        permissions = permissionsdto;
        profileFields = list;
        images = list1;
        phone = phonedto;
        couponCode = s6;
        termsAccepted = boolean1;
        fbToken = s7;
        isDriverLastRide = boolean2;
        wheelchair = boolean3;
    }
}
