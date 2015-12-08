// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import android.text.TextUtils;
import ctz;

public final class mResourceId extends Enum
{

    private static b a;
    private static b b;
    private static final b c[];
    final int mResourceId;
    public final String mValue;

    static int a(mResourceId mresourceid)
    {
        return mresourceid.mResourceId;
    }

    public static mResourceId valueOf(String s)
    {
        return (mResourceId)Enum.valueOf(com/spotify/mobile/android/service/flow/login/GenderSelectionHelper$Gender, s);
    }

    public static mResourceId[] values()
    {
        return (mResourceId[])c.clone();
    }

    static 
    {
        a = new <init>("MALE", 0, "male", 0x7f08017f);
        b = new <init>("FEMALE", 1, "female", 0x7f08017d);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        boolean flag;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Gender value must not be empty");
        mValue = s1;
        mResourceId = j;
    }
}
