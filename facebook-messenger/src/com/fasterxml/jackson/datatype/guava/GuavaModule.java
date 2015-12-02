// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

// Referenced classes of package com.fasterxml.jackson.datatype.guava:
//            GuavaDeserializers, GuavaSerializers, MultimapTypeModifier, ModuleVersion

public class GuavaModule extends Module
{

    private final String NAME = "GuavaModule";

    public GuavaModule()
    {
    }

    public String getModuleName()
    {
        return "GuavaModule";
    }

    public void setupModule(com.fasterxml.jackson.databind.Module.SetupContext setupcontext)
    {
        setupcontext.addDeserializers(new GuavaDeserializers());
        setupcontext.addSerializers(new GuavaSerializers());
        setupcontext.addTypeModifier(new MultimapTypeModifier());
    }

    public Version version()
    {
        return ModuleVersion.instance.version();
    }
}
