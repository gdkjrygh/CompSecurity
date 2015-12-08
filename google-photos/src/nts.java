// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;

final class nts
    implements mmt, nac
{

    private Activity a;
    private mzz b;
    private nfw c;

    nts()
    {
    }

    private static String a(Intent intent)
    {
        intent = intent.getStringExtra("notification_tag");
        if (intent != null)
        {
            if ((intent = intent.split(":")).length == 4 && TextUtils.equals("notifications", intent[1]) && TextUtils.equals("gaiaid", intent[2]))
            {
                return intent[3];
            }
        }
        return null;
    }

    public final void a()
    {
        String s = a(a.getIntent());
        if (s != null)
        {
            nfw nfw1 = c;
            ngg ngg1 = new ngg();
            ngg1.q = s;
            ngg1.p = null;
            nfw1.a(ngg1);
            return;
        } else
        {
            c.a((new ngg()).a(ngl, null));
            return;
        }
    }

    public final void a(Activity activity, opd opd, mzz mzz1, nfw nfw1)
    {
        a = activity;
        b = mzz1;
        c = nfw1.b(this);
    }

    public final void a(boolean flag, mms mms, mms mms1, int i, int j)
    {
        Object obj = a.getIntent();
        mms = new Intent();
        mms.setPackage(a.getPackageName());
        mms.setAction("com.google.android.libraries.social.settings.NOTIFICATION_SETTINGS");
        android.os.Bundle bundle = ((Intent) (obj)).getExtras();
        mms1 = (mmv)olm.a(a, mmv);
        if (bundle != null)
        {
            mms.putExtras(bundle);
        }
        obj = a(((Intent) (obj)));
        if (obj != null)
        {
            j = mms1.b(((String) (obj)));
        }
        if (j == -1)
        {
            mms = null;
        } else
        {
            mms.putExtra("account_id", j);
        }
        if (mms != null)
        {
            b.a(mms);
            return;
        } else
        {
            b.a(1);
            return;
        }
    }
}
