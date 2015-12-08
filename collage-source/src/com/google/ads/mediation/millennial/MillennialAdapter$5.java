// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.millennial;

import android.util.Log;
import com.millennialmedia.InlineAd;

// Referenced classes of package com.google.ads.mediation.millennial:
//            MillennialAdapter

class a
    implements com.millennialmedia.ennialAdapter._cls5
{

    final MillennialAdapter a;

    public void a(InlineAd inlinead)
    {
        Log.d(MillennialAdapter.a(), "Abort succeeded.");
    }

    public void b(InlineAd inlinead)
    {
        Log.w(MillennialAdapter.a(), "Request to abort failed.");
    }

    (MillennialAdapter millennialadapter)
    {
        a = millennialadapter;
        super();
    }
}
