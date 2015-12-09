// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;

public abstract class gqi extends gqj
{

    public static final SpotifyIcon e;
    public static final SpotifyIcon f;
    private int a;
    private int b;
    public Menu c;
    public boolean d;

    public gqi(Context context, Verified verified, ViewGroup viewgroup, SpotifyIcon spotifyicon, SpotifyIcon spotifyicon1, SpotifyIcon spotifyicon2, SpotifyIcon spotifyicon3, 
            boolean flag, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        if (flag)
        {
            spotifyicon = (SpotifyIcon)ctz.a(spotifyicon2);
        }
        if (flag)
        {
            spotifyicon1 = (SpotifyIcon)ctz.a(spotifyicon3);
        }
        super(context, verified, viewgroup, spotifyicon, spotifyicon1, featureidentifier, featureidentifier1);
        a = ((Integer)ctz.a(Integer.valueOf(0x7f080048))).intValue();
        b = ((Integer)ctz.a(Integer.valueOf(0x7f110011))).intValue();
        d = flag;
    }

    protected final void b()
    {
        if (!d)
        {
            super.b();
        }
    }

    protected final Button c()
    {
        if (d)
        {
            ctz.a(c);
            return (Button)fzr.a(super.j, c, a, b, super.k, super.n);
        } else
        {
            return super.c();
        }
    }

    protected final void d()
    {
        if (d)
        {
            Button button = (Button)a(false);
            button.setText(0x7f0802fc);
            button.setCompoundDrawablesWithIntrinsicBounds(new dfz(super.j, super.l), null, null, null);
            return;
        } else
        {
            super.d();
            return;
        }
    }

    protected final void e()
    {
        if (d)
        {
            Button button = (Button)a(false);
            button.setText(0x7f0802fd);
            button.setCompoundDrawablesWithIntrinsicBounds(new dfz(super.j, super.k), null, null, null);
            return;
        } else
        {
            super.e();
            return;
        }
    }

    static 
    {
        e = SpotifyIcon.B;
        f = SpotifyIcon.z;
    }
}
