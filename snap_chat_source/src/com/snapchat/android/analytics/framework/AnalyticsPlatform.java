// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.app.Activity;
import java.util.Map;

public interface AnalyticsPlatform
{

    public abstract void a(Activity activity);

    public abstract void a(String s, Map map, Map map1, Map map2, Map map3);

    public abstract void b(Activity activity);
}
