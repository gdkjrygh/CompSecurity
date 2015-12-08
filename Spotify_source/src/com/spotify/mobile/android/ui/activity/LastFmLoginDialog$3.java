// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            LastFmLoginDialog

final class a
    implements android.view.
{

    private LastFmLoginDialog a;

    public final void onClick(View view)
    {
        fop.a(a, ViewUri.ar, new ClientEvent(com.spotify.mobile.android.util.alog._cls3.a));
        a.finish();
    }

    (LastFmLoginDialog lastfmlogindialog)
    {
        a = lastfmlogindialog;
        super();
    }
}
