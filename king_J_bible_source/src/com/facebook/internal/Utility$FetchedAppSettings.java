// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            Utility

public static class <init>
{

    private Map dialogConfigMap;
    private String nuxContent;
    private boolean nuxEnabled;
    private boolean supportsAttribution;
    private boolean supportsImplicitLogging;

    public Map getDialogConfigurations()
    {
        return dialogConfigMap;
    }

    public String getNuxContent()
    {
        return nuxContent;
    }

    public boolean getNuxEnabled()
    {
        return nuxEnabled;
    }

    public boolean supportsAttribution()
    {
        return supportsAttribution;
    }

    public boolean supportsImplicitLogging()
    {
        return supportsImplicitLogging;
    }

    private (boolean flag, boolean flag1, String s, boolean flag2, Map map)
    {
        supportsAttribution = flag;
        supportsImplicitLogging = flag1;
        nuxContent = s;
        nuxEnabled = flag2;
        dialogConfigMap = map;
    }

    dialogConfigMap(boolean flag, boolean flag1, String s, boolean flag2, Map map, dialogConfigMap dialogconfigmap)
    {
        this(flag, flag1, s, flag2, map);
    }
}
