// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.location;

import android.accounts.Account;
import android.app.IntentService;
import android.content.Intent;
import com.google.android.libraries.social.gcm.GcmBroadcastReceiver;
import lzh;
import lzp;
import lzq;
import lzr;
import lzt;
import lzu;
import lzv;
import mdy;
import mdz;
import mmv;
import mmx;
import nfa;
import olm;

public final class GcmLocationService extends IntentService
    implements lzt, lzu
{

    private lzq a;
    private mdy b;
    private Intent c;

    public GcmLocationService()
    {
        super("GcmLocationService");
    }

    public static void a(GcmLocationService gcmlocationservice)
    {
        gcmlocationservice.b();
    }

    public static lzq b(GcmLocationService gcmlocationservice)
    {
        return gcmlocationservice.a;
    }

    private void b()
    {
        a.b();
        GcmBroadcastReceiver.a(c);
        c = null;
    }

    public static mdy c(GcmLocationService gcmlocationservice)
    {
        return gcmlocationservice.b;
    }

    public final void a()
    {
        if (a == null || !a.c())
        {
            if (c != null)
            {
                GcmBroadcastReceiver.a(c);
            }
            return;
        }
        Object obj = c.getStringExtra("gaia_id");
        mmv mmv1 = (mmv)olm.a(this, mmv);
        int i = mmv1.b(((String) (obj)));
        if (i == -1)
        {
            b();
            return;
        }
        obj = new Account(mmv1.a(i).b("account_name"), "com.google");
        try
        {
            b.a(a, ((Account) (obj))).a(new nfa(this, ((Account) (obj)), i));
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            b();
        }
    }

    public final void a(int i)
    {
        b();
    }

    public final void a(lzh lzh)
    {
        GcmBroadcastReceiver.a(c);
    }

    public final void onCreate()
    {
        super.onCreate();
        b = (mdy)olm.a(this, mdy);
        a = ((lzr)olm.a(this, lzr)).a((lzp)olm.a(this, mdz)).a();
        a.a(this);
        a.a(this);
    }

    protected final void onHandleIntent(Intent intent)
    {
        if (intent.hasExtra("gaia_id"))
        {
            c = intent;
            a.a();
            return;
        } else
        {
            GcmBroadcastReceiver.a(intent);
            return;
        }
    }
}
