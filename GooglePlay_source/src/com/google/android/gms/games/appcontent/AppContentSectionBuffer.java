// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionRef

public final class AppContentSectionBuffer extends EntityBuffer
{

    private final ArrayList mDataHolderCollection;

    public AppContentSectionBuffer(ArrayList arraylist)
    {
        super((DataHolder)arraylist.get(0));
        mDataHolderCollection = arraylist;
    }

    protected final String getChildDataMarkerColumn()
    {
        return "card_id";
    }

    protected final volatile Object getEntry(int i, int j)
    {
        return new AppContentSectionRef(mDataHolderCollection, i, j);
    }

    protected final String getPrimaryDataMarkerColumn()
    {
        return "section_id";
    }

    public final void release()
    {
        super.release();
        int i = 1;
        for (int j = mDataHolderCollection.size(); i < j; i++)
        {
            DataHolder dataholder = (DataHolder)mDataHolderCollection.get(i);
            if (dataholder != null)
            {
                dataholder.close();
            }
        }

    }
}
