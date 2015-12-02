// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.b;

import com.mobvista.sdk.m.a.f.i;
import java.io.File;

public final class a
{

    public static boolean a(String s)
    {
        if (!i.a(s))
        {
            if ((s = new File(s)).exists() && s.isFile())
            {
                return true;
            }
        }
        return false;
    }
}
