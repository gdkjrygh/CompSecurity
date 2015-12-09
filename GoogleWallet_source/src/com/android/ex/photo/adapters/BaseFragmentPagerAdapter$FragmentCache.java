// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.LruCache;

// Referenced classes of package com.android.ex.photo.adapters:
//            BaseFragmentPagerAdapter

final class this._cls0 extends LruCache
{

    final BaseFragmentPagerAdapter this$0;

    private void entryRemoved(boolean flag, String s, Fragment fragment, Fragment fragment1)
    {
        if (flag || fragment1 != null && fragment != fragment1)
        {
            BaseFragmentPagerAdapter.access$000(BaseFragmentPagerAdapter.this).remove(fragment);
        }
    }

    protected final volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        entryRemoved(flag, (String)obj, (Fragment)obj1, (Fragment)obj2);
    }

    public (int i)
    {
        this$0 = BaseFragmentPagerAdapter.this;
        super(i);
    }
}
