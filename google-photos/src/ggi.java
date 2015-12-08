// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Bundle;

public final class ggi
    implements omb, opp, opr, opv
{

    ejn a;
    nwm b;
    ggk c;
    private final Activity d;
    private Context e;
    private NfcAdapter f;

    public ggi(Activity activity, opd opd1)
    {
        d = activity;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = context;
        a = (ejn)olm1.a(ejn);
        b = (nwm)olm1.b(nwm);
        c = (ggk)olm1.b(ggk);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (e.getPackageManager().checkPermission("android.permission.NFC", e.getPackageName()) != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                f = NfcAdapter.getDefaultAdapter(context);
            }
        }
    }

    public final void al_()
    {
        if (f == null)
        {
            return;
        } else
        {
            f.setBeamPushUris(null, d);
            f.setBeamPushUrisCallback(new ggj(this), d);
            return;
        }
    }

    public final void am_()
    {
        if (f == null)
        {
            return;
        } else
        {
            f.setBeamPushUrisCallback(null, d);
            return;
        }
    }
}
