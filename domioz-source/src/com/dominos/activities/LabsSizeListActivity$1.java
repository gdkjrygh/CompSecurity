// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.store.MenuManager;
import java.util.Comparator;

// Referenced classes of package com.dominos.activities:
//            LabsSizeListActivity

class this._cls0
    implements Comparator
{

    final LabsSizeListActivity this$0;

    public int compare(LabsVariant labsvariant, LabsVariant labsvariant1)
    {
        LabsSize labssize = mMenuManager.getSize(labsvariant);
        LabsSize labssize1 = mMenuManager.getSize(labsvariant1);
        int j = 0;
        int i = j;
        if (labssize != null)
        {
            i = j;
            if (labssize1 != null)
            {
                i = Integer.parseInt(labssize.getSortSeq()) - Integer.parseInt(labssize1.getSortSeq());
            }
        }
        j = i;
        if (i == 0)
        {
            labsvariant = mMenuManager.getFlavor(labsvariant);
            labsvariant1 = mMenuManager.getFlavor(labsvariant1);
            j = i;
            if (labsvariant != null)
            {
                j = i;
                if (labsvariant1 != null)
                {
                    j = Integer.parseInt(labsvariant.getSortSeq()) - Integer.parseInt(labsvariant1.getSortSeq());
                }
            }
        }
        return j;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((LabsVariant)obj, (LabsVariant)obj1);
    }

    t()
    {
        this$0 = LabsSizeListActivity.this;
        super();
    }
}
