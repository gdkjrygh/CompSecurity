// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.os.Handler;
import com.kik.g.i;

// Referenced classes of package kik.android.chat:
//            KikApplication, ag

final class af extends i
{

    final KikApplication a;

    af(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Integer)obj1;
        KikApplication.d(a).post(new ag(this, ((Integer) (obj))));
    }
}
