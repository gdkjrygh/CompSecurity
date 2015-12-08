// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.LikeShareInfo;
import com.hmobile.model.LikeShareList;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, TabProvider, HolyBibleApplication, MainBookActivity

public class MostLikeShareActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    public class LikeShareAdapter extends BaseAdapter
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
            viewgroup = new ViewHolder();
            LikeShareInfo likeshareinfo;
            if (view == null)
            {
                view = getLayoutInflater().inflate(0x7f030024, null);
                view.setTag(viewgroup);
                viewgroup.txtVerse = (TextView)view.findViewById(0x7f0e00ac);
                viewgroup.txtBookInfo = (TextView)view.findViewById(0x7f0e00ad);
                viewgroup.txtLikeShare = (TextView)view.findViewById(0x7f0e00ae);
                viewgroup.rlLikeItem = (RelativeLayout)view.findViewById(0x7f0e00ab);
            } else
            {
                viewgroup = (ViewHolder)view.getTag();
            }
            likeshareinfo = (LikeShareInfo)m_list.get(book_id);
            if (likeshareinfo != null)
            {
                ((ViewHolder) (viewgroup)).txtBookInfo.setText((new StringBuilder(String.valueOf(likeshareinfo.book))).append(" ").append(likeshareinfo.chapter).append(":").append(likeshareinfo.verse).toString());
                ((ViewHolder) (viewgroup)).txtVerse.setText(likeshareinfo.verseinfo);
                final int chap_id;
                int i;
                if (islike)
                {
                    ((ViewHolder) (viewgroup)).txtLikeShare.setText((new StringBuilder(String.valueOf(likeshareinfo.likes))).toString());
                } else
                {
                    ((ViewHolder) (viewgroup)).txtLikeShare.setText((new StringBuilder(String.valueOf(likeshareinfo.shares))).toString());
                }
            }
            book_id = BookInfo.getBookIdByName(likeshareinfo.book);
            chap_id = Utils.ConvertToInt(likeshareinfo.chapter);
            i = Utils.ConvertToInt(likeshareinfo.verse);
            ((ViewHolder) (viewgroup)).rlLikeItem.setOnClickListener(i. new android.view.View.OnClickListener() {

                final LikeShareAdapter this$1;
                private final int val$book_id;
                private final int val$chap_id;
                private final int val$verse_id;

                public void onClick(View view)
                {
                    view = new Intent(_fld0, com/hmobile/biblekjv/MainBookActivity);
                    view.putExtra("book_id", book_id);
                    view.putExtra("chap_id", chap_id);
                    view.putExtra("verse_id", verse_id);
                    view.putExtra("isFromLikeShare", true);
                    startActivity(view);
                    finish();
                }

            
            {
                this$1 = final_likeshareadapter;
                book_id = i;
                chap_id = j;
                verse_id = I.this;
                super();
            }
            });
            return view;
        }


        public LikeShareAdapter(ArrayList arraylist)
        {
            this$0 = MostLikeShareActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public static class ViewHolder
    {

        RelativeLayout rlLikeItem;
        TextView txtBookInfo;
        TextView txtLikeShare;
        TextView txtVerse;

        public ViewHolder()
        {
        }
    }

    class getAllData extends AsyncTask
    {

        final MostLikeShareActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            if (islike);
            avoid = (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070098)).append("?PackageName=").append(getString(0x7f07004b)).append("&action=like").toString();
            infoLikes = LikeShareList.Instance().getAllLike(avoid);
            avoid = (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070098)).append("?PackageName=").append(getString(0x7f07004b)).append("&action=share").toString();
            infoShares = LikeShareList.Instance().getAllShare(avoid);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            if (m_pd != null)
            {
                m_pd.dismiss();
            }
            bindData();
            super.onPostExecute(void1);
        }

        protected void onPreExecute()
        {
            if (m_pd != null)
            {
                m_pd.setCancelable(false);
                m_pd.show();
            }
            super.onPreExecute();
        }

        getAllData()
        {
            this$0 = MostLikeShareActivity.this;
            super();
        }
    }


    LikeShareAdapter adapter;
    getAllData async;
    private Button btnMostLike;
    private Button btnMostShare;
    ArrayList infoLikes;
    ArrayList infoShares;
    ArrayList infos;
    private boolean islike;
    private ListView lstMostLikeShare;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    private TabView tabView;

    public MostLikeShareActivity()
    {
        islike = true;
        adapter = null;
        infos = new ArrayList();
        infoLikes = new ArrayList();
        infoShares = new ArrayList();
    }

    public void bindData()
    {
        if (islike)
        {
            adapter = null;
            if (infoLikes != null)
            {
                adapter = new LikeShareAdapter(infoLikes);
                lstMostLikeShare.setAdapter(adapter);
            }
        } else
        {
            adapter = null;
            if (infoShares != null)
            {
                adapter = new LikeShareAdapter(infoShares);
                lstMostLikeShare.setAdapter(adapter);
                return;
            }
        }
    }

    public void onClick(View view)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f030025);
        setContentView(tabView.render(1));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/MostLikedShared");
        lstMostLikeShare = (ListView)findViewById(0x7f0e00b1);
        btnMostLike = (Button)findViewById(0x7f0e00af);
        btnMostShare = (Button)findViewById(0x7f0e00b0);
        setFontStyleRoboto(btnMostLike, getString(0x7f0700b8));
        setFontStyleRoboto(btnMostShare, getString(0x7f0700b8));
        btnMostLike.setTypeface(null, 1);
        btnMostShare.setTypeface(null, 1);
        btnMostLike.setOnClickListener(new android.view.View.OnClickListener() {

            final MostLikeShareActivity this$0;

            public void onClick(View view)
            {
                islike = true;
                btnMostLike.setBackgroundResource(0x7f020005);
                btnMostShare.setBackgroundColor(0);
                bindData();
            }

            
            {
                this$0 = MostLikeShareActivity.this;
                super();
            }
        });
        btnMostShare.setOnClickListener(new android.view.View.OnClickListener() {

            final MostLikeShareActivity this$0;

            public void onClick(View view)
            {
                islike = false;
                btnMostLike.setBackgroundColor(0);
                btnMostShare.setBackgroundResource(0x7f020005);
                bindData();
            }

            
            {
                this$0 = MostLikeShareActivity.this;
                super();
            }
        });
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

    public void onPause()
    {
        if (async != null)
        {
            async.cancel(true);
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }




}
