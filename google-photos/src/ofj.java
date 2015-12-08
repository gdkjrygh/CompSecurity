// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class ofj
    implements mmt
{

    private final mmv a;
    private final Context b;
    private String c;

    ofj(Activity activity)
    {
        b = activity.getApplicationContext();
        a = (mmv)olm.a(activity, mmv);
        c = a(activity.getIntent().getIntExtra("account_id", -1));
        activity = (mmr)olm.b(activity, mmr);
        if (activity != null)
        {
            activity.a(this);
        }
    }

    private String a(int i)
    {
        if (a.c(i))
        {
            return a.a(i).b("account_name");
        } else
        {
            return null;
        }
    }

    private void a(msm msm1)
    {
        msm1 = new mry(25, (new msn()).a(msm1));
        msm1.c = c;
        msm1.b(b);
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i, int j)
    {
        if (Log.isLoggable("AnalyticsAccount", 3))
        {
            String.format(Locale.US, "Account change notification: prevState=%s state=%s prevAccountId=%d accountId=%d", new Object[] {
                mms1.toString(), mms2.toString(), Integer.valueOf(i), Integer.valueOf(j)
            });
        }
        if (j != i && mms.a != mms2)
        {
            mms1 = a(j);
            if (!TextUtils.equals(mms1, c))
            {
                a(new msm(pxb.a));
                c = mms1;
                a(new msm(pxb.b));
            }
        }
    }
}
