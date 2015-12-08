// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;

public class eex extends Fragment
{

    public static final String a = eex.getCanonicalName();
    final fot Y = new fot() {

        private eex a;

        public final boolean C_()
        {
            a.b.a("tapped_native_back_button");
            return true;
        }

            
            {
                a = eex.this;
                super();
            }
    };
    private Ad Z;
    private LinearLayout aa;
    private TextView ab;
    private TextView ac;
    private Button ad;
    private final efd ae = new efd() {

        private eex a;

        public final void a()
        {
            eex.a(a).animate().alpha(0.0F).setDuration(100L).start();
            eex.b(a).animate().alpha(0.0F).setDuration(100L).start();
        }

        public final void b()
        {
            eex.a(a).animate().alpha(1.0F).setDuration(100L).start();
            eex.b(a).animate().alpha(1.0F).setDuration(100L).start();
        }

        public final void c()
        {
            a.b.a("swiped");
        }

        public final void d()
        {
            dmz.a(edr);
            dne dne = edr.a(AdSlot.MOBILE_SCREENSAVER, Format.BANNER, "tapped_image");
            dmz.a(fop);
            fop.a(a.j(), dne);
        }

            
            {
                a = eex.this;
                super();
            }
    };
    eey b;

    public eex()
    {
    }

    static TextView a(eex eex1)
    {
        return eex1.ab;
    }

    public static eex a(eey eey, Ad ad1, Flags flags)
    {
        Assertion.a(eey, "Need an orchestrator to handle closing of the ad");
        Assertion.a(ad1, "Need an ad to display");
        Assertion.a(flags, "Need flags to display the screensaver ad fragment");
        eex eex1 = new eex();
        Bundle bundle = new Bundle();
        bundle.putParcelable("FlagsArgumentHelper.Flags", flags);
        bundle.putParcelable("ad", ad1);
        eex1.f(bundle);
        eex1.b = eey;
        return eex1;
    }

    static TextView b(eex eex1)
    {
        return eex1.ac;
    }

    static Ad c(eex eex1)
    {
        return eex1.Z;
    }

    public final void A()
    {
        super.A();
        ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).d(AdSlot.MOBILE_SCREENSAVER);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aa = (LinearLayout)layoutinflater.inflate(0x7f030090, viewgroup, false);
        aa.setOnClickListener(new android.view.View.OnClickListener() {

            private eex a;

            public final void onClick(View view)
            {
                a.b.a("tapped_outside");
            }

            
            {
                a = eex.this;
                super();
            }
        });
        ab = (TextView)aa.findViewById(0x7f11039b);
        ac = (TextView)aa.findViewById(0x7f11039f);
        ad = (Button)aa.findViewById(0x7f11039e);
        ad.setText(Z.getButtonText());
        ad.setOnClickListener(new android.view.View.OnClickListener() {

            private eex a;

            public final void onClick(View view)
            {
                view = eff.c(a.j(), eex.c(a).getClickUrl());
                a.k().startActivity(view);
                ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.a, eex.c(a).getId());
            }

            
            {
                a = eex.this;
                super();
            }
        });
        layoutinflater = (FrameLayout)aa.findViewById(0x7f11039c);
        viewgroup = (ImageView)aa.findViewById(0x7f11039d);
        viewgroup.setOnTouchListener(new efc(layoutinflater, ae));
        ((eez)dmz.a(eez)).b(Z).a(viewgroup, null);
        return aa;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Z = (Ad)g().getParcelable("ad");
    }

    public final void z()
    {
        super.z();
        ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).a(com.spotify.mobile.android.spotlets.ads.AdEventReporter.Event.c, Z.getId());
    }

}
