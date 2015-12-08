// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.people;

import android.graphics.Bitmap;
import com.google.common.base.Optional;

public class UserProfilePhotoEvent
{

    private final Bitmap photo;

    public UserProfilePhotoEvent()
    {
        photo = null;
    }

    public UserProfilePhotoEvent(Bitmap bitmap)
    {
        photo = bitmap;
    }

    public final Optional getPhoto()
    {
        return Optional.fromNullable(photo);
    }
}
