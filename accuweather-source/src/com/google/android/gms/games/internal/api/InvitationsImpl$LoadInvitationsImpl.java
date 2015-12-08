// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            InvitationsImpl

private static abstract class <init> extends com.google.android.gms.games.itationsImpl
{

    public com.google.android.gms.games.multiplayer. F(Status status)
    {
        return new com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult(status) {

            final InvitationsImpl.LoadInvitationsImpl PE;
            final Status yG;

            public InvitationBuffer getInvitations()
            {
                return new InvitationBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yG;
            }

            public void release()
            {
            }

            
            {
                PE = InvitationsImpl.LoadInvitationsImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return F(status);
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
