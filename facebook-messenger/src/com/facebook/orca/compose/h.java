// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.net.Uri;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.compose:
//            AudioComposerView, a

final class h
{

    final AudioComposerView a;
    private Uri b;

    private h(AudioComposerView audiocomposerview)
    {
        a = audiocomposerview;
        super();
        b = null;
    }

    h(AudioComposerView audiocomposerview, a a1)
    {
        this(audiocomposerview);
    }

    public Uri a()
    {
        Preconditions.checkState(b());
        return b;
    }

    public void a(Uri uri)
    {
        boolean flag;
        if (!b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        b = uri;
    }

    public boolean b()
    {
        return b != null;
    }

    public void c()
    {
        b = null;
    }

    public void d()
    {
        AudioComposerView.a(a, a());
        c();
        AudioComposerView.e(a);
    }
}
