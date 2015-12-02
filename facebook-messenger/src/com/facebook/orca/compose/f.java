// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.os.Handler;
import com.facebook.orca.d.af;

// Referenced classes of package com.facebook.orca.compose:
//            e, AudioComposerView

class f
    implements Runnable
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        AudioComposerView.a(a.b, AudioComposerView.d(a.b).c());
        a.a.postDelayed(this, 50L);
    }
}
