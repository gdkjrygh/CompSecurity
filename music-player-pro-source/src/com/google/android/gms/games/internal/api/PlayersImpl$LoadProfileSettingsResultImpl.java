// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.DS extends com.google.android.gms.games.gsResultImpl
{

    protected com.google.android.gms.games.gsResultImpl ae(Status status)
    {
        return new com.google.android.gms.games.Players.LoadProfileSettingsResult(status) {

            final Status DS;
            final PlayersImpl.LoadProfileSettingsResultImpl abh;

            public Status getStatus()
            {
                return DS;
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
                abh = PlayersImpl.LoadProfileSettingsResultImpl.this;
                DS = status;
                super();
            }
        };
    }

    protected Result c(Status status)
    {
        return ae(status);
    }
}
