// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eff extends fyl
    implements fxy
{

    public eff()
    {
    }

    static WebView a(eff eff1)
    {
        return eff1.x_();
    }

    public static eff a(Flags flags)
    {
        eff eff1 = new eff();
        fyw.a(eff1, flags);
        return eff1;
    }

    public static Intent c(Context context, String s)
    {
        Assertion.a(s, "Don't call with empty url");
        Assertion.a(context);
        Bundle bundle = new Bundle();
        bundle.putString("url", s);
        return gms.a(context, "spotify:internal:screensaver-ad-web-view").a(bundle).a;
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:internal:screensaver-ad-web-view";
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    protected final void a()
    {
        c(k().getIntent().getStringExtra("url"));
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(true);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        menuinflater = j();
        android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener = new android.view.MenuItem.OnMenuItemClickListener() {

            private eff a;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                menuitem = Uri.parse(eff.a(a).getUrl());
                a.a(new Intent("android.intent.action.VIEW", menuitem));
                return true;
            }

            
            {
                a = eff.this;
                super();
            }
        };
        if (!fzr.a(menuinflater))
        {
            ji.a(menu.add(0, 0x7f110008, 0, menuinflater.getString(0x7f080390)).setOnMenuItemClickListener(onmenuitemclicklistener), 0);
        }
    }

    protected final void a(String s)
    {
        super.a(s);
        if (k() instanceof fpe)
        {
            ((fpe)k()).a(this, x_().getTitle());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.aF;
    }
}
