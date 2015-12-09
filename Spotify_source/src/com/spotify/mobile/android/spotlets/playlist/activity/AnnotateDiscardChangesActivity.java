// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import android.content.Context;
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

public class AnnotateDiscardChangesActivity extends fou
{

    private DialogLayout d;

    public AnnotateDiscardChangesActivity()
    {
        dmz.a(fop);
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/mobile/android/spotlets/playlist/activity/AnnotateDiscardChangesActivity);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new DialogLayout(this);
        setContentView(d);
        d.a(0x7f080074);
        d.c(0x7f080071);
        d.a(0x7f080073, new android.view.View.OnClickListener() {

            private AnnotateDiscardChangesActivity a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.by, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
                a.finish();
            }

            
            {
                a = AnnotateDiscardChangesActivity.this;
                super();
            }
        });
        d.b(0x7f080072, new android.view.View.OnClickListener() {

            private AnnotateDiscardChangesActivity a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.by, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H));
                a.setResult(-1);
                a.finish();
            }

            
            {
                a = AnnotateDiscardChangesActivity.this;
                super();
            }
        });
        super.e = ggn.a(this, ViewUri.by);
        setResult(0);
    }
}
