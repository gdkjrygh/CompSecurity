// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;


// Referenced classes of package com.auditude.ads.util:
//            AuditudeUtil, BrowserUtil

public static class _cls9
    implements _cls9
{

    public String getResult()
    {
        String s;
        try
        {
            s = BrowserUtil.getPageUrl();
        }
        catch (RuntimeException runtimeexception)
        {
            return "";
        }
        return s;
    }

    public _cls9()
    {
    }
}
