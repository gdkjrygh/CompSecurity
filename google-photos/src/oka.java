// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;

public final class oka
    implements omb, ooi, opo, opv
{

    private final Activity a;
    private mmr b;
    private rz c;
    private nxp d;
    private boolean e;
    private ArrayList f;

    private oka(Activity activity, opd opd1)
    {
        e = true;
        f = new ArrayList();
        a = activity;
        opd1.a(this);
    }

    public oka(rz rz1, opd opd1)
    {
        this(((Activity) (rz1)), opd1);
        c = rz1;
    }

    private boolean a(Activity activity)
    {
        android.content.Intent intent = activity.getParentActivityIntent();
        Object obj = intent;
        if (intent == null)
        {
            obj = intent;
            if (d != null)
            {
                obj = d;
                if (b != null)
                {
                    b.d();
                }
                obj = ((nxp) (obj)).a();
            }
        }
        if (obj != null && activity.shouldUpRecreateTask(((android.content.Intent) (obj))))
        {
            TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(activity);
            activity.onCreateNavigateUpTaskStack(taskstackbuilder);
            activity.onPrepareNavigateUpTaskStack(taskstackbuilder);
            taskstackbuilder.startActivities();
            try
            {
                activity.finishAffinity();
            }
            catch (IllegalStateException illegalstateexception)
            {
                activity.finish();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean a(rz rz1)
    {
        android.content.Intent intent = cd.b(rz1);
        Object obj = intent;
        if (intent == null)
        {
            obj = intent;
            if (d != null)
            {
                obj = d;
                if (b != null)
                {
                    b.d();
                }
                obj = ((nxp) (obj)).a();
            }
        }
        if (obj != null && cd.a(rz1, ((android.content.Intent) (obj))))
        {
            dw dw1 = dw.a(rz1);
            rz1.a(dw1);
            if (dw1.a.size() == 0)
            {
                dw1.a(((android.content.Intent) (obj)));
            }
            dw1.a();
            try
            {
                x.a(rz1);
            }
            catch (IllegalStateException illegalstateexception)
            {
                rz1.finish();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final oka a(ojz ojz1)
    {
        if (f.contains(ojz1))
        {
            throw new IllegalStateException("UpNavigationHandler already on stack.");
        } else
        {
            f.add(ojz1);
            return this;
        }
    }

    public final oka a(olm olm1)
    {
        olm1.a(oka, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (nxp)olm.b(a, nxp);
        b = (mmr)olm1.b(mmr);
    }

    public final boolean a()
    {
        int i = f.size() - 1;
_L10:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (!((ojz)f.get(i)).a()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        i--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (ojx.a(a))
        {
            a.onBackPressed();
            return true;
        }
        if (c == null) goto _L6; else goto _L5
_L5:
        if (a(c)) goto _L3; else goto _L7
_L7:
        a.onBackPressed();
        return true;
_L6:
        if (android.os.Build.VERSION.SDK_INT < 16 || !a(a)) goto _L7; else goto _L8
_L8:
        return true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            return a();
        } else
        {
            return false;
        }
    }

    public final void b_(Bundle bundle)
    {
        if (c != null)
        {
            bundle = c.e().a();
            if (bundle != null)
            {
                bundle.b(e);
            }
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            bundle = a.getActionBar();
            if (bundle != null)
            {
                bundle.setDisplayHomeAsUpEnabled(e);
                return;
            }
        }
    }
}
