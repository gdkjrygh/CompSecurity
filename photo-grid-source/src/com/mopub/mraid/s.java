// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.mopub.mraid:
//            r, t

final class s
    implements Runnable
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public final void run()
    {
        View aview[] = r.a(a);
        int j = aview.length;
        int i = 0;
        while (i < j) 
        {
            View view = aview[i];
            if (view.getHeight() > 0 || view.getWidth() > 0)
            {
                r.b(a);
            } else
            {
                view.getViewTreeObserver().addOnPreDrawListener(new t(this, view));
            }
            i++;
        }
    }
}
