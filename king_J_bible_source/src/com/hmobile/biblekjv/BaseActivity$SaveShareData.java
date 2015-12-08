// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.AsyncTask;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class chap_count extends AsyncTask
{

    int book_count;
    int chap_count;
    ArrayList m_verse_number_list;
    final BaseActivity this$0;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = "";
        if (m_verse_number_list.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = m_verse_number_list.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        avoid.substring(0, avoid.length() - 1);
        BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count))).replace(" ", "%20").trim();
        (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070099)).toString();
_L2:
        return null;
_L4:
        int i = ((Integer)iterator.next()).intValue();
        avoid = (new StringBuilder(String.valueOf(avoid))).append(String.valueOf(i)).append(",").toString();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        super.onPostExecute(void1);
    }

    public (ArrayList arraylist, int i, int j)
    {
        this$0 = BaseActivity.this;
        super();
        m_verse_number_list = new ArrayList();
        book_count = 1;
        chap_count = 1;
        m_verse_number_list = arraylist;
        book_count = i;
        chap_count = j;
    }
}
