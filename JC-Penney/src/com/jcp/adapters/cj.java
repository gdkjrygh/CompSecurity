// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.util.at;

// Referenced classes of package com.jcp.adapters:
//            ReviewsAdapter

class cj
    implements android.view.View.OnClickListener
{

    final String a;
    final ReviewsAdapter.ViewHolder b;
    final ReviewsAdapter c;

    cj(ReviewsAdapter reviewsadapter, String s, ReviewsAdapter.ViewHolder viewholder)
    {
        c = reviewsadapter;
        a = s;
        b = viewholder;
        super();
    }

    public void onClick(View view)
    {
        int i = a.length() / 2;
        if (b.review.getText().length() > i)
        {
            view = Html.fromHtml(a.substring(0, i).trim(), null, new at()).toString();
            b.review.setText(view);
            b.arrow.setBackgroundResource(0x7f02018f);
        } else
        {
            view = Html.fromHtml(a, null, new at()).toString();
            b.review.setText(view);
            b.arrow.setBackgroundResource(0x7f020190);
        }
        b.review.invalidate();
        b.review.requestLayout();
    }
}
