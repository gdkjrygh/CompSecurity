// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ipr
{

    final Map a = new HashMap();

    public ipr(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (View)((ObjectAnimator)list.next()).getTarget();
            if (obj instanceof ipq)
            {
                obj = (ipq)obj;
                if (!a.containsKey(obj))
                {
                    a.put(obj, Integer.valueOf(1));
                } else
                {
                    a.put(obj, Integer.valueOf(((Integer)a.get(obj)).intValue() + 1));
                }
            }
        } while (true);
    }
}
