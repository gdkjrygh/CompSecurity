// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.User;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

private static class a extends bf
{

    private final long a;

    protected User a()
    {
        return s.a(getContext()).b(a);
    }

    protected Object f_()
    {
        return a();
    }

    public (Context context, long l)
    {
        super(context);
        a = l;
    }
}
