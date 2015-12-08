// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.FavoriteInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            FavoritesActivity, MainBookActivity

public class m_list extends BaseAdapter
{

    ArrayList m_list;
    final FavoritesActivity this$0;

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
        view = new e();
        final FavoriteInfo fav_info;
        String s;
        if (viewgroup == null)
        {
            viewgroup = getLayoutInflater().inflate(0x7f03001c, null);
            viewgroup.setTag(view);
            view.txtFavoriteVerse = (TextView)viewgroup.findViewById(0x7f0e0099);
            view.txtTitle = (TextView)viewgroup.findViewById(0x7f0e006c);
            view.rlFavorite = (RelativeLayout)viewgroup.findViewById(0x7f0e0098);
            view.imgDisLike = (ImageView)viewgroup.findViewById(0x7f0e009a);
        } else
        {
            view = (e)viewgroup.getTag();
        }
        fav_info = (FavoriteInfo)m_list.get(i);
        ((e) (view)).txtFavoriteVerse.setText(fav_info.Verse);
        s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(fav_info.BookId)));
        ((e) (view)).txtTitle.setText((new StringBuilder(String.valueOf(s))).append(" ").append(fav_info.ChapterNumber).append(":").append(fav_info.VerseNumber).toString());
        ((e) (view)).rlFavorite.setOnClickListener(new android.view.View.OnClickListener() {

            final FavoritesActivity.FavoriteListAdapter this$1;
            private final FavoriteInfo val$fav_info;

            public void onClick(View view1)
            {
                view1 = new Intent(this$0, com/hmobile/biblekjv/MainBookActivity);
                view1.putExtra("isFromFavorite", true);
                view1.putExtra("book_id", fav_info.BookId);
                view1.putExtra("chap_id", fav_info.ChapterNumber);
                view1.putExtra("verse_id", fav_info.VerseNumber);
                startActivity(view1);
                finish();
            }

            
            {
                this$1 = FavoritesActivity.FavoriteListAdapter.this;
                fav_info = favoriteinfo;
                super();
            }
        });
        ((e) (view)).imgDisLike.setOnClickListener(new android.view.View.OnClickListener() {

            final FavoritesActivity.FavoriteListAdapter this$1;
            private final FavoriteInfo val$fav_info;

            public void onClick(View view1)
            {
                try
                {
                    fav_info.delete();
                }
                // Misplaced declaration of an exception variable
                catch (View view1)
                {
                    view1.printStackTrace();
                }
                LoadViewForFavorite();
            }

            
            {
                this$1 = FavoritesActivity.FavoriteListAdapter.this;
                fav_info = favoriteinfo;
                super();
            }
        });
        return viewgroup;
    }


    public _cls2.val.fav_info(ArrayList arraylist)
    {
        this$0 = FavoritesActivity.this;
        super();
        m_list = new ArrayList();
        m_list = arraylist;
    }
}
