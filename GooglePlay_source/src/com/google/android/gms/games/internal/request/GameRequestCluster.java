// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            GameRequestClusterCreator

public final class GameRequestCluster
    implements SafeParcelable, GameRequest
{

    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
    public final ArrayList mRequestList;
    final int mVersionCode;

    GameRequestCluster(int i, ArrayList arraylist)
    {
        mVersionCode = i;
        mRequestList = arraylist;
        verifyData();
    }

    public GameRequestCluster(ArrayList arraylist)
    {
        mVersionCode = 1;
        arraylist = FreezableUtils.freeze(arraylist);
        mRequestList = new ArrayList(arraylist.size());
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            mRequestList.add((GameRequestEntity)arraylist.get(i));
        }

        verifyData();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof GameRequestCluster) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (this == obj)
        {
            return true;
        }
        obj = (GameRequestCluster)obj;
        if (((GameRequestCluster) (obj)).mRequestList.size() == mRequestList.size())
        {
            int i = 0;
            int j = mRequestList.size();
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (!((GameRequest)mRequestList.get(i)).equals((GameRequest)((GameRequestCluster) (obj)).mRequestList.get(i)))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final long getCreationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final byte[] getData()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final long getExpirationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final Game getGame()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int getRecipientStatus(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final volatile List getRecipients()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final String getRequestId()
    {
        return ((GameRequestEntity)mRequestList.get(0)).mRequestId;
    }

    public final ArrayList getRequestList()
    {
        return new ArrayList(mRequestList);
    }

    public final Player getSender()
    {
        return ((GameRequestEntity)mRequestList.get(0)).mSender;
    }

    public final int getStatus()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int getType()
    {
        return ((GameRequestEntity)mRequestList.get(0)).mType;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(mRequestList.toArray());
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void verifyData()
    {
        GameRequest gamerequest;
        int i;
        int j;
        boolean flag;
        if (!mRequestList.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        gamerequest = (GameRequest)mRequestList.get(0);
        i = 1;
        j = mRequestList.size();
        while (i < j) 
        {
            GameRequest gamerequest1 = (GameRequest)mRequestList.get(i);
            if (gamerequest.getType() == gamerequest1.getType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "All the requests must be of the same type");
            Asserts.checkState(gamerequest.getSender().equals(gamerequest1.getSender()), "All the requests must be from the same sender");
            i++;
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GameRequestClusterCreator.writeToParcel$a8b6183(this, parcel);
    }

}
