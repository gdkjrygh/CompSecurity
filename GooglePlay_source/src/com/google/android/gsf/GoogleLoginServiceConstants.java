// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.Intent;

public final class GoogleLoginServiceConstants
{

    public static final Intent SERVICE_INTENT = (new Intent()).setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");

    public static String featureForService(String s)
    {
        return (new StringBuilder("service_")).append(s).toString();
    }

}
