// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import java.io.File;
import me.lyft.android.domain.profile.Profile;
import rx.Observable;

public interface IProfileService
{

    public abstract boolean isPassengerPhotoUploadEnabled();

    public abstract Observable refreshFacebookToken();

    public abstract boolean shouldRequestProfileV1FacebookPermissions();

    public abstract Observable uploadProfileData(Profile profile);

    public abstract Observable uploadProfilePicture(File file);

    public abstract Observable uploadProfilePictureAndData(File file, Profile profile);
}
