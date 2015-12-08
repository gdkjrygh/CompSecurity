// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hk;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            GameRequestClusterCreator

public final class GameRequestCluster
    implements SafeParcelable, GameRequest
{

    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
    private final ArrayList Sm;
    private final int xM;

    GameRequestCluster(int i, ArrayList arraylist)
    {
        xM = i;
        Sm = arraylist;
        ii();
    }

    private void ii()
    {
        GameRequest gamerequest;
        int i;
        int j;
        boolean flag;
        if (!Sm.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gx.A(flag);
        gamerequest = (GameRequest)Sm.get(0);
        j = Sm.size();
        i = 1;
        while (i < j) 
        {
            GameRequest gamerequest1 = (GameRequest)Sm.get(i);
            if (gamerequest.getType() == gamerequest1.getType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gx.a(flag, "All the requests must be of the same type");
            gx.a(gamerequest.getSender().equals(gamerequest1.getSender()), "All the requests must be from the same sender");
            i++;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GameRequestCluster))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (GameRequestCluster)obj;
        if (((GameRequestCluster) (obj)).Sm.size() != Sm.size())
        {
            return false;
        }
        int j = Sm.size();
        for (int i = 0; i < j; i++)
        {
            if (!((GameRequest)Sm.get(i)).equals((GameRequest)((GameRequestCluster) (obj)).Sm.get(i)))
            {
                return false;
            }
        }

        return true;
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
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public byte[] getData()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getExpirationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getRecipientStatus(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public List getRecipients()
    {
        return ix();
    }

    public String getRequestId()
    {
        return ((GameRequestEntity)Sm.get(0)).getRequestId();
    }

    public Player getSender()
    {
        return ((GameRequestEntity)Sm.get(0)).getSender();
    }

    public int getStatus()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getType()
    {
        return ((GameRequestEntity)Sm.get(0)).getType();
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(Sm.toArray());
    }

    public boolean isConsumed(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean isDataValid()
    {
        return true;
    }

    public ArrayList iw()
    {
        return new ArrayList(Sm);
    }

    public ArrayList ix()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestClusterCreator.a(this, parcel, i);
    }

}
