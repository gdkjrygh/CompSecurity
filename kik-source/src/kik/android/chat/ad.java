// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.os.Handler;
import com.kik.g.i;

// Referenced classes of package kik.android.chat:
//            KikApplication, ae

final class ad extends i
{

    final KikApplication a;

    ad(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (kik.a.b.a.a.d)obj1;
        KikApplication.d(a).post(new ae(this, ((kik.a.b.a.a.d) (obj))));
    }
}
