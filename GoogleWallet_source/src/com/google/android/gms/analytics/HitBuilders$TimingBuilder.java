// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            HitBuilders, w

public static final class setCategory extends setCategory
{

    private setCategory setCategory(String s)
    {
        set("&utc", s);
        return this;
    }

    private set setValue(long l)
    {
        set("&utt", Long.toString(l));
        return this;
    }

    private set setVariable(String s)
    {
        set("&utv", s);
        return this;
    }

    public final volatile Map build()
    {
        return super.ld();
    }

    public ()
    {
        w.eF().a();
        set("&t", "timing");
    }

    public set(String s, String s1, long l)
    {
        this();
        setVariable(s1);
        setValue(l);
        setCategory(s);
    }
}
