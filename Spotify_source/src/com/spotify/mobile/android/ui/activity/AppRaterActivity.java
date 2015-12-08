// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import fop;
import fou;
import ggn;

public class AppRaterActivity extends fou
{

    private ClientInfo d;
    private Verified i;

    public AppRaterActivity()
    {
        dmz.a(fop);
        d = (ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo);
        i = ViewUri.bH;
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/mobile/android/ui/activity/AppRaterActivity);
    }

    static Verified a(AppRaterActivity apprateractivity)
    {
        return apprateractivity.i;
    }

    static ClientInfo b(AppRaterActivity apprateractivity)
    {
        return apprateractivity.d;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R);
        fop.a(this, ViewUri.bH, bundle);
        bundle = new DialogLayout(this);
        setContentView(bundle);
        setResult(-1);
        bundle.a(0x7f080446);
        bundle.c(0x7f080443);
        bundle.b(0x7f080444, new android.view.View.OnClickListener() {

            private AppRaterActivity a;

            public final void onClick(View view)
            {
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.Z);
                fop.a(a, AppRaterActivity.a(a), view);
                a.finish();
            }

            
            {
                a = AppRaterActivity.this;
                super();
            }
        });
        bundle.a(0x7f080445, new android.view.View.OnClickListener() {

            private AppRaterActivity a;

            public final void onClick(View view)
            {
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.aa);
                fop.a(a, AppRaterActivity.a(a), view);
                a.startActivity(new Intent("android.intent.action.VIEW", AppRaterActivity.b(a).b()));
                a.finish();
            }

            
            {
                a = AppRaterActivity.this;
                super();
            }
        });
        super.e = ggn.a(this, i);
    }
}
