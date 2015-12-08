// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import cua;

// Referenced classes of package com.spotify.mobile.android.spotlets.eventshub.model:
//            ConcertResults, ConcertResult, SourceType

final class a
    implements cua
{

    private SourceType a;

    public final boolean a(Object obj)
    {
        obj = (ConcertResult)obj;
        return obj != null && ((ConcertResult) (obj)).getSourceType() == a;
    }

    (SourceType sourcetype)
    {
        a = sourcetype;
        super();
    }
}
