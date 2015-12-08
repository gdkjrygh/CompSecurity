// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.d;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.OnGamesLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            em

final class <init> extends <init>
{

    final em mP;

    protected void a(OnGamesLoadedListener ongamesloadedlistener, d d1)
    {
        ongamesloadedlistener.onGamesLoaded(d1.getStatusCode(), new GameBuffer(d1));
    }

    protected volatile void a(Object obj, d d1)
    {
        a((OnGamesLoadedListener)obj, d1);
    }

    oadedListener(em em1, OnGamesLoadedListener ongamesloadedlistener, d d1)
    {
        mP = em1;
        super(em1, ongamesloadedlistener, d1);
    }
}
