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
import com.hmobile.model.VerseInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SearchResultActivity

public class m_list extends BaseAdapter
{

    ArrayList m_list;
    final SearchResultActivity this$0;

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

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        view = new init>();
        final VerseInfo info;
        String s;
        if (viewgroup == null)
        {
            viewgroup = getLayoutInflater().inflate(0x7f03002a, null);
            viewgroup.setTag(view);
            view.xtBookName = (TextView)viewgroup.findViewById(0x7f0e006c);
            view.xtVerse = (TextView)viewgroup.findViewById(0x7f0e00ac);
            view.l = (RelativeLayout)viewgroup.findViewById(0x7f0e00c3);
        } else
        {
            view = (l)viewgroup.getTag();
        }
        info = (VerseInfo)m_list.get(i);
        s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(info.BookId)));
        ((m_list) (view)).xtBookName.setText((new StringBuilder(String.valueOf(s))).append(" ").append(info.ChapterNumber).append(":").append(info.VerseNumber).toString());
        ((xtBookName) (view)).xtVerse.setText(info.Verse);
        setFontStyleRoboto(((Roboto) (view)).xtVerse, getString(0x7f0700b7));
        ColorText(((xtVerse) (view)).xtVerse, 0xff00ff00);
        ((xtVerse) (view)).l.setOnClickListener(new android.view.View.OnClickListener() {

            final SearchResultActivity.ListAdapter this$1;
            private final VerseInfo val$info;

            public void onClick(View view1)
            {
                view1 = new Intent();
                view1.putExtra("book_id", info.BookId);
                view1.putExtra("chap_id", info.ChapterNumber);
                view1.putExtra("verse_id", info.VerseNumber);
                setResult(-1, view1);
                finish();
            }

            
            {
                this$1 = SearchResultActivity.ListAdapter.this;
                info = verseinfo;
                super();
            }
        });
        return viewgroup;
    }


    public _cls1.val.info(ArrayList arraylist)
    {
        this$0 = SearchResultActivity.this;
        super();
        m_list = new ArrayList();
        m_list = arraylist;
    }
}
