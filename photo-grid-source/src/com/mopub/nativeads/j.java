// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.nativeads:
//            h, ax, NativeResponse

final class j
    implements Runnable
{

    final h a;
    private final ArrayList b = new ArrayList();

    j(h h1)
    {
        a = h1;
        super();
    }

    public final void run()
    {
        Iterator iterator = h.b(a).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            View view = (View)((java.util.Map.Entry) (obj)).getKey();
            obj = (ax)((java.util.Map.Entry) (obj)).getValue();
            long l = ((ax) (obj)).b;
            int i = ((NativeResponse)((ax) (obj)).a).getImpressionMinTimeViewed();
            boolean flag;
            if (SystemClock.uptimeMillis() - l >= (long)i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ((NativeResponse)((ax) (obj)).a).recordImpression(view);
                b.add(view);
            }
        } while (true);
        View view1;
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); a.a(view1))
        {
            view1 = (View)iterator1.next();
        }

        b.clear();
        if (!h.b(a).isEmpty())
        {
            a.b();
        }
    }
}
