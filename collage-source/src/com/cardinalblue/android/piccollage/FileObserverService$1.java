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

class a extends FileObserver
{

    final String a;
    final FileObserverService b;

    public void onEvent(int i, String s)
    {
        if (k.j().getBoolean("key_create_collage_reminder_notification", true) && FileObserverService.a(b, s))
        {
            Log.v("FileObserverService", (new StringBuilder()).append("File created [").append(s).append("] : ").append(i).toString());
            if (FileObserverService.a(b).incrementAndGet() % 10 == 0)
            {
                s = new File(a, s);
                j.a(new Callable(s) {

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
                }).c(new i(s) {

                    final File a;
                    final FileObserverService._cls1 b;

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

            
            {
                b = FileObserverService._cls1.this;
                a = file;
                super();
            }
                }, k.a).a(new i() {

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
                });
                return;
            }
        }
    }

    _cls3.a(FileObserverService fileobserverservice, String s, int i, String s1)
    {
        b = fileobserverservice;
        a = s1;
        super(s, i);
    }
}
