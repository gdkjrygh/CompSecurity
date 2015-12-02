// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;


// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            c

static class fo.GroupType
{

    static final int a[];

    static 
    {
        a = new int[com.qihoo.security.malware.vo.ciousInfo.GroupType.values().length];
        try
        {
            a[com.qihoo.security.malware.vo.ciousInfo.GroupType.GROUP_TYPE_MALWARE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.qihoo.security.malware.vo.ciousInfo.GroupType.GROUP_TYPE_FLAW.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.qihoo.security.malware.vo.ciousInfo.GroupType.GROUP_TYPE_PROTECTION.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.qihoo.security.malware.vo.ciousInfo.GroupType.GROUP_TYPE_ADVERT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.qihoo.security.malware.vo.ciousInfo.GroupType.GROUP_TYPE_WARNING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
