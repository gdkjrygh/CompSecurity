// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class mnk
    implements mmr, mnc, omb, opl, opn, opr, ops, opt, opv
{

    public boolean a;
    private final Activity b;
    private int c;
    private List d;
    private mmv e;
    private boolean f;

    public mnk(Activity activity, opd opd1)
    {
        c = -1;
        d = new ArrayList();
        a = true;
        b = activity;
        opd1.a(this);
    }

    private void h()
    {
        boolean flag;
        if (c == -1)
        {
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = e.c(c);
        }
        if (!flag)
        {
            if (Log.isLoggable("IntentAccountHandler", 3))
            {
                int i = c;
                String s = String.valueOf(b.getClass().getName());
                (new StringBuilder(String.valueOf(s).length() + 62)).append("Invalid account state with accountId ").append(i).append(" for activity ").append(s);
            }
            c = -1;
            b.finish();
        }
    }

    public final void X_()
    {
        f = true;
        h();
    }

    public final mmr a(mmt mmt1)
    {
        d.add(mmt1);
        return this;
    }

    public final mnk a(olm olm1)
    {
        olm1.a(mmr, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        if (e == null)
        {
            e = (mmv)olm1.a(mmv);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle == null)
        {
            c = b.getIntent().getIntExtra("account_id", -1);
            h();
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                mmt mmt1 = (mmt)iterator.next();
                mms mms1 = mms.a;
                if (c != -1)
                {
                    bundle = mms.c;
                } else
                {
                    bundle = mms.b;
                }
                mmt1.a(true, mms1, bundle, -1, c);
            }
        } else
        {
            c = bundle.getInt("state_account_id");
        }
        f = true;
        e.a(this);
    }

    public final void al_()
    {
        f = true;
        h();
    }

    public final void c()
    {
        e.b(this);
    }

    public final int d()
    {
        b.u();
        return c;
    }

    public final void e(Bundle bundle)
    {
        f = false;
        bundle.putInt("state_account_id", c);
    }

    public final boolean e()
    {
        b.u();
        return c != -1;
    }

    public final boolean f()
    {
        b.u();
        return c != -1 && e.a(c).a();
    }

    public final mmx g()
    {
        b.u();
        return e.a(c);
    }

    public final void r()
    {
        if (f)
        {
            h();
        }
    }
}
