// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPVersion;
import com.digby.mm.android.library.utils.Logger;
import java.io.IOException;
import java.util.Properties;

public class LPVersion
    implements ILPVersion
{

    private static int LPVERSION_MAJOR_VERSION;
    private static int LPVERSION_MINOR_VERSION;
    private static int LPVERSION_REVISION_VERSION;
    private static final LPVersion lpVersionInstance = new LPVersion();

    private LPVersion()
    {
        Properties properties = new Properties();
        try
        {
            properties.load(com/digby/localpoint/sdk/core/impl/LPVersion.getClassLoader().getResourceAsStream("library.properties"));
            String as[] = properties.getProperty("com.digby.localpoint.sdk.core.version").split("\\.|\\-");
            LPVERSION_MAJOR_VERSION = Integer.parseInt(as[0]);
            LPVERSION_MINOR_VERSION = Integer.parseInt(as[1]);
            LPVERSION_REVISION_VERSION = Integer.parseInt(as[2]);
            return;
        }
        catch (IOException ioexception)
        {
            Logger.Warn("Failed to read library.properties", ioexception);
        }
    }

    public static LPVersion getInstance()
    {
        return lpVersionInstance;
    }

    public int getMajorVersion()
    {
        return LPVERSION_MAJOR_VERSION;
    }

    public int getMinorVersion()
    {
        return LPVERSION_MINOR_VERSION;
    }

    public int getRevisionVersion()
    {
        return LPVERSION_REVISION_VERSION;
    }

    public String getValue()
    {
        return String.format("%d.%d.%d", new Object[] {
            Integer.valueOf(getMajorVersion()), Integer.valueOf(getMinorVersion()), Integer.valueOf(getRevisionVersion())
        });
    }

}
