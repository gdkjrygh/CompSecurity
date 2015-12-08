// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.text.TextUtils;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import rx.functions.Func1;

public class GameInfoViewModel
{

    private static final DateTimeFormatter formatter = DateTimeFormat.forPattern("E d MMM");
    int capacity;
    String date;
    String referee;
    String stadium;

    public GameInfoViewModel(String s, int i, String s1, String s2)
    {
        stadium = s;
        capacity = i;
        date = s1;
        referee = s2;
    }

    public static Func1 fromGameInfo()
    {
        return new Func1() {

            public GameInfoViewModel call(GameInfo gameinfo)
            {
                if (gameinfo == null)
                {
                    return null;
                } else
                {
                    return new GameInfoViewModel(TextUtils.join(", ", new String[] {
                        gameinfo.getVName(), gameinfo.getVCity()
                    }), Integer.parseInt(gameinfo.getVCap()), DateTime.parse(gameinfo.getGameStart()).toString(GameInfoViewModel.formatter), gameinfo.getRefName());
                }
            }

            public volatile Object call(Object obj)
            {
                return call((GameInfo)obj);
            }

        };
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getDate()
    {
        return date;
    }

    public String getReferee()
    {
        return referee;
    }

    public String getStadium()
    {
        return stadium;
    }


}
