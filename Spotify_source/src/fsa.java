// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class fsa extends fsc
{

    private fsb k;
    private frz l;
    private fry m;

    public fsa(fsb fsb1, frz frz1, boolean flag, Verified verified, fry fry1)
    {
        super(Reason.m, "info", flag, fsb1, frz1, fry1, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, "full-page");
        k = fsb1;
        l = frz1;
        m = fry1;
    }

    public final void a()
    {
        super.a();
        k.dismiss();
    }

    public final void a(SessionState sessionstate)
    {
        l.a(sessionstate);
        boolean flag;
        if (l.j)
        {
            sessionstate = l;
            int i = (int)TimeUnit.MILLISECONDS.toDays(((frz) (sessionstate)).k - System.currentTimeMillis());
            if (i >= 0)
            {
                sessionstate = (Context)m.a.get();
                fsb fsb1;
                if (sessionstate == null)
                {
                    sessionstate = "";
                } else
                {
                    sessionstate = sessionstate.getResources().getQuantityString(0x7f090017, i, new Object[] {
                        Integer.valueOf(i)
                    });
                }
            } else
            {
                sessionstate = "";
            }
        } else
        {
            sessionstate = (Context)m.a.get();
            if (sessionstate == null)
            {
                sessionstate = "";
            } else
            {
                sessionstate = sessionstate.getString(0x7f080407);
            }
        }
        if (TextUtils.isEmpty(sessionstate))
        {
            k.b(8);
        } else
        {
            k.b(0);
            k.b(sessionstate.toUpperCase(Locale.getDefault()));
        }
        fsb1 = k;
        sessionstate = m;
        flag = l.j;
        sessionstate = (Context)((fry) (sessionstate)).a.get();
        if (sessionstate == null)
        {
            sessionstate = "";
        } else
        {
            int j;
            if (flag)
            {
                j = 0x7f080406;
            } else
            {
                j = 0x7f080405;
            }
            sessionstate = sessionstate.getString(j);
        }
        fsb1.c(sessionstate);
        fsb1 = k;
        sessionstate = m;
        flag = l.j;
        sessionstate = (Context)((fry) (sessionstate)).a.get();
        if (sessionstate == null)
        {
            sessionstate = "";
        } else
        {
            int i1;
            if (flag)
            {
                i1 = 0x7f080404;
            } else
            {
                i1 = 0x7f080403;
            }
            sessionstate = sessionstate.getString(i1);
        }
        fsb1.d(sessionstate);
        e();
    }

    public final void b()
    {
        super.a();
        k.dismiss();
    }

    public final void c()
    {
        super.c();
        k.dismiss();
    }

    public final void d()
    {
        k = null;
        l.a();
        l = null;
        m.a.clear();
        m = null;
    }
}
