// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.roidapp.photogrid.release.PhotoGridActivity;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

public class LauncherActivity extends Activity
{

    private static final UriMatcher a;

    public LauncherActivity()
    {
    }

    private static boolean a(Context context)
    {
label0:
        {
            context = (ActivityManager)context.getSystemService("activity");
            if (context == null)
            {
                break label0;
            }
            context = context.getRunningTasks(100);
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            android.app.ActivityManager.RunningTaskInfo runningtaskinfo;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                runningtaskinfo = (android.app.ActivityManager.RunningTaskInfo)context.next();
            } while (runningtaskinfo.topActivity == null || !"com.roidapp.photogrid.release.PhotoGridActivity".equals(runningtaskinfo.topActivity.getClassName()));
            return true;
        }
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(new FrameLayout(this));
        if (getIntent() == null) goto _L2; else goto _L1
_L1:
        bundle = getIntent().getData();
        if (bundle == null) goto _L2; else goto _L3
_L3:
        a.match(bundle);
        JVM INSTR tableswitch 1 1: default 60
    //                   1 65;
           goto _L2 _L4
_L2:
        finish();
        return;
_L4:
        long l;
        try
        {
            l = ContentUris.parseId(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            l = -1L;
        }
        if (l > 0L)
        {
            if (a(this))
            {
                bundle = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
                bundle.addFlags(0x400000);
                startActivity(bundle);
            } else
            {
                bundle = new Intent(this, com/roidapp/photogrid/MainPage);
                bundle.putExtra("cmlTid", l);
                bundle.addFlags(32768);
                bundle.addFlags(0x4000000);
                startActivity(bundle);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        a = urimatcher;
        urimatcher.addURI("open", "/template/#", 1);
    }
}
