// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.common.SegmentedRadioGroup;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, TabProvider, HolyBibleApplication, MainBookActivity

public class SelectActivity extends BaseActivity
{
    public class GridAdapter extends BaseAdapter
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

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = new ViewHolder();
            if (view == null)
            {
                view = getLayoutInflater().inflate(0x7f030021, null);
                view.setTag(viewgroup);
                viewgroup.txtName = (TextView)view.findViewById(0x7f0e00a4);
                viewgroup.rl = (RelativeLayout)view.findViewById(0x7f0e00a3);
            } else
            {
                viewgroup = (ViewHolder)view.getTag();
            }
            ((ViewHolder) (viewgroup)).txtName.setText((new StringBuilder()).append(i + 1).toString());
            if (chap_id == i + 1 && isChapterView)
            {
                ((ViewHolder) (viewgroup)).txtName.setBackgroundColor(Color.parseColor("#96D7EF"));
            } else
            if (verse_id == i + 1 && isVerseView)
            {
                ((ViewHolder) (viewgroup)).txtName.setBackgroundColor(Color.parseColor("#96D7EF"));
            } else
            {
                ((ViewHolder) (viewgroup)).txtName.setBackgroundColor(getResources().getColor(0x7f080024));
            }
            ((ViewHolder) (viewgroup)).rl.setBackgroundResource(0x7f020060);
            ((ViewHolder) (viewgroup)).rl.setOnClickListener(i. new android.view.View.OnClickListener() {

                final GridAdapter this$1;
                private final int val$position;

                public void onClick(View view)
                {
                    if (isChapterView)
                    {
                        chap_id = position + 1;
                        segmentText.check(0x7f0e00cf);
                    } else
                    if (isVerseView)
                    {
                        verse_id = position + 1;
                        view = new Intent(_fld0, com/hmobile/biblekjv/MainBookActivity);
                        view.putExtra("book_id", book_id);
                        view.putExtra("chap_id", chap_id);
                        view.putExtra("verse_id", verse_id);
                        view.putExtra("select_flag", true);
                        view.setFlags(0x4000000);
                        startActivity(view);
                        finish();
                        return;
                    }
                }

            
            {
                this$1 = final_gridadapter;
                position = I.this;
                super();
            }
            });
            return view;
        }


        public GridAdapter(int i)
        {
            this$0 = SelectActivity.this;
            super();
            count = 0;
            count = i;
        }
    }

    public class ListAdapter extends BaseAdapter
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

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = new ViewHolder();
            BookInfo bookinfo;
            if (view == null)
            {
                view = getLayoutInflater().inflate(0x7f030007, null);
                view.setTag(viewgroup);
                viewgroup.txtName = (TextView)view.findViewById(0x7f0e0064);
                viewgroup.rl = (RelativeLayout)view.findViewById(0x7f0e0063);
            } else
            {
                viewgroup = (ViewHolder)view.getTag();
            }
            bookinfo = (BookInfo)m_list.get(i);
            ((ViewHolder) (viewgroup)).txtName.setText(bookinfo.BookName.trim());
            if (book_id == i + 1 && isBookView)
            {
                ((ViewHolder) (viewgroup)).txtName.setBackgroundColor(Color.parseColor("#96D7EF"));
            } else
            {
                ((ViewHolder) (viewgroup)).txtName.setBackgroundColor(getResources().getColor(0x7f080024));
            }
            ((ViewHolder) (viewgroup)).rl.setBackgroundResource(0x7f020060);
            ((ViewHolder) (viewgroup)).rl.setOnClickListener(i. new android.view.View.OnClickListener() {

                final ListAdapter this$1;
                private final int val$position;

                public void onClick(View view)
                {
                    book_id = position + 1;
                    segmentText.check(0x7f0e00ce);
                }

            
            {
                this$1 = final_listadapter;
                position = I.this;
                super();
            }
            });
            return view;
        }


        public ListAdapter(ArrayList arraylist)
        {
            this$0 = SelectActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public static class ViewHolder
    {

        RelativeLayout rl;
        TextView txtName;

        public ViewHolder()
        {
        }
    }

    public class loadView extends AsyncTask
    {

        final SelectActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            try
            {
                Thread.sleep(100L);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            super.onPostExecute(void1);
            segmentText.check(0x7f0e00cd);
        }

        public loadView()
        {
            this$0 = SelectActivity.this;
            super();
        }
    }


    GridAdapter adapter;
    int book_id;
    int chap_id;
    GridView grid;
    boolean isBookView;
    boolean isChapterView;
    boolean isVerseView;
    ListView lstBook;
    ListAdapter lstadapter;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    SegmentedRadioGroup segmentText;
    private TabView tabView;
    String title;
    TextView txtTitle;
    int verse_id;

    public SelectActivity()
    {
        adapter = null;
        isBookView = false;
        isChapterView = false;
        isVerseView = false;
        book_id = 1;
        chap_id = 1;
        verse_id = 1;
    }

    public void loadviewForBook()
    {
        grid.setVisibility(8);
        lstBook.setVisibility(0);
        lstadapter = new ListAdapter(BookInfo.getBookList());
        lstBook.setAdapter(lstadapter);
        title = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_id)));
        txtTitle.setText(title);
        isBookView = true;
        isChapterView = false;
        isVerseView = false;
    }

    public void loadviewForChapter(int i)
    {
        grid.setVisibility(0);
        lstBook.setVisibility(8);
        adapter = new GridAdapter(BookInfo.getTotalChapterCountBybookid(i));
        grid.setAdapter(adapter);
        title = (new StringBuilder(String.valueOf(BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(i)))))).append(" ").append(chap_id).toString();
        txtTitle.setText(title);
        isBookView = false;
        isChapterView = true;
        isVerseView = false;
    }

    public void loadviewForVerse(int i, int j)
    {
        title = (new StringBuilder(String.valueOf(BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(i)))))).append(" ").append(j).append(":").append(verse_id).toString();
        txtTitle.setText(title);
        grid.setVisibility(0);
        lstBook.setVisibility(8);
        adapter = new GridAdapter(BookInfo.getVerseCountByBookAndChapId(i, j));
        grid.setAdapter(adapter);
        isBookView = false;
        isChapterView = false;
        isVerseView = true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f03002c);
        setContentView(tabView.render(2));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/SelectBookChapterVerseActivity");
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("book_id"))
            {
                book_id = bundle.getInt("book_id");
            }
            if (bundle.containsKey("chap_id"))
            {
                chap_id = bundle.getInt("chap_id");
            }
            if (bundle.containsKey("verse_id"))
            {
                verse_id = bundle.getInt("verse_id");
            }
        }
        segmentText = (SegmentedRadioGroup)findViewById(0x7f0e00cb);
        grid = (GridView)findViewById(0x7f0e00d2);
        lstBook = (ListView)findViewById(0x7f0e00d1);
        txtTitle = (TextView)findViewById(0x7f0e00ca);
        segmentText.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final SelectActivity this$0;

            public void onCheckedChanged(RadioGroup radiogroup, int i)
            {
                if (radiogroup == segmentText)
                {
                    try
                    {
                        Thread.sleep(200L);
                    }
                    // Misplaced declaration of an exception variable
                    catch (RadioGroup radiogroup)
                    {
                        radiogroup.printStackTrace();
                    }
                    if (i == 0x7f0e00cd)
                    {
                        loadviewForBook();
                    } else
                    {
                        if (i == 0x7f0e00ce)
                        {
                            loadviewForChapter(book_id);
                            return;
                        }
                        if (i == 0x7f0e00cf)
                        {
                            loadviewForVerse(book_id, chap_id);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = SelectActivity.this;
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

    protected void onResume()
    {
        super.onResume();
        (new loadView()).execute(new Void[0]);
    }
}
