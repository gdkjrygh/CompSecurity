// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.photos.permissions.runtime.RuntimePermissionsActivity;
import java.util.Iterator;
import java.util.Set;

final class gtb
    implements gst, omb, opv
{

    private static final int a;
    private gsu b;
    private mpk c;
    private gss d;
    private noz e;
    private mpj f;

    gtb(opd opd1)
    {
        f = new gtc(this);
        opd1.a(this);
    }

    static gsu a(gtb gtb1)
    {
        return gtb1.b;
    }

    static noz b(gtb gtb1)
    {
        return gtb1.e;
    }

    public final void a(Activity activity, Set set, gsu gsu1)
    {
        boolean flag;
        if (!set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (!d.a(activity, set))
        {
            if (e.a())
            {
                String s = String.valueOf(activity);
                (new StringBuilder(String.valueOf(s).length() + 24)).append("requestPermissions from ").append(s);
                noy.a("permissions", set);
            }
            b = gsu1;
            c.a(a, RuntimePermissionsActivity.a(activity, (String[])set.toArray(new String[set.size()])));
            return;
        } else
        {
            gsu1.a();
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mpk)olm1.a(mpk);
        c.a(a, f);
        d = (gss)olm1.a(gss);
        e = noz.a(context, 3, "PermissionsManager", new String[0]);
    }

    public final boolean a(Activity activity, Set set)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            String s = (String)set.next();
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 23)
            {
                flag = activity.shouldShowRequestPermissionRationale(s);
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }

        return false;
    }

    static 
    {
        a = b.tU;
    }
}
