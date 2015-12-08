// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.mopub.mraid:
//            s, r

final class t
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final s b;

    t(s s1, View view)
    {
        b = s1;
        a = view;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        try
        {
            r.b(b.a);
        }
        catch (Exception exception) { }
        return true;
    }
}
