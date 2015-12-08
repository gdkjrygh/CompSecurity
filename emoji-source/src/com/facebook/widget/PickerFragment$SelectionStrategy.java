// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.Bundle;
import java.util.Collection;

// Referenced classes of package com.facebook.widget:
//            PickerFragment

abstract class this._cls0
{

    final PickerFragment this$0;

    abstract void clear();

    abstract Collection getSelectedIds();

    abstract boolean isEmpty();

    abstract boolean isSelected(String s);

    abstract void readSelectionFromBundle(Bundle bundle, String s);

    abstract void saveSelectionToBundle(Bundle bundle, String s);

    abstract boolean shouldShowCheckBoxIfUnselected();

    abstract void toggleSelection(String s);

    ()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
