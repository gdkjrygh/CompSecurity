// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0
    implements android.view.nGlobalLayoutListener
{

    final LibraryFragment this$0;

    public void onGlobalLayout()
    {
        String s = LibraryFragment.access$100(LibraryFragment.this).getText().toString();
        int i = LibraryFragment.access$100(LibraryFragment.this).getCompoundDrawables()[0].getIntrinsicWidth();
        int j = LibraryFragment.access$100(LibraryFragment.this).getPaddingLeft();
        if (LibraryFragment.access$200(LibraryFragment.this, LibraryFragment.access$100(LibraryFragment.this), s, i, j))
        {
            LibraryFragment.access$100(LibraryFragment.this).setText(0x7f07061e);
        }
        LibraryFragment.access$100(LibraryFragment.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    ()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
