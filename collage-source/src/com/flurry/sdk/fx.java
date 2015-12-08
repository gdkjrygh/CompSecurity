// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            fz

public abstract class fx
{

    protected String f;

    public fx(String s)
    {
        f = "com.flurry.android.sdk.ReplaceMeWithAProperEventName";
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Event must have a name!");
        } else
        {
            f = s;
            return;
        }
    }

    public String a()
    {
        return f;
    }

    public void b()
    {
        fz.a().a(this);
    }
}
