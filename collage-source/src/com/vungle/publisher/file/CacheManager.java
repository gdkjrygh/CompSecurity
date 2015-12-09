// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.file;

import com.vungle.log.Logger;
import com.vungle.publisher.cc;
import java.io.File;
import javax.inject.Provider;

public class CacheManager
{

    public Provider a;
    public Provider b;

    CacheManager()
    {
    }

    public static void a(String s)
    {
        if ((new File(s)).exists())
        {
            cc.a(s);
            return;
        }
        try
        {
            Logger.v("VungleFile", (new StringBuilder("ad temp directory does not exist ")).append(s).toString());
            return;
        }
        catch (Exception exception)
        {
            Logger.d("VungleFile", (new StringBuilder("error deleting ad temp directory ")).append(s).toString());
        }
        return;
    }
}
