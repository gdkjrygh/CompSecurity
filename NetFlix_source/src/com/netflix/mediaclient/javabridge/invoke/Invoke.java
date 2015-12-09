// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke;

import com.netflix.mediaclient.javabridge.transport.Transport;

public interface Invoke
{

    public abstract void execute(Transport transport);

    public abstract String getArguments();

    public abstract String getMethod();

    public abstract String getObject();
}
