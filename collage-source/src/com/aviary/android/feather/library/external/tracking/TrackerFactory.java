// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.external.tracking;

import android.content.Context;
import com.aviary.android.feather.common.b.a;

// Referenced classes of package com.aviary.android.feather.library.external.tracking:
//            a

public class TrackerFactory
{

    public TrackerFactory()
    {
    }

    public static a create(Context context, String s, String s1, String s2)
    {
        return new com.aviary.android.feather.library.external.tracking.a(context, s, s1, s2);
    }
}
