// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.fragment;

import android.content.Intent;

public class e
{

    Intent a;

    public e(Class class1)
    {
        a = (new Intent("com.facebook.fragment.FRAGMENT_ACTION")).setClassName(class1.getPackage().getName(), class1.getName());
    }

    public e a()
    {
        a.putExtra("com.facebook.fragment.PUSH_BACK_STACK", true);
        return this;
    }

    public e b()
    {
        a.putExtra("com.facebook.fragment.CLEAR_BACK_STACK", true);
        return this;
    }

    public Intent c()
    {
        return a;
    }
}
