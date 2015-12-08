// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.graphics.Color;
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
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.BookMarkInfo;
import com.hmobile.model.NotesInfo;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, TabProvider, HolyBibleApplication, MainBookActivity, 
//            EditNotesActivity

public class BookMarkesActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    public class BookamrkListAdapter extends BaseAdapter
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
            view = new ViewHolderForBookMark();
            BookMarkInfo bookmarkinfo;
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
                view = (ViewHolderForBookMark)viewgroup.getTag();
            }
            bookmarkinfo = (BookMarkInfo)m_list.get(i);
            if (bookmarkinfo.isBackColor)
            {
                ((ViewHolderForBookMark) (view)).rlColor.setBackgroundColor(bookmarkinfo.backColor);
            } else
            {
                ((ViewHolderForBookMark) (view)).rlColor.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
            ((ViewHolderForBookMark) (view)).txtLable.setText(bookmarkinfo.Verse);
            ((ViewHolderForBookMark) (view)).txtTitle.setText(bookmarkinfo.Name);
            as = getDate(bookmarkinfo.date, "MMM/dd").split("/");
            ((ViewHolderForBookMark) (view)).txtDay.setText(as[0]);
            ((ViewHolderForBookMark) (view)).txtDate.setText(as[1]);
            s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(bookmarkinfo.book_id)));
            ((ViewHolderForBookMark) (view)).txtBookName.setText((new StringBuilder(String.valueOf(s))).append(" ").append(bookmarkinfo.chap_number).append(":").append(bookmarkinfo.verse_id).toString());
            ((ViewHolderForBookMark) (view)).rl.setOnClickListener(bookmarkinfo. new android.view.View.OnClickListener() {

                final BookamrkListAdapter this$1;
                private final BookMarkInfo val$bookmark;

                public void onClick(View view)
                {
                    view = new Intent(_fld0, com/hmobile/biblekjv/MainBookActivity);
                    view.putExtra("isFromBookMark", true);
                    view.putExtra("BookMarkId", bookmark.getID());
                    startActivity(view);
                    finish();
                }

            
            {
                this$1 = final_bookamrklistadapter;
                bookmark = BookMarkInfo.this;
                super();
            }
            });
            ((ViewHolderForBookMark) (view)).btnDelete.setOnClickListener(bookmarkinfo. new android.view.View.OnClickListener() {

                final BookamrkListAdapter this$1;
                private final BookMarkInfo val$bookmark;

                public void onClick(View view)
                {
                    try
                    {
                        bookmark.delete();
                        LoadViewForBookMark();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        view.printStackTrace();
                    }
                }

            
            {
                this$1 = final_bookamrklistadapter;
                bookmark = BookMarkInfo.this;
                super();
            }
            });
            return viewgroup;
        }


        public BookamrkListAdapter(ArrayList arraylist)
        {
            this$0 = BookMarkesActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public class NotesAdapter extends BaseAdapter
    {

        private ArrayList m_list;
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
            view = new ViewHolderForFavorite();
            NotesInfo notesinfo;
            String s;
            if (viewgroup == null)
            {
                viewgroup = getLayoutInflater().inflate(0x7f030026, null);
                viewgroup.setTag(view);
                view.btnDelete = (Button)viewgroup.findViewById(0x7f0e006a);
                view.btnEdit = (Button)viewgroup.findViewById(0x7f0e00b4);
                view.txtNotesTitle = (TextView)viewgroup.findViewById(0x7f0e00b3);
                view.txtNotesDesc = (TextView)viewgroup.findViewById(0x7f0e00b5);
                view.txtBookName = (TextView)viewgroup.findViewById(0x7f0e006c);
                view.txtDate = (TextView)viewgroup.findViewById(0x7f0e0069);
                view.rlNotesItem = (RelativeLayout)viewgroup.findViewById(0x7f0e00b2);
            } else
            {
                view = (ViewHolderForFavorite)viewgroup.getTag();
            }
            notesinfo = (NotesInfo)m_list.get(i);
            ((ViewHolderForFavorite) (view)).txtNotesTitle.setText(notesinfo.Title);
            ((ViewHolderForFavorite) (view)).txtNotesDesc.setText(notesinfo.Lable);
            s = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(notesinfo.book_id)));
            ((ViewHolderForFavorite) (view)).txtBookName.setText((new StringBuilder(String.valueOf(s))).append(" ").append(notesinfo.chap_number).append(":").append(notesinfo.verse_id).toString());
            ((ViewHolderForFavorite) (view)).txtDate.setText(getDate(notesinfo.date, "dd MMM, yy"));
            ((ViewHolderForFavorite) (view)).rlNotesItem.setOnClickListener(notesinfo. new android.view.View.OnClickListener() {

                final NotesAdapter this$1;
                private final NotesInfo val$noteInfo;

                public void onClick(View view)
                {
                    view = new Intent(_fld0, com/hmobile/biblekjv/MainBookActivity);
                    view.putExtra("isFromNotes", true);
                    view.putExtra("note_label", noteInfo.Lable);
                    view.putExtra("book_id", noteInfo.book_id);
                    view.putExtra("chap_id", noteInfo.chap_number);
                    view.putExtra("verse_id", noteInfo.verse_id);
                    startActivity(view);
                    finish();
                }

            
            {
                this$1 = final_notesadapter;
                noteInfo = NotesInfo.this;
                super();
            }
            });
            ((ViewHolderForFavorite) (view)).btnDelete.setOnClickListener(notesinfo. new android.view.View.OnClickListener() {

                final NotesAdapter this$1;
                private final NotesInfo val$noteInfo;

                public void onClick(View view)
                {
                    try
                    {
                        noteInfo.delete();
                        LoadViewForNotes();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        view.printStackTrace();
                    }
                }

            
            {
                this$1 = final_notesadapter;
                noteInfo = NotesInfo.this;
                super();
            }
            });
            ((ViewHolderForFavorite) (view)).btnEdit.setOnClickListener(notesinfo. new android.view.View.OnClickListener() {

                final NotesAdapter this$1;
                private final NotesInfo val$noteInfo;

                public void onClick(View view)
                {
                    view = new Intent(_fld0, com/hmobile/biblekjv/EditNotesActivity);
                    view.putExtra("notes_id", noteInfo.getID());
                    startActivityForResult(view, 1);
                }

            
            {
                this$1 = final_notesadapter;
                noteInfo = NotesInfo.this;
                super();
            }
            });
            return viewgroup;
        }


        public NotesAdapter(ArrayList arraylist)
        {
            this$0 = BookMarkesActivity.this;
            super();
            m_list = new ArrayList();
            m_list = arraylist;
        }
    }

    public static class ViewHolderForBookMark
    {

        Button btnDelete;
        RelativeLayout rl;
        RelativeLayout rlColor;
        TextView txtBookName;
        TextView txtDate;
        TextView txtDay;
        TextView txtLable;
        TextView txtTitle;

        public ViewHolderForBookMark()
        {
        }
    }

    public static class ViewHolderForFavorite
    {

        Button btnDelete;
        Button btnEdit;
        RelativeLayout rlNotesItem;
        TextView txtBookName;
        TextView txtDate;
        TextView txtNotesDesc;
        TextView txtNotesTitle;

        public ViewHolderForFavorite()
        {
        }
    }


    BookamrkListAdapter bookmarkAdapter;
    private Button btnBookmarks;
    private Button btnNotes;
    private boolean isbookmark;
    private ListView lstBookmarks;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    NotesAdapter notesAdapter;
    private TabView tabView;
    private TextView txtNoBookmark;

    public BookMarkesActivity()
    {
        bookmarkAdapter = null;
        isbookmark = true;
        notesAdapter = null;
    }

    public void LoadViewForBookMark()
    {
        txtNoBookmark.setVisibility(8);
        lstBookmarks.setVisibility(0);
        ArrayList arraylist = BookMarkInfo.getAllBookMark();
        if (arraylist != null && arraylist.size() > 0)
        {
            notesAdapter = null;
            bookmarkAdapter = new BookamrkListAdapter(arraylist);
            lstBookmarks.setAdapter(bookmarkAdapter);
            return;
        } else
        {
            lstBookmarks.setVisibility(8);
            txtNoBookmark.setVisibility(0);
            txtNoBookmark.setText(0x7f07005c);
            return;
        }
    }

    public void LoadViewForNotes()
    {
        txtNoBookmark.setVisibility(8);
        lstBookmarks.setVisibility(0);
        ArrayList arraylist = NotesInfo.getAllNotes();
        if (arraylist != null && arraylist.size() > 0)
        {
            bookmarkAdapter = null;
            notesAdapter = new NotesAdapter(arraylist);
            lstBookmarks.setAdapter(notesAdapter);
            return;
        } else
        {
            lstBookmarks.setVisibility(8);
            txtNoBookmark.setVisibility(0);
            txtNoBookmark.setText(0x7f0700bc);
            return;
        }
    }

    public String getDate(long l, String s)
    {
        s = new SimpleDateFormat(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        return s.format(calendar.getTime());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            intent = NotesInfo.getAllNotes();
            if (intent != null && intent.size() > 0)
            {
                notesAdapter = new NotesAdapter(intent);
                lstBookmarks.setAdapter(notesAdapter);
            }
        }
    }

    public void onClick(View view)
    {
        if (view == btnBookmarks)
        {
            LoadViewForBookMark();
            btnBookmarks.setBackgroundResource(0x7f020005);
            btnNotes.setBackgroundColor(0);
        } else
        if (view == btnNotes)
        {
            LoadViewForNotes();
            btnNotes.setBackgroundResource(0x7f020005);
            btnBookmarks.setBackgroundColor(0);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f030006);
        setContentView(tabView.render(3));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/HighLightsNotesActivity");
        lstBookmarks = (ListView)findViewById(0x7f0e0061);
        btnBookmarks = (Button)findViewById(0x7f0e005e);
        btnNotes = (Button)findViewById(0x7f0e005f);
        txtNoBookmark = (TextView)findViewById(0x7f0e0062);
        setFontStyleRoboto(btnBookmarks, getString(0x7f0700b8));
        setFontStyleRoboto(btnNotes, getString(0x7f0700b8));
        btnBookmarks.setOnClickListener(this);
        btnBookmarks.setTypeface(null, 1);
        btnNotes.setOnClickListener(this);
        btnNotes.setTypeface(null, 1);
        if (!HolyBibleApplication.isPurchased)
        {
            addAdView();
        } else
        {
            hideAdView();
        }
        LoadViewForNotes();
        LoadViewForBookMark();
    }

    protected void onResume()
    {
        super.onResume();
    }
}
