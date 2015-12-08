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
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            GameRequestClusterCreator

public final class GameRequestCluster
    implements SafeParcelable, GameRequest
{

    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
    private final int CK;
    private final ArrayList adk;

    GameRequestCluster(int i, ArrayList arraylist)
    {
        CK = i;
        adk = arraylist;
        mp();
    }

    private void mp()
    {
        GameRequest gamerequest;
        int i;
        int j;
        boolean flag;
        if (!adk.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        je.K(flag);
        gamerequest = (GameRequest)adk.get(0);
        j = adk.size();
        i = 1;
        while (i < j) 
        {
            GameRequest gamerequest1 = (GameRequest)adk.get(i);
            if (gamerequest.getType() == gamerequest1.getType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            je.a(flag, "All the requests must be of the same type");
            je.a(gamerequest.getSender().equals(gamerequest1.getSender()), "All the requests must be from the same sender");
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
        if (((GameRequestCluster) (obj)).adk.size() != adk.size())
        {
            return false;
        }
        int j = adk.size();
        for (int i = 0; i < j; i++)
        {
            if (!((GameRequest)adk.get(i)).equals((GameRequest)((GameRequestCluster) (obj)).adk.get(i)))
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
        return mE();
    }

    public String getRequestId()
    {
        return ((GameRequestEntity)adk.get(0)).getRequestId();
    }

    public Player getSender()
    {
        return ((GameRequestEntity)adk.get(0)).getSender();
    }

    public int getStatus()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getType()
    {
        return ((GameRequestEntity)adk.get(0)).getType();
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(adk.toArray());
    }

    public boolean isConsumed(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean isDataValid()
    {
        return true;
    }

    public ArrayList mD()
    {
        return new ArrayList(adk);
    }

    public ArrayList mE()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestClusterCreator.a(this, parcel, i);
    }

}
