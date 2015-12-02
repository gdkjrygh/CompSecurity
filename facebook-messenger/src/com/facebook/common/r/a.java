// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.r;

import android.content.Context;
import java.util.TimeZone;

// Referenced classes of package com.facebook.common.r:
//            e

public class a
    implements e
{

    private final Context a;
    private final com.facebook.common.time.a b;
    private final TimeZone c;

    public a(Context context, com.facebook.common.time.a a1)
    {
        this(context, a1, TimeZone.getDefault());
    }

    public a(Context context, com.facebook.common.time.a a1, TimeZone timezone)
    {
        a = context.getApplicationContext();
        b = a1;
        c = timezone;
    }
}
