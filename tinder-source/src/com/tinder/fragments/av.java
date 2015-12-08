// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.a.b;
import com.tinder.model.Message;

// Referenced classes of package com.tinder.fragments:
//            aj

final class av
    implements b
{

    private final aj._cls12._cls1 a;

    av(aj._cls12._cls1 _pcls1)
    {
        a = _pcls1;
    }

    public final boolean test(Object obj)
    {
        aj._cls12._cls1 _lcls1 = a;
        return ((Message)obj).getText().toLowerCase().contains(aj.e(_lcls1.a.c));
    }
}
