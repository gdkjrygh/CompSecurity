// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.lang.ref.WeakReference;

final class azk
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    private final WeakReference a;

    public azk(azj azj1)
    {
        a = new WeakReference(azj1);
    }

    public final boolean onPreDraw()
    {
        if (Log.isLoggable("ViewTarget", 2))
        {
            String s = String.valueOf(this);
            (new StringBuilder(String.valueOf(s).length() + 39)).append("OnGlobalLayoutListener called listener=").append(s);
        }
        azj azj1 = (azj)a.get();
        if (azj1 != null)
        {
            azj.a(azj1);
        }
        return true;
    }
}
