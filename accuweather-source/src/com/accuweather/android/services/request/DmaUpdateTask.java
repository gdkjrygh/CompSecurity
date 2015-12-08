// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.content.Context;
import android.content.res.Resources;
import com.accuweather.android.models.DmaModel;
import com.accuweather.android.services.BaseUpdateTask;
import com.accuweather.android.services.DmaService;
import com.accuweather.android.utilities.Data;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.InputSource;

public class DmaUpdateTask extends BaseUpdateTask
{

    private Exception lastException;

    public DmaUpdateTask(Data data)
    {
        super(data);
        lastException = null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((List[])aobj);
    }

    protected transient Object doInBackground(List alist[])
    {
        alist = (new DmaService()).retrieveDMAs(new InputSource(data.getContext().getResources().openRawResource(com.accuweather.android.R.raw.dma)));
        int i = 0;
_L2:
        if (i >= alist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        DmaModel dmamodel = (DmaModel)alist.get(i);
        data.getDmaModels().put(dmamodel.getMarketId(), dmamodel);
        i++;
        if (true) goto _L2; else goto _L1
        alist;
        lastException = alist;
_L1:
        return null;
    }

    public boolean equals(Object obj)
    {
        return obj != null && obj.getClass().equals(getClass()) && obj.hashCode() == hashCode();
    }

    public int hashCode()
    {
        return toString().hashCode();
    }

    protected void onPostExecute(Object obj)
    {
        if (lastException != null)
        {
            data.notifyMainAppWeatherCallError(lastException);
        }
        data.removeTaskFromQueue();
        data.executeNextTask();
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }
}
