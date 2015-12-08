// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntityCreator

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    public static final GameRequestEntityCreator CREATOR = new GameRequestEntityCreator();
    private final int CK;
    private final int FP;
    private final int Gt;
    private final String Zt;
    private final GameEntity acs;
    private final long adS;
    private final byte aeA[];
    private final PlayerEntity aeU;
    private final ArrayList aeV;
    private final long aeW;
    private final Bundle aeX;

    GameRequestEntity(int i, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j, 
            long l, long l1, Bundle bundle, int k)
    {
        CK = i;
        acs = gameentity;
        aeU = playerentity;
        aeA = abyte0;
        Zt = s;
        aeV = arraylist;
        Gt = j;
        adS = l;
        aeW = l1;
        aeX = bundle;
        FP = k;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        CK = 2;
        acs = new GameEntity(gamerequest.getGame());
        aeU = new PlayerEntity(gamerequest.getSender());
        Zt = gamerequest.getRequestId();
        Gt = gamerequest.getType();
        adS = gamerequest.getCreationTimestamp();
        aeW = gamerequest.getExpirationTimestamp();
        FP = gamerequest.getStatus();
        Object obj = gamerequest.getData();
        int j;
        if (obj == null)
        {
            aeA = null;
        } else
        {
            aeA = new byte[obj.length];
            System.arraycopy(obj, 0, aeA, 0, obj.length);
        }
        obj = gamerequest.getRecipients();
        j = ((List) (obj)).size();
        aeV = new ArrayList(j);
        aeX = new Bundle();
        for (int i = 0; i < j; i++)
        {
            Player player = (Player)((Player)((List) (obj)).get(i)).freeze();
            String s = player.getPlayerId();
            aeV.add((PlayerEntity)player);
            aeX.putInt(s, gamerequest.getRecipientStatus(s));
        }

    }

    static int a(GameRequest gamerequest)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(((GameRequest) (obj)).getGame(), gamerequest.getGame()) || !jv.equal(((GameRequest) (obj)).getRecipients(), gamerequest.getRecipients()) || !jv.equal(((GameRequest) (obj)).getRequestId(), gamerequest.getRequestId()) || !jv.equal(((GameRequest) (obj)).getSender(), gamerequest.getSender()) || !Arrays.equals(b(((GameRequest) (obj))), b(gamerequest)) || !jv.equal(Integer.valueOf(((GameRequest) (obj)).getType()), Integer.valueOf(gamerequest.getType())) || !jv.equal(Long.valueOf(((GameRequest) (obj)).getCreationTimestamp()), Long.valueOf(gamerequest.getCreationTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Long.valueOf(((GameRequest) (obj)).getExpirationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp()))) goto _L4; else goto _L5
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
        return jv.h(gamerequest).a("Game", gamerequest.getGame()).a("Sender", gamerequest.getSender()).a("Recipients", gamerequest.getRecipients()).a("Data", gamerequest.getData()).a("RequestId", gamerequest.getRequestId()).a("Type", Integer.valueOf(gamerequest.getType())).a("CreationTimestamp", Long.valueOf(gamerequest.getCreationTimestamp())).a("ExpirationTimestamp", Long.valueOf(gamerequest.getExpirationTimestamp())).toString();
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
        return adS;
    }

    public byte[] getData()
    {
        return aeA;
    }

    public long getExpirationTimestamp()
    {
        return aeW;
    }

    public Game getGame()
    {
        return acs;
    }

    public int getRecipientStatus(String s)
    {
        return aeX.getInt(s, 0);
    }

    public List getRecipients()
    {
        return new ArrayList(aeV);
    }

    public String getRequestId()
    {
        return Zt;
    }

    public Player getSender()
    {
        return aeU;
    }

    public int getStatus()
    {
        return FP;
    }

    public int getType()
    {
        return Gt;
    }

    public int getVersionCode()
    {
        return CK;
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

    public Bundle mS()
    {
        return aeX;
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
