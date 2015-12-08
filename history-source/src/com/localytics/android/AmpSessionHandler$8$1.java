// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.AsyncTask;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.widget.Toast;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            AmpSessionHandler, AmpDialogFragment, JavaScriptClient, Constants, 
//            AmpCallable

class val.ampMessage extends AsyncTask
{

    final text this$1;
    final Map val$ampMessage;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Map[])aobj);
    }

    protected transient Map doInBackground(Map amap[])
    {
        if (AmpSessionHandler.access$300(_fld0, amap[0]))
        {
            return amap[0];
        } else
        {
            return null;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Map)obj);
    }

    protected void onPostExecute(Map map)
    {
        if (map == null)
        {
            AmpDialogFragment ampdialogfragment;
            try
            {
                Toast.makeText(mContext, "The downloaded campaign file is broken.", 0).show();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map) { }
            break MISSING_BLOCK_LABEL_182;
        }
        if (AmpSessionHandler.access$000(_fld0) != null && AmpSessionHandler.access$000(_fld0).findFragmentByTag((new StringBuilder()).append("amp_dialog").append(map.get("campaign_id")).toString()) == null)
        {
            ampdialogfragment = AmpDialogFragment.newInstance();
            ampdialogfragment.setRetainInstance(false);
            ampdialogfragment.setData(map).setCallbacks(getDialogCallbacks()).setJavaScriptClient(new JavaScriptClient(getJavaScriptClientCallbacks(null))).show(AmpSessionHandler.access$000(_fld0), (new StringBuilder()).append("amp_dialog").append(map.get("campaign_id")).toString());
            AmpSessionHandler.access$000(_fld0).executePendingTransactions();
            return;
        }
        break MISSING_BLOCK_LABEL_197;
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", "Localytics library threw an uncaught exception", map);
        }
    }

    protected void onPreExecute()
    {
        int i = ((Integer)val$ampMessage.get("_id")).intValue();
        boolean flag = AmpSessionHandler.access$100(_fld0, val$ampMessage).endsWith(".zip");
        if (!AmpSessionHandler.access$200(_fld0, i, flag))
        {
            Toast.makeText(mContext, "Downloading the campaign...\nIt'll be shown in few seconds.", 0).show();
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$ampMessage = Map.this;
        super();
    }

    // Unreferenced inner class com/localytics/android/AmpSessionHandler$8

/* anonymous class */
    class AmpSessionHandler._cls8 extends AmpCallable
    {

        final AmpSessionHandler this$0;

        Object call(Object aobj[])
        {
            aobj = (Map)aobj[0];
            (((AmpSessionHandler._cls8._cls1) (aobj)). new AmpSessionHandler._cls8._cls1()).execute(new Map[] {
                aobj
            });
            return null;
        }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
    }

}
