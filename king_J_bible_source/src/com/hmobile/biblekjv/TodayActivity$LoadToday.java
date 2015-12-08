// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.AsyncTask;
import android.widget.TextView;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.TodayVerseInfo;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.hmobile.biblekjv:
//            TodayActivity

public class this._cls0 extends AsyncTask
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
            TodayActivity.access$0(TodayActivity.this).setText(todayverse.Verse);
            bookname = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(todayverse.BookId)));
            TodayActivity.access$1(TodayActivity.this).setText((new StringBuilder(String.valueOf(bookname.trim()))).append(" ").append(todayverse.ChapterNumber).append(":").append(todayverse.VerseNumber).toString());
        }
        if (Todaybook != null)
        {
            TodayActivity.access$2(TodayActivity.this).setText(Todaybook.BookName.trim());
        }
        LoadAutoText();
        if (!isFinishing())
        {
            hideProgress();
        }
    }

    public ()
    {
        this$0 = TodayActivity.this;
        super();
    }
}
