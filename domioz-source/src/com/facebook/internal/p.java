// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import com.facebook.l;
import com.facebook.q;

// Referenced classes of package com.facebook.internal:
//            am, bd, aw, bi, 
//            q, w, r

public final class p extends m
{

    private Dialog a;

    public p()
    {
    }

    static void a(p p1, Bundle bundle)
    {
        FragmentActivity fragmentactivity = p1.getActivity();
        Intent intent = new Intent();
        p1 = bundle;
        if (bundle == null)
        {
            p1 = new Bundle();
        }
        intent.putExtras(p1);
        fragmentactivity.setResult(-1, intent);
        fragmentactivity.finish();
    }

    static void a(p p1, Bundle bundle, l l)
    {
        p1 = p1.getActivity();
        bundle = am.a(p1.getIntent(), bundle, l);
        byte byte0;
        if (l == null)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        p1.setResult(byte0, bundle);
        p1.finish();
    }

    public final void a(Dialog dialog)
    {
        a = dialog;
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (a instanceof bd)
        {
            ((bd)a).d();
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (a != null) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        bundle = getActivity();
        bundle1 = am.a(bundle.getIntent());
        if (bundle1.getBoolean("is_fallback", false)) goto _L4; else goto _L3
_L3:
        String s;
        s = bundle1.getString("action");
        bundle1 = bundle1.getBundle("params");
        if (!aw.a(s)) goto _L6; else goto _L5
_L5:
        aw.b("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
        bundle.finish();
_L2:
        return;
_L6:
        bundle = (new bi(bundle, s, bundle1)).a(new com.facebook.internal.q(this)).a();
_L8:
        a = bundle;
        return;
_L4:
        String s1 = bundle1.getString("url");
        if (aw.a(s1))
        {
            aw.b("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
            bundle.finish();
            return;
        }
        bundle = new w(bundle, s1, String.format("fb%s://bridge/", new Object[] {
            q.h()
        }));
        bundle.a(new r(this));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
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
