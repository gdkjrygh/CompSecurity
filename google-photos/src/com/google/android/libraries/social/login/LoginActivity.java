// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login;

import android.content.Intent;
import android.os.Bundle;
import b;
import mms;
import mmt;
import nfw;
import ngb;
import ngg;
import olm;
import omr;

public final class LoginActivity extends omr
    implements mmt
{

    private ngb f;
    private boolean g;
    private nfw h;

    public LoginActivity()
    {
        h = (new nfw(this, e)).b(this);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        f = (ngb)d.b(ngb);
    }

    public final void a(boolean flag, mms mms, mms mms1, int i, int j)
    {
        if (j != -1)
        {
            mms = (Intent)getIntent().getParcelableExtra("redirect_intent");
            mms1 = (Bundle)getIntent().getParcelableExtra("redirect_intent_options");
            if (mms != null)
            {
                nfw nfw1 = h;
                b.u();
                mms.putExtra("account_id", nfw1.b);
                mms.addFlags(0x2800000);
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    startActivity(mms, mms1);
                } else
                {
                    startActivity(mms);
                }
            } else
            {
                mms = new Intent();
                mms1 = h;
                b.u();
                mms.putExtra("account_id", ((nfw) (mms1)).b);
                setResult(-1, mms);
            }
        } else
        {
            setResult(0);
        }
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = (ngg)getIntent().getParcelableExtra("login_request");
            h.a(bundle);
            return;
        } else
        {
            g = bundle.getBoolean("impression_logged", false);
            return;
        }
    }

    protected final void onResume()
    {
        super.onResume();
        if (!g && f != null)
        {
            g = true;
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("impression_logged", g);
    }
}
