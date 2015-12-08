// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Browser;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.scannerfire.model.MyAdapter;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;

public class BookmarksListActivity extends SherlockActivity
{
    private class MyTask extends AsyncTask
    {

        final BookmarksListActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            as = getContentResolver().query(Browser.BOOKMARKS_URI, new String[] {
                "_id", "title", "url", "visits", "date", "favicon"
            }, "bookmark", null, null);
            if (as.moveToFirst())
            {
                do
                {
                    title.add(as.getString(as.getColumnIndex("title")));
                    url.add(as.getString(as.getColumnIndex("url")));
                    byte abyte0[] = as.getBlob(as.getColumnIndex("favicon"));
                    if (abyte0 != null)
                    {
                        android.graphics.Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
                        if (bitmap != null)
                        {
                            favicon.add(new BitmapDrawable(getResources(), bitmap));
                        }
                    } else
                    {
                        android.graphics.drawable.Drawable drawable = getResources().getDrawable(0x7f02008c);
                        favicon.add(drawable);
                    }
                } while (as.moveToNext());
            }
            prog.dismiss();
            return "OK";
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            s = new MyAdapter(BookmarksListActivity.this, 0x7f030032, favicon, title, url);
            BookmarksListActivity.lv.setAdapter(s);
        }

        protected void onPreExecute()
        {
        }

        protected volatile transient void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        private MyTask()
        {
            this$0 = BookmarksListActivity.this;
            super();
        }

        MyTask(MyTask mytask)
        {
            this();
        }
    }


    private static ListView lv;
    private ArrayList favicon;
    private ProgressDialog prog;
    private ArrayList title;
    private ArrayList url;
    private Utils utils;

    public BookmarksListActivity()
    {
        utils = new Utils();
        title = new ArrayList();
        favicon = new ArrayList();
        url = new ArrayList();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030020);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800c7);
        bundle.setHomeButtonEnabled(true);
        lv = (ListView)findViewById(0x7f0d0076);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final BookmarksListActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                (new EncodeUtils(BookmarksListActivity.this)).start((String)url.get(i), (String)url.get(i));
            }

            
            {
                this$0 = BookmarksListActivity.this;
                super();
            }
        });
        prog = utils.showProgress(this, getString(0x7f0800f8), getString(0x7f0800f9));
        (new MyTask(null)).execute(new String[0]);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }





}
