// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.hmobile.model.LikeShareList;

// Referenced classes of package com.hmobile.biblekjv:
//            MostLikeShareActivity

class this._cls0 extends AsyncTask
{

    final MostLikeShareActivity this$0;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        if (MostLikeShareActivity.access$0(MostLikeShareActivity.this));
        avoid = (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070098)).append("?PackageName=").append(getString(0x7f07004b)).append("&action=like").toString();
        infoLikes = LikeShareList.Instance().getAllLike(avoid);
        avoid = (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070098)).append("?PackageName=").append(getString(0x7f07004b)).append("&action=share").toString();
        infoShares = LikeShareList.Instance().getAllShare(avoid);
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        if (m_pd != null)
        {
            m_pd.dismiss();
        }
        bindData();
        super.onPostExecute(void1);
    }

    protected void onPreExecute()
    {
        if (m_pd != null)
        {
            m_pd.setCancelable(false);
            m_pd.show();
        }
        super.onPreExecute();
    }

    ()
    {
        this$0 = MostLikeShareActivity.this;
        super();
    }
}
