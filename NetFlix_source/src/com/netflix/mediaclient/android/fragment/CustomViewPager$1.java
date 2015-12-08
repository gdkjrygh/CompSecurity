// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.fragment:
//            CustomViewPager

class this._cls0
    implements com.viewpagerindicator.android.osp.angeListener
{

    final CustomViewPager this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        Log.v("CustomViewPager", (new StringBuilder()).append("onPageSelected, position: ").append(i).toString());
        CustomViewPager.this.onPageSelected(i);
    }

    stener()
    {
        this$0 = CustomViewPager.this;
        super();
    }
}
