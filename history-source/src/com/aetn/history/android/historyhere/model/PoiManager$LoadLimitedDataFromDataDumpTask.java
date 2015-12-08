// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.os.AsyncTask;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager

class this._cls0 extends AsyncTask
{

    final PoiManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient ArrayList doInBackground(String as[])
    {
        Utils.logger(PoiManager.access$200(PoiManager.this), "LoadLimitedDataFromDataDumpTask(): running");
        return new ArrayList(Arrays.asList((POIDetail[])(new Gson()).fromJson(as[0], [Lcom/aetn/history/android/historyhere/model/POIDetail;)));
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ArrayList)obj);
    }

    protected void onPostExecute(ArrayList arraylist)
    {
        PoiManager.access$700(PoiManager.this, arraylist);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        super.onProgressUpdate(ainteger);
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    ()
    {
        this$0 = PoiManager.this;
        super();
    }
}
