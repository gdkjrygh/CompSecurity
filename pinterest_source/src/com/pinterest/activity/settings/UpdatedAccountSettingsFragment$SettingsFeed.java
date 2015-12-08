// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import com.pinterest.api.model.Feed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

public class setItems extends Feed
{

    final UpdatedAccountSettingsFragment this$0;

    protected List getPersistedItems()
    {
        return null;
    }

    public Q(HashMap hashmap)
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
        setItems(new ArrayList(hashmap.values()));
    }
}
