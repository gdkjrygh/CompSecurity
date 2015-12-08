// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.AsyncTask;
import android.widget.Spinner;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            SearchResultActivity

public class isAutoText extends AsyncTask
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
        spinAdapter = new (SearchResultActivity.this, m_book);
        spnBook.setAdapter(spinAdapter);
    }

    public (boolean flag)
    {
        this$0 = SearchResultActivity.this;
        super();
        m_book = null;
        isAutoText = false;
        isAutoText = flag;
    }
}
