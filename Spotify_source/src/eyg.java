// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.mobile.android.spotlets.party.PartySetupActivity;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eyg extends Fragment
    implements NavigationItem, fxy
{

    private String a;
    private Flags b;

    public eyg()
    {
    }

    public static eyg a(String s, Flags flags)
    {
        geh.a(s, "username must not be empty");
        Bundle bundle = new Bundle();
        bundle.putString("username", s);
        bundle.putParcelable("FlagsArgumentHelper.Flags", flags);
        s = new eyg();
        s.f(bundle);
        return s;
    }

    static String a(eyg eyg1)
    {
        return eyg1.a;
    }

    private void a(String s, String s1, ViewGroup viewgroup)
    {
        Button button = dgp.b(viewgroup.getContext(), viewgroup);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        layoutparams.setMargins(20, 20, 20, 20);
        button.setLayoutParams(layoutparams);
        button.setText(s1);
        button.setOnClickListener(new android.view.View.OnClickListener(s) {

            private String a;
            private eyg b;

            public final void onClick(View view)
            {
                b.a(PartySetupActivity.a(b.k(), a, eyg.a(b), eyg.b(b)));
            }

            
            {
                b = eyg.this;
                a = s;
                super();
            }
        });
        viewgroup.addView(button);
    }

    static Flags b(eyg eyg1)
    {
        return eyg1.b;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.o;
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "party";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = fyw.a(this);
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03008b, viewgroup, false);
        a("pop", "Pop", ((ViewGroup) (layoutinflater)));
        a("hiphop", "Hiphop", ((ViewGroup) (layoutinflater)));
        a("indie", "Indie", ((ViewGroup) (layoutinflater)));
        a("edm", "EDM", ((ViewGroup) (layoutinflater)));
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080314);
    }

    public final void a(Bundle bundle)
    {
        a = g().getString("username");
        b = fyw.a(this);
        super.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.G;
    }
}
