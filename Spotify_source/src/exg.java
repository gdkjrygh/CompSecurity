// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.service.LoginActivity;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public class exg extends Fragment
{

    private View a;
    private exv b;

    public exg()
    {
        b = (exv)dmz.a(exv);
        new android.content.DialogInterface.OnClickListener() {

            private exg a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.a(LoginActivity.a(a.k(), (Intent)a.k().getIntent().getParcelableExtra("intent")));
                a.k().finish();
            }

            
            {
                a = exg.this;
                super();
            }
        };
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03008a, null);
        a = layoutinflater.findViewById(0x7f110383);
        return layoutinflater;
    }

    public final void a(Verified verified)
    {
        Object obj = k();
        if (obj != null)
        {
            if ((obj = ((Activity) (obj)).getIntent()) != null)
            {
                obj = (Intent)((Intent) (obj)).getParcelableExtra("intent");
                ctz.a(obj);
                a(LoginActivity.a(k(), ((Intent) (obj))));
                obj = b;
                ClientEvent clientevent = ClientEventFactory.a("login", com.spotify.mobile.android.util.ClientEvent.SubEvent.aY, ViewUri.au.toString(), null);
                clientevent.a("installation_id", ((exv) (obj)).a.f());
                fop.a(verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.A, clientevent);
                k().finish();
                return;
            }
        }
    }

    public final void b(Verified verified)
    {
        if (a.getVisibility() == 0)
        {
            return;
        } else
        {
            a.setOnClickListener(new android.view.View.OnClickListener(verified) {

                private Verified a;
                private exg b;

                public final void onClick(View view)
                {
                    b.a(a);
                }

            
            {
                b = exg.this;
                a = verified;
                super();
            }
            });
            a.setVisibility(0);
            return;
        }
    }
}
