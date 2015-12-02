// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import com.qihoo.security.clearengine.TrashType;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            f

static class 
{

    static final int a[];

    static 
    {
        a = new int[TrashType.values().length];
        try
        {
            a[TrashType.CATE_SYSTEM.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[TrashType.CATE_APP_SYSTEM_CACHE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[TrashType.CATE_ADPLUGIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[TrashType.CATE_APK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[TrashType.CATE_CACHE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[TrashType.CATE_UNINSTALLED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[TrashType.CATE_BIGFILE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
