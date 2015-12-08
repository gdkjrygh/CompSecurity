// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.urbanairship:
//            PreferenceDataStore, Logger

class this._cls2
    implements Runnable
{

    final Value this$2;

    public void run()
    {
        Value();
    }

    is._cls1()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/urbanairship/PreferenceDataStore$Preference$2

/* anonymous class */
    class PreferenceDataStore.Preference._cls2 extends ContentObserver
    {

        final PreferenceDataStore.Preference this$1;

        public void onChange(boolean flag)
        {
            super.onChange(flag);
            Logger.verbose((new StringBuilder()).append("Preference updated:").append(PreferenceDataStore.Preference.access$300(PreferenceDataStore.Preference.this)).toString());
            executor.execute(new PreferenceDataStore.Preference._cls2._cls1());
        }

            
            {
                this$1 = PreferenceDataStore.Preference.this;
                super(handler);
            }
    }

}
