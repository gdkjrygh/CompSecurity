// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;

final class ang.Object
    implements ckp
{

    private bzw a;

    public final void a(Object obj)
    {
        bzw bzw1;
        obj = (cae)obj;
        bzw.a(a);
        bzw1 = a;
        ((cae) (obj)).a("/updateActiveView", bzw1.f);
        ((cae) (obj)).a("/untrackActiveViewUnit", bzw1.g);
        ((cae) (obj)).a("/visibilityChanged", bzw1.h);
        bzw1 = a;
        obj = bzw1.a;
        obj;
        JVM INSTR monitorenter ;
        if (bzw1.d == null) goto _L2; else goto _L1
_L1:
        a.a(false);
        return;
_L2:
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        bzw1.d = new <init>(bzw1);
        bzw1.b.registerReceiver(bzw1.d, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (bzw bzw1)
    {
        a = bzw1;
        super();
    }
}
