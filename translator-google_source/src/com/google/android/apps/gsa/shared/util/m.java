// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class m
{

    public static final int a;
    public static final boolean b;
    public static final Charset c = Charset.forName("UTF-8");

    public static List a(List list)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        return ((List) (obj));
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        a = i;
        boolean flag;
        if (i >= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
