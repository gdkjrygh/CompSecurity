// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class enImpl extends enImpl
{

    final SnapshotsImpl ZL;
    final SnapshotMetadataChange ZP;
    final String ZR;
    final String ZS;
    final SnapshotContents ZT;

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls6 _pcls6)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls6);
    }

    protected void a(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.a(this, ZR, ZS, ZP, ZT);
    }

    ge(SnapshotsImpl snapshotsimpl, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        ZL = snapshotsimpl;
        ZR = s;
        ZS = s1;
        ZP = snapshotmetadatachange;
        ZT = snapshotcontents;
        super(null);
    }
}
