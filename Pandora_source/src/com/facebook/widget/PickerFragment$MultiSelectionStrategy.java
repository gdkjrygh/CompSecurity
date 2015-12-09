// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.widget:
//            PickerFragment

class selectedIds extends selectedIds
{

    private Set selectedIds;
    final PickerFragment this$0;

    public void clear()
    {
        selectedIds.clear();
    }

    public Collection getSelectedIds()
    {
        return selectedIds;
    }

    boolean isEmpty()
    {
        return selectedIds.isEmpty();
    }

    boolean isSelected(String s)
    {
        return s != null && selectedIds.contains(s);
    }

    void readSelectionFromBundle(Bundle bundle, String s)
    {
        if (bundle != null)
        {
            bundle = bundle.getString(s);
            if (bundle != null)
            {
                bundle = TextUtils.split(bundle, ",");
                selectedIds.clear();
                Collections.addAll(selectedIds, bundle);
            }
        }
    }

    void saveSelectionToBundle(Bundle bundle, String s)
    {
        if (!selectedIds.isEmpty())
        {
            bundle.putString(s, TextUtils.join(",", selectedIds));
        }
    }

    boolean shouldShowCheckBoxIfUnselected()
    {
        return true;
    }

    void toggleSelection(String s)
    {
label0:
        {
            if (s != null)
            {
                if (!selectedIds.contains(s))
                {
                    break label0;
                }
                selectedIds.remove(s);
            }
            return;
        }
        selectedIds.add(s);
    }

    ()
    {
        this$0 = PickerFragment.this;
        super(PickerFragment.this);
        selectedIds = new HashSet();
    }
}
