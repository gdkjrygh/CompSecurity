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
//            PoiManager, PoiDbManager

class this._cls0 extends AsyncTask
{

    final PoiManager this$0;

    protected transient Boolean doInBackground(String as[])
    {
        Utils.logger(PoiManager.access$200(PoiManager.this), "LoadAllPoisFromDataDumpTask(): running");
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("LoadAllPoisFromDataDumpTask: the response was this long: ").append(as[0].length()).toString());
        as = new ArrayList(Arrays.asList((POIDetail[])(new Gson()).fromJson(as[0], [Lcom/aetn/history/android/historyhere/model/POIDetail;)));
        PoiDbManager.getInstance(PoiManager.access$300()).addPois(as, true);
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        PoiManager.access$600(PoiManager.this);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
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
