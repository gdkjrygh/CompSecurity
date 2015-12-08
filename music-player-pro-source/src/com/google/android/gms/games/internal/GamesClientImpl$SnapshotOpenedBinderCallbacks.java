// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class ZC extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.it> ZC;

    public void a(DataHolder dataholder, Contents contents)
    {
        ZC.ZC(new ZC(dataholder, contents));
    }

    public void a(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
    {
        ZC.ZC(new ZC(dataholder, s, contents, contents1, contents2));
    }

    public Y(com.google.android.gms.common.api.cks cks)
    {
        ZC = (com.google.android.gms.common.api.cks.ZC)jx.b(cks, "Holder must not be null");
    }
}
