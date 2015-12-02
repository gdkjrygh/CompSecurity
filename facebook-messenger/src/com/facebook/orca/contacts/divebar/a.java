// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.abtest.qe.d.e;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.debug.log.b;
import com.google.common.a.fi;
import com.google.common.a.kl;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Set;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            b, d, c

public class a
{

    private static final Class a = com/facebook/orca/contacts/divebar/a;
    private static final Set b = fi.d();
    private final com.facebook.abtest.qe.d.a c;

    public a(e e1)
    {
        c = ((e)Preconditions.checkNotNull(e1)).a("android_divebar_badging", new com.facebook.orca.contacts.divebar.b(this));
    }

    private long a(Optional optional, long l)
    {
        if (optional.isPresent())
        {
            return Long.decode((String)optional.get()).longValue();
        } else
        {
            com.facebook.debug.log.b.b(a, "Experiment parameter not found! using the default value ...");
            return l;
        }
    }

    static d a(a a1, QuickExperimentInfo quickexperimentinfo)
    {
        return a1.c(quickexperimentinfo);
    }

    private d c(QuickExperimentInfo quickexperimentinfo)
    {
        return new d(a(quickexperimentinfo), b(quickexperimentinfo), null);
    }

    public d a()
    {
        return (d)c.a();
    }

    public Set a(QuickExperimentInfo quickexperimentinfo)
    {
        if (!quickexperimentinfo.c())
        {
            return b;
        }
        quickexperimentinfo = (String)quickexperimentinfo.a("badge_type").get();
        if (quickexperimentinfo.equals("on_open_count"))
        {
            return kl.a(c.ON_OPEN_COUNT, new c[0]);
        }
        if (quickexperimentinfo.equals("on_open_and_transition_count"))
        {
            return c.ON_OPEN_AND_TRANSITION_COUNT;
        }
        if (quickexperimentinfo.equals("on_transition_count"))
        {
            return kl.a(c.ON_TRANSITION_COUNT, new c[0]);
        }
        if (quickexperimentinfo.equals("on_open_and_chat_head_roll"))
        {
            return c.ON_OPEN_COUNT_AND_CHAT_HEAD_ROLL;
        }
        if (quickexperimentinfo.equals("chathead_roll_favorites"))
        {
            return kl.a(c.CHAT_HEAD_ROLL, new c[0]);
        }
        if (quickexperimentinfo.equals("steady_state_count"))
        {
            return kl.a(c.STEADY_STATE_COUNT, new c[0]);
        }
        if (quickexperimentinfo.equals("steady_state_green_dot"))
        {
            return kl.a(c.STEADY_STATE_GREEN_DOT, new c[0]);
        }
        if (quickexperimentinfo.equals("give_me_everything"))
        {
            return c.ALL;
        } else
        {
            return b;
        }
    }

    public long b(QuickExperimentInfo quickexperimentinfo)
    {
        long l = 60000L;
        if (quickexperimentinfo.c())
        {
            l = a(quickexperimentinfo.a("transition_interval"), 60000L);
        }
        return l;
    }

    public void b()
    {
        c.d();
    }

}
