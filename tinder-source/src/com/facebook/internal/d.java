// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.i;
import com.facebook.FacebookException;
import com.facebook.g;

// Referenced classes of package com.facebook.internal:
//            i, o, m, f

public final class d extends h
{

    public Dialog a;

    public d()
    {
    }

    private void a(Bundle bundle, FacebookException facebookexception)
    {
        i j = getActivity();
        bundle = i.a(j.getIntent(), bundle, facebookexception);
        byte byte0;
        if (facebookexception == null)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        j.setResult(byte0, bundle);
        j.finish();
    }

    static void a(d d1, Bundle bundle)
    {
        i j = d1.getActivity();
        Intent intent = new Intent();
        d1 = bundle;
        if (bundle == null)
        {
            d1 = new Bundle();
        }
        intent.putExtras(d1);
        j.setResult(-1, intent);
        j.finish();
    }

    static void a(d d1, Bundle bundle, FacebookException facebookexception)
    {
        d1.a(bundle, facebookexception);
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (a instanceof o)
        {
            ((o)a).a();
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (a != null) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        bundle = getActivity();
        bundle1 = i.a(bundle.getIntent());
        if (bundle1.getBoolean("is_fallback", false)) goto _L4; else goto _L3
_L3:
        String s;
        s = bundle1.getString("action");
        bundle1 = bundle1.getBundle("params");
        if (!m.a(s)) goto _L6; else goto _L5
_L5:
        m.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
        bundle.finish();
_L2:
        return;
_L6:
        bundle = new o.a(bundle, s, bundle1);
        bundle.d = new o.c() {

            final d a;

            public final void a(Bundle bundle2, FacebookException facebookexception)
            {
                d.a(a, bundle2, facebookexception);
            }

            
            {
                a = d.this;
                super();
            }
        };
        bundle = bundle.a();
_L8:
        a = bundle;
        return;
_L4:
        String s1 = bundle1.getString("url");
        if (m.a(s1))
        {
            m.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
            bundle.finish();
            return;
        }
        bundle = new f(bundle, s1, String.format("fb%s://bridge/", new Object[] {
            g.j()
        }));
        bundle.b = new o.c() {

            final d a;

            public final void a(Bundle bundle2, FacebookException facebookexception)
            {
                d.a(a, bundle2);
            }

            
            {
                a = d.this;
                super();
            }
        };
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        if (a == null)
        {
            a(((Bundle) (null)), ((FacebookException) (null)));
            setShowsDialog(false);
        }
        return a;
    }

    public final void onDestroyView()
    {
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
