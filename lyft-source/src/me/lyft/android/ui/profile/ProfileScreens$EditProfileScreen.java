// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import me.lyft.android.common.Preconditions;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileScreens, EditProfileSession

public class editProfileSession extends ProfileScreens
{

    private EditProfileSession editProfileSession;

    public EditProfileSession getEditProfileSession()
    {
        return editProfileSession;
    }

    public A()
    {
        editProfileSession = new EditProfileSession();
    }

    protected editProfileSession(EditProfileSession editprofilesession)
    {
        Preconditions.checkNotNull(editprofilesession);
        editProfileSession = editprofilesession;
    }
}
