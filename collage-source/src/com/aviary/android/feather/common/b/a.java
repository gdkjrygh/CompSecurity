// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.b;

import android.content.Context;
import java.util.HashMap;

public abstract class a
{

    protected String a;
    protected String b;
    protected String c;
    protected String d;

    public a(Context context, String s, String s1, String s2)
    {
        a = "com.aviary.feather";
        b = "com.aviary.feather";
        d = "d2703c903";
        b = s;
        a = s;
        d = s1;
        c = s2;
    }

    public abstract void a();

    public abstract void a(String s, String s1);

    public abstract boolean a(String s, HashMap hashmap);

    public abstract void b();

    public abstract boolean c();
}
