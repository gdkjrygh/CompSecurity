// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.v5:
//            AveDBUpdateService

private class <init> extends BroadcastReceiver
{

    final AveDBUpdateService a;

    public void onReceive(Context context, Intent intent)
    {
        <init> <init>1;
        if (intent != null)
        {
            context = intent.getExtras();
        } else
        {
            context = null;
        }
        <init>1 = (<init>)AveDBUpdateService.b().get();
        if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (<init>1 != null)
        {
            <init>1.b(context);
        }
_L4:
        return;
_L2:
        if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (<init>1 != null)
        {
            <init>1.e(context);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (<init>1 != null)
        {
            <init>1.a(context);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (<init>1 != null)
        {
            <init>1.d(context);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!"com.qihoo.antivirus.update.action.ERROR".equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (<init>1 == null) goto _L4; else goto _L7
_L7:
        <init>1.c(context);
        return;
        if (!"com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER".equals(intent.getAction()) || <init>1 == null) goto _L4; else goto _L8
_L8:
        <init>1.f(context);
        return;
    }

    private (AveDBUpdateService avedbupdateservice)
    {
        a = avedbupdateservice;
        super();
    }

    a(AveDBUpdateService avedbupdateservice, a a1)
    {
        this(avedbupdateservice);
    }
}
