// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.presence;

import com.facebook.abtest.qe.d.a;
import com.facebook.abtest.qe.d.e;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.debug.log.b;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.presence:
//            g, e, f

public class d
{

    private static final Class a = com/facebook/orca/presence/d;
    private static final g b;
    private final a c;

    public d(e e1)
    {
        c = ((e)Preconditions.checkNotNull(e1)).a("messenger_mobile_presence_icon_master", new com.facebook.orca.presence.e(this));
    }

    private f a(QuickExperimentInfo quickexperimentinfo)
    {
        return new f(c(quickexperimentinfo), b(quickexperimentinfo), d(quickexperimentinfo), null);
    }

    static f a(d d1, QuickExperimentInfo quickexperimentinfo)
    {
        return d1.a(quickexperimentinfo);
    }

    private boolean a(Optional optional, boolean flag)
    {
        if (optional.isPresent())
        {
            return ((String)optional.get()).equals("1");
        } else
        {
            com.facebook.debug.log.b.e(a, "Experiment parameter not found! using the default value ...");
            return flag;
        }
    }

    private boolean b(QuickExperimentInfo quickexperimentinfo)
    {
        if (!quickexperimentinfo.c())
        {
            return true;
        } else
        {
            return a(quickexperimentinfo.a("show_time_stamp"), true);
        }
    }

    private g c(QuickExperimentInfo quickexperimentinfo)
    {
        if (!quickexperimentinfo.c())
        {
            return b;
        }
        quickexperimentinfo = quickexperimentinfo.a("mobile_icon");
        if (quickexperimentinfo.isPresent())
        {
            return g.fromName((String)quickexperimentinfo.get());
        } else
        {
            return g.NOT_SPECIFIED;
        }
    }

    private boolean d(QuickExperimentInfo quickexperimentinfo)
    {
        if (!quickexperimentinfo.c())
        {
            return false;
        } else
        {
            return a(quickexperimentinfo.a("fading_icon"), false);
        }
    }

    public f a()
    {
        return (f)c.a();
    }

    public void b()
    {
        c.d();
    }

    static 
    {
        b = g.WHITE_PHONE;
    }
}
