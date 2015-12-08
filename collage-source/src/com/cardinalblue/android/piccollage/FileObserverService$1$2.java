// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.FileObserver;
import android.util.Log;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            FileObserverService

class a
    implements i
{

    final File a;
    final a b;

    public Object then(j j1)
        throws Exception
    {
        if (j1.e() == null)
        {
            return null;
        } else
        {
            FileObserverService.b(b.b).notify(0xf4240, FileObserverService.a(b.b, a, (Bitmap)j1.e()));
            return null;
        }
    }

    a(a a1, File file)
    {
        b = a1;
        a = file;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/FileObserverService$1

/* anonymous class */
    class FileObserverService._cls1 extends FileObserver
    {

        final String a;
        final FileObserverService b;

        public void onEvent(int l, String s)
        {
            if (k.j().getBoolean("key_create_collage_reminder_notification", true) && FileObserverService.a(b, s))
            {
                Log.v("FileObserverService", (new StringBuilder()).append("File created [").append(s).append("] : ").append(l).toString());
                if (FileObserverService.a(b).incrementAndGet() % 10 == 0)
                {
                    s = new File(a, s);
                    j.a(new FileObserverService._cls1._cls3(s)).c(new FileObserverService._cls1._cls2(this, s), k.a).a(new FileObserverService._cls1._cls1());
                    return;
                }
            }
        }

            
            {
                b = fileobserverservice;
                a = s1;
                super(s, l);
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/FileObserverService$1$1

/* anonymous class */
        class FileObserverService._cls1._cls1
            implements i
        {

            final FileObserverService._cls1 a;

            public Object then(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    j1.f().printStackTrace();
                }
                return null;
            }

                    
                    {
                        a = FileObserverService._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/FileObserverService$1$3

/* anonymous class */
        class FileObserverService._cls1._cls3
            implements Callable
        {

            final File a;
            final FileObserverService._cls1 b;

            public Bitmap a()
                throws Exception
            {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inSampleSize = 8;
                return BitmapFactory.decodeFile(a.getAbsolutePath(), options);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

                    
                    {
                        b = FileObserverService._cls1.this;
                        a = file;
                        super();
                    }
        }

    }

}
