// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import ing;
import ite;
import iuj;
import iun;
import msv;
import noy;
import noz;
import nxx;
import pbm;
import pdz;

public class PrefetchStoryService extends IntentService
{

    private noz a;

    public PrefetchStoryService()
    {
        super("PrefetchStoryService");
    }

    public static void a(Context context, int i, iuj iuj1)
    {
        Intent intent = new Intent(context, com/google/android/apps/photos/stories/PrefetchStoryService);
        intent.putExtra("account_id", i);
        intent.putExtra("story_ref", iuj1);
        context.startService(intent);
    }

    public void onCreate()
    {
        super.onCreate();
        a = noz.a(this, 3, "PrefetchStoryService", new String[] {
            "sync"
        });
    }

    protected void onHandleIntent(Intent intent)
    {
        int i;
        i = intent.getIntExtra("account_id", -1);
        intent = (iuj)intent.getParcelableExtra("story_ref");
        msv msv1 = msv.b;
        if (ite.a(this, i, intent) != null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        if (a.a())
        {
            noy.a(i);
            noy.a("storyMediaKey", ((iuj) (intent)).a);
        }
        Object obj;
        obj = new ing(this, i, intent, null, null, true, false, ite.a(ite.a(this)), false, false);
        ((ing) (obj)).d();
        if (!((ing) (obj)).l())
        {
            obj = ((pbm)((ing) (obj)).t()).a.a;
            ite.a(((pev) (obj)), ((iuj) (intent)).a);
            iun.a(this, i, ((pev) (obj)), false);
            obj = msv.c;
            if (a.a())
            {
                noy.a(i);
                noy.a("storyMediaKey", ((iuj) (intent)).a);
                return;
            }
            break MISSING_BLOCK_LABEL_260;
        }
        try
        {
            msv msv2 = msv.d;
            if (a.a())
            {
                Exception exception = ((nxx) (obj)).n;
                noy.a(i);
                noy.a("storyMediaKey", ((iuj) (intent)).a);
                noy.a("errorCode", Integer.valueOf(((nxx) (obj)).l));
                noy.a("reason", ((nxx) (obj)).m);
                return;
            }
        }
        catch (Throwable throwable)
        {
            if (a.a())
            {
                noy.a(i);
                noy.a("storyMediaKey", ((iuj) (intent)).a);
            }
            Log.w("PrefetchStoryService", "Could not prefetch story", throwable);
            intent = msv.d;
            return;
        }
        break MISSING_BLOCK_LABEL_260;
        intent = msv.e;
    }
}
