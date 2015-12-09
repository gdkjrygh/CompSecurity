// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fou;
import ggn;

public class DiskAlmostFullActivity extends fou
{

    public DiskAlmostFullActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new DialogLayout(this);
        setContentView(bundle);
        bundle.a(0x7f08028b);
        bundle.c(0x7f080289);
        bundle.a(0x7f08028a, new android.view.View.OnClickListener() {

            private DiskAlmostFullActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = DiskAlmostFullActivity.this;
                super();
            }
        });
        super.e = ggn.a(this, ViewUri.aF);
    }
}
