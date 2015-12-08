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
import com.google.android.gms.internal.hk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntityCreator

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    public static final GameRequestEntityCreator CREATOR = new GameRequestEntityCreator();
    private final int AT;
    private final String OB;
    private final GameEntity Rt;
    private final long SU;
    private final byte TF[];
    private final int Tb;
    private final PlayerEntity Ua;
    private final ArrayList Ub;
    private final long Uc;
    private final Bundle Ud;
    private final int xM;

    GameRequestEntity(int i, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j, 
            long l, long l1, Bundle bundle, int k)
    {
        xM = i;
        Rt = gameentity;
        Ua = playerentity;
        TF = abyte0;
        OB = s;
        Ub = arraylist;
        AT = j;
        SU = l;
        Uc = l1;
        Ud = bundle;
        Tb = k;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        xM = 2;
        Rt = new GameEntity(gamerequest.getGame());
        Ua = new PlayerEntity(gamerequest.getSender());
        OB = gamerequest.getRequestId();
        AT = gamerequest.getType();
        SU = gamerequest.getCreationTimestamp();
        Uc = gamerequest.getExpirationTimestamp();
        Tb = gamerequest.getStatus();
        Object obj = gamerequest.getData();
        int j;
        if (obj == null)
        {
            TF = null;
        } else
        {
            TF = new byte[obj.length];
            System.arraycopy(obj, 0, TF, 0, obj.length);
        }
        obj = gamerequest.getRecipients();
        j = ((List) (obj)).size();
        Ub = new ArrayList(j);
        Ud = new Bundle();
        for (int i = 0; i < j; i++)
        {
            Player player = (Player)((Player)((List) (obj)).get(i)).freeze();
            String s = player.getPlayerId();
            Ub.add((PlayerEntity)player);
            Ud.putInt(s, gamerequest.getRecipientStatus(s));
        }

    }

    static int a(GameRequest gamerequest)
    {
        return hk.hashCode(new Object[] {
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
        if (!hk.equal(((GameRequest) (obj)).getGame(), gamerequest.getGame()) || !hk.equal(((GameRequest) (obj)).getRecipients(), gamerequest.getRecipients()) || !hk.equal(((GameRequest) (obj)).getRequestId(), gamerequest.getRequestId()) || !hk.equal(((GameRequest) (obj)).getSender(), gamerequest.getSender()) || !Arrays.equals(b(((GameRequest) (obj))), b(gamerequest)) || !hk.equal(Integer.valueOf(((GameRequest) (obj)).getType()), Integer.valueOf(gamerequest.getType())) || !hk.equal(Long.valueOf(((GameRequest) (obj)).getCreationTimestamp()), Long.valueOf(gamerequest.getCreationTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Long.valueOf(((GameRequest) (obj)).getExpirationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp()))) goto _L4; else goto _L5
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
        return hk.e(gamerequest).a("Game", gamerequest.getGame()).a("Sender", gamerequest.getSender()).a("Recipients", gamerequest.getRecipients()).a("Data", gamerequest.getData()).a("RequestId", gamerequest.getRequestId()).a("Type", Integer.valueOf(gamerequest.getType())).a("CreationTimestamp", Long.valueOf(gamerequest.getCreationTimestamp())).a("ExpirationTimestamp", Long.valueOf(gamerequest.getExpirationTimestamp())).toString();
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
        return SU;
    }

    public byte[] getData()
    {
        return TF;
    }

    public long getExpirationTimestamp()
    {
        return Uc;
    }

    public Game getGame()
    {
        return Rt;
    }

    public int getRecipientStatus(String s)
    {
        return Ud.getInt(s, 0);
    }

    public List getRecipients()
    {
        return new ArrayList(Ub);
    }

    public String getRequestId()
    {
        return OB;
    }

    public Player getSender()
    {
        return Ua;
    }

    public int getStatus()
    {
        return Tb;
    }

    public int getType()
    {
        return AT;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public Bundle iL()
    {
        return Ud;
    }

    public boolean isConsumed(String s)
    {
        return getRecipientStatus(s) == 1;
    }

    public boolean isDataValid()
    {
        return true;
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
