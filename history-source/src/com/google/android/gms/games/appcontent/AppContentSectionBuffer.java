// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionRef, AppContentSection

public final class AppContentSectionBuffer extends g
{

    private final ArrayList XX;

    protected Object f(int i, int j)
    {
        return h(i, j);
    }

    protected AppContentSection h(int i, int j)
    {
        return new AppContentSectionRef(XX, i, j);
    }

    protected String ha()
    {
        return "section_id";
    }

    protected String hc()
    {
        return "card_id";
    }

    public void release()
    {
        super.release();
        int j = XX.size();
        for (int i = 1; i < j; i++)
        {
            DataHolder dataholder = (DataHolder)XX.get(i);
            if (dataholder != null)
            {
                dataholder.close();
            }
        }

    }
}
