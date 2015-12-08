// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hmobile.common.SegmentedRadioGroup;

// Referenced classes of package com.hmobile.biblekjv:
//            SelectActivity, MainBookActivity

public class count extends BaseAdapter
{

    int count;
    final SelectActivity this$0;

    public int getCount()
    {
        return count;
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(final int position, View view, ViewGroup viewgroup)
    {
        viewgroup = new init>();
        if (view == null)
        {
            view = getLayoutInflater().inflate(0x7f030021, null);
            view.setTag(viewgroup);
            viewgroup.xtName = (TextView)view.findViewById(0x7f0e00a4);
            viewgroup.l = (RelativeLayout)view.findViewById(0x7f0e00a3);
        } else
        {
            viewgroup = (l)view.getTag();
        }
        ((l) (viewgroup)).xtName.setText((new StringBuilder()).append(position + 1).toString());
        if (chap_id == position + 1 && isChapterView)
        {
            ((w) (viewgroup)).xtName.setBackgroundColor(Color.parseColor("#96D7EF"));
        } else
        if (verse_id == position + 1 && isVerseView)
        {
            ((xtName) (viewgroup)).xtName.setBackgroundColor(Color.parseColor("#96D7EF"));
        } else
        {
            ((xtName) (viewgroup)).xtName.setBackgroundColor(getResources().getColor(0x7f080024));
        }
        (() (viewgroup)).l.setBackgroundResource(0x7f020060);
        ((rce) (viewgroup)).l.setOnClickListener(new android.view.View.OnClickListener() {

            final SelectActivity.GridAdapter this$1;
            private final int val$position;

            public void onClick(View view1)
            {
                if (isChapterView)
                {
                    chap_id = position + 1;
                    segmentText.check(0x7f0e00cf);
                } else
                if (isVerseView)
                {
                    verse_id = position + 1;
                    view1 = new Intent(this$0, com/hmobile/biblekjv/MainBookActivity);
                    view1.putExtra("book_id", book_id);
                    view1.putExtra("chap_id", chap_id);
                    view1.putExtra("verse_id", verse_id);
                    view1.putExtra("select_flag", true);
                    view1.setFlags(0x4000000);
                    startActivity(view1);
                    finish();
                    return;
                }
            }

            
            {
                this$1 = SelectActivity.GridAdapter.this;
                position = i;
                super();
            }
        });
        return view;
    }


    public _cls1.val.position(int i)
    {
        this$0 = SelectActivity.this;
        super();
        count = 0;
        count = i;
    }
}
