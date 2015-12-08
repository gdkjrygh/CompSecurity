// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager, PoiDbManager

class this._cls0 extends AsyncTask
{

    final PoiManager this$0;

    protected transient Boolean doInBackground(String as[])
    {
        Object obj;
        Utils.logger(PoiManager.access$200(PoiManager.this), "LoadAllPoisFromAssetsTask(): running");
        obj = PoiManager.access$300().getAssets();
        as = "";
        obj = PoiManager.access$500(((AssetManager) (obj)).open("fulldata_2015_01_22.json"));
        as = ((String []) (obj));
_L1:
        IOException ioexception;
        if (as.isEmpty())
        {
            return Boolean.valueOf(false);
        } else
        {
            as = new ArrayList(Arrays.asList((POIDetail[])(new Gson()).fromJson(as, [Lcom/aetn/history/android/historyhere/model/POIDetail;)));
            PoiDbManager.getInstance(PoiManager.access$300()).addPois(as, false);
            return Boolean.valueOf(true);
        }
        ioexception;
        ioexception.printStackTrace();
          goto _L1
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            PoiManager.access$600(PoiManager.this);
            return;
        } else
        {
            Utils.logger(PoiManager.access$200(PoiManager.this), "getFullPoiList(): FAILED");
            return;
        }
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
