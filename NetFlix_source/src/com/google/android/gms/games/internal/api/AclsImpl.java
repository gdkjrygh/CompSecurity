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

        public Result d(Status status)
        {
            return x(status);
        }

        public com.google.android.gms.games.internal.game.Acls.LoadAclResult x(Status status)
        {
            return AclsImpl.w(status);
        }

        private LoadNotifyAclImpl()
        {
        }
    }

    private static abstract class UpdateNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
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

    private static com.google.android.gms.games.internal.game.Acls.LoadAclResult v(Status status)
    {
        return new com.google.android.gms.games.internal.game.Acls.LoadAclResult(status) {

            final Status wz;

            public Status getStatus()
            {
                return wz;
            }

            public void release()
            {
            }

            
            {
                wz = status;
                super();
            }
        };
    }

    static com.google.android.gms.games.internal.game.Acls.LoadAclResult w(Status status)
    {
        return v(status);
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
            gamesclientimpl.i(this);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$3

/* anonymous class */
    class _cls3 extends UpdateNotifyAclImpl
    {

        final String JY;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.m(this, JY);
        }
    }

}
