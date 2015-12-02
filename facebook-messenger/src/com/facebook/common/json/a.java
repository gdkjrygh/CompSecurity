// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json;

import android.net.Uri;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;

// Referenced classes of package com.facebook.common.json:
//            b

public class a extends Module
{

    public a()
    {
    }

    public String getModuleName()
    {
        return "Android";
    }

    public void setupModule(com.fasterxml.jackson.databind.Module.SetupContext setupcontext)
    {
        SimpleDeserializers simpledeserializers = new SimpleDeserializers();
        simpledeserializers.addDeserializer(android/net/Uri, new b());
        setupcontext.addDeserializers(simpledeserializers);
    }

    public Version version()
    {
        return new Version(1, 0, 0, "", null, null);
    }
}
