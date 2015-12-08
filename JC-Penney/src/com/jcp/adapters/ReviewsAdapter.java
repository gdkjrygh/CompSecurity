// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.jcp.productentity.sephoraproductentity.Result;
import com.jcp.util.ae;
import com.jcp.util.at;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.jcp.adapters:
//            cj

public class ReviewsAdapter extends BaseAdapter
{

    private final Context a;
    private final List b;

    public ReviewsAdapter(Context context, List list)
    {
        a = context;
        b = list;
    }

    private android.view.View.OnClickListener a(ViewHolder viewholder, String s)
    {
        return new cj(this, s, viewholder);
    }

    private String a(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat simpledateformat1 = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        try
        {
            s = simpledateformat1.format(simpledateformat.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            ae.a(getClass().getSimpleName(), "While formatting review comment date got exception");
            return "";
        }
        return s;
    }

    private void a(TextView textview, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            textview.setText(s);
        }
    }

    private void a(ViewHolder viewholder, Result result)
    {
label0:
        {
            String s = result.getReviewText();
            if (!TextUtils.isEmpty(s))
            {
                result = Html.fromHtml(s, null, new at()).toString();
                if (s.length() <= 200)
                {
                    break label0;
                }
                s = Html.fromHtml(s.substring(0, s.length() / 2), null, new at()).toString();
                viewholder.review.setText(s);
                viewholder.arrow.setBackgroundResource(0x7f02018f);
                viewholder.reviewContainer.setOnClickListener(a(viewholder, ((String) (result))));
            }
            return;
        }
        viewholder.review.setText(result);
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return b.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(0x7f0300d0, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        view = (ViewHolder)view1.getTag();
        viewgroup = (Result)getItem(i);
        if (viewgroup != null)
        {
            a(((ViewHolder) (view)).title, viewgroup.getTitle());
            a(((ViewHolder) (view)).username, viewgroup.getUserNickname());
            a(((ViewHolder) (view)).date, a(viewgroup.getSubmissionTime()));
            a(view, viewgroup);
            ((ViewHolder) (view)).rating.setRating(viewgroup.getRating().intValue());
        }
        return view1;
    }

    private class ViewHolder
    {

        protected ImageView arrow;
        protected TextView date;
        protected RatingBar rating;
        protected TextView review;
        protected View reviewContainer;
        protected TextView title;
        protected TextView username;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
