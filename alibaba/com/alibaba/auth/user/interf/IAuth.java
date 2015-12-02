// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.auth.user.interf;

import abj;
import abk;
import android.app.Activity;
import java.util.HashMap;

public interface IAuth
{

    public static final int TYPE_SNS_AUTH = 2;
    public static final int TYPE_SNS_LOGIN = 1;

    public abstract void snsAuth(Activity activity, int i, HashMap hashmap, Object obj, abj abj);

    public abstract void snsLogin(Activity activity, int i, HashMap hashmap, Object obj, abk abk);
}
