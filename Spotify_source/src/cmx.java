// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

final class cmx
    implements Runnable
{

    final cmv a;
    private final int b;
    private final ConnectionResult c;

    public cmx(cmv cmv1, int i, ConnectionResult connectionresult)
    {
        a = cmv1;
        super();
        b = i;
        c = connectionresult;
    }

    public final void run()
    {
        if (cmv.a(a) && !cmv.b(a))
        {
            cmv.c(a);
            cmv.a(a, b);
            cmv.a(a, c);
            if (c.a())
            {
                try
                {
                    int i = a.k().a_().f().indexOf(a);
                    ConnectionResult connectionresult = c;
                    u u1 = a.k();
                    if (connectionresult.a())
                    {
                        u1.startIntentSenderForResult(connectionresult.d.getIntentSender(), (i + 1 << 16) + 1, null, 0, 0, 0);
                        return;
                    }
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    cmv.d(a);
                    return;
                }
            } else
            {
                cmv.G();
                if (bqi.a(c.c))
                {
                    GooglePlayServicesUtil.showErrorDialogFragment(c.c, a.k(), a, 2, a);
                    return;
                }
                if (c.c == 18)
                {
                    cmv.G();
                    Dialog dialog = bqi.a(a.k(), a);
                    cmv.a(a, cmt.a(a.k().getApplicationContext(), new cmt(dialog) {

                        private Dialog a;
                        private cmx b;

                        protected final void a()
                        {
                            cmv.d(b.a);
                            a.dismiss();
                        }

            
            {
                b = cmx.this;
                a = dialog;
                super();
            }
                    }));
                    return;
                } else
                {
                    cmv.b(a, b);
                    return;
                }
            }
        }
    }
}
