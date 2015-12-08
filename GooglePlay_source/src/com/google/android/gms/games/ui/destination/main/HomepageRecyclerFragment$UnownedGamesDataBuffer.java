// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.FilteredDataBuffer;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            HomepageRecyclerFragment

private final class mUnownedGamePositions extends FilteredDataBuffer
{

    private final ArrayList mUnownedGamePositions = new ArrayList();
    final HomepageRecyclerFragment this$0;

    protected final int computeRealPosition(int i)
    {
        return ((Integer)mUnownedGamePositions.get(i)).intValue();
    }

    public final int getCount()
    {
        return mUnownedGamePositions.size();
    }

    public (DataBuffer databuffer, int i)
    {
        this$0 = HomepageRecyclerFragment.this;
        super(databuffer);
        int k = 0;
        int j = 0;
        int i1 = databuffer.getCount();
        while (j < i1) 
        {
            homepagerecyclerfragment = (GameFirstParty)databuffer.get(j);
            int l;
            boolean flag;
            if (!isOwned() && !getGame().isInstanceInstalled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = k;
            if (flag)
            {
                mUnownedGamePositions.add(Integer.valueOf(j));
                l = k + 1;
                if (l == i)
                {
                    break;
                }
            }
            j++;
            k = l;
        }
    }
}
