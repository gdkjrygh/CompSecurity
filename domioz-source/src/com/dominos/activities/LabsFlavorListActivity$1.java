// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.store.MenuManager;
import java.util.Comparator;

// Referenced classes of package com.dominos.activities:
//            LabsFlavorListActivity

class this._cls0
    implements Comparator
{

    final LabsFlavorListActivity this$0;

    public int compare(LabsVariant labsvariant, LabsVariant labsvariant1)
    {
        boolean flag = false;
        labsvariant = mMenuManager.getFlavor(labsvariant);
        labsvariant1 = mMenuManager.getFlavor(labsvariant1);
        int i = ((flag) ? 1 : 0);
        if (labsvariant != null)
        {
            i = ((flag) ? 1 : 0);
            if (labsvariant1 != null)
            {
                i = Integer.parseInt(labsvariant.getSortSeq()) - Integer.parseInt(labsvariant1.getSortSeq());
            }
        }
        return i;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((LabsVariant)obj, (LabsVariant)obj1);
    }

    ()
    {
        this$0 = LabsFlavorListActivity.this;
        super();
    }
}
