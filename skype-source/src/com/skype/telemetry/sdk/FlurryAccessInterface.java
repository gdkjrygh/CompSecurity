// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry.sdk;

import android.content.Context;
import java.util.Map;

public interface FlurryAccessInterface
{

    public abstract void a(Context context);

    public abstract void a(String s, Map map, boolean flag);

    public abstract void b(Context context);

    public abstract void b(String s);

    public abstract void c(String s);
}
