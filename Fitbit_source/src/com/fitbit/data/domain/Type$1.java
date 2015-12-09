// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.Context;
import com.fitbit.runtrack.data.a;
import com.fitbit.runtrack.data.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.domain:
//            Type, b

static final class nit> extends Type
{

    public com.fitbit.data.domain.b getDetails(Context context, String s)
    {
        context = (new b()).a(UUID.fromString(s));
        if (context == null)
        {
            return null;
        } else
        {
            return new a(context);
        }
    }

    (String s, int i, String s1)
    {
        super(s, i, s1, null);
    }
}
