// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.baselib.b:
//            m

final class l extends BitmapDrawable
{

    private final WeakReference a;

    public l(Resources resources, m m1)
    {
        super(resources, null);
        a = new WeakReference(m1);
    }

    public final m a()
    {
        return (m)a.get();
    }
}
