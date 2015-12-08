// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemView

public class PlayerCardAdapter extends PagerAdapter
{

    private final LayoutInflater inflater;
    private List players;

    public PlayerCardAdapter(Context context)
    {
        players = new ArrayList();
        inflater = LayoutInflater.from(context);
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return players.size();
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        PlayerItemView playeritemview = (PlayerItemView)inflater.inflate(0x7f040084, viewgroup, false);
        playeritemview.setPlayer((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)players.get(i));
        viewgroup.addView(playeritemview);
        return playeritemview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return obj == view;
    }

    public void update(List list)
    {
        if (players.isEmpty())
        {
            players.addAll(list);
            notifyDataSetChanged();
        } else
        if (!players.equals(list))
        {
            int i = 0;
            while (i < list.size()) 
            {
                com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player = (com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)list.get(i);
                if (!player.equals((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)players.get(i)))
                {
                    players.set(i, player);
                }
                i++;
            }
            notifyDataSetChanged();
            return;
        }
    }
}
