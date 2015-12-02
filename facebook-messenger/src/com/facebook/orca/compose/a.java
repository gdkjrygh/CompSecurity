// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


// Referenced classes of package com.facebook.orca.compose:
//            AudioComposerView

class a
    implements Runnable
{

    final AudioComposerView a;

    a(AudioComposerView audiocomposerview)
    {
        a = audiocomposerview;
        super();
    }

    public void run()
    {
        AudioComposerView.a(a, true);
        if (AudioComposerView.a(a))
        {
            AudioComposerView.b(a);
        }
    }
}
