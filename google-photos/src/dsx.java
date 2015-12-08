// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

public class dsx
    implements opl, opp, ops, opv
{

    public boolean a;
    private final Activity b;
    private int c;

    public dsx(Activity activity, opd opd1)
    {
        b = activity;
        opd1.a(this);
    }

    private int a()
    {
        return b.getResources().getConfiguration().orientation;
    }

    public final void a(Bundle bundle)
    {
        c = a();
        if (bundle != null)
        {
            a = bundle.getBoolean("ImpressionOnResumeMixin.was_paused_for_rotation", false);
        }
    }

    public final void am_()
    {
        int i = a();
        boolean flag;
        if (i != c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        c = i;
    }

    public final void e(Bundle bundle)
    {
        if (a)
        {
            bundle.putBoolean("ImpressionOnResumeMixin.was_paused_for_rotation", true);
        }
    }
}
