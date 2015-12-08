// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.cmcm.adsdk:
//            b

public final class a extends b
{

    public static void a(Context context, String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("ID cannot be null or empty");
        } else
        {
            b(context, s, s1);
            a(context, s);
            return;
        }
    }
}
