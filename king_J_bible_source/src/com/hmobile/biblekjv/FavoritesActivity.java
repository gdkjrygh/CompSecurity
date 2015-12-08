// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.FavoriteInfo;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, TabProvider, HolyBibleApplication, MainBookActivity

public class FavoritesActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    public class FavoriteListAdapter extends BaseAdapter
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
            view = new ViewHolderForFavorite();
            FavoriteInfo favoriteinfo;
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
                view = (ViewHolderForFavorite)viewgroup.getTag();
            }
            favoriteinfo = (FavoriteInfo)m_list.get(i);
            ((ViewHolderForFavorite) (view)).txtFavoriteVerse.setText(favoriteinfo.Verse);
            s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(favoriteinfo.BookId)));
            ((ViewHolderForFavorite) (view)).txtTitle.setText((new StringBuilder(String.valueOf(s))).append(" ").append(favoriteinfo.ChapterNumber).append(":").append(favoriteinfo.VerseNumber).toString());
            ((ViewHolderForFavorite) (view)).rlFavorite.setOnClickListener(favoriteinfo. new android.view.View.OnClickListener() {

                final FavoriteListAdapter this$1;
                private final FavoriteInfo val$fav_info;

                public void onClick(View view)
                {
                    view = new Intent(_fld0, com/hmobile/biblekjv/MainBookActivity);
                    view.putExtra("isFromFavorite", true);
                    view.putExtra("book_id", fav_info.BookId);
                    view.putExtra("chap_id", fav_info.ChapterNumber);
                    view.putExtra("verse_id", fav_info.VerseNumber);
                    startActivity(view);
                    finish();
                }

            
            {
                this$1 = final_favoritelistadapter;
                fav_info = FavoriteInfo.this;
                super();
            }
            });
            ((ViewHolderForFavorite) (view)).imgDisLike.setOnClickListener(favoriteinfo. new android.view.View.OnClickListener() {

                final FavoriteListAdapter this$1;
                private final FavoriteInfo val$fav_info;

                public void onClick(View view)
                {
                    try
                    {
                        fav_info.delete();
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        view.printStackTrace();
                    }
                    LoadViewForFavorite();
                }

            
            {
                this$1 = final_favoritelistadapter;
                fav_info = FavoriteInfo.this;
                super();
            }
            });
            return viewgroup;
        }


        public FavoriteListAdapter(ArrayList arraylist)
        {
            this$0 = FavoritesActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public static class ViewHolderForFavorite
    {

        ImageView imgDisLike;
        RelativeLayout rlFavorite;
        TextView txtFavoriteVerse;
        TextView txtTitle;

        public ViewHolderForFavorite()
        {
        }
    }


    private Button btnFavorite;
    FavoriteListAdapter favoriteAdapter;
    private boolean isbookmark;
    private ListView lstFavorites;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    private TabView tabView;
    private TextView txtNoBookmark;

    public FavoritesActivity()
    {
        isbookmark = true;
        favoriteAdapter = null;
    }

    public void LoadViewForFavorite()
    {
        txtNoBookmark.setVisibility(8);
        lstFavorites.setVisibility(0);
        ArrayList arraylist = FavoriteInfo.getAllLocalFavorite();
        if (arraylist != null && arraylist.size() > 0)
        {
            favoriteAdapter = new FavoriteListAdapter(arraylist);
            lstFavorites.setAdapter(favoriteAdapter);
            return;
        } else
        {
            lstFavorites.setVisibility(8);
            txtNoBookmark.setVisibility(0);
            txtNoBookmark.setText(0x7f07005d);
            return;
        }
    }

    public String getDate(long l)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MMM/dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        return simpledateformat.format(calendar.getTime());
    }

    public void onClick(View view)
    {
        if (view == btnFavorite)
        {
            LoadViewForFavorite();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f03001d);
        setContentView(tabView.render(1));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/FavoritesActivity");
        lstFavorites = (ListView)findViewById(0x7f0e009c);
        btnFavorite = (Button)findViewById(0x7f0e009b);
        txtNoBookmark = (TextView)findViewById(0x7f0e0062);
        setFontStyleRoboto(btnFavorite, getString(0x7f0700b8));
        btnFavorite.setOnClickListener(this);
        btnFavorite.setTypeface(null, 1);
        if (!HolyBibleApplication.isPurchased)
        {
            addAdView();
            return;
        } else
        {
            hideAdView();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        LoadViewForFavorite();
    }
}
