// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import com.facebook.orca.d.af;

// Referenced classes of package com.facebook.orca.compose:
//            AudioComposerView, h

class b
    implements Runnable
{

    final AudioComposerView a;

    b(AudioComposerView audiocomposerview)
    {
        a = audiocomposerview;
        super();
    }

    public void run()
    {
        if (AudioComposerView.c(a).b())
        {
            AudioComposerView.c(a).d();
        } else
        if (AudioComposerView.d(a).d())
        {
            AudioComposerView.d(a).a();
            return;
        }
    }
}
