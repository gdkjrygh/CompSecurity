// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.data.bl.an;

// Referenced classes of package com.fitbit.util:
//            c

static final class <init> extends <init>
{

    public void a(Context context)
    {
        com.fitbit.data.domain.Profile profile = an.a().c();
        c.b(profile);
        if (c.b(profile))
        {
            an.a().a(profile, context);
        }
    }

    public void b(Object obj)
    {
        a((Context)obj);
    }

    ext(Context context)
    {
        super(context);
    }
}
