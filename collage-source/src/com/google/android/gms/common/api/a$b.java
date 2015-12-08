// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            a

public static abstract class .i
{

    public int a()
    {
        return 0x7fffffff;
    }

    public abstract .i a(Context context, Looper looper, i i, Object obj, .i j, .i k);

    public List a(Object obj)
    {
        return Collections.emptyList();
    }

    public .i()
    {
    }
}
