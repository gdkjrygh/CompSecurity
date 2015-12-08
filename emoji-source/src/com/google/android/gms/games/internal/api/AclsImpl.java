// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.game.Acls;

public final class AclsImpl
    implements Acls
{
    private static abstract class LoadNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result c(Status status)
        {
            return z(status);
        }

        public com.google.android.gms.games.internal.game.Acls.LoadAclResult z(Status status)
        {
            return AclsImpl.y(status);
        }

        private LoadNotifyAclImpl()
        {
        }
    }

    private static abstract class UpdateNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private UpdateNotifyAclImpl()
        {
        }
    }


    public AclsImpl()
    {
    }

    private static com.google.android.gms.games.internal.game.Acls.LoadAclResult x(Status status)
    {
        return new com.google.android.gms.games.internal.game.Acls.LoadAclResult(status) {

            final Status yJ;

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                yJ = status;
                super();
            }
        };
    }

    static com.google.android.gms.games.internal.game.Acls.LoadAclResult y(Status status)
    {
        return x(status);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$2

/* anonymous class */
    class _cls2 extends LoadNotifyAclImpl
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.h(this);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$3

/* anonymous class */
    class _cls3 extends UpdateNotifyAclImpl
    {

        final String Pm;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.p(this, Pm);
        }
    }

}
