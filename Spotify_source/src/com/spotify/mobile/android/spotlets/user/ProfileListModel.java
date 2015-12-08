// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            ProfileModel

public class ProfileListModel
    implements JacksonModel
{

    private final ProfileModel mProfiles[];

    public ProfileListModel(ProfileModel aprofilemodel[], ProfileModel aprofilemodel1[], ProfileModel aprofilemodel2[])
    {
        if (aprofilemodel == null)
        {
            if (aprofilemodel1 != null)
            {
                aprofilemodel = aprofilemodel1;
            } else
            {
                aprofilemodel = aprofilemodel2;
            }
        }
        mProfiles = aprofilemodel;
    }

    public ProfileModel[] getProfiles()
    {
        return mProfiles;
    }
}
