// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class fxz extends Fragment
    implements fxy
{

    private ggl a;

    public fxz()
    {
    }

    public final void A()
    {
        super.A();
        a.b();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "internal:licenses";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (WebView)layoutinflater.inflate(0x7f030094, viewgroup, false);
        layoutinflater.loadUrl("file:///android_asset/licenses.xhtml");
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080325);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(true);
        a = ggn.a(k(), ViewUri.be);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.aw;
    }

    public final void z()
    {
        super.z();
        a.a();
    }
}
