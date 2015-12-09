// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.spotify.mobile.android.ui.cell.settings.LastFmSettingsCell;
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
        fop.a(a, ViewUri.ar, new ClientEvent(com.spotify.mobile.android.util.alog._cls2.a));
        LastFmLoginDialog.a(LastFmLoginDialog.c(a));
        LastFmLoginDialog.a(LastFmLoginDialog.a(a));
        view = LastFmLoginDialog.c(a).getText().toString().trim();
        String s = LastFmLoginDialog.a(a).getText().toString().trim();
        if (!TextUtils.isEmpty(view) && !TextUtils.isEmpty(s))
        {
            LastFmSettingsCell.a(a.getApplicationContext(), view, s);
            a.finish();
            a.overridePendingTransition(0, 0);
        }
        a.finish();
    }

    ell(LastFmLoginDialog lastfmlogindialog)
    {
        a = lastfmlogindialog;
        super();
    }
}
