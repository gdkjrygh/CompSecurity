// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;


// Referenced classes of package com.addlive.view:
//            VideoRenderer, VideoViewType

static class 
{

    static final int $SwitchMap$com$addlive$view$VideoViewType[];

    static 
    {
        $SwitchMap$com$addlive$view$VideoViewType = new int[VideoViewType.values().length];
        try
        {
            $SwitchMap$com$addlive$view$VideoViewType[VideoViewType.RECTANGLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$addlive$view$VideoViewType[VideoViewType.CIRCLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
