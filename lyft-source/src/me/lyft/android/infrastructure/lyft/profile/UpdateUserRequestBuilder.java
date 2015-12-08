// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.profile:
//            UpdateUserRequestDTO, PermissionsDTO, PhoneDTO, ImageUploadDTO

public class UpdateUserRequestBuilder
{

    private String couponCode;
    private String email;
    private String fbToken;
    private String firstName;
    private String googlePushToken;
    private List images;
    private Boolean isDriverLastRide;
    private String lastName;
    private String mode;
    private PermissionsDTO permissions;
    private PhoneDTO phone;
    private List profileFields;
    private Boolean termsAccepted;
    private Boolean wheelchair;

    public UpdateUserRequestBuilder()
    {
    }

    public UpdateUserRequestDTO build()
    {
        return new UpdateUserRequestDTO(email, firstName, lastName, mode, googlePushToken, null, permissions, profileFields, images, phone, couponCode, termsAccepted, fbToken, isDriverLastRide, wheelchair);
    }

    public UpdateUserRequestBuilder withCouponCode(String s)
    {
        couponCode = s;
        return this;
    }

    public UpdateUserRequestBuilder withDriverLastRide(Boolean boolean1)
    {
        isDriverLastRide = boolean1;
        return this;
    }

    public UpdateUserRequestBuilder withEmail(String s)
    {
        email = s;
        return this;
    }

    public UpdateUserRequestBuilder withFbToken(String s)
    {
        fbToken = s;
        return this;
    }

    public UpdateUserRequestBuilder withFirstName(String s)
    {
        firstName = s;
        return this;
    }

    public UpdateUserRequestBuilder withGooglePushToken(String s)
    {
        googlePushToken = s;
        return this;
    }

    public UpdateUserRequestBuilder withImage(ImageUploadDTO imageuploaddto)
    {
        if (images == null)
        {
            images = new ArrayList();
        }
        images.add(imageuploaddto);
        return this;
    }

    public UpdateUserRequestBuilder withLastName(String s)
    {
        lastName = s;
        return this;
    }

    public UpdateUserRequestBuilder withMode(String s)
    {
        mode = s;
        return this;
    }

    public UpdateUserRequestBuilder withPermissions(PermissionsDTO permissionsdto)
    {
        permissions = permissionsdto;
        return this;
    }

    public UpdateUserRequestBuilder withPhone(PhoneDTO phonedto)
    {
        phone = phonedto;
        return this;
    }

    public UpdateUserRequestBuilder withProfileFields(List list)
    {
        profileFields = list;
        return this;
    }

    public UpdateUserRequestBuilder withTermsAccepted(boolean flag)
    {
        termsAccepted = Boolean.valueOf(flag);
        return this;
    }

    public UpdateUserRequestBuilder withWheelchair(Boolean boolean1)
    {
        wheelchair = boolean1;
        return this;
    }
}
