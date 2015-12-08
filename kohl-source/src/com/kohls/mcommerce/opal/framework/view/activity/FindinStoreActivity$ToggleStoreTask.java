// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FindinStoreActivity

protected class this._cls0 extends AsyncTask
{

    final FindinStoreActivity this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Boolean[])aobj);
    }

    protected transient List doInBackground(Boolean aboolean[])
    {
        if (mIsShowAllStore && mStoreData != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = mStoreData.iterator();
            do
            {
                aboolean = arraylist;
                if (!iterator.hasNext())
                {
                    break;
                }
                aboolean = (com.kohls.mcommerce.opal.framework.vo.eData)iterator.next();
                if (aboolean.lability() != null && !aboolean.lability().contains("Out") && aboolean.lableStock() != null && Integer.parseInt(aboolean.lableStock()) > 0 && (selectedQuantity == 0 || selectedQuantity <= Integer.parseInt(aboolean.lableStock())))
                {
                    arraylist.add(aboolean);
                }
            } while (true);
        } else
        {
            aboolean = mStoreData;
        }
        return aboolean;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        super.onPostExecute(list);
        showStores(list);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
    }

    protected ()
    {
        this$0 = FindinStoreActivity.this;
        super();
    }
}
