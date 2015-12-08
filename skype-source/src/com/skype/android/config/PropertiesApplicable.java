// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import java.util.Properties;

public interface PropertiesApplicable
{

    public abstract void applyFrom(Properties properties);

    public abstract void applyTo(Properties properties);
}
