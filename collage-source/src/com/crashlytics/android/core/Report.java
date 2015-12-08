// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

interface Report
{

    public abstract Map getCustomHeaders();

    public abstract File getFile();

    public abstract String getFileName();

    public abstract String getIdentifier();

    public abstract boolean remove();
}
