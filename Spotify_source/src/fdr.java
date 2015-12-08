// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.StickyRecyclerView;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.spotlets.running.auto.TempoDetectionActivity;
import com.spotify.mobile.android.spotlets.running.manual.ManualTempoActivity;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Locale;

public final class fdr extends doq
    implements NavigationItem
{

    private String aa;
    private String ag;
    private Flags ah;

    public fdr()
    {
        dmz.a(fop);
    }

    public static fdr a(String s, Flags flags, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("username", s1);
        s = new fdr();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.n;
    }

    protected final SpotifyIcon G()
    {
        return SpotifyIcon.bs;
    }

    protected final Request H()
    {
        Object obj = DebugFlag.n;
        String s = ag;
        obj = Locale.getDefault().toString();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = "locale=en";
        } else
        {
            obj = (new StringBuilder("locale=")).append(((String) (obj))).toString();
        }
        if (TextUtils.isEmpty(s))
        {
            s = "";
        } else
        {
            s = (new StringBuilder("user/")).append(Uri.encode(s)).append("/").toString();
        }
        return RequestBuilder.get((new StringBuilder("hm://rttb-view/v1/recommendation/")).append(s).append("setup?platform=android&").append(((String) (obj))).toString()).build();
    }

    protected final com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader a(com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader porcelainpageheader)
    {
        return new dst(porcelainpageheader) {

            private fdr a;

            public final CharSequence getSubtitle()
            {
                return a.b(0x7f080461);
            }

            public final CharSequence getTitle()
            {
                return a.b(0x7f080654);
            }

            
            {
                a = fdr.this;
                super(porcelainpageheader);
            }
        };
    }

    protected final dip a(StickyRecyclerView stickyrecyclerview, com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader porcelainpageheader)
    {
        stickyrecyclerview = super.a(stickyrecyclerview, porcelainpageheader);
        if (stickyrecyclerview != null)
        {
            stickyrecyclerview.e();
        }
        return stickyrecyclerview;
    }

    public final String a(Context context, Flags flags)
    {
        if (aa == null)
        {
            return context.getString(0x7f080654);
        } else
        {
            return aa;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ah = fyw.a(this);
        aa = g().getString("title");
        ag = g().getString("username");
    }

    protected final boolean a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
    {
        String s = porcelainnavigationlink.getUri();
        SpotifyLink spotifylink = new SpotifyLink(s);
        if (spotifylink.c != com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
        {
            return super.a(porcelainnavigationlink, i, j);
        }
        porcelainnavigationlink = k();
        Object obj = fop.b(porcelainnavigationlink, ViewUri.l, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dw));
        ((Intent) (obj)).putExtra("context", s);
        porcelainnavigationlink.startService(((Intent) (obj)));
        obj = k().getPackageManager();
        if (((Boolean)ah.a(fys.av)).booleanValue() && ((PackageManager) (obj)).hasSystemFeature("android.hardware.sensor.accelerometer"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            a(TempoDetectionActivity.a(porcelainnavigationlink, s, ag));
        } else
        {
            a(ManualTempoActivity.a(porcelainnavigationlink, spotifylink, ag));
        }
        return true;
    }

    protected final FeatureIdentifier r_()
    {
        return FeatureIdentifier.F;
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.F;
    }

    public final Verified v_()
    {
        return ViewUri.l;
    }
}
