// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.support.v4.app.FragmentManager;
import android.widget.Filter;
import com.scannerfire.fragment.FragmentCronology;
import com.scannerfire.model.CustomListAdapter;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class this._cls0
    implements com.actionbarsherlock.widget.seListener
{

    final StartActivity this$0;

    public boolean onClose()
    {
        ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter("");
        return false;
    }

    apter()
    {
        this$0 = StartActivity.this;
        super();
    }
}
