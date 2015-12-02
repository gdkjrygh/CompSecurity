// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.orca.threadlist.FrameworkBasedThreadListActivity;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.reflex:
//            ReflexBasedThreadListActivity

public class j
    implements a
{

    private final Context a;
    private final a b;

    public j(Context context, a a1)
    {
        a = context;
        b = a1;
    }

    public ComponentName a()
    {
        if (((Boolean)b.b()).booleanValue())
        {
            return new ComponentName(a, com/facebook/orca/reflex/ReflexBasedThreadListActivity);
        } else
        {
            return new ComponentName(a, com/facebook/orca/threadlist/FrameworkBasedThreadListActivity);
        }
    }

    public Object b()
    {
        return a();
    }
}
