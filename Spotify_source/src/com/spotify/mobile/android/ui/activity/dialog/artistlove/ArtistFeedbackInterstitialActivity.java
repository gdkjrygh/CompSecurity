// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog.artistlove;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.ui.activity.dialog.artistlove.model.FeedbackChannelDialogModel;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dff;
import dmz;
import fop;
import fou;
import gji;
import gjj;
import java.util.Iterator;
import java.util.List;

public class ArtistFeedbackInterstitialActivity extends fou
{

    private FeedbackChannelDialogModel d;

    public ArtistFeedbackInterstitialActivity()
    {
        dmz.a(fop);
    }

    public static Intent a(Context context, FeedbackChannelDialogModel feedbackchanneldialogmodel)
    {
        ctz.a(context);
        ctz.a(feedbackchanneldialogmodel);
        context = new Intent(context, com/spotify/mobile/android/ui/activity/dialog/artistlove/ArtistFeedbackInterstitialActivity);
        context.putExtra("EXTRA_DIALOG_MODEL", feedbackchanneldialogmodel);
        return context;
    }

    static FeedbackChannelDialogModel a(ArtistFeedbackInterstitialActivity artistfeedbackinterstitialactivity)
    {
        return artistfeedbackinterstitialactivity.d;
    }

    static void a(ArtistFeedbackInterstitialActivity artistfeedbackinterstitialactivity, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        subevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, subevent);
        subevent.a("artistFeedbackChannelId", artistfeedbackinterstitialactivity.d.getId());
        subevent.a("targetName", "artist-feedback-channel-modal");
        subevent.a("targetUri", "spotify:app");
        fop.a(artistfeedbackinterstitialactivity, ViewUri.aX, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, subevent);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 42)
        {
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setResult(0);
        d = (FeedbackChannelDialogModel)getIntent().getParcelableExtra("EXTRA_DIALOG_MODEL");
        Object obj = new DialogLayout(this);
        setContentView(((View) (obj)));
        ((DialogLayout) (obj)).a(d.getTitle());
        bundle = LayoutInflater.from(this).inflate(0x7f03006c, ((android.view.ViewGroup) (obj)), false);
        ((DialogLayout) (obj)).a(bundle);
        obj = (TextView)bundle.findViewById(0x7f110334);
        ImageView imageview = (ImageView)bundle.findViewById(0x7f110335);
        TextView textview = (TextView)bundle.findViewById(0x7f11026e);
        TextView textview1 = (TextView)bundle.findViewById(0x7f1102ef);
        Button button = (Button)bundle.findViewById(0x7f1102ae);
        bundle = (Button)bundle.findViewById(0x7f1102e3);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            private ArtistFeedbackInterstitialActivity a;

            public final void onClick(View view)
            {
                Intent intent;
                Object obj1;
                ArtistFeedbackInterstitialActivity.a(a, com.spotify.mobile.android.util.ClientEvent.SubEvent.dB);
                view = a;
                obj1 = a;
                FeedbackChannelDialogModel feedbackchanneldialogmodel = ArtistFeedbackInterstitialActivity.a(a);
                ctz.a(obj1);
                ctz.a(feedbackchanneldialogmodel);
                intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", feedbackchanneldialogmodel.getTweetBody());
                intent.setType("text/plain");
                obj1 = ((Context) (obj1)).getPackageManager().queryIntentActivities(intent, 0x10000).iterator();
_L4:
                if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
                ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
                if (!resolveinfo.activityInfo.packageName.startsWith("com.twitter.android")) goto _L4; else goto _L3
_L3:
                boolean flag;
                intent.setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
                flag = true;
_L6:
                ctz.a(flag, "Is twitter installed?");
                view.startActivityForResult(intent, 42);
                a.finish();
                return;
_L2:
                flag = false;
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = ArtistFeedbackInterstitialActivity.this;
                super();
            }
        });
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            private ArtistFeedbackInterstitialActivity a;

            public final void onClick(View view)
            {
                ArtistFeedbackInterstitialActivity.a(a, com.spotify.mobile.android.util.ClientEvent.SubEvent.dC);
                a.finish();
            }

            
            {
                a = ArtistFeedbackInterstitialActivity.this;
                super();
            }
        });
        ((TextView) (obj)).setText(d.getBody());
        textview.setText(d.getImageTitle());
        if (!TextUtils.isEmpty(d.getImageSubtitle()))
        {
            textview1.setVisibility(0);
            textview1.setText(d.getImageSubtitle());
        } else
        {
            textview1.setVisibility(8);
        }
        if (d.getImageUrl() != null)
        {
            dmz.a(gjj);
            gjj.a(this).e(imageview, d.getImageUrl());
        } else
        {
            imageview.setImageDrawable(dff.b(this));
        }
        if (!TextUtils.isEmpty(d.getCallToActions()))
        {
            button.setText(d.getCallToActions());
        }
        if (!TextUtils.isEmpty(d.getCloseButtonLabel()))
        {
            bundle.setText(d.getCloseButtonLabel());
        }
        bundle = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.dA);
        bundle.a("artistFeedbackChannelId", d.getId());
        fop.a(this, ViewUri.aX, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, bundle);
    }
}
