// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.i;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            dl

private static final class <init>
    implements android.os.er.DeathRecipient, <init>
{

    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    private void a()
    {
        Object obj = (<init>)a.get();
        i j = (i)b.get();
        if (j != null && obj != null)
        {
            ((b) (obj)).a().intValue();
            j.a();
        }
        obj = (IBinder)c.get();
        if (c != null)
        {
            ((IBinder) (obj)).unlinkToDeath(this, 0);
        }
    }

    public final void a(c c1)
    {
        a();
    }

    public final void binderDied()
    {
        a();
    }

    private ( , i j, IBinder ibinder)
    {
        b = new WeakReference(j);
        a = new WeakReference();
        c = new WeakReference(ibinder);
    }

    c(c c1, i j, IBinder ibinder, byte byte0)
    {
        this(c1, j, ibinder);
    }
}
