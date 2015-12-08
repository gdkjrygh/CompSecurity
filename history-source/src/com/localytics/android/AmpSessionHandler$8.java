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
//            AmpCallable, AmpSessionHandler, AmpDialogFragment, JavaScriptClient, 
//            Constants

class this._cls0 extends AmpCallable
{

    final AmpSessionHandler this$0;

    Object call(final Object ampMessage[])
    {
        ampMessage = (Map)ampMessage[0];
        (new AsyncTask() {

            final AmpSessionHandler._cls8 this$1;
            final Map val$ampMessage;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Map[])aobj);
            }

            protected transient Map doInBackground(Map amap[])
            {
                if (AmpSessionHandler.access$300(this$0, amap[0]))
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
                if (AmpSessionHandler.access$000(this$0) != null && AmpSessionHandler.access$000(this$0).findFragmentByTag((new StringBuilder()).append("amp_dialog").append(map.get("campaign_id")).toString()) == null)
                {
                    ampdialogfragment = AmpDialogFragment.newInstance();
                    ampdialogfragment.setRetainInstance(false);
                    ampdialogfragment.setData(map).setCallbacks(getDialogCallbacks()).setJavaScriptClient(new JavaScriptClient(getJavaScriptClientCallbacks(null))).show(AmpSessionHandler.access$000(this$0), (new StringBuilder()).append("amp_dialog").append(map.get("campaign_id")).toString());
                    AmpSessionHandler.access$000(this$0).executePendingTransactions();
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
                int i = ((Integer)ampMessage.get("_id")).intValue();
                boolean flag = AmpSessionHandler.access$100(this$0, ampMessage).endsWith(".zip");
                if (!AmpSessionHandler.access$200(this$0, i, flag))
                {
                    Toast.makeText(mContext, "Downloading the campaign...\nIt'll be shown in few seconds.", 0).show();
                }
            }

            
            {
                this$1 = AmpSessionHandler._cls8.this;
                ampMessage = map;
                super();
            }
        }).execute(new Map[] {
            ampMessage
        });
        return null;
    }

    _cls1.val.ampMessage()
    {
        this$0 = AmpSessionHandler.this;
        super();
    }
}
