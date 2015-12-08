// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntityCreator

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    public static final GameRequestEntityCreator CREATOR = new GameRequestEntityCreator();
    private final int BR;
    private final int FD;
    private final int Fa;
    private final String XC;
    private final GameEntity aay;
    private final long abZ;
    private final byte acH[];
    private final PlayerEntity adc;
    private final ArrayList add;
    private final long ade;
    private final Bundle adf;

    GameRequestEntity(int i, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j, 
            long l, long l1, Bundle bundle, int k)
    {
        BR = i;
        aay = gameentity;
        adc = playerentity;
        acH = abyte0;
        XC = s;
        add = arraylist;
        FD = j;
        abZ = l;
        ade = l1;
        adf = bundle;
        Fa = k;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        BR = 2;
        aay = new GameEntity(gamerequest.getGame());
        adc = new PlayerEntity(gamerequest.getSender());
        XC = gamerequest.getRequestId();
        FD = gamerequest.getType();
        abZ = gamerequest.getCreationTimestamp();
        ade = gamerequest.getExpirationTimestamp();
        Fa = gamerequest.getStatus();
        Object obj = gamerequest.getData();
        int j;
        if (obj == null)
        {
            acH = null;
        } else
        {
            acH = new byte[obj.length];
            System.arraycopy(obj, 0, acH, 0, obj.length);
        }
        obj = gamerequest.getRecipients();
        j = ((List) (obj)).size();
        add = new ArrayList(j);
        adf = new Bundle();
        for (int i = 0; i < j; i++)
        {
            Player player = (Player)((Player)((List) (obj)).get(i)).freeze();
            String s = player.getPlayerId();
            add.add((PlayerEntity)player);
            adf.putInt(s, gamerequest.getRecipientStatus(s));
        }

    }

    static int a(GameRequest gamerequest)
    {
        return n.hashCode(new Object[] {
            gamerequest.getGame(), gamerequest.getRecipients(), gamerequest.getRequestId(), gamerequest.getSender(), b(gamerequest), Integer.valueOf(gamerequest.getType()), Long.valueOf(gamerequest.getCreationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp())
        });
    }

    static boolean a(GameRequest gamerequest, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof GameRequest) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (gamerequest == obj) goto _L4; else goto _L3
_L3:
        obj = (GameRequest)obj;
        if (!n.equal(((GameRequest) (obj)).getGame(), gamerequest.getGame()) || !n.equal(((GameRequest) (obj)).getRecipients(), gamerequest.getRecipients()) || !n.equal(((GameRequest) (obj)).getRequestId(), gamerequest.getRequestId()) || !n.equal(((GameRequest) (obj)).getSender(), gamerequest.getSender()) || !Arrays.equals(b(((GameRequest) (obj))), b(gamerequest)) || !n.equal(Integer.valueOf(((GameRequest) (obj)).getType()), Integer.valueOf(gamerequest.getType())) || !n.equal(Long.valueOf(((GameRequest) (obj)).getCreationTimestamp()), Long.valueOf(gamerequest.getCreationTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(Long.valueOf(((GameRequest) (obj)).getExpirationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    private static int[] b(GameRequest gamerequest)
    {
        List list = gamerequest.getRecipients();
        int j = list.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = gamerequest.getRecipientStatus(((Player)list.get(i)).getPlayerId());
        }

        return ai;
    }

    static String c(GameRequest gamerequest)
    {
        return n.h(gamerequest).a("Game", gamerequest.getGame()).a("Sender", gamerequest.getSender()).a("Recipients", gamerequest.getRecipients()).a("Data", gamerequest.getData()).a("RequestId", gamerequest.getRequestId()).a("Type", Integer.valueOf(gamerequest.getType())).a("CreationTimestamp", Long.valueOf(gamerequest.getCreationTimestamp())).a("ExpirationTimestamp", Long.valueOf(gamerequest.getExpirationTimestamp())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public GameRequest freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getCreationTimestamp()
    {
        return abZ;
    }

    public byte[] getData()
    {
        return acH;
    }

    public long getExpirationTimestamp()
    {
        return ade;
    }

    public Game getGame()
    {
        return aay;
    }

    public int getRecipientStatus(String s)
    {
        return adf.getInt(s, 0);
    }

    public List getRecipients()
    {
        return new ArrayList(add);
    }

    public String getRequestId()
    {
        return XC;
    }

    public Player getSender()
    {
        return adc;
    }

    public int getStatus()
    {
        return Fa;
    }

    public int getType()
    {
        return FD;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConsumed(String s)
    {
        return getRecipientStatus(s) == 1;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public Bundle lL()
    {
        return adf;
    }

    public String toString()
    {
        return c(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestEntityCreator.a(this, parcel, i);
    }

}
