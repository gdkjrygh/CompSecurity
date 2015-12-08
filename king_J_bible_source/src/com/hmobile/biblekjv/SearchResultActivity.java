// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.VerseInfo;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

public class SearchResultActivity extends BaseActivity
{
    public class ListAdapter extends BaseAdapter
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
            view = new ViewHolder();
            VerseInfo verseinfo;
            String s;
            if (viewgroup == null)
            {
                viewgroup = getLayoutInflater().inflate(0x7f03002a, null);
                viewgroup.setTag(view);
                view.txtBookName = (TextView)viewgroup.findViewById(0x7f0e006c);
                view.txtVerse = (TextView)viewgroup.findViewById(0x7f0e00ac);
                view.rl = (RelativeLayout)viewgroup.findViewById(0x7f0e00c3);
            } else
            {
                view = (ViewHolder)viewgroup.getTag();
            }
            verseinfo = (VerseInfo)m_list.get(i);
            s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(verseinfo.BookId)));
            ((ViewHolder) (view)).txtBookName.setText((new StringBuilder(String.valueOf(s))).append(" ").append(verseinfo.ChapterNumber).append(":").append(verseinfo.VerseNumber).toString());
            ((ViewHolder) (view)).txtVerse.setText(verseinfo.Verse);
            setFontStyleRoboto(((ViewHolder) (view)).txtVerse, getString(0x7f0700b7));
            ColorText(((ViewHolder) (view)).txtVerse, 0xff00ff00);
            ((ViewHolder) (view)).rl.setOnClickListener(verseinfo. new android.view.View.OnClickListener() {

                final ListAdapter this$1;
                private final VerseInfo val$info;

                public void onClick(View view)
                {
                    view = new Intent();
                    view.putExtra("book_id", info.BookId);
                    view.putExtra("chap_id", info.ChapterNumber);
                    view.putExtra("verse_id", info.VerseNumber);
                    setResult(-1, view);
                    finish();
                }

            
            {
                this$1 = final_listadapter;
                info = VerseInfo.this;
                super();
            }
            });
            return viewgroup;
        }


        public ListAdapter(ArrayList arraylist)
        {
            this$0 = SearchResultActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public class LoadBookAsync extends AsyncTask
    {

        boolean isAutoText;
        ArrayList m_book;
        final SearchResultActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            if (isAutoText)
            {
                m_book = new ArrayList();
                m_book.add("All");
            } else
            {
                m_book = loadBook();
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
            hideProgress();
            spinAdapter = new SpinnerAdapter(m_book);
            spnBook.setAdapter(spinAdapter);
        }

        public LoadBookAsync(boolean flag)
        {
            this$0 = SearchResultActivity.this;
            super();
            m_book = null;
            isAutoText = false;
            isAutoText = flag;
        }
    }

    public class SearchAsync extends AsyncTask
    {

        String bookname;
        boolean isSearchByBook;
        final SearchResultActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            if (isFromAuto)
            {
                avoid = BookInfo.getBookByBookName(selected_book);
                m_list = VerseInfo.getVerseByBookAndChapNumber((int)avoid.getID(), Utils.ConvertToInt(chapnumber));
            } else
            if (isSearchByBook)
            {
                m_list = VerseInfo.getVerseByBookbySearchWord(word, bookname);
            } else
            {
                m_list = VerseInfo.getVerseBySearchWord(word);
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
            hideProgress();
            if (m_list.size() > 0)
            {
                lstSearchResult.setVisibility(0);
                txtNoResult.setVisibility(8);
                binddata();
                return;
            } else
            {
                lstSearchResult.setVisibility(8);
                txtNoResult.setVisibility(0);
                return;
            }
        }

        public SearchAsync(boolean flag, String s)
        {
            this$0 = SearchResultActivity.this;
            super();
            isSearchByBook = flag;
            bookname = s;
        }
    }

    public class SpinnerAdapter extends BaseAdapter
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
            return (long)((String)m_list.get(i)).hashCode();
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = new ViewHolderForSpinner();
            String s;
            if (view == null)
            {
                view = getLayoutInflater().inflate(0x7f030030, null);
                view.setTag(viewgroup);
                viewgroup.txtBookName = (TextView)view.findViewById(0x7f0e006c);
                viewgroup.rl_spinner_item = (RelativeLayout)view.findViewById(0x7f0e0122);
            } else
            {
                viewgroup = (ViewHolderForSpinner)view.getTag();
            }
            s = (String)m_list.get(i);
            ((ViewHolderForSpinner) (viewgroup)).txtBookName.setText(s.trim());
            return view;
        }

        public SpinnerAdapter(ArrayList arraylist)
        {
            this$0 = SearchResultActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public static class ViewHolder
    {

        RelativeLayout rl;
        TextView txtBookName;
        TextView txtVerse;

        public ViewHolder()
        {
        }
    }

    public class ViewHolderForSpinner
    {

        RelativeLayout rl_spinner_item;
        final SearchResultActivity this$0;
        TextView txtBookName;

        public ViewHolderForSpinner()
        {
            this$0 = SearchResultActivity.this;
            super();
        }
    }


    ListAdapter adapter;
    String chapnumber;
    boolean fromToday;
    boolean isFromAuto;
    ListView lstSearchResult;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    ArrayList m_list;
    String selected_book;
    SpinnerAdapter spinAdapter;
    Spinner spnBook;
    TextView txtNoResult;
    TextView txtSearchResult;
    String word;

    public SearchResultActivity()
    {
        word = "";
        m_list = null;
        adapter = null;
        fromToday = false;
        isFromAuto = false;
        selected_book = "";
        chapnumber = "";
    }

    public SpannableString ColorText(TextView textview, int i)
    {
        SpannableString spannablestring;
        try
        {
            int j = textview.getText().toString().toLowerCase().indexOf(word.toLowerCase());
            spannablestring = new SpannableString(textview.getText().toString());
            spannablestring.setSpan(new BackgroundColorSpan(i), j, word.length() + j, 18);
            textview.setText(spannablestring);
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            return null;
        }
        return spannablestring;
    }

    public void SearchVerse(boolean flag, String s)
    {
        showProgress();
        (new SearchAsync(flag, s)).execute(new Void[0]);
    }

    public void binddata()
    {
        adapter = new ListAdapter(m_list);
        lstSearchResult.setAdapter(adapter);
    }

    public ArrayList loadBook()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("All");
        Iterator iterator = BookInfo.getBookList().iterator();
        do
        {
            BookInfo bookinfo;
            ArrayList arraylist1;
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                bookinfo = (BookInfo)iterator.next();
                arraylist1 = VerseInfo.getVerseByBookbySearchWord(word, bookinfo.BookName);
            } while (arraylist1.size() <= 0);
            arraylist.add((new StringBuilder(String.valueOf(bookinfo.BookName))).append("  (").append(arraylist1.size()).append(")").toString());
        } while (true);
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002b);
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/SearchResultActivity");
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("search_word"))
            {
                word = bundle.getString("search_word");
            }
            if (bundle.containsKey("FromToday"))
            {
                fromToday = bundle.getBoolean("FromToday");
            }
            if (bundle.containsKey("isFromAuto"))
            {
                isFromAuto = bundle.getBoolean("isFromAuto");
                selected_book = bundle.getString("BookName");
                chapnumber = bundle.getString("ChapCount");
            }
        }
        lstSearchResult = (ListView)findViewById(0x7f0e00c7);
        txtNoResult = (TextView)findViewById(0x7f0e00c8);
        txtSearchResult = (TextView)findViewById(0x7f0e00c5);
        spnBook = (Spinner)findViewById(0x7f0e00c6);
        txtSearchResult.setText((new StringBuilder(" ")).append(word).toString());
        showProgress();
        (new LoadBookAsync(isFromAuto)).execute(new Void[0]);
        spnBook.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SearchResultActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (i != 0)
                {
                    m_list = new ArrayList();
                    adapterview = spnBook.getSelectedItem().toString().split("\\(");
                    SearchVerse(true, adapterview[0].trim());
                    return;
                } else
                {
                    SearchVerse(false, "");
                    return;
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SearchResultActivity.this;
                super();
            }
        });
    }
}
