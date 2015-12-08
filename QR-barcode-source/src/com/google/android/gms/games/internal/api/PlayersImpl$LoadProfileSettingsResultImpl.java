// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.CW extends com.google.android.gms.games.gsResultImpl
{

    protected com.google.android.gms.games.gsResultImpl ae(Status status)
    {
        return new com.google.android.gms.games.Players.LoadProfileSettingsResult(status) {

            final Status CW;
            final PlayersImpl.LoadProfileSettingsResultImpl Zn;

            public Status getStatus()
            {
                return CW;
            }

            public boolean isProfileVisible()
            {
                return true;
            }

            public boolean isVisibilityExplicitlySet()
            {
                return false;
            }

            
            {
                Zn = PlayersImpl.LoadProfileSettingsResultImpl.this;
                CW = status;
                super();
            }
        };
    }

    protected Result c(Status status)
    {
        return ae(status);
    }

    private _cls1.CW()
    {
    }
}
