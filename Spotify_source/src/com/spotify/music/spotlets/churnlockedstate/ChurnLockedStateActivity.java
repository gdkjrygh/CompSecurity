// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.churnlockedstate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.HtmlUtil;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dvv;
import dwx;
import dxc;
import dxd;
import fop;
import fou;
import fqz;
import fys;
import fyw;
import gdt;
import ggn;

public class ChurnLockedStateActivity extends fou
{

    private Flags d;
    private dxc i;
    private View j;
    private boolean k;
    private dwx l;

    public ChurnLockedStateActivity()
    {
        dmz.a(fop);
        l = new dwx() {

            private ChurnLockedStateActivity a;

            public final void a(Flags flags)
            {
                ChurnLockedStateActivity.a(a, flags);
                if (!((Boolean)ChurnLockedStateActivity.b(a).a(fys.X)).booleanValue())
                {
                    ChurnLockedStateActivity.c(a);
                    if (ChurnLockedStateActivity.c(a))
                    {
                        a.setResult(1);
                        a.finish();
                    }
                }
            }

            
            {
                a = ChurnLockedStateActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, Flags flags)
    {
        context = new Intent(context, com/spotify/music/spotlets/churnlockedstate/ChurnLockedStateActivity);
        context.putExtra("autoclose", true);
        fyw.a(context, flags);
        return context;
    }

    static Flags a(ChurnLockedStateActivity churnlockedstateactivity, Flags flags)
    {
        churnlockedstateactivity.d = flags;
        return flags;
    }

    static void a(ChurnLockedStateActivity churnlockedstateactivity)
    {
        fop.a(churnlockedstateactivity, ViewUri.bO, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.c));
        fqz fqz1 = PremiumSignupActivity.a(churnlockedstateactivity);
        fqz1.c = Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_update_payment&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls");
        fqz1.a = churnlockedstateactivity.d;
        fqz1.b = true;
        churnlockedstateactivity.startActivityForResult(fqz1.a(), 0);
    }

    static void a(ChurnLockedStateActivity churnlockedstateactivity, String s)
    {
        fop.a(churnlockedstateactivity, ViewUri.bO, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.av));
        fqz fqz1 = PremiumSignupActivity.a(churnlockedstateactivity);
        fqz1.c = Uri.parse(s);
        fqz1.a = churnlockedstateactivity.d;
        fqz1.b = true;
        fqz1.d = churnlockedstateactivity.getString(0x7f080184);
        churnlockedstateactivity.startActivityForResult(fqz1.a(), 0);
    }

    static Flags b(ChurnLockedStateActivity churnlockedstateactivity)
    {
        return churnlockedstateactivity.d;
    }

    static boolean c(ChurnLockedStateActivity churnlockedstateactivity)
    {
        return churnlockedstateactivity.k;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 0 && j1 == -1)
        {
            if (intent != null)
            {
                intent = intent.getStringExtra("reason");
            } else
            {
                intent = null;
            }
            if ("cls_unlocked".equals(intent))
            {
                setResult(1);
                finish();
            }
        }
    }

    public void onBackPressed()
    {
        fop.a(this, ViewUri.bO, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ak));
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001c);
        k = getIntent().getBooleanExtra("autoclose", true);
        TextView textview;
        Spannable spannable;
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            d = fyw.a(bundle);
        } else
        {
            d = fyw.a(this);
        }
        dmz.a(dxd);
        i = dxd.a(this);
        j = findViewById(0x7f1102a7);
        j.setOnClickListener(new android.view.View.OnClickListener() {

            private ChurnLockedStateActivity a;

            public final void onClick(View view)
            {
                ChurnLockedStateActivity.a(a);
            }

            
            {
                a = ChurnLockedStateActivity.this;
                super();
            }
        });
        textview = (TextView)findViewById(0x7f1102a8);
        spannable = (Spannable)Html.fromHtml(getString(0x7f080183, new Object[] {
            "https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_cancel_subscription&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls"
        }));
        HtmlUtil.a(spannable, new gdt() {

            private ChurnLockedStateActivity a;

            public final boolean a(String s)
            {
                ChurnLockedStateActivity.a(a, s);
                return true;
            }

            
            {
                a = ChurnLockedStateActivity.this;
                super();
            }
        });
        textview.setText(spannable);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        if (bundle == null)
        {
            fop.a(this, ViewUri.bO, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R));
            startService(dvv.a(this, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"));
        }
        super.e = ggn.a(this, ViewUri.bO);
    }

    public void onPause()
    {
        i.b(l);
        i.b();
        super.onPause();
    }

    public void onResume()
    {
        i.a();
        i.a(l);
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", d);
    }
}
