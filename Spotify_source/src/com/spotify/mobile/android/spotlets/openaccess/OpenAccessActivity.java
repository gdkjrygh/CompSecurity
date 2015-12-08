// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.util.SpotifyLink;
import exi;
import exl;
import fou;
import gfv;

public class OpenAccessActivity extends fou
{

    public OpenAccessActivity()
    {
    }

    public static Intent a(Context context, Intent intent)
    {
        context = new Intent(context, com/spotify/mobile/android/spotlets/openaccess/OpenAccessActivity);
        context.putExtra("intent", intent);
        return context;
    }

    private void a(Intent intent)
    {
        intent = ((Intent)intent.getParcelableExtra("intent")).getDataString();
        SpotifyLink spotifylink = new SpotifyLink(intent);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.h.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[spotifylink.c.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(((Fragment) (exl.a(intent))));
            return;

        case 2: // '\002'
            a(((Fragment) (exi.a(intent))));
            return;

        case 3: // '\003'
            a(((Fragment) (exl.a(spotifylink.i()))));
            return;

        case 4: // '\004'
            a(((Fragment) (exi.a(spotifylink.i()))));
            break;
        }
    }

    private void a(Fragment fragment)
    {
        a_().a().b(0x7f1102b1, fragment).c();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        gfv.a(this);
        setContentView(0x7f030029);
        a(getIntent());
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }
}
