// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.g;
import com.cardinalblue.android.piccollage.activities.BaseActivity;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.a.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class MainActivity extends BaseActivity
{
    private static class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            MainActivity mainactivity = (MainActivity)a.get();
            message.what;
            JVM INSTR tableswitch 1 1: default 32
        //                       1 38;
               goto _L1 _L2
_L1:
            super.handleMessage(message);
_L4:
            return;
_L2:
            if (mainactivity != null)
            {
                message = new Intent(mainactivity, com/cardinalblue/android/piccollage/activities/HomeActivity);
                g.a(message, mainactivity.getIntent().getExtras());
                mainactivity.startActivity(message);
                mainactivity.finish();
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public a(MainActivity mainactivity)
        {
            a = new WeakReference(mainactivity);
        }
    }


    private Handler a;

    public MainActivity()
    {
        a = new a(this);
    }

    static Handler a(MainActivity mainactivity)
    {
        return mainactivity.a;
    }

    static void a(MainActivity mainactivity, File file)
    {
        mainactivity.a(file);
    }

    private void a(File file)
    {
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                int l = afile.length;
                int i = 0;
                while (i < l) 
                {
                    File file1 = afile[i];
                    if (file1.isDirectory())
                    {
                        a(file1);
                    } else
                    {
                        file1.deleteOnExit();
                    }
                    i++;
                }
            }
            file.deleteOnExit();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(null);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030031);
        bundle = getIntent().getData();
        boolean flag;
        if (bundle != null && "piccollage".equals(getIntent().getScheme()))
        {
            startService(PICAppRoutesService.a(bundle));
            flag = true;
        } else
        {
            flag = false;
        }
        f.g(this);
        if (!flag && k.m(this))
        {
            f.a(this);
            b.aR();
            if ((long)PreferenceManager.getDefaultSharedPreferences(this).getInt("version_code", 0) == 0L)
            {
                b.aS();
            }
            b.e(Locale.getDefault().getDisplayLanguage(Locale.US), Locale.getDefault().getDisplayName(Locale.US));
            j.a(new Callable(com.cardinalblue.android.piccollage.model.a.a.a(this)) {

                final com.cardinalblue.android.piccollage.model.a.a a;
                final MainActivity b;

                public Object call()
                    throws Exception
                {
                    Map map;
                    boolean flag1;
                    a.getReadableDatabase();
                    a.close();
                    map = k.b("cardinalblue_video_ad_metadata").getAll();
                    flag1 = map.isEmpty();
                    if (flag1)
                    {
                        com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
                        return null;
                    }
                    o o1;
                    List list;
                    o1 = o.a();
                    list = o1.g();
                    int i = 0;
                    Iterator iterator = map.keySet().iterator();
_L2:
                    Object obj1;
                    Iterator iterator1;
                    if (!iterator.hasNext())
                    {
                        break MISSING_BLOCK_LABEL_216;
                    }
                    obj1 = (String)iterator.next();
                    iterator1 = list.iterator();
_L4:
                    if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
                    StickerBundle stickerbundle = (StickerBundle)iterator1.next();
                    if (!stickerbundle.f().equals(obj1)) goto _L4; else goto _L3
_L3:
                    obj1 = new File(o1.f(), (new StringBuilder()).append(stickerbundle.f()).append(".bundle").toString());
                    if (!((File) (obj1)).exists() || !((File) (obj1)).isDirectory()) goto _L2; else goto _L5
_L5:
                    com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b, ((File) (obj1)));
                    i++;
                      goto _L2
                    if (i != map.size()) goto _L7; else goto _L6
_L6:
                    k.b("cardinalblue_video_ad_metadata").edit().clear().commit();
_L9:
                    com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
                    return null;
_L7:
                    f.a(new IllegalStateException((new StringBuilder()).append("it have to removes ").append(map.size()).append(" sticker packs, but it only removes ").append(i).toString()));
                    if (true) goto _L9; else goto _L8
_L8:
                    Object obj;
                    obj;
                    f.a(((Throwable) (obj)));
                    com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
                    return null;
                    obj;
                    com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity.a(b).sendEmptyMessageDelayed(1, 2000L);
                    throw obj;
                }

            
            {
                b = MainActivity.this;
                a = a1;
                super();
            }
            });
            f.b(this);
            return;
        } else
        {
            startActivity(new Intent(this, com/cardinalblue/android/piccollage/activities/HomeActivity));
            finish();
            return;
        }
    }
}
