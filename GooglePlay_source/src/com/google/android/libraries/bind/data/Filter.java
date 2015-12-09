// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import java.util.List;
import java.util.concurrent.Executor;

public interface Filter
{

    public abstract Executor executor();

    public abstract List transform$7ddb133f(List list);
}
