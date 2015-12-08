// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class esg extends t
    implements fxy
{

    private final android.content.DialogInterface.OnClickListener Y = new android.content.DialogInterface.OnClickListener() {

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = (esl)dmz.a(esh, esl);
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cl);
            clientevent.a("n_friends", String.valueOf(((esl) (dialoginterface)).c));
            clientevent.a("n_friends_not_followed", String.valueOf(((esl) (dialoginterface)).d));
            fop fop1 = ((esl) (dialoginterface)).a;
            fop.a(((esl) (dialoginterface)).b, ViewUri.p, clientevent);
        }

    };
    private final android.content.DialogInterface.OnClickListener Z = new android.content.DialogInterface.OnClickListener() {

        private esg a;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            a.h().a(a.i(), 1, null);
            dialoginterface = (esl)dmz.a(esh, esl);
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ck);
            clientevent.a("n_friends", String.valueOf(((esl) (dialoginterface)).c));
            clientevent.a("n_friends_not_followed", String.valueOf(((esl) (dialoginterface)).d));
            fop fop1 = ((esl) (dialoginterface)).a;
            fop.a(((esl) (dialoginterface)).b, ViewUri.p, clientevent);
        }

            
            {
                a = esg.this;
                super();
            }
    };

    public esg()
    {
    }

    public static esg c(int i)
    {
        esg esg1 = new esg();
        Bundle bundle1 = esg1.g();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
            esg1.f(bundle);
        }
        bundle.putInt("friends_count", i);
        return esg1;
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:findfriends:confirm";
    }

    public final String a(Context context, Flags flags)
    {
        return context.getResources().getString(0x7f0802d2);
    }

    public final Dialog c(Bundle bundle)
    {
        super.c(bundle);
        ctz.a(g().containsKey("friends_count"));
        int i = g().getInt("friends_count");
        bundle = new LinearLayout(k());
        bundle.setOrientation(1);
        TextView textview = dgp.a(k(), null);
        textview.setText(k().getResources().getString(0x7f0802cf, new Object[] {
            Integer.valueOf(i)
        }));
        textview.setFreezesText(true);
        dgo.a(k(), textview, 0x7f0101d6);
        textview.setTextColor(dgo.b(k(), 0x1010031));
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i = (int)l().getDimension(0x7f0c013d);
        layoutparams.setMargins(0, i, 0, i);
        bundle.addView(textview, layoutparams);
        return (new dfj(k(), 0x7f0b017f)).a(l().getString(0x7f0802d2)).b(0x7f0802d0, Y).a(0x7f0802d1, Z).a(bundle).b();
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.al;
    }
}
