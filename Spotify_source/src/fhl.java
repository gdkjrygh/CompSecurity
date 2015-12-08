// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.share.client.ShareViewClient;
import com.spotify.mobile.android.util.Assertion;

public final class fhl extends fhi
{

    private com.spotify.mobile.android.spotlets.share.model.Network.Type Z;
    private EditText aa;
    private EditText ab;
    private dfi ac;

    public fhl()
    {
    }

    static EditText a(fhl fhl1)
    {
        return fhl1.aa;
    }

    public static fhl a(com.spotify.mobile.android.spotlets.share.model.Network.Type type)
    {
        Assertion.a(type);
        Bundle bundle = new Bundle();
        bundle.putString("network_type", type.toString());
        type = new fhl();
        type.f(bundle);
        return type;
    }

    private void a(TextView textview)
    {
        dgo.a(k(), textview, 0x7f0101d6);
        dgo.a(textview, gcg.a(k(), 0x7f0200d4));
        textview.setTextColor(dgo.b(k(), 0x1010031));
        textview.setHintTextColor(dgo.b(k(), 0x7f0101d2));
    }

    static EditText b(fhl fhl1)
    {
        return fhl1.ab;
    }

    static com.spotify.mobile.android.spotlets.share.model.Network.Type c(fhl fhl1)
    {
        return fhl1.Z;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Assertion.a(g());
        bundle = g().getString("network_type");
        Assertion.a(bundle);
        Z = com.spotify.mobile.android.spotlets.share.model.Network.Type.valueOf(bundle);
        Assertion.a(Z);
    }

    public final Dialog c(Bundle bundle)
    {
        super.c(bundle);
        bundle = new LinearLayout(k());
        bundle.setOrientation(1);
        aa = dgp.a(k());
        aa.setId(0x7f11011c);
        aa.setImeOptions(5);
        aa.setFreezesText(true);
        aa.setSingleLine(true);
        a(aa);
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i;
        if (Z.equals(com.spotify.mobile.android.spotlets.share.model.Network.Type.b))
        {
            aa.setHint(0x7f0804c9);
        } else
        {
            aa.setHint(0x7f0804c7);
        }
        ab = dgp.a(k());
        ab.setId(0x7f1100df);
        ab.setImeOptions(6);
        ab.setFreezesText(true);
        ab.setSingleLine(true);
        ab.setInputType(129);
        ab.setHint(0x7f0804c8);
        a(ab);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i = (int)l().getDimension(0x7f0c013d);
        layoutparams.setMargins(0, i, 0, i);
        bundle.addView(aa, layoutparams);
        bundle.addView(ab, layoutparams);
        ac = (new dfj(k(), 0x7f0b017f)).a(a(0x7f0804ca, new Object[] {
            Z.mName
        })).b(0x7f08059f, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int j)
            {
            }

        }).a(0x7f0805a1, null).a(bundle).b();
        ac.a().setOnClickListener(new android.view.View.OnClickListener() {

            private fhl a;

            public final void onClick(View view)
            {
                view = fhl.a(a).getText().toString();
                Object obj1 = fhl.b(a).getText().toString();
                Object obj = ((fhi) (a)).Y;
                obj.a = fhl.c(a).a();
                ShareViewClient shareviewclient;
                if (fhl.c(a).equals(com.spotify.mobile.android.spotlets.share.model.Network.Type.b))
                {
                    obj.b = view;
                    obj.d = ((String) (obj1));
                } else
                {
                    obj.c = view;
                    obj.d = ((String) (obj1));
                }
                obj1 = a.F();
                view = fhl.c(a);
                obj = new com.spotify.mobile.android.spotlets.share.model.Connect.Request(((fhq) (obj)).a, ((fhq) (obj)).b, ((fhq) (obj)).c, ((fhq) (obj)).d, null);
                shareviewclient = ((fhn) (obj1)).Y;
                obj1 = ((fhn) (obj1)).a(view);
                shareviewclient.b().resolve(ShareViewClient.a(view, ((com.spotify.mobile.android.spotlets.share.model.Connect.Request) (obj))), ((com.spotify.cosmos.android.Resolver.CallbackReceiver) (obj1)));
                a.dismiss();
            }

            
            {
                a = fhl.this;
                super();
            }
        });
        return ac;
    }
}
