// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mDataHolders extends mDataHolders
    implements com.google.android.gms.games.appcontent.ataHolders
{

    private final ArrayList mDataHolders;

    public final AppContentSectionBuffer getSections()
    {
        return new AppContentSectionBuffer(mDataHolders);
    }

    (DataHolder adataholder[])
    {
        super(adataholder[0]);
        mDataHolders = new ArrayList(Arrays.asList(adataholder));
    }
}
