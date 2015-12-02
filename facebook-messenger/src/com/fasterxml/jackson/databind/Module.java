// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;

public abstract class Module
    implements Versioned
{

    public Module()
    {
    }

    public abstract String getModuleName();

    public abstract void setupModule(SetupContext setupcontext);

    public abstract Version version();
}
