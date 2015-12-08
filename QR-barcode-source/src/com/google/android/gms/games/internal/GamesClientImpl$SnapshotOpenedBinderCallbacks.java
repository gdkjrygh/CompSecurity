// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class XL extends AbstractGamesCallbacks
{

    final GamesClientImpl WC;
    private final com.google.android.gms.common.api.it> XL;

    public void a(DataHolder dataholder, Contents contents)
    {
        XL.XL(new XL(dataholder, contents));
    }

    public void a(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
    {
        XL.XL(new XL(dataholder, s, contents, contents1, contents2));
    }

    public Y(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        WC = gamesclientimpl;
        super();
        XL = (com.google.android.gms.common.api.cks.XL)o.b(cks, "Holder must not be null");
    }
}
