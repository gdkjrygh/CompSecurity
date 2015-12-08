// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.b;

import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.request.b:
//            k

private static class a
    implements android.view.eeObserver.OnPreDrawListener
{

    private final WeakReference a;

    public boolean onPreDraw()
    {
        if (Log.isLoggable("ViewTarget", 2))
        {
            Log.v("ViewTarget", (new StringBuilder()).append("OnGlobalLayoutListener called listener=").append(this).toString());
        }
        stener stener = (stener)a.get();
        if (stener != null)
        {
            a(stener);
        }
        return true;
    }

    public DrawListener(DrawListener drawlistener)
    {
        a = new WeakReference(drawlistener);
    }
}
