// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class gib extends mtf
{

    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean j;

    gib(gic gic1)
    {
        super("OnboardAutoBackupBackgroundTask");
        a = gic1.a;
        b = gic1.b;
        c = gic1.c;
        j = gic1.d;
    }

    protected final mue a(Context context)
    {
        Object obj;
        mhe mhe1;
        noz noz1;
        long l;
        boolean flag1;
        flag1 = true;
        noz1 = noz.a(context, 4, "OnboardAutoBackupTask", new String[0]);
        obj = noz.a(context, 3, "OnboardAutoBackupTask", new String[0]);
        l = noy.a();
        mhe1 = ((mhh)olm.a(context, mhh)).a(context, a);
        mhe1.a(30L, TimeUnit.SECONDS);
        if (mhe1.c()) goto _L2; else goto _L1
_L1:
        if (noz1.a())
        {
            noy.a("duration", l);
        }
        obj = new mue(false);
        context = ((Context) (obj));
        if (mhe1 != null)
        {
            mhe1.b();
            context = ((Context) (obj));
        }
_L7:
        return context;
_L2:
        context = (mhl)mhe1.d().a(30L, TimeUnit.SECONDS);
        if (context == null) goto _L4; else goto _L3
_L3:
        if (context.r().a()) goto _L5; else goto _L4
_L14:
        boolean flag;
        if (((noz) (obj)).a())
        {
            noy.a("duration", l);
        }
        obj = new mue(flag);
        context = ((Context) (obj));
        if (mhe1 == null) goto _L7; else goto _L6
_L6:
        mhe1.b();
        return ((mue) (obj));
_L5:
        context = context.a();
        if (context == null) goto _L9; else goto _L8
_L8:
        if (!context.isEmpty()) goto _L10; else goto _L9
_L16:
        if (context == null) goto _L12; else goto _L11
_L11:
        if (!((mhj) (context)).b || a.equals(((mhj) (context)).a)) goto _L12; else goto _L13
_L13:
        flag = flag1;
        if (!b) goto _L14; else goto _L12
_L12:
        flag = b;
        context = new mhk(a);
        context.a = flag;
        context.b = c;
        context.e = c;
        context.f = j;
        if (!mhe1.a(context.a()).a(30L, TimeUnit.SECONDS).r().a())
        {
            break MISSING_BLOCK_LABEL_404;
        }
        flag = flag1;
        if (((maa)mhe1.c(a).a(30L, TimeUnit.SECONDS)).a()) goto _L14; else goto _L15
_L15:
        break MISSING_BLOCK_LABEL_404;
_L10:
        context = (mhj)context.get(0);
          goto _L16
        context;
        if (mhe1 != null)
        {
            mhe1.b();
        }
        throw context;
_L4:
        flag = false;
          goto _L14
_L9:
        context = null;
          goto _L16
        flag = false;
          goto _L14
    }
}
