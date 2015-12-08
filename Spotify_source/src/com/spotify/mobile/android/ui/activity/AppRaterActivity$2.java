// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientInfo;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            AppRaterActivity

final class a
    implements android.view.r
{

    private AppRaterActivity a;

    public final void onClick(View view)
    {
        view = new ClientEvent(com.spotify.mobile.android.util., com.spotify.mobile.android.util.t.aa);
        fop.a(a, AppRaterActivity.a(a), view);
        a.startActivity(new Intent("android.intent.action.VIEW", AppRaterActivity.b(a).b()));
        a.finish();
    }

    (AppRaterActivity apprateractivity)
    {
        a = apprateractivity;
        super();
    }
}
