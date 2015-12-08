// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.activity.library.model.LibraryFeed;
import com.pinterest.activity.library.view.LibrarySectionView;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class <init> extends BaseApiResponseHandler
{

    final LibraryFragment this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        pinterestjsonobject = new LibraryFeed(pinterestjsonobject, "", "pins");
        if (pinterestjsonobject.getCode() != 0)
        {
            return;
        }
        LibraryFragment.access$2602(LibraryFragment.this, (LibrarySection)pinterestjsonobject.get(0));
        if (LibraryFragment.access$2700(LibraryFragment.this))
        {
            LibraryFragment.access$2102(LibraryFragment.this, LibrarySectionView.get(LibraryFragment.access$2100(LibraryFragment.this), LibraryFragment.access$2800(LibraryFragment.this)));
            LibraryFragment.access$2100(LibraryFragment.this).configure(LibraryFragment.access$2600(LibraryFragment.this), LibraryFragment.access$300(LibraryFragment.this), 1);
        }
        LibraryFragment.access$2400(LibraryFragment.this);
    }

    private ()
    {
        this$0 = LibraryFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
