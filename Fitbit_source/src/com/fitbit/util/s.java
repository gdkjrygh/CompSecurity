// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.savedstate.d;
import org.apache.commons.validator.routines.EmailValidator;

public class s
{

    public s()
    {
    }

    public static boolean a(String s1)
    {
        return EmailValidator.a().a(s1);
    }

    public static boolean b(String s1)
    {
        String s2 = d.h();
        return EmailValidator.a().a(s1) && !s1.equals(s2);
    }
}
