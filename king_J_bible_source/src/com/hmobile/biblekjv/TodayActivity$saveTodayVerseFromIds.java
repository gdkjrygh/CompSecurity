// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.AsyncTask;
import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.model.TodayVerseInfo;
import java.util.List;

// Referenced classes of package com.hmobile.biblekjv:
//            TodayActivity, HolyBibleApplication

class size extends AsyncTask
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

    ()
    {
        this$0 = TodayActivity.this;
        super();
        size = 0;
    }
}
