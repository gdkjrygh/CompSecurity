// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.support.v4.app.FragmentManager;
import android.widget.Filter;
import com.scannerfire.fragment.FragmentCronology;
import com.scannerfire.model.CustomListAdapter;
import com.scannerfire.utils.Utils;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class this._cls0
    implements com.actionbarsherlock.widget.ryTextListener
{

    final StartActivity this$0;

    public boolean onQueryTextChange(String s)
    {
        Utils.setLastElem(-1);
        ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter(s);
        return true;
    }

    public boolean onQueryTextSubmit(String s)
    {
        Utils.setLastElem(-1);
        ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).getAdapter().getFilter().filter(s);
        return true;
    }

    apter()
    {
        this$0 = StartActivity.this;
        super();
    }
}
