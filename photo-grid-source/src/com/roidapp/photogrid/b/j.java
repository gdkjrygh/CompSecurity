// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import com.cm.kinfoc.s;
import com.roidapp.cloudlib.sns.f.b;

// Referenced classes of package com.roidapp.photogrid.b:
//            e

public final class j
    implements b
{

    public j()
    {
    }

    public final void a(String s1, int i)
    {
        s1 = String.format("page_name=%s&action_type=%s", new Object[] {
            s1, Integer.valueOf(i)
        });
        e.a();
        s.a().a("grid_social_activity", s1);
    }
}
