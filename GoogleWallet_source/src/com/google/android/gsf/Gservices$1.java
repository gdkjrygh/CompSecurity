// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

// Referenced classes of package com.google.android.gsf:
//            Gservices

static final class val.cr extends Thread
{

    final ContentResolver val$cr;

    public final void run()
    {
        Looper.prepare();
        val$cr.registerContentObserver(Gservices.CONTENT_URI, true, new ContentObserver(new Handler(Looper.myLooper())) {

            final Gservices._cls1 this$0;

            public final void onChange(boolean flag)
            {
                com/google/android/gsf/Gservices;
                JVM INSTR monitorenter ;
                Gservices.access$000().clear();
                Gservices.access$102(new Object());
                if (Gservices.access$200().length > 0)
                {
                    Gservices.bulkCacheByPrefix(cr, Gservices.access$200());
                }
                com/google/android/gsf/Gservices;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                com/google/android/gsf/Gservices;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = Gservices._cls1.this;
                super(handler);
            }
        });
        Looper.loop();
    }

    nit>(String s, ContentResolver contentresolver)
    {
        val$cr = contentresolver;
        super(s);
    }
}
