// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class OH extends AbstractGamesCallbacks
{

    final GamesClientImpl NB;
    private final com.google.android.gms.common.api.it> OH;

    public void a(DataHolder dataholder, Contents contents)
    {
        OH.OH(new OH(dataholder, contents));
    }

    public void a(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
    {
        OH.OH(new OH(dataholder, s, contents, contents1, contents2));
    }

    public Y(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        NB = gamesclientimpl;
        super();
        OH = (com.google.android.gms.common.api.cks.OH)hn.b(cks, "Holder must not be null");
    }
}
