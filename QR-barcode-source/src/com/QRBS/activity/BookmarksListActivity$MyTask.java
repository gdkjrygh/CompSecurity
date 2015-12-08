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
import android.provider.Browser;
import android.widget.ListView;
import com.scannerfire.model.MyAdapter;
import java.util.ArrayList;

// Referenced classes of package com.QRBS.activity:
//            BookmarksListActivity

private class <init> extends AsyncTask
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
                BookmarksListActivity.access$0(BookmarksListActivity.this).add(as.getString(as.getColumnIndex("title")));
                BookmarksListActivity.access$1(BookmarksListActivity.this).add(as.getString(as.getColumnIndex("url")));
                byte abyte0[] = as.getBlob(as.getColumnIndex("favicon"));
                if (abyte0 != null)
                {
                    android.graphics.Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
                    if (bitmap != null)
                    {
                        BookmarksListActivity.access$2(BookmarksListActivity.this).add(new BitmapDrawable(getResources(), bitmap));
                    }
                } else
                {
                    android.graphics.drawable.Drawable drawable = getResources().getDrawable(0x7f02008c);
                    BookmarksListActivity.access$2(BookmarksListActivity.this).add(drawable);
                }
            } while (as.moveToNext());
        }
        BookmarksListActivity.access$3(BookmarksListActivity.this).dismiss();
        return "OK";
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        s = new MyAdapter(BookmarksListActivity.this, 0x7f030032, BookmarksListActivity.access$2(BookmarksListActivity.this), BookmarksListActivity.access$0(BookmarksListActivity.this), BookmarksListActivity.access$1(BookmarksListActivity.this));
        BookmarksListActivity.access$4().setAdapter(s);
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

    private ()
    {
        this$0 = BookmarksListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
