// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import com.soundcloud.android.storage.provider.Content;

class 
{

    static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

    static 
    {
        $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
