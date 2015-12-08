// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import fop;
import fou;
import ggn;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            DeleteCacheAndSettingsConfirmationActivity

public class DeleteCacheAndSettingsActivity extends fou
{

    private DialogLayout d;
    private android.view.View.OnClickListener i;
    private android.view.View.OnClickListener j;

    public DeleteCacheAndSettingsActivity()
    {
        dmz.a(fop);
        i = new android.view.View.OnClickListener() {

            private DeleteCacheAndSettingsActivity a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.bg, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
                a.finish();
            }

            
            {
                a = DeleteCacheAndSettingsActivity.this;
                super();
            }
        };
        j = new android.view.View.OnClickListener() {

            private DeleteCacheAndSettingsActivity a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.bg, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H));
                view = new Intent(a, com/spotify/mobile/android/ui/activity/DeleteCacheAndSettingsConfirmationActivity);
                view.addFlags(0x40000000);
                view.addFlags(0x10000);
                a.startActivity(view);
                a.finish();
                a.overridePendingTransition(0, 0);
            }

            
            {
                a = DeleteCacheAndSettingsActivity.this;
                super();
            }
        };
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new DialogLayout(this);
        setContentView(d);
        d.a(0x7f080271);
        d.c(0x7f080270);
        d.a(0x7f0805a1, j);
        d.b(0x7f08059f, i);
        super.e = ggn.a(this, ViewUri.bg);
    }
}
