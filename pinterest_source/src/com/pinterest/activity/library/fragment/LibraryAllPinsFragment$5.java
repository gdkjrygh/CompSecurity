// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryAllPinsFragment

class val.smoothScroll
    implements Runnable
{

    final LibraryAllPinsFragment this$0;
    final boolean val$smoothScroll;

    public void run()
    {
        int i;
        if (LibraryAllPinsFragment.access$600(LibraryAllPinsFragment.this) == -1)
        {
            i = 0;
        } else
        {
            i = LibraryAllPinsFragment.access$600(LibraryAllPinsFragment.this);
        }
        if (val$smoothScroll)
        {
            LibraryAllPinsFragment.access$200(LibraryAllPinsFragment.this).smoothScrollToPositionFromOffset(i, 0, 700);
            return;
        } else
        {
            LibraryAllPinsFragment.access$200(LibraryAllPinsFragment.this).setSelection(i);
            return;
        }
    }

    ()
    {
        this$0 = final_libraryallpinsfragment;
        val$smoothScroll = Z.this;
        super();
    }
}
