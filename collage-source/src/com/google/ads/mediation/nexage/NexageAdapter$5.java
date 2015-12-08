// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.nexage;

import android.util.Log;
import com.millennialmedia.InlineAd;

// Referenced classes of package com.google.ads.mediation.nexage:
//            NexageAdapter

class a
    implements com.millennialmedia.geAdapter._cls5
{

    final NexageAdapter a;

    public void a(InlineAd inlinead)
    {
        Log.d(NexageAdapter.a(), "Abort succeeded.");
    }

    public void b(InlineAd inlinead)
    {
        Log.w(NexageAdapter.a(), "Request to abort failed.");
    }

    (NexageAdapter nexageadapter)
    {
        a = nexageadapter;
        super();
    }
}
