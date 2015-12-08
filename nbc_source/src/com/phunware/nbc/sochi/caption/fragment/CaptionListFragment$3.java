// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.Set;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionListFragment

class this._cls0 extends AsyncQueryHandler
{

    final CaptionListFragment this$0;

    protected void onDeleteComplete(int i, Object obj, int j)
    {
        NBCSystem.debugLog("CaptionListFragment", "onDeleteComplete");
        CaptionListFragment.access$500(CaptionListFragment.this).clear();
    }

    (ContentResolver contentresolver)
    {
        this$0 = CaptionListFragment.this;
        super(contentresolver);
    }
}
