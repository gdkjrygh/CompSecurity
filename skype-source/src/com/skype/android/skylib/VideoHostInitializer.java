// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import android.content.Context;

public interface VideoHostInitializer
{

    public abstract void initLibs(Context context);

    public abstract void postInit(Context context);
}
