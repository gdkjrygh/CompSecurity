// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.y;
import com.facebook.m;
import com.facebook.s;

// Referenced classes of package com.facebook.b:
//            aa, al, ax, r, 
//            x, s, as

public class q extends y
{

    private Dialog aj;

    public q()
    {
    }

    private void a(Bundle bundle, m m)
    {
        ac ac1 = i();
        bundle = aa.a(ac1.getIntent(), bundle, m);
        byte byte0;
        if (m == null)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        ac1.setResult(byte0, bundle);
        ac1.finish();
    }

    static void a(q q1, Bundle bundle)
    {
        q1.l(bundle);
    }

    static void a(q q1, Bundle bundle, m m)
    {
        q1.a(bundle, m);
    }

    private void l(Bundle bundle)
    {
        ac ac1 = i();
        Intent intent = new Intent();
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        intent.putExtras(bundle1);
        ac1.setResult(-1, intent);
        ac1.finish();
    }

    public void a(Dialog dialog)
    {
        aj = dialog;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (aj != null) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        bundle = i();
        bundle1 = aa.c(bundle.getIntent());
        if (bundle1.getBoolean("is_fallback", false)) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = bundle1.getString("action");
        bundle1 = bundle1.getBundle("params");
        if (!al.a(s1)) goto _L6; else goto _L5
_L5:
        al.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
        bundle.finish();
_L2:
        return;
_L6:
        bundle = (new ax(bundle, s1, bundle1)).a(new r(this)).a();
_L8:
        aj = bundle;
        return;
_L4:
        String s2 = bundle1.getString("url");
        if (al.a(s2))
        {
            al.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
            bundle.finish();
            return;
        }
        bundle = new x(bundle, s2, String.format("fb%s://bridge/", new Object[] {
            s.h()
        }));
        bundle.a(new com.facebook.b.s(this));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Dialog c(Bundle bundle)
    {
        if (aj == null)
        {
            a(((Bundle) (null)), ((m) (null)));
            b(false);
        }
        return aj;
    }

    public void f()
    {
        if (a() != null && q())
        {
            a().setDismissMessage(null);
        }
        super.f();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (aj instanceof as)
        {
            ((as)aj).d();
        }
    }
}
