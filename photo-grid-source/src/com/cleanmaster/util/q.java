// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.content.Context;
import android.content.res.Resources;
import com.cleanmaster.common.a;
import com.picksinit.PicksMob;
import com.picksinit.b;

public class q
{

    public static int a(String s)
    {
        return PicksMob.getInstance().getContext().getResources().getIdentifier(s, "string", com.cleanmaster.common.a.c());
    }
}
