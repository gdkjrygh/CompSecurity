// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
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

    public static final android.os.Parcelable.Creator CREATOR = new GameRequestEntityCreator();
    final long mCreationTimestamp;
    final byte mData[];
    final long mExpirationTimestamp;
    final GameEntity mGame;
    final Bundle mRecipientStatusMap;
    private final ArrayList mRecipients;
    public final String mRequestId;
    public final PlayerEntity mSender;
    final int mStatus;
    public final int mType;
    final int mVersionCode;

    GameRequestEntity(int i, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j, 
            long l, long l1, Bundle bundle, int k)
    {
        mVersionCode = i;
        mGame = gameentity;
        mSender = playerentity;
        mData = abyte0;
        mRequestId = s;
        mRecipients = arraylist;
        mType = j;
        mCreationTimestamp = l;
        mExpirationTimestamp = l1;
        mRecipientStatusMap = bundle;
        mStatus = k;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        mVersionCode = 2;
        mGame = new GameEntity(gamerequest.getGame());
        mSender = new PlayerEntity(gamerequest.getSender());
        mRequestId = gamerequest.getRequestId();
        mType = gamerequest.getType();
        mCreationTimestamp = gamerequest.getCreationTimestamp();
        mExpirationTimestamp = gamerequest.getExpirationTimestamp();
        mStatus = gamerequest.getStatus();
        Object obj = gamerequest.getData();
        int j;
        if (obj == null)
        {
            mData = null;
        } else
        {
            mData = new byte[obj.length];
            System.arraycopy(obj, 0, mData, 0, obj.length);
        }
        obj = gamerequest.getRecipients();
        j = ((List) (obj)).size();
        mRecipients = new ArrayList(j);
        mRecipientStatusMap = new Bundle();
        for (int i = 0; i < j; i++)
        {
            Player player = (Player)((Player)((List) (obj)).get(i)).freeze();
            String s = player.getPlayerId();
            mRecipients.add((PlayerEntity)player);
            mRecipientStatusMap.putInt(s, gamerequest.getRecipientStatus(s));
        }

    }

    static boolean equals(GameRequest gamerequest, Object obj)
    {
        if (obj instanceof GameRequest)
        {
            if (gamerequest == obj)
            {
                return true;
            }
            obj = (GameRequest)obj;
            if (Objects.equal(((GameRequest) (obj)).getGame(), gamerequest.getGame()) && Objects.equal(((GameRequest) (obj)).getRecipients(), gamerequest.getRecipients()) && Objects.equal(((GameRequest) (obj)).getRequestId(), gamerequest.getRequestId()) && Objects.equal(((GameRequest) (obj)).getSender(), gamerequest.getSender()) && Arrays.equals(getRecipientStatusArray(((GameRequest) (obj))), getRecipientStatusArray(gamerequest)) && Objects.equal(Integer.valueOf(((GameRequest) (obj)).getType()), Integer.valueOf(gamerequest.getType())) && Objects.equal(Long.valueOf(((GameRequest) (obj)).getCreationTimestamp()), Long.valueOf(gamerequest.getCreationTimestamp())) && Objects.equal(Long.valueOf(((GameRequest) (obj)).getExpirationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp())))
            {
                return true;
            }
        }
        return false;
    }

    private static int[] getRecipientStatusArray(GameRequest gamerequest)
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

    static int hashCode(GameRequest gamerequest)
    {
        return Arrays.hashCode(new Object[] {
            gamerequest.getGame(), gamerequest.getRecipients(), gamerequest.getRequestId(), gamerequest.getSender(), getRecipientStatusArray(gamerequest), Integer.valueOf(gamerequest.getType()), Long.valueOf(gamerequest.getCreationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp())
        });
    }

    static String toString(GameRequest gamerequest)
    {
        return Objects.toStringHelper(gamerequest).add("Game", gamerequest.getGame()).add("Sender", gamerequest.getSender()).add("Recipients", gamerequest.getRecipients()).add("Data", gamerequest.getData()).add("RequestId", gamerequest.getRequestId()).add("Type", Integer.valueOf(gamerequest.getType())).add("CreationTimestamp", Long.valueOf(gamerequest.getCreationTimestamp())).add("ExpirationTimestamp", Long.valueOf(gamerequest.getExpirationTimestamp())).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((GameRequest) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final long getCreationTimestamp()
    {
        return mCreationTimestamp;
    }

    public final byte[] getData()
    {
        return mData;
    }

    public final long getExpirationTimestamp()
    {
        return mExpirationTimestamp;
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final int getRecipientStatus(String s)
    {
        return mRecipientStatusMap.getInt(s, 0);
    }

    public final List getRecipients()
    {
        return new ArrayList(mRecipients);
    }

    public final String getRequestId()
    {
        return mRequestId;
    }

    public final Player getSender()
    {
        return mSender;
    }

    public final int getStatus()
    {
        return mStatus;
    }

    public final int getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return hashCode(((GameRequest) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((GameRequest) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GameRequestEntityCreator.writeToParcel(this, parcel, i);
    }

}
