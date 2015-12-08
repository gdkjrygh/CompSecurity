// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.servicemgr.VideoType;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsDetailsActivity

static class 
{

    static final int $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType = new int[VideoType.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[VideoType.MOVIE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[VideoType.SHOW.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[VideoType.CHARACTERS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
