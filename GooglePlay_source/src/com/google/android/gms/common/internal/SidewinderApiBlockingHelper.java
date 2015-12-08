// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.text.TextUtils;

public final class SidewinderApiBlockingHelper
{

    static boolean isServiceWhitelisted(String s, int i)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = s.split(",");
            int k = s.length;
            for (int j = 0; j < k; j++)
            {
                if (String.valueOf(i).equals(s[j]))
                {
                    return true;
                }
            }

        }
        return false;
    }
}
