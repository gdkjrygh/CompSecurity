// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import for;
import fou;
import ggn;

public class ConfirmDeletionActivity extends fou
{

    private String d;
    private String i;

    public ConfirmDeletionActivity()
    {
        dmz.a(for);
    }

    public static Intent a(Context context, String s, String s1)
    {
        Assertion.a(context);
        Assertion.a(s, "We need a non-null playlist or folder title");
        Assertion.a(s, "We need a non-empty playlist or folder title");
        Assertion.a(s1, "We need a non-null uri");
        Assertion.a(s1, "We need a non-empty uri");
        Intent intent = new Intent();
        intent.setClass(context, com/spotify/mobile/android/ui/activity/ConfirmDeletionActivity);
        intent.putExtra("com.spotify.mobile.android.ui.activity.name", s);
        intent.putExtra("com.spotify.mobile.android.ui.activity.uri", s1);
        return intent;
    }

    static String a(ConfirmDeletionActivity confirmdeletionactivity)
    {
        return confirmdeletionactivity.i;
    }

    public void onCreate(Bundle bundle)
    {
        int j;
        super.onCreate(bundle);
        DialogLayout dialoglayout = new DialogLayout(this);
        setContentView(dialoglayout);
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.T.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            d = bundle.getString("com.spotify.mobile.android.ui.activity.name");
            i = bundle.getString("com.spotify.mobile.android.ui.activity.uri");
        } else
        {
            bundle = getIntent();
            d = bundle.getStringExtra("com.spotify.mobile.android.ui.activity.name");
            i = bundle.getStringExtra("com.spotify.mobile.android.ui.activity.uri");
        }
        Assertion.a(d, "We need a non-null playlist or folder title");
        Assertion.a(d, "We need a non-empty playlist or folder title");
        Assertion.a(i, "We need the uri to the item to be deleted.");
        bundle = new SpotifyLink(i);
        _cls3.a[((SpotifyLink) (bundle)).c.ordinal()];
        JVM INSTR tableswitch 1 3: default 128
    //                   1 260
    //                   2 266
    //                   3 266;
           goto _L1 _L2 _L3 _L3
_L3:
        break MISSING_BLOCK_LABEL_266;
_L1:
        Assertion.a((new StringBuilder("Trying to incorrectly delete link type :")).append(((SpotifyLink) (bundle)).c).toString());
        j = -1;
_L4:
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, "Unsupported uri type.");
        dialoglayout.a(j);
        dialoglayout.b(getString(0x7f0801b5, new Object[] {
            d
        }));
        dialoglayout.a(0x7f0801b7, new android.view.View.OnClickListener() {

            private ConfirmDeletionActivity a;

            public final void onClick(View view)
            {
                for.a(a, ConfirmDeletionActivity.a(a), false);
                a.finish();
            }

            
            {
                a = ConfirmDeletionActivity.this;
                super();
            }
        });
        dialoglayout.b(0x7f0801b6, new android.view.View.OnClickListener() {

            private ConfirmDeletionActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ConfirmDeletionActivity.this;
                super();
            }
        });
        super.e = ggn.a(this, ViewUri.aB);
        return;
_L2:
        j = 0x7f0801b8;
          goto _L4
        j = 0x7f0801b9;
          goto _L4
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.spotify.mobile.android.ui.activity.name", d);
        bundle.putString("com.spotify.mobile.android.ui.activity.uri", i);
    }
}
