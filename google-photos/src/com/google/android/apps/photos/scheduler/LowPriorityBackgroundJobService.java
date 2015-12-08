// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.scheduler;

import android.app.IntentService;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import hqf;
import hqk;
import hqn;
import hqo;
import java.util.Iterator;
import java.util.List;
import mmv;
import noy;
import noz;
import olm;

public final class LowPriorityBackgroundJobService extends IntentService
{

    public LowPriorityBackgroundJobService()
    {
        super("LowPriorityJobService");
    }

    private void a(int i, hqo hqo1)
    {
        long l = noy.a();
        noz noz1 = noz.a(this, 3, "Scheduler", new String[0]);
        Object obj = olm.c(this, hqf);
        olm olm1 = olm.b(this);
        String s = olm1.a("LoginAccountHandler.account_key", null);
        if (TextUtils.isEmpty(s))
        {
            hqo1 = String.valueOf(s);
            if (hqo1.length() != 0)
            {
                hqo1 = "Got invalid account key? ".concat(hqo1);
            } else
            {
                hqo1 = new String("Got invalid account key? ");
            }
            throw new IllegalStateException(hqo1);
        }
        int j = ((mmv)olm1.a(mmv)).c(s);
        if (noz1.a())
        {
            noy.a(j);
            noy.a("run id", Integer.valueOf(i));
            noy.a("total jobs", Integer.valueOf(((List) (obj)).size()));
        }
        obj = ((List) (obj)).iterator();
        do
        {
            hqf hqf1;
label0:
            {
                if (((Iterator) (obj)).hasNext())
                {
                    hqf1 = (hqf)((Iterator) (obj)).next();
                    if (!hqo1.c)
                    {
                        break label0;
                    }
                    if (noz1.a())
                    {
                        noy.a("duration", l);
                    }
                }
                if (noz1.a())
                {
                    noy.a(j);
                    noy.a("isCancelled", Boolean.valueOf(hqo1.c));
                    noy.a("duration", l);
                }
                return;
            }
            long l1 = noy.a();
            hqf1.a(j, hqo1);
            if (noz1.a())
            {
                noy.a(j);
                noy.a("name", hqf1.a());
                noy.a("isCancelled", Boolean.valueOf(hqo1.c));
                noy.a("duration", l1);
            }
        } while (true);
    }

    protected final void onHandleIntent(Intent intent)
    {
        hqo hqo1;
        int i;
        Process.setThreadPriority(10);
        i = intent.getIntExtra("com.google.android.apps.photos.scheduler.id", -1);
        if (i == -1)
        {
            intent = String.valueOf(intent);
            throw new IllegalStateException((new StringBuilder(String.valueOf(intent).length() + 46)).append("Received invalid id: ").append(i).append(" from intent: ").append(intent).toString());
        }
        intent = new hqk();
        intent.a(this);
        hqo1 = ((hqn)olm.a(this, hqn)).a(i);
        a(i, hqo1);
        hqo1.a();
        intent.b(this);
        return;
        Exception exception;
        exception;
        hqo1.a();
        intent.b(this);
        throw exception;
    }
}
