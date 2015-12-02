// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.net.Uri;
import com.facebook.h;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.orca.notify:
//            an

public class au
    implements an
{

    private final d a;

    public au(d d1)
    {
        a = d1;
    }

    public boolean a()
    {
        return a.a(n.q, true);
    }

    public boolean b()
    {
        return a.a(n.p, true);
    }

    public boolean c()
    {
        return a.a(n.r, true);
    }

    public Uri d()
    {
        String s = a.a(n.t, android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public int e()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return h.orca_notification_icon_ics;
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            return h.orca_notification_icon_gingerbread;
        } else
        {
            return h.orca_notification_icon_froyo;
        }
    }
}
