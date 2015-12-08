// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.LikeShareInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            MostLikeShareActivity, MainBookActivity

public class m_list extends BaseAdapter
{

    ArrayList m_list;
    final MostLikeShareActivity this$0;

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

    public View getView(final int book_id, View view, ViewGroup viewgroup)
    {
        viewgroup = new ();
        LikeShareInfo likeshareinfo;
        if (view == null)
        {
            view = getLayoutInflater().inflate(0x7f030024, null);
            view.setTag(viewgroup);
            viewgroup.se = (TextView)view.findViewById(0x7f0e00ac);
            viewgroup.kInfo = (TextView)view.findViewById(0x7f0e00ad);
            viewgroup.eShare = (TextView)view.findViewById(0x7f0e00ae);
            viewgroup.Item = (RelativeLayout)view.findViewById(0x7f0e00ab);
        } else
        {
            viewgroup = (Item)view.getTag();
        }
        likeshareinfo = (LikeShareInfo)m_list.get(book_id);
        if (likeshareinfo != null)
        {
            ((m_list) (viewgroup)).kInfo.setText((new StringBuilder(String.valueOf(likeshareinfo.book))).append(" ").append(likeshareinfo.chapter).append(":").append(likeshareinfo.verse).toString());
            ((kInfo) (viewgroup)).se.setText(likeshareinfo.verseinfo);
            final int chap_id;
            final int verse_id;
            if (MostLikeShareActivity.access$0(MostLikeShareActivity.this))
            {
                ((this._cls0) (viewgroup)).eShare.setText((new StringBuilder(String.valueOf(likeshareinfo.likes))).toString());
            } else
            {
                ((eShare) (viewgroup)).eShare.setText((new StringBuilder(String.valueOf(likeshareinfo.shares))).toString());
            }
        }
        book_id = BookInfo.getBookIdByName(likeshareinfo.book);
        chap_id = Utils.ConvertToInt(likeshareinfo.chapter);
        verse_id = Utils.ConvertToInt(likeshareinfo.verse);
        ((eShare) (viewgroup)).Item.setOnClickListener(new android.view.View.OnClickListener() {

            final MostLikeShareActivity.LikeShareAdapter this$1;
            private final int val$book_id;
            private final int val$chap_id;
            private final int val$verse_id;

            public void onClick(View view1)
            {
                view1 = new Intent(this$0, com/hmobile/biblekjv/MainBookActivity);
                view1.putExtra("book_id", book_id);
                view1.putExtra("chap_id", chap_id);
                view1.putExtra("verse_id", verse_id);
                view1.putExtra("isFromLikeShare", true);
                startActivity(view1);
                finish();
            }

            
            {
                this$1 = MostLikeShareActivity.LikeShareAdapter.this;
                book_id = i;
                chap_id = j;
                verse_id = k;
                super();
            }
        });
        return view;
    }


    public _cls1.val.verse_id(ArrayList arraylist)
    {
        this$0 = MostLikeShareActivity.this;
        super();
        m_list = new ArrayList();
        m_list = arraylist;
    }
}
