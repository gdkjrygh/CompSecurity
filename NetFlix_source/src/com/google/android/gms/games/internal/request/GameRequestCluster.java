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
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fo;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            GameRequestClusterCreator

public final class GameRequestCluster
    implements SafeParcelable, GameRequest
{

    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
    private final ArrayList LM;
    private final int xH;

    GameRequestCluster(int i, ArrayList arraylist)
    {
        xH = i;
        LM = arraylist;
        hn();
    }

    private void hn()
    {
        GameRequest gamerequest;
        int i;
        int j;
        boolean flag;
        if (!LM.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fb.x(flag);
        gamerequest = (GameRequest)LM.get(0);
        j = LM.size();
        i = 1;
        while (i < j) 
        {
            GameRequest gamerequest1 = (GameRequest)LM.get(i);
            if (gamerequest.getType() == gamerequest1.getType())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fb.a(flag, "All the requests must be of the same type");
            fb.a(gamerequest.getSender().equals(gamerequest1.getSender()), "All the requests must be from the same sender");
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
        if (((GameRequestCluster) (obj)).LM.size() != LM.size())
        {
            return false;
        }
        int j = LM.size();
        for (int i = 0; i < j; i++)
        {
            if (!((GameRequest)LM.get(i)).equals((GameRequest)((GameRequestCluster) (obj)).LM.get(i)))
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
        return hA();
    }

    public String getRequestId()
    {
        return ((GameRequestEntity)LM.get(0)).getRequestId();
    }

    public Player getSender()
    {
        return ((GameRequestEntity)LM.get(0)).getSender();
    }

    public int getStatus()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getType()
    {
        return ((GameRequestEntity)LM.get(0)).getType();
    }

    public int getVersionCode()
    {
        return xH;
    }

    public ArrayList hA()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode()
    {
        return fo.hashCode(LM.toArray());
    }

    public ArrayList hz()
    {
        return new ArrayList(LM);
    }

    public boolean isConsumed(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestClusterCreator.a(this, parcel, i);
    }

}
