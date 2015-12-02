// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.os.IBinder;
import android.util.SparseArray;

// Referenced classes of package com.qihoo.security.ui.b:
//            f

private class <init>
    implements android.os.der.DeathRecipient
{

    int a;
    IBinder b;
    final f c;

    public void binderDied()
    {
        b.unlinkToDeath(this, 0);
        synchronized (f.a(c))
        {
            f.a(c).remove(a);
        }
        return;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private pient(f f1)
    {
        c = f1;
        super();
    }

    c(f f1, c c1)
    {
        this(f1);
    }
}
