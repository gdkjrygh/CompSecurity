// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.VerseInfo;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SearchResultActivity

public class bookname extends AsyncTask
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

    public (boolean flag, String s)
    {
        this$0 = SearchResultActivity.this;
        super();
        isSearchByBook = flag;
        bookname = s;
    }
}
