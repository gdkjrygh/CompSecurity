// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.app.ListActivity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Browser;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.google.zxing.client.android.share:
//            BookmarkAdapter

public final class BookmarkPickerActivity extends ListActivity
{

    private static final String BOOKMARK_PROJECTION[] = {
        "title", "url"
    };
    private static final String BOOKMARK_SELECTION = "bookmark = 1 AND url IS NOT NULL";
    private static final String TAG = com/google/zxing/client/android/share/BookmarkPickerActivity.getSimpleName();
    static final int TITLE_COLUMN = 0;
    static final int URL_COLUMN = 1;
    private Cursor cursor;

    public BookmarkPickerActivity()
    {
        cursor = null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        cursor = getContentResolver().query(Browser.BOOKMARKS_URI, BOOKMARK_PROJECTION, "bookmark = 1 AND url IS NOT NULL", null, null);
        if (cursor == null)
        {
            Log.w(TAG, "No cursor returned for bookmark query");
            finish();
            return;
        } else
        {
            startManagingCursor(cursor);
            setListAdapter(new BookmarkAdapter(this, cursor));
            return;
        }
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
        if (!cursor.isClosed() && cursor.moveToPosition(i))
        {
            listview = new Intent();
            listview.addFlags(0x80000);
            listview.putExtra("title", cursor.getString(0));
            listview.putExtra("url", cursor.getString(1));
            setResult(-1, listview);
        } else
        {
            setResult(0);
        }
        finish();
    }

}
