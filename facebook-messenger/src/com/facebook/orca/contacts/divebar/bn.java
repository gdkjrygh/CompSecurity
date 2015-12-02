// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.abtest.qe.d.a;
import com.facebook.abtest.qe.d.e;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.debug.log.b;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            bo, bp

public class bn
{

    private static final Class a = com/facebook/orca/contacts/divebar/bn;
    private final a b;

    public bn(e e1)
    {
        b = ((e)Preconditions.checkNotNull(e1)).a("android_messenger_rich_presence", new bo(this));
    }

    private bp a(QuickExperimentInfo quickexperimentinfo)
    {
        return new bp(b(quickexperimentinfo), null);
    }

    static bp a(bn bn1, QuickExperimentInfo quickexperimentinfo)
    {
        return bn1.a(quickexperimentinfo);
    }

    private boolean a(Optional optional, boolean flag)
    {
        if (optional.isPresent())
        {
            return ((String)optional.get()).equals("1");
        } else
        {
            com.facebook.debug.log.b.b(a, "Experiment parameter not found! using the default value ...");
            return flag;
        }
    }

    private boolean b(QuickExperimentInfo quickexperimentinfo)
    {
        if (!quickexperimentinfo.c())
        {
            return false;
        } else
        {
            return a(quickexperimentinfo.a("text_context_presence"), false);
        }
    }

    public bp a()
    {
        return (bp)b.a();
    }

    public void b()
    {
        b.d();
    }

}
