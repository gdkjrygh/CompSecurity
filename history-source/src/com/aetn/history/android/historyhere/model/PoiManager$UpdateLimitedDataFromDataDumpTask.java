// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.os.AsyncTask;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager, PoiDbManager, POIDetail

class this._cls0 extends AsyncTask
{

    final PoiManager this$0;

    protected transient Boolean doInBackground(ArrayList aarraylist[])
    {
        Utils.logger(PoiManager.access$200(PoiManager.this), "UpdateLimitedDataFromDataDumpTask(): running");
        aarraylist = aarraylist[0];
        ArrayList arraylist = new ArrayList();
        new ArrayList();
        Object obj = PoiDbManager.getInstance(PoiManager.access$300()).getRowsForUpdate(aarraylist);
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): this is how many need to be updated:").append(((ArrayList) (obj)).size()).toString());
        obj = ((ArrayList) (obj)).iterator();
label0:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            POIDetail poidetail = (POIDetail)((Iterator) (obj)).next();
            Iterator iterator = aarraylist.iterator();
            POIDetail poidetail1;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                poidetail1 = (POIDetail)iterator.next();
            } while (!poidetail.getId().equalsIgnoreCase(poidetail1.getId()));
            Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): FOUND ONE: ").append(poidetail.getTitle()).toString());
            arraylist.add(poidetail);
            aarraylist.remove(poidetail1);
        } while (true);
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): updateList.size():").append(arraylist.size()).toString());
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): insertList.size():").append(aarraylist.size()).toString());
        if (arraylist.size() > 0)
        {
            PoiDbManager.getInstance(PoiManager.access$300()).updatePois(arraylist);
        }
        if (aarraylist.size() > 0)
        {
            PoiDbManager.getInstance(PoiManager.access$300()).addPois(aarraylist, false);
        }
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((ArrayList[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        Utils.logger(PoiManager.access$200(PoiManager.this), "UpdateLimitedDataFromDataDumpTask(): onPostExecute: success");
        PoiManager.access$800(PoiManager.this);
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
