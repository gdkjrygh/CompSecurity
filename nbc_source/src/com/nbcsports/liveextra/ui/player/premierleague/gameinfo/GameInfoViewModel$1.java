// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.text.TextUtils;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import org.joda.time.DateTime;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            GameInfoViewModel

static final class 
    implements Func1
{

    public GameInfoViewModel call(GameInfo gameinfo)
    {
        if (gameinfo == null)
        {
            return null;
        } else
        {
            return new GameInfoViewModel(TextUtils.join(", ", new String[] {
                gameinfo.getVName(), gameinfo.getVCity()
            }), Integer.parseInt(gameinfo.getVCap()), DateTime.parse(gameinfo.getGameStart()).toString(GameInfoViewModel.access$000()), gameinfo.getRefName());
        }
    }

    public volatile Object call(Object obj)
    {
        return call((GameInfo)obj);
    }

    ()
    {
    }
}
