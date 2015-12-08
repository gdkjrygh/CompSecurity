// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus:
//            PlusClient

class anu
    implements com.google.android.gms.common.api.ation.b
{

    final MomentsLoadedListener anu;
    final PlusClient anv;

    public void a(omentsResult omentsresult)
    {
        anu.onMomentsLoaded(omentsresult.getStatus().gQ(), omentsresult.getMomentBuffer(), omentsresult.getNextPageToken(), omentsresult.getUpdated());
    }

    public void b(Object obj)
    {
        a((omentsResult)obj);
    }

    MomentsLoadedListener(PlusClient plusclient, MomentsLoadedListener momentsloadedlistener)
    {
        anv = plusclient;
        anu = momentsloadedlistener;
        super();
    }
}
