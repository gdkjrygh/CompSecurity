// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.GAServiceManager;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.common.MyDailyQuoteReceiver;
import com.hmobile.common.NotificationCenter;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.BookMarkInfo;
import com.hmobile.model.FavoriteInfo;
import com.hmobile.model.TodayInfo;
import com.hmobile.model.TodayVerseInfo;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, MainBookActivity, ShareActivity, SearchResultActivity, 
//            TabProvider, HolyBibleApplication

public class TodayActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    public class LoadToday extends AsyncTask
    {

        final TodayActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            todayverse = BookInfo.getTodayVerse();
            Todaybook = BookInfo.getTodayBook();
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            super.onPostExecute(void1);
            editor.putString("TodayVerse", todayverse.Verse);
            editor.putString("BookName", Todaybook.BookName);
            editor.putInt("BookCount", todayverse.BookId);
            editor.putInt("ChapterCount", todayverse.ChapterNumber);
            editor.putInt("VerseCount", todayverse.VerseNumber);
            void1 = new Date();
            void1 = (new SimpleDateFormat("MM/dd/yyyy")).format(void1);
            editor.putString("TodayDate", void1);
            editor.commit();
            if (todayverse != null)
            {
                txtTodayVerse.setText(todayverse.Verse);
                bookname = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(todayverse.BookId)));
                txtBookInfo.setText((new StringBuilder(String.valueOf(bookname.trim()))).append(" ").append(todayverse.ChapterNumber).append(":").append(todayverse.VerseNumber).toString());
            }
            if (Todaybook != null)
            {
                txtTodayBook.setText(Todaybook.BookName.trim());
            }
            LoadAutoText();
            if (!isFinishing())
            {
                hideProgress();
            }
        }

        public LoadToday()
        {
            this$0 = TodayActivity.this;
            super();
        }
    }

    class saveTodayVerseFromIds extends AsyncTask
    {

        List lst;
        int size;
        final TodayActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            int i = TodayVerseInfo.m_verse_info_ids.length;
            if (lst != null)
            {
                size = lst.size();
            }
            if (size < i)
            {
                TodayVerseInfo.saveTodayVerse();
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
            loadTodayVerse();
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            try
            {
                lst = HolyBibleApplication.LocalConnection().findAll(com/hmobile/model/TodayVerseInfo);
                showProgress(getString(0x7f0700c6));
                return;
            }
            catch (ActiveRecordException activerecordexception)
            {
                activerecordexception.printStackTrace();
            }
        }

        saveTodayVerseFromIds()
        {
            this$0 = TodayActivity.this;
            super();
            size = 0;
        }
    }


    final int SEARCH_ACTVITY = 2;
    BookInfo Todaybook;
    int book_count;
    String bookname;
    private Button btnLastReadChapter;
    private Button btnReadBookOfDay;
    private Button btnShareTodayVerse;
    int chap_count;
    android.content.SharedPreferences.Editor editor;
    private AutoCompleteTextView edtSearch;
    private ImageView imgCancelSearch;
    private ImageView imgRefresh;
    private ImageView imgSearch;
    private ImageView imgSearchText;
    private RelativeLayout llSearch;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    ArrayList m_strings;
    ArrayList m_tempstrings;
    SharedPreferences settings;
    private TabView tabView;
    TodayVerseInfo todayverse;
    private TextView txtBookInfo;
    private TextView txtLastRead;
    private TextView txtTitleBook;
    private TextView txtTitleVerse;
    private TextView txtToday;
    private TextView txtTodayBook;
    private TextView txtTodayVerse;
    int verse_id;

    public TodayActivity()
    {
        book_count = 1;
        chap_count = 1;
        verse_id = 1;
        m_strings = new ArrayList();
        m_tempstrings = new ArrayList();
    }

    private void LoadDatabaseTodayInfo(TodayInfo todayinfo)
    {
        todayverse = TodayVerseInfo.getVerseInfoByVerse(todayinfo.TodayVerse, editor);
        Todaybook = BookInfo.getBookByBookName(todayinfo.BookName);
        if (todayverse != null)
        {
            txtTodayVerse.setText(todayverse.Verse);
            bookname = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(todayverse.BookId)));
            txtBookInfo.setText((new StringBuilder(String.valueOf(bookname.trim()))).append(" ").append(todayverse.ChapterNumber).append(":").append(todayverse.VerseNumber).toString());
        }
        if (Todaybook != null)
        {
            txtTodayBook.setText(Todaybook.BookName.trim());
        }
        hideProgress();
    }

    private TodayInfo getTodayInfo()
    {
        TodayInfo todayinfo;
label0:
        {
            TodayInfo todayinfo1 = new TodayInfo();
            todayinfo1.TodayVerse = settings.getString("TodayVerse", "");
            todayinfo1.BookName = settings.getString("BookName", "");
            todayinfo1.TodayDate = settings.getString("TodayDate", "");
            todayinfo1.BookCount = settings.getInt("BookCount", 1);
            todayinfo1.ChapterCount = settings.getInt("ChapterCount", 1);
            todayinfo1.VerseCount = settings.getInt("VerseCount", 1);
            if (!todayinfo1.TodayVerse.equalsIgnoreCase(""))
            {
                todayinfo = todayinfo1;
                if (!todayinfo1.TodayDate.equalsIgnoreCase(""))
                {
                    break label0;
                }
            }
            todayinfo = null;
        }
        return todayinfo;
    }

    public void LoadAutoText()
    {
        Object obj = BookInfo.getBookList().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                obj = new ArrayAdapter(this, 0x109000a, m_strings);
                Utils.LogInfo((new StringBuilder("ALL_Book====>")).append(m_strings).toString());
                edtSearch.setThreshold(1);
                edtSearch.setAdapter(((android.widget.ListAdapter) (obj)));
                return;
            }
            BookInfo bookinfo = (BookInfo)((Iterator) (obj)).next();
            int j = BookInfo.getTotalChapterCountBybookid(bookinfo.getID());
            int i = 0;
            while (i < j) 
            {
                if (bookinfo.BookName.contains("\n"))
                {
                    String s = bookinfo.BookName.replaceAll("\n", "");
                    m_strings.add((new StringBuilder(String.valueOf(s))).append(" ").append(i + 1).toString());
                    m_tempstrings.add((new StringBuilder(String.valueOf(s))).append("###").append(i + 1).toString());
                } else
                {
                    m_strings.add((new StringBuilder(String.valueOf(bookinfo.BookName))).append(" ").append(i + 1).toString());
                    m_tempstrings.add((new StringBuilder(String.valueOf(bookinfo.BookName))).append("###").append(i + 1).toString());
                }
                i++;
            }
        } while (true);
    }

    public void loadTodayVerse()
    {
        TodayInfo todayinfo;
        showProgress(getString(0x7f0700e6));
        todayinfo = getTodayInfo();
        if (todayinfo == null) goto _L2; else goto _L1
_L1:
        Date date;
        SimpleDateFormat simpledateformat;
        date = new Date();
        simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
        if (simpledateformat.parse(simpledateformat.format(date)).compareTo(simpledateformat.parse(simpledateformat.format(Long.valueOf(Date.parse(todayinfo.TodayDate))))) != 0) goto _L4; else goto _L3
_L3:
        LoadDatabaseTodayInfo(todayinfo);
_L5:
        LoadAutoText();
        return;
_L4:
        try
        {
            (new LoadToday()).execute(new Void[0]);
        }
        catch (ParseException parseexception) { }
        if (true) goto _L5; else goto _L2
_L2:
        (new LoadToday()).execute(new Void[0]);
        return;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 2 2: default 28
    //                   2 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j == -1)
        {
            book_count = intent.getIntExtra("book_id", 1);
            chap_count = intent.getIntExtra("chap_id", 1);
            verse_id = intent.getIntExtra("verse_id", 1);
            intent = new Intent(this, com/hmobile/biblekjv/MainBookActivity);
            intent.putExtra("book_id", book_count);
            intent.putExtra("chap_id", chap_count);
            intent.putExtra("verse_id", verse_id);
            intent.putExtra("search_flag", true);
            startActivity(intent);
            finish();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        if (view == btnShareTodayVerse)
        {
            if (todayverse != null)
            {
                view = new Intent(this, com/hmobile/biblekjv/ShareActivity);
                String s = (new StringBuilder(String.valueOf(bookname.trim()))).append(" ").append(todayverse.ChapterNumber).append(":").append(todayverse.VerseNumber).toString();
                view.putExtra("SHARETEXT", todayverse.Verse);
                view.putExtra("book", s);
                startActivity(view);
            }
        } else
        {
            if (view == btnReadBookOfDay)
            {
                EasyTracker.getTracker().sendEvent("Click", "Button", "Read book of day", Long.valueOf(10L));
                view = new Intent(this, com/hmobile/biblekjv/MainBookActivity);
                view.putExtra("Book_id", Todaybook.getID());
                startActivity(view);
                finish();
                return;
            }
            if (view == btnLastReadChapter)
            {
                int i = settings.getInt("last_read_book", 1);
                int j = settings.getInt("last_read_chapter", 1);
                EasyTracker.getTracker().sendEvent("Click", "Button", "Last Read Book", Long.valueOf(10L));
                view = new Intent(this, com/hmobile/biblekjv/MainBookActivity);
                view.putExtra("book_id", i);
                view.putExtra("chap_id", j);
                startActivity(view);
                finish();
                return;
            }
            if (view == imgRefresh)
            {
                if (!isFinishing())
                {
                    showProgress(getString(0x7f0700e6));
                }
                (new LoadToday()).execute(new Void[0]);
                return;
            }
            if (view == txtTodayVerse)
            {
                view = new Intent(this, com/hmobile/biblekjv/MainBookActivity);
                view.putExtra("verse_id", todayverse.VerseNumber);
                view.putExtra("chap_id", todayverse.ChapterNumber);
                view.putExtra("book_id", todayverse.BookId);
                view.putExtra("isFromToday", true);
                startActivity(view);
                finish();
                return;
            }
            if (view == txtTodayBook)
            {
                view = new Intent(this, com/hmobile/biblekjv/MainBookActivity);
                view.putExtra("Book_id", Todaybook.getID());
                startActivity(view);
                finish();
                return;
            }
            if (view == imgSearch)
            {
                llSearch.setVisibility(0);
                imgSearch.setVisibility(8);
                return;
            }
            if (view == imgCancelSearch)
            {
                llSearch.setVisibility(8);
                imgSearch.setVisibility(0);
                return;
            }
            if (view == imgSearchText)
            {
                getWindow().setSoftInputMode(3);
                view = edtSearch.getText().toString();
                if (view.length() > 1)
                {
                    Intent intent = new Intent(this, com/hmobile/biblekjv/SearchResultActivity);
                    intent.putExtra("search_word", view);
                    startActivityForResult(intent, 2);
                    llSearch.setVisibility(8);
                    imgSearch.setVisibility(0);
                    return;
                }
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f030033);
        setContentView(tabView.render(0));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        EasyTracker.getTracker().sendView("/TodayActivity");
        GAServiceManager.getInstance().dispatch();
        addQuickActionMenu();
        menuDialogDisplay();
        NotificationCenter.Instance().addObserver(this, "purchase", "showAdView", null);
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        editor = settings.edit();
        FavoriteInfo.copyFavs();
        BookMarkInfo.copyBookmarks();
        txtToday = (TextView)findViewById(0x7f0e00b6);
        txtTodayVerse = (TextView)findViewById(0x7f0e0127);
        txtLastRead = (TextView)findViewById(0x7f0e012c);
        btnShareTodayVerse = (Button)findViewById(0x7f0e0128);
        btnReadBookOfDay = (Button)findViewById(0x7f0e012b);
        btnLastReadChapter = (Button)findViewById(0x7f0e012d);
        txtTodayBook = (TextView)findViewById(0x7f0e012a);
        txtBookInfo = (TextView)findViewById(0x7f0e00ad);
        txtTitleBook = (TextView)findViewById(0x7f0e0129);
        txtTitleVerse = (TextView)findViewById(0x7f0e0126);
        imgSearch = (ImageView)findViewById(0x7f0e002d);
        imgSearchText = (ImageView)findViewById(0x7f0e0044);
        imgCancelSearch = (ImageView)findViewById(0x7f0e0041);
        edtSearch = (AutoCompleteTextView)findViewById(0x7f0e0045);
        llSearch = (RelativeLayout)findViewById(0x7f0e0040);
        bundle = Typeface.createFromAsset(getAssets(), getString(0x7f0700b7));
        Typeface typeface = Typeface.createFromAsset(getAssets(), getString(0x7f0700b8));
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), getString(0x7f0700b5));
        txtTodayVerse.setTypeface(bundle);
        txtTodayBook.setTypeface(bundle);
        txtToday.setTypeface(typeface1);
        txtBookInfo.setTypeface(typeface);
        txtTitleBook.setText(getResources().getString(0x7f070053));
        txtTitleVerse.setText(getResources().getString(0x7f070052));
        txtLastRead.setText(getString(0x7f070054));
        underlineText(txtLastRead);
        underlineText(txtTitleBook);
        underlineText(txtTitleVerse);
        imgRefresh = (ImageView)findViewById(0x7f0e0125);
        imgRefresh.setOnClickListener(this);
        btnShareTodayVerse.setOnClickListener(this);
        btnReadBookOfDay.setOnClickListener(this);
        btnLastReadChapter.setOnClickListener(this);
        txtTodayVerse.setOnClickListener(this);
        txtTodayBook.setOnClickListener(this);
        imgCancelSearch.setOnClickListener(this);
        imgSearch.setOnClickListener(this);
        imgSearchText.setOnClickListener(this);
        int i;
        if (HolyBibleApplication.getContext().getResources().getString(0x7f0700c0).equalsIgnoreCase("on"))
        {
            (new saveTodayVerseFromIds()).execute(new Void[0]);
        } else
        {
            loadTodayVerse();
        }
        if (!settings.getBoolean("isfontset", false))
        {
            editor.putString("font_style", "robotoregular.ttf");
            editor.putBoolean("isfontset", true);
            editor.commit();
        }
        edtSearch.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final TodayActivity this$0;

            public boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
            {
                if (k == 3)
                {
                    getWindow().setSoftInputMode(3);
                    textview = edtSearch.getText().toString();
                    if (textview.length() > 1)
                    {
                        keyevent = new Intent(TodayActivity.this, com/hmobile/biblekjv/SearchResultActivity);
                        keyevent.putExtra("search_word", textview);
                        keyevent.putExtra("FromToday", true);
                        startActivityForResult(keyevent, 2);
                        llSearch.setVisibility(8);
                        imgSearch.setVisibility(0);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = TodayActivity.this;
                super();
            }
        });
        edtSearch.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TodayActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int k, long l2)
            {
                adapterview = ((AdapterView) (adapterview.getItemAtPosition(k)));
                k = m_strings.indexOf(adapterview);
                adapterview = ((String)m_tempstrings.get(k)).split("###");
                view = new Intent(TodayActivity.this, com/hmobile/biblekjv/SearchResultActivity);
                view.putExtra("BookName", adapterview[0]);
                view.putExtra("ChapCount", adapterview[1]);
                view.putExtra("FromToday", true);
                view.putExtra("isFromAuto", true);
                startActivityForResult(view, 2);
                llSearch.setVisibility(8);
                imgSearch.setVisibility(0);
            }

            
            {
                this$0 = TodayActivity.this;
                super();
            }
        });
        if (PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(this, com/hmobile/common/MyDailyQuoteReceiver), 0x20000000) != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (settings.getBoolean("is_notification", true) && i == 0)
        {
            Utils.LogInfo("In Today Application ::: ");
            i = settings.getInt("notification_hour", 8);
            int j = settings.getInt("notification_min", 0);
            Object obj = Calendar.getInstance();
            ((Calendar) (obj)).set(11, i);
            ((Calendar) (obj)).set(12, j);
            bundle = Calendar.getInstance();
            if (((Calendar) (obj)).before(bundle))
            {
                ((Calendar) (obj)).add(5, 1);
            }
            long l = ((Calendar) (obj)).getTimeInMillis();
            long l1 = bundle.getTimeInMillis();
            obj = PendingIntent.getBroadcast(this, 0, new Intent(this, com/hmobile/common/MyDailyQuoteReceiver), 0x10000000);
            AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
            alarmmanager.cancel(((PendingIntent) (obj)));
            alarmmanager.setInexactRepeating(0, bundle.getTimeInMillis() + Long.valueOf(l - l1).longValue(), 0x5265c00L, ((PendingIntent) (obj)));
        }
    }

    protected void onResume()
    {
        if (HolyBibleApplication.mService != null)
        {
            showAdView();
        } else
        {
            hideAdView();
        }
        super.onResume();
    }

    public void showAdView()
    {
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

    public void underlineText(TextView textview)
    {
        try
        {
            SpannableString spannablestring = new SpannableString(textview.getText().toString());
            spannablestring.setSpan(new UnderlineSpan(), 0, spannablestring.length(), 0);
            textview.setText(spannablestring);
            textview.setTypeface(Typeface.createFromAsset(getAssets(), getString(0x7f0700b6)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            return;
        }
    }






}
