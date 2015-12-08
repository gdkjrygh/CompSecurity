// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.porcelain.view.PorcelainCompactCardView;
import com.squareup.picasso.Picasso;

public final class ews extends ewu
{

    public ews(ViewGroup viewgroup)
    {
        super(viewgroup);
    }

    protected final void a(String s)
    {
        ((gft)dmz.a(gft)).a().a(s).a(dff.b(k, SpotifyIcon.g, 0.5F, false)).a(gft.a(j.c, new dfv() {

            private ews a;

            public final Drawable a(Bitmap bitmap)
            {
                return new eww(a.k, 0x7f02007e, Bitmap.createScaledBitmap(bitmap, ((ewu) (a)).m, ((ewu) (a)).m, false));
            }

            
            {
                a = ews.this;
                super();
            }
        }));
    }
}
