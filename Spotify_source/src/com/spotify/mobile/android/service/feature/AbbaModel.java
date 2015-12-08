// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            AbbaFlagModel

public class AbbaModel
    implements JacksonModel
{

    private final AbbaFlagModel mFlags[];

    public AbbaModel(AbbaFlagModel aabbaflagmodel[])
    {
        if (aabbaflagmodel == null)
        {
            mFlags = new AbbaFlagModel[0];
            return;
        } else
        {
            mFlags = aabbaflagmodel;
            return;
        }
    }

    public AbbaFlagModel[] getFlags()
    {
        return mFlags;
    }
}
