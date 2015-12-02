// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class aj
    implements a
{

    public static final ae a = n.a("messenger_emoji_composer_android");
    private final d b;
    private final com.facebook.config.a.a c;

    public aj(d d1, com.facebook.config.a.a a1)
    {
        b = d1;
        c = a1;
    }

    public Boolean a()
    {
        return Boolean.valueOf(b.a(a, true));
    }

    public Object b()
    {
        return a();
    }

}
