// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;


// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

static class er.DragState
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.qihoo.security.adv..values().length];
        try
        {
            b[com.qihoo.security.adv..GameBoosterFolderAllLikeData.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.qihoo.security.adv..GameBoosterFolderHotAdvData.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.qihoo.security.gamebooster.draglist.ate.values().length];
        try
        {
            a[com.qihoo.security.gamebooster.draglist.ate.StartDrag.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.qihoo.security.gamebooster.draglist.ate.Delete.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.qihoo.security.gamebooster.draglist.ate.UnInstall.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
