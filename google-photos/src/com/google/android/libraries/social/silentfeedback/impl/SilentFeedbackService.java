// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.silentfeedback.impl;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import lzq;
import lzr;
import mbb;
import mbc;
import mbd;
import mbf;
import obp;
import obr;
import olm;

public final class SilentFeedbackService extends Service
{

    private final Object a = new Object();
    private int b;
    private int c;

    public SilentFeedbackService()
    {
        b = 0;
        c = 0;
    }

    public static mbd a(SilentFeedbackService silentfeedbackservice, Intent intent)
    {
        silentfeedbackservice = (mbf)olm.a(silentfeedbackservice.getApplication(), mbf);
        if (intent != null)
        {
            silentfeedbackservice.a(" ");
            silentfeedbackservice.a(true);
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass"))
            {
                silentfeedbackservice.c(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass"));
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace"))
            {
                silentfeedbackservice.g(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace"));
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass"))
            {
                silentfeedbackservice.e(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass"));
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile"))
            {
                silentfeedbackservice.d(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile"));
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine"))
            {
                silentfeedbackservice.a(intent.getIntExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", -1));
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod"))
            {
                silentfeedbackservice.f(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod"));
            }
            if (intent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag"))
            {
                silentfeedbackservice.b(intent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag"));
            }
        }
        return silentfeedbackservice.a();
    }

    public static void a(SilentFeedbackService silentfeedbackservice)
    {
        silentfeedbackservice.b();
    }

    private final boolean a()
    {
        boolean flag = false;
        int i;
        try
        {
            i = getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            i = 0;
        }
        if (i >= 0x645b68)
        {
            flag = true;
        }
        return flag;
    }

    private void b()
    {
        Integer integer = null;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int i;
        i = b - 1;
        b = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        integer = Integer.valueOf(c);
        obj;
        JVM INSTR monitorexit ;
        if (integer != null)
        {
            stopSelf(integer.intValue());
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        synchronized (a)
        {
            b = b + 1;
            c = j;
        }
        if (!a())
        {
            b();
            return 2;
        } else
        {
            lzq lzq1 = ((lzr)olm.a(getApplication(), lzr)).a(((mbc)olm.a(getApplication(), mbc)).a()).a();
            lzq1.a(new obp(this, ((mbb)olm.a(getApplication(), mbb)).a(lzq1), intent, lzq1));
            lzq1.a(new obr(this));
            lzq1.a();
            return 2;
        }
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }
}
