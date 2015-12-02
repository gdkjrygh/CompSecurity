// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.google.common.base.Objects;

public class bl
{

    public final boolean a;
    public final boolean b;

    public bl(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("needToHitServer", Boolean.valueOf(a)).add("loadWasFromUserAction", Boolean.valueOf(b)).toString();
    }
}
