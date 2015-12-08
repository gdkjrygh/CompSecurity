// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            ExtendedPlayer

public final class ExtendedPlayerEntity
    implements ExtendedPlayer
{

    private final PlayerEntity LH;
    private final String LI;
    private final long LJ;
    private final Uri LK;

    public ExtendedPlayerEntity(ExtendedPlayer extendedplayer)
    {
        Object obj = extendedplayer.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        LH = ((PlayerEntity) (obj));
        LI = extendedplayer.hu();
        LJ = extendedplayer.hv();
        LK = extendedplayer.hw();
    }

    static int a(ExtendedPlayer extendedplayer)
    {
        return fo.hashCode(new Object[] {
            extendedplayer.getPlayer(), extendedplayer.hu(), Long.valueOf(extendedplayer.hv()), extendedplayer.hw()
        });
    }

    static boolean a(ExtendedPlayer extendedplayer, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof ExtendedPlayer) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (extendedplayer == obj) goto _L4; else goto _L3
_L3:
        obj = (ExtendedPlayer)obj;
        if (!fo.equal(((ExtendedPlayer) (obj)).getPlayer(), extendedplayer.getPlayer()) || !fo.equal(((ExtendedPlayer) (obj)).hu(), extendedplayer.hu()) || !fo.equal(Long.valueOf(((ExtendedPlayer) (obj)).hv()), Long.valueOf(extendedplayer.hv())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((ExtendedPlayer) (obj)).hw(), extendedplayer.hw())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(ExtendedPlayer extendedplayer)
    {
        return fo.e(extendedplayer).a("Player", extendedplayer.getPlayer()).a("MostRecentGameId", extendedplayer.hu()).a("MostRecentActivityTimestamp", Long.valueOf(extendedplayer.hv())).a("MostRecentGameIconImageUri", extendedplayer.hw()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return hy();
    }

    public Player getPlayer()
    {
        return hx();
    }

    public int hashCode()
    {
        return a(this);
    }

    public String hu()
    {
        return LI;
    }

    public long hv()
    {
        return LJ;
    }

    public Uri hw()
    {
        return LK;
    }

    public PlayerEntity hx()
    {
        return LH;
    }

    public ExtendedPlayer hy()
    {
        return this;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }
}
