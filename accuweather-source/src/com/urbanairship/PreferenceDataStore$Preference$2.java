// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.urbanairship:
//            PreferenceDataStore, Logger

class this._cls1 extends ContentObserver
{

    final ncValue this$1;

    public void onChange(boolean flag)
    {
        super.onChange(flag);
        Logger.verbose((new StringBuilder()).append("Preference updated:").append(cess._mth300(this._cls1.this)).toString());
        executor.execute(new Runnable() {

            final PreferenceDataStore.Preference._cls2 this$2;

            public void run()
            {
                syncValue();
            }

            
            {
                this$2 = PreferenceDataStore.Preference._cls2.this;
                super();
            }
        });
    }

    _cls1.this._cls2(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }
}
