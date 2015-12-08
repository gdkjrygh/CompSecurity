// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchInfoViewModel

static final class val.key
    implements Func1
{

    final String val$key;

    public amViewModel call(MatchInfoViewModel matchinfoviewmodel)
    {
        if (val$key.equals("H"))
        {
            return matchinfoviewmodel.getHome();
        } else
        {
            return matchinfoviewmodel.getAway();
        }
    }

    public volatile Object call(Object obj)
    {
        return call((MatchInfoViewModel)obj);
    }

    amViewModel(String s)
    {
        val$key = s;
        super();
    }
}
