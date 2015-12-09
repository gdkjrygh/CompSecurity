// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

final class anw
    implements anr
{

    anw()
    {
    }

    private static String a(String s)
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(s));
        s = CommonUtils.b(bufferedinputstream);
        CommonUtils.a(bufferedinputstream);
        return s;
        s;
        bufferedinputstream = null;
_L2:
        CommonUtils.a(bufferedinputstream);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(File file)
    {
        return a(file.getPath());
    }
}
