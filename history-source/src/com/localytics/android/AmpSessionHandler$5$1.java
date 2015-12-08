// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler, AmpRulesAdapter

class this._cls1
    implements Runnable
{

    final DataSetChanged this$1;

    public void run()
    {
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final AmpSessionHandler._cls5._cls1 this$2;

            public void run()
            {
                adapter.updateDataSet(mProvider);
                adapter.notifyDataSetChanged();
            }

            
            {
                this$2 = AmpSessionHandler._cls5._cls1.this;
                super();
            }
        });
    }

    l.adapter()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/localytics/android/AmpSessionHandler$5

/* anonymous class */
    class AmpSessionHandler._cls5 extends AmpCallable
    {

        final AmpSessionHandler this$0;
        final AmpRulesAdapter val$adapter;

        Object call(Object aobj[])
        {
            sendMessage(obtainMessage(3, ((Object) (new Object[] {
                String.format("%s:%s", new Object[] {
                    mContext.getPackageName(), "Test Mode Update Data"
                }), null, null
            }))));
            sendMessage(obtainMessage(4, new AmpSessionHandler._cls5._cls1()));
            return null;
        }

            
            {
                this$0 = final_ampsessionhandler;
                adapter = AmpRulesAdapter.this;
                super();
            }
    }

}
