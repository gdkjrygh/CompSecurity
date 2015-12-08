// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.shoprunner;

import org.androidannotations.api.b.a;
import org.androidannotations.api.b.b;
import org.androidannotations.api.b.c;

public interface ShopRunnerRestInterface
    extends a, b, c
{

    public abstract String validateMemberToken(String s);

    public abstract String validateToken(String s);
}
