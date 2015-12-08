// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.SpotifyError;

public class dxn extends dxx
{

    private Runnable a;
    private Handler b;

    public dxn()
    {
        b = new Handler();
    }

    public final void B()
    {
        super.B();
        b.removeCallbacks(a);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (View)ctz.a(layoutinflater.inflate(0x7f030084, viewgroup, false));
        a = new Runnable(layoutinflater) {

            private View a;

            public final void run()
            {
                a.findViewById(0x7f1102c3).setVisibility(0);
            }

            
            {
                a = view;
                super();
            }
        };
        b.postDelayed(a, 2000L);
        return layoutinflater;
    }

    protected final void a(SpotifyError spotifyerror)
    {
        super.a(spotifyerror);
        ((dxo)H().a(this)).a();
    }
}
