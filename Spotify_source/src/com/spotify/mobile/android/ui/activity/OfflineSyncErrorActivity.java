// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fou;
import ggn;

public class OfflineSyncErrorActivity extends fou
{

    public OfflineSyncErrorActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = SpotifyError.a(getIntent().getIntExtra("error_code", 0));
        if (bundle == SpotifyError.a)
        {
            finish();
            setResult(-1);
            return;
        } else
        {
            DialogLayout dialoglayout = new DialogLayout(this);
            dialoglayout.a(0x7f08037d);
            dialoglayout.b(bundle.a(this));
            dialoglayout.a(0x7f08037c, new android.view.View.OnClickListener() {

                private OfflineSyncErrorActivity a;

                public final void onClick(View view)
                {
                    a.setResult(-1);
                    a.finish();
                }

            
            {
                a = OfflineSyncErrorActivity.this;
                super();
            }
            });
            setContentView(dialoglayout);
            setResult(0);
            super.e = ggn.a(this, ViewUri.aE);
            return;
        }
    }
}
