// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hmobile.common.SegmentedRadioGroup;
import com.hmobile.model.BookInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SelectActivity

public class m_list extends BaseAdapter
{

    ArrayList m_list;
    final SelectActivity this$0;

    public int getCount()
    {
        return m_list.size();
    }

    public Object getItem(int i)
    {
        return m_list.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(final int position, View view, ViewGroup viewgroup)
    {
        viewgroup = new init>();
        BookInfo bookinfo;
        if (view == null)
        {
            view = getLayoutInflater().inflate(0x7f030007, null);
            view.setTag(viewgroup);
            viewgroup.xtName = (TextView)view.findViewById(0x7f0e0064);
            viewgroup.l = (RelativeLayout)view.findViewById(0x7f0e0063);
        } else
        {
            viewgroup = (l)view.getTag();
        }
        bookinfo = (BookInfo)m_list.get(position);
        ((m_list) (viewgroup)).xtName.setText(bookinfo.BookName.trim());
        if (book_id == position + 1 && isBookView)
        {
            ((xtName) (viewgroup)).xtName.setBackgroundColor(Color.parseColor("#96D7EF"));
        } else
        {
            ((xtName) (viewgroup)).xtName.setBackgroundColor(getResources().getColor(0x7f080024));
        }
        (() (viewgroup)).l.setBackgroundResource(0x7f020060);
        ((rce) (viewgroup)).l.setOnClickListener(new android.view.View.OnClickListener() {

            final SelectActivity.ListAdapter this$1;
            private final int val$position;

            public void onClick(View view1)
            {
                book_id = position + 1;
                segmentText.check(0x7f0e00ce);
            }

            
            {
                this$1 = SelectActivity.ListAdapter.this;
                position = i;
                super();
            }
        });
        return view;
    }


    public _cls1.val.position(ArrayList arraylist)
    {
        this$0 = SelectActivity.this;
        super();
        m_list = new ArrayList();
        m_list = arraylist;
    }
}
