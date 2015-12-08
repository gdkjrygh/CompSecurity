// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import fde;
import fop;
import fou;
import fyw;
import ggn;

public class AddToPlaylistActivity extends fou
{

    private PlaylistLogger d;

    public AddToPlaylistActivity()
    {
    }

    public static Intent a(Context context, String s, String s1, Flags flags, Verified verified, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction sourceaction)
    {
        Object obj = (new SpotifyLink(s)).c;
        if (s == null || obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.aT && obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.c)
        {
            Assertion.a((new StringBuilder("You should never call this class with an empty uri or any other link type than SpotifyLink.LinkType.TRACK or SpotifyLink.LinkType.ALBUM, link was: ")).append(s).toString());
        }
        obj = new Intent();
        ((Intent) (obj)).setClass(context, com/spotify/mobile/android/spotlets/playlist/activity/AddToPlaylistActivity);
        if (s1 != null)
        {
            ((Intent) (obj)).putExtra("default_name", s1);
        }
        fyw.a(((Intent) (obj)), flags);
        ((Intent) (obj)).setData(Uri.parse(s));
        ((Intent) (obj)).putExtra("view_uri", verified.toString());
        ((Intent) (obj)).putExtra("source_action", sourceaction);
        return ((Intent) (obj));
    }

    public void onBackPressed()
    {
        d.a("cancel", null, 0L, 0L, null);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = new DialogLayout(this, false);
        ((DialogLayout) (obj)).a(getString(0x7f080065));
        Object obj1 = new FrameLayout(this);
        ((FrameLayout) (obj1)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        ((FrameLayout) (obj1)).setId(0x7f1100ff);
        ((DialogLayout) (obj)).a(((android.view.View) (obj1)));
        setContentView(((android.view.View) (obj)));
        Object obj2 = getIntent();
        obj = ((Intent) (obj2)).getDataString();
        obj1 = (new SpotifyLink(((String) (obj)))).c;
        if (obj == null || obj1 != com.spotify.mobile.android.util.SpotifyLink.LinkType.aT && obj1 != com.spotify.mobile.android.util.SpotifyLink.LinkType.c)
        {
            Assertion.a((new StringBuilder("You should never call this class with an empty uri or any other link type than SpotifyLink.LinkType.TRACK or SpotifyLink.LinkType.ALBUM, link was: ")).append(((String) (obj))).toString());
            finish();
            return;
        }
        obj1 = ((Intent) (obj2)).getStringExtra("view_uri");
        obj2 = (com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction)((Intent) (obj2)).getSerializableExtra("source_action");
        dmz.a(fop);
        d = new PlaylistLogger(this, ((String) (obj)), ((String) (obj1)), ((com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction) (obj2)));
        Flags flags = fyw.a(this);
        if (bundle == null)
        {
            bundle = a_().a();
            bundle.b(0x7f1100ff, fde.a(((String) (obj)), getIntent().getStringExtra("default_name"), flags, ((String) (obj1)), ((com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction) (obj2))));
            bundle.c();
        }
        super.e = ggn.a(this, ViewUri.az);
    }
}
