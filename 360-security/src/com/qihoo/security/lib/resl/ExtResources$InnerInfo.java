// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lib.resl;

import com.qihoo.security.lib.iresl.IInfo;

// Referenced classes of package com.qihoo.security.lib.resl:
//            ExtResources

private static class pn
    implements IInfo
{

    private String pi;
    private String pn;
    private int vc;
    private String vn;

    public String getPkgInfo()
    {
        return pi;
    }

    public String getPkgName()
    {
        return pn;
    }

    public int getVersionCode()
    {
        return vc;
    }

    public String getVersionName()
    {
        return vn;
    }

    public (int i, String s, String s1, String s2)
    {
        vc = i;
        vn = s;
        pi = s1;
        pn = s2;
    }
}
