// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fou;
import ggn;

public class DisableOfflineModeActivity extends fou
{

    public DisableOfflineModeActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001f);
        bundle = (Button)findViewById(0x7f1103da);
        bundle.setText(0x7f08027e);
        Button button = (Button)findViewById(0x7f1103db);
        button.setText(0x7f08027f);
        ((TextView)findViewById(0x7f11026e)).setText(0x7f080280);
        setResult(0);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            private DisableOfflineModeActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = DisableOfflineModeActivity.this;
                super();
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() {

            private DisableOfflineModeActivity a;

            public final void onClick(View view)
            {
                a.setResult(-1);
                a.finish();
            }

            
            {
                a = DisableOfflineModeActivity.this;
                super();
            }
        });
        super.e = ggn.b(this, ViewUri.av);
    }
}
