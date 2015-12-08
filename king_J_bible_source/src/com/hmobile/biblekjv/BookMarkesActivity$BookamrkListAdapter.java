// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.BookMarkInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            BookMarkesActivity, MainBookActivity

public class m_list extends BaseAdapter
{

    ArrayList m_list;
    final BookMarkesActivity this$0;

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
        view = new k();
        final BookMarkInfo bookmark;
        String as[];
        String s;
        if (viewgroup == null)
        {
            viewgroup = getLayoutInflater().inflate(0x7f030008, null);
            viewgroup.setTag(view);
            view.txtLable = (TextView)viewgroup.findViewById(0x7f0e006b);
            view.btnDelete = (Button)viewgroup.findViewById(0x7f0e006a);
            view.txtTitle = (TextView)viewgroup.findViewById(0x7f0e0064);
            view.txtDate = (TextView)viewgroup.findViewById(0x7f0e0069);
            view.txtDay = (TextView)viewgroup.findViewById(0x7f0e0068);
            view.txtBookName = (TextView)viewgroup.findViewById(0x7f0e006c);
            view.rl = (RelativeLayout)viewgroup.findViewById(0x7f0e0065);
            view.rlColor = (RelativeLayout)viewgroup.findViewById(0x7f0e0066);
        } else
        {
            view = (k)viewgroup.getTag();
        }
        bookmark = (BookMarkInfo)m_list.get(i);
        if (bookmark.isBackColor)
        {
            ((k) (view)).rlColor.setBackgroundColor(bookmark.backColor);
        } else
        {
            ((k) (view)).rlColor.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        ((k) (view)).txtLable.setText(bookmark.Verse);
        ((k) (view)).txtTitle.setText(bookmark.Name);
        as = getDate(bookmark.date, "MMM/dd").split("/");
        ((k) (view)).txtDay.setText(as[0]);
        ((k) (view)).txtDate.setText(as[1]);
        s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(bookmark.book_id)));
        ((k) (view)).txtBookName.setText((new StringBuilder(String.valueOf(s))).append(" ").append(bookmark.chap_number).append(":").append(bookmark.verse_id).toString());
        ((k) (view)).rl.setOnClickListener(new android.view.View.OnClickListener() {

            final BookMarkesActivity.BookamrkListAdapter this$1;
            private final BookMarkInfo val$bookmark;

            public void onClick(View view1)
            {
                view1 = new Intent(this$0, com/hmobile/biblekjv/MainBookActivity);
                view1.putExtra("isFromBookMark", true);
                view1.putExtra("BookMarkId", bookmark.getID());
                startActivity(view1);
                finish();
            }

            
            {
                this$1 = BookMarkesActivity.BookamrkListAdapter.this;
                bookmark = bookmarkinfo;
                super();
            }
        });
        ((k) (view)).btnDelete.setOnClickListener(new android.view.View.OnClickListener() {

            final BookMarkesActivity.BookamrkListAdapter this$1;
            private final BookMarkInfo val$bookmark;

            public void onClick(View view1)
            {
                try
                {
                    bookmark.delete();
                    LoadViewForBookMark();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view1)
                {
                    view1.printStackTrace();
                }
            }

            
            {
                this$1 = BookMarkesActivity.BookamrkListAdapter.this;
                bookmark = bookmarkinfo;
                super();
            }
        });
        return viewgroup;
    }


    public _cls2.val.bookmark(ArrayList arraylist)
    {
        this$0 = BookMarkesActivity.this;
        super();
        m_list = new ArrayList();
        m_list = arraylist;
    }
}
