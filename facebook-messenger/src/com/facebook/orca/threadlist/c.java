// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.abtest.qe.d.a;
import com.facebook.abtest.qe.d.e;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.threadlist:
//            d, e

public class c
{

    private static final Class a = com/facebook/orca/threadlist/c;
    private final a b;

    public c(e e1)
    {
        b = ((e)Preconditions.checkNotNull(e1)).a("android_messenger_context_menu_entry_point", new d(this));
    }

    private com.facebook.orca.threadlist.e a(QuickExperimentInfo quickexperimentinfo)
    {
        if (!quickexperimentinfo.c())
        {
            return new com.facebook.orca.threadlist.e(null, null, null, null);
        }
        Object obj = quickexperimentinfo.a("message");
        Object obj1;
        if (((Optional) (obj)).isPresent())
        {
            obj = (String)((Optional) (obj)).get();
        } else
        {
            obj = null;
        }
        obj1 = quickexperimentinfo.a("group");
        if (((Optional) (obj1)).isPresent())
        {
            obj1 = (String)((Optional) (obj1)).get();
        } else
        {
            obj1 = null;
        }
        quickexperimentinfo = quickexperimentinfo.a("broadcast");
        if (quickexperimentinfo.isPresent())
        {
            quickexperimentinfo = (String)quickexperimentinfo.get();
        } else
        {
            quickexperimentinfo = null;
        }
        return new com.facebook.orca.threadlist.e(((String) (obj)), ((String) (obj1)), quickexperimentinfo, null);
    }

    static com.facebook.orca.threadlist.e a(c c1, QuickExperimentInfo quickexperimentinfo)
    {
        return c1.a(quickexperimentinfo);
    }

    public com.facebook.orca.threadlist.e a()
    {
        return (com.facebook.orca.threadlist.e)b.a();
    }

    public void b()
    {
        b.d();
    }

}
