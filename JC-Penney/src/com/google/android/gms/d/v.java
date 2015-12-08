// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import com.google.android.gms.common.internal.b;
import java.util.regex.Pattern;

public class v
{

    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String s)
    {
        return s == null || b.a.b(s);
    }

}
