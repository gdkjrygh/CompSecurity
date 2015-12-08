// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.squareup.picasso.Picasso;
import ctz;
import dmz;
import gft;
import gwb;

public class BiographyImageView extends FrameLayout
{

    private SpotifyImageView a;

    public BiographyImageView(Context context)
    {
        super(context);
    }

    public BiographyImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(Image image)
    {
        SpotifyImageView spotifyimageview;
label0:
        {
            boolean flag = true;
            spotifyimageview = a;
            image = image.getUri();
            boolean flag1;
            if (spotifyimageview.a != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ctz.b(flag1, "A default drawable has not been set yet!");
            if (spotifyimageview.b == null || !spotifyimageview.b.equals(image))
            {
                flag = false;
            }
            if (!flag)
            {
                spotifyimageview.b = image;
                if (!Uri.EMPTY.equals(image))
                {
                    break label0;
                }
                spotifyimageview.setImageResource(spotifyimageview.a);
            }
            return;
        }
        ((gft)dmz.a(gft)).a().a(image).a(spotifyimageview.a).b(spotifyimageview.a).a(spotifyimageview.c);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (SpotifyImageView)LayoutInflater.from(getContext()).inflate(0x7f03003d, this).findViewById(0x7f11026a);
        a.a = 0x7f020256;
    }
}
