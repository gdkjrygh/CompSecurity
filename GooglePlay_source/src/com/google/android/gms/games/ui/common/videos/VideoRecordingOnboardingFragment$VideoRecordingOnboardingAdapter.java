// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.videos;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui.common.videos:
//            VideoRecordingOnboardingFragment

private static final class mInflater extends PagerAdapter
{

    private static final PAGE_INFO_ARRAY PAGE_INFO_ARRAY[] = {
        new PAGE_INFO_ARRAY(0x7f020188, 0x7f1002f0, 0x7f1002ef), new PAGE_INFO_ARRAY(0x7f020189, 0x7f1002f2, 0x7f1002f1), new PAGE_INFO_ARRAY(0x7f02018a, 0x7f1002f4, 0x7f1002f3)
    };
    private final LayoutInflater mInflater;

    public final void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        return 3;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = mInflater.inflate(0x7f0400ef, null);
        mInflater minflater = PAGE_INFO_ARRAY[i];
        ((ImageView)view.findViewById(0x7f0d006f)).setImageResource(minflater.PAGE_INFO_ARRAY);
        ((TextView)view.findViewById(0x7f0d0075)).setText(minflater.PAGE_INFO_ARRAY);
        ((TextView)view.findViewById(0x7f0d009f)).setText(minflater.PAGE_INFO_ARRAY);
        viewgroup.addView(view);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }



    public (Context context)
    {
        mInflater = LayoutInflater.from(context);
    }
}
