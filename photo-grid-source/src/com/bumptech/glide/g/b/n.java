// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.g.b:
//            m

final class n
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    private final WeakReference a;

    public n(m m1)
    {
        a = new WeakReference(m1);
    }

    public final boolean onPreDraw()
    {
        if (Log.isLoggable("ViewTarget", 2))
        {
            (new StringBuilder("OnGlobalLayoutListener called listener=")).append(this);
        }
        m m1 = (m)a.get();
        if (m1 != null)
        {
            m.a(m1);
        }
        return true;
    }
}
