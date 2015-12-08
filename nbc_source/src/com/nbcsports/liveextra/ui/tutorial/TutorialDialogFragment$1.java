// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.tutorial;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

// Referenced classes of package com.nbcsports.liveextra.ui.tutorial:
//            TutorialDialogFragment

class this._cls0 extends PagerAdapter
{

    final int imageIds[] = {
        0x7f02003c, 0x7f02003d, 0x7f02003e
    };
    final TutorialDialogFragment this$0;

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return 3;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        ImageView imageview = (ImageView)TutorialDialogFragment.access$000(TutorialDialogFragment.this).inflate(0x7f0400a9, viewgroup, false);
        picasso.load(imageIds[i]).fit().skipMemoryCache().into(imageview);
        viewgroup.addView(imageview);
        return imageview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    ()
    {
        this$0 = TutorialDialogFragment.this;
        super();
    }
}
