// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.mopub.nativeads:
//            bf, h, NativeResponse, ax

final class i
    implements bf
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void onVisibilityChanged(List list, List list1)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            View view = (View)list.next();
            NativeResponse nativeresponse = (NativeResponse)h.a(a).get(view);
            if (nativeresponse == null)
            {
                a.a(view);
            } else
            {
                ax ax1 = (ax)h.b(a).get(view);
                if (ax1 == null || !nativeresponse.equals(ax1.a))
                {
                    h.b(a).put(view, new ax(nativeresponse));
                }
            }
        } while (true);
        for (list = list1.iterator(); list.hasNext(); h.b(a).remove(list1))
        {
            list1 = (View)list.next();
        }

        a.b();
    }
}
